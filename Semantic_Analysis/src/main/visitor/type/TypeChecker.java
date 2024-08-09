package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;
import org.antlr.v4.runtime.atn.SemanticContext;
import parsers.FunctionCraftLexer;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());

            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            int i = 0;
            for (i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                try {
                    argItem.setType(currentArgTypes.get(i));
                } catch (IndexOutOfBoundsException iob) {
                    argItem.setType(functionDeclaration.getArgs().get(i).getDefaultVal().accept(this));
                }
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}
        Type ret_st = new NoType();
        for(Statement statement : functionDeclaration.getBody()) {
            ret_st = statement.accept(this);
        }

        //TODO:Figure out whether return types of functions are not the same.
        SymbolTable.pop();

        //TODO:Return the inferred type of the function
        return ret_st;

    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){

        SymbolTable.push(new SymbolTable());
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){

                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
        //TODO:1-figure out whether return expression of different cases in pattern are of the same type
        }catch (ItemNotFound ignored){}


        SymbolTable.pop();
        //TODO:2-return the inferred type
        return patternDeclaration.getReturnExp().get(0).accept(this);
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        //TODO:visit main
        for (Statement statement: mainDeclaration.getBody()) {
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            //TODO:function is called here.set the arguments type and visit its declaration
            try {
                Identifier id = (Identifier) accessExpression.getAccessedExpression();
                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + id.getName());
                ArrayList<Type> types = new ArrayList<>();
                for (Expression arg: accessExpression.getArguments()) {
                    types.add(arg.accept(this));
                }
                functionItem.setArgumentTypes(types);
                return functionItem.getFunctionDeclaration().accept(this);
            }catch (ItemNotFound ignored) {return new NoType();}

        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            Type el_type = new StringType();
            try {
                el_type = ((ListType) accessExpression.getAccessedExpression().accept(this)).getType();
            }catch (ClassCastException exc){}
            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }

           //TODO:index of access list must be int
            if (!(accessExpression.getDimentionalAccess().get(0).accept(this) instanceof IntType)) {
                typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                return new NoType();
            }
            return el_type;
        }
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        // TODO:Visit return statement.Note that return type of functions are specified here
        Type ret_expr = returnStatement.getReturnExp().accept(this);
        return ret_expr;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);

    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type range = forStatement.getRangeExpression().accept(this);

        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(range);
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        Type ret_st = new NoType();
        for(Statement statement : forStatement.getLoopBodyStmts())
            ret_st = statement.accept(this);
        SymbolTable.pop();
        return ret_st;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        Type ret_st = new NoType();
        for(Statement statement : ifStatement.getThenBody())
            ret_st = statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            ret_st = statement.accept(this);
        SymbolTable.pop();
        return ret_st;
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        Type ret_st = new NoType();
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            ret_st = statement.accept(this);
        SymbolTable.pop();
        return ret_st;
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            // TODO:assignment to list

            try {
                Type sti = ((ListType) ((VarItem) SymbolTable.top.getItem(VarItem.START_KEY +
                        assignStatement.getAssignedId().getName())).getType()).getType();
                Type assigned = assignStatement.getAssignExpression().accept(this);
                // TODO:maybe new type for a variable
                if (!(assigned.sameType(sti))) {
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                    return new NoType();
                }
            }catch (ItemNotFound e) {}

        }
        else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            Type expr_type = assignStatement.getAssignExpression().accept(this);
            newVarItem.setType(expr_type);
            // TODO:maybe new type for a variable
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists ignored){}
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return new NoType();
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return new NoType();
    }
    @Override
    public Type visit(PushStatement pushStatement){
        //TODO:visit push statement
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        //TODO:visit putStatement
        putStatement.getExpression().accept(this);
        return new NoType();

    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue) {
        return new FloatType();
    }
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        // TODO:visit listValue
        try {
            Type first_type = listValue.getElements().get(0).accept(this);
            for (Expression expression : listValue.getElements()) {

                if (!(expression.accept(this).sameType(listValue.getElements().get(0).accept(this)))) {
                    typeErrors.add((new ListElementsTypesMisMatch(listValue.getLine())));
                    return new NoType();
                }
            }

            return new ListType(first_type);
        }catch (IndexOutOfBoundsException iob){return new NoType();}
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){

        Type appendeeType = appendExpression.getAppendee().accept(this);

        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType) && !(appendeeType instanceof NoType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        if (appendeeType instanceof StringType) {
            for(Expression expression : appendExpression.getAppendeds()) {
                if (!((expression.accept(this)) instanceof StringType)) {
                    typeErrors.add((new AppendTypesMisMatch(appendExpression.getLine())));
                    return new NoType();
                }
            }
        }
        else if (appendeeType instanceof ListType) {
            Type list_type = ((ListType) appendeeType).getType();
            if (!(list_type instanceof NoType)) {
                for (Expression expression : appendExpression.getAppendeds()) {
                    if (!((expression.accept(this)).sameType(list_type))) {
                        typeErrors.add((new AppendTypesMisMatch(appendExpression.getLine())));
                        return new NoType();
                    }
                }
            }
        }
        else {
                Type first_type = appendExpression.getAppendeds().get(0).accept(this);
                for (Expression expression : appendExpression.getAppendeds()) {
                    if (!((expression.accept(this)).sameType(first_type))) {
                        typeErrors.add((new AppendTypesMisMatch(appendExpression.getLine())));
                        return new NoType();
                    }
                }
                return new ListType(first_type);
            }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        //TODO:visit binary expression
        Type firstOperand = binaryExpression.getFirstOperand().accept(this);
        Type secondOperand = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator operator = binaryExpression.getOperator();
        if (!(firstOperand.sameType(secondOperand))) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), operator));
            return new NoType();
        }
        if ((operator.equals(BinaryOperator.PLUS)) || (operator.equals(BinaryOperator.MINUS)) || (operator.equals(BinaryOperator.MULT)) ||
                (operator.equals(BinaryOperator.DIVIDE)))  {
            if (!((firstOperand instanceof IntType) || (firstOperand instanceof FloatType))) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
                return new NoType();
            }

            return firstOperand;

        } else if ((operator.equals(BinaryOperator.GREATER_EQUAL_THAN)) || (operator.equals(BinaryOperator.GREATER_THAN)) ||
                (operator.equals(BinaryOperator.LESS_EQUAL_THAN)) || (operator.equals(BinaryOperator.LESS_THAN))) {

            if (!((firstOperand instanceof IntType) || (firstOperand instanceof FloatType))) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.name()));
                return new NoType();
            }
            return new BoolType();
        } else if (operator.equals(BinaryOperator.EQUAL)) {
            return new BoolType();
        }

        return new NoType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        //TODO:visit unaryExpression
        Type exp = unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        if ((operator.equals(UnaryOperator.MINUS)) || (operator.equals(UnaryOperator.INC)) || (operator.equals(UnaryOperator.DEC))) {
            if (!((exp instanceof IntType) || (exp instanceof FloatType))) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                return new NoType();
            }

            return exp;
        } else if (operator.equals(UnaryOperator.NOT)) {
            if (!(exp instanceof BoolType)) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.name()));
                return new NoType();
            }

        }

        return new NoType();
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){

        if (!(chopStatement.getChopExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChopArgumentTypeMisMatch(chopStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        // TODO:visit Identifier
        try {
            VarItem item = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
            Type item_type = item.getType();
            return item_type;
        }catch (ItemNotFound ignored){
            return new NoType();
        }

    }
    @Override
    public Type visit(LenStatement lenStatement){
        //TODO:visit LenStatement.Be carefull about the return type of LenStatement.
        lenStatement.getExpression().accept(this);

        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{

            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){

        RangeType rangeType = rangeExpression.getRangeType();

        if(rangeType.equals(RangeType.LIST)){
            // TODO --> mind that the lists are declared explicitly in the grammar in this node, so handle the errors
            Type first_type = rangeExpression.getRangeExpressions().get(0).accept(this);
            for (Expression expression : rangeExpression.getRangeExpressions()) {

                if (!(expression.accept(this).sameType(first_type))) {
                    typeErrors.add((new ListElementsTypesMisMatch(rangeExpression.getLine())));
                    return first_type;
                }
            }

            return first_type;
        }

        else if (rangeType.equals(RangeType.DOUBLE_DOT)) {
            Type exp1 = rangeExpression.getRangeExpressions().get(0).accept(this);
            Type exp2 = rangeExpression.getRangeExpressions().get(1).accept(this);

            if (!(exp1 instanceof IntType) || !(exp2 instanceof IntType)) {
                typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
                return new IntType();
            }
            return new IntType();

        }
        else if (rangeType.equals(RangeType.IDENTIFIER)) {
            Type sid_type = rangeExpression.getRangeExpressions().get(0).accept(this);
            if (!(sid_type instanceof ListType)) {
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                return new NoType();
            }

            return ((ListType) sid_type).getType();

        }
        return new NoType();
    }
}
