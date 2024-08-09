// Generated from C:/Users/pars system/Downloads/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 */
	void enterBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 */
	void exitBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#dflt_params}.
	 * @param ctx the parse tree
	 */
	void enterDflt_params(FunctionCraftParser.Dflt_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#dflt_params}.
	 * @param ctx the parse tree
	 */
	void exitDflt_params(FunctionCraftParser.Dflt_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(FunctionCraftParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(FunctionCraftParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(FunctionCraftParser.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(FunctionCraftParser.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void enterBool_val(FunctionCraftParser.Bool_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void exitBool_val(FunctionCraftParser.Bool_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void enterList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 */
	void exitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#valList}.
	 * @param ctx the parse tree
	 */
	void enterValList(FunctionCraftParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#valList}.
	 * @param ctx the parse tree
	 */
	void exitValList(FunctionCraftParser.ValListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#nestedList}.
	 * @param ctx the parse tree
	 */
	void enterNestedList(FunctionCraftParser.NestedListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#nestedList}.
	 * @param ctx the parse tree
	 */
	void exitNestedList(FunctionCraftParser.NestedListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(FunctionCraftParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(FunctionCraftParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equ}.
	 * @param ctx the parse tree
	 */
	void enterEqu(FunctionCraftParser.EquContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equ}.
	 * @param ctx the parse tree
	 */
	void exitEqu(FunctionCraftParser.EquContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition_statement}.
	 * @param ctx the parse tree
	 */
	void enterCondition_statement(FunctionCraftParser.Condition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition_statement}.
	 * @param ctx the parse tree
	 */
	void exitCondition_statement(FunctionCraftParser.Condition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expression(FunctionCraftParser.Condition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expression(FunctionCraftParser.Condition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 */
	void enterBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 */
	void exitBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(FunctionCraftParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(FunctionCraftParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(FunctionCraftParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(FunctionCraftParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#options}.
	 * @param ctx the parse tree
	 */
	void enterOptions(FunctionCraftParser.OptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#options}.
	 * @param ctx the parse tree
	 */
	void exitOptions(FunctionCraftParser.OptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 */
	void enterPattern_call(FunctionCraftParser.Pattern_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 */
	void exitPattern_call(FunctionCraftParser.Pattern_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#shift}.
	 * @param ctx the parse tree
	 */
	void enterShift(FunctionCraftParser.ShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#shift}.
	 * @param ctx the parse tree
	 */
	void exitShift(FunctionCraftParser.ShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or(FunctionCraftParser.Logical_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or(FunctionCraftParser.Logical_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and(FunctionCraftParser.Logical_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and(FunctionCraftParser.Logical_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(FunctionCraftParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(FunctionCraftParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(FunctionCraftParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(FunctionCraftParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(FunctionCraftParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(FunctionCraftParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(FunctionCraftParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(FunctionCraftParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FunctionCraftParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FunctionCraftParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primary2}.
	 * @param ctx the parse tree
	 */
	void enterPrimary2(FunctionCraftParser.Primary2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primary2}.
	 * @param ctx the parse tree
	 */
	void exitPrimary2(FunctionCraftParser.Primary2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#indexed}.
	 * @param ctx the parse tree
	 */
	void enterIndexed(FunctionCraftParser.IndexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#indexed}.
	 * @param ctx the parse tree
	 */
	void exitIndexed(FunctionCraftParser.IndexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void enterC_expr(FunctionCraftParser.C_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_expr}.
	 * @param ctx the parse tree
	 */
	void exitC_expr(FunctionCraftParser.C_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_assignment}.
	 * @param ctx the parse tree
	 */
	void enterC_assignment(FunctionCraftParser.C_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_assignment}.
	 * @param ctx the parse tree
	 */
	void exitC_assignment(FunctionCraftParser.C_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_shift}.
	 * @param ctx the parse tree
	 */
	void enterC_shift(FunctionCraftParser.C_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_shift}.
	 * @param ctx the parse tree
	 */
	void exitC_shift(FunctionCraftParser.C_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_equality}.
	 * @param ctx the parse tree
	 */
	void enterC_equality(FunctionCraftParser.C_equalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_equality}.
	 * @param ctx the parse tree
	 */
	void exitC_equality(FunctionCraftParser.C_equalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_relational}.
	 * @param ctx the parse tree
	 */
	void enterC_relational(FunctionCraftParser.C_relationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_relational}.
	 * @param ctx the parse tree
	 */
	void exitC_relational(FunctionCraftParser.C_relationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_additive}.
	 * @param ctx the parse tree
	 */
	void enterC_additive(FunctionCraftParser.C_additiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_additive}.
	 * @param ctx the parse tree
	 */
	void exitC_additive(FunctionCraftParser.C_additiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterC_multiplicative(FunctionCraftParser.C_multiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitC_multiplicative(FunctionCraftParser.C_multiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_unary}.
	 * @param ctx the parse tree
	 */
	void enterC_unary(FunctionCraftParser.C_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_unary}.
	 * @param ctx the parse tree
	 */
	void exitC_unary(FunctionCraftParser.C_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_primary}.
	 * @param ctx the parse tree
	 */
	void enterC_primary(FunctionCraftParser.C_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_primary}.
	 * @param ctx the parse tree
	 */
	void exitC_primary(FunctionCraftParser.C_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_primary2}.
	 * @param ctx the parse tree
	 */
	void enterC_primary2(FunctionCraftParser.C_primary2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_primary2}.
	 * @param ctx the parse tree
	 */
	void exitC_primary2(FunctionCraftParser.C_primary2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_indexed}.
	 * @param ctx the parse tree
	 */
	void enterC_indexed(FunctionCraftParser.C_indexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_indexed}.
	 * @param ctx the parse tree
	 */
	void exitC_indexed(FunctionCraftParser.C_indexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#c_factor}.
	 * @param ctx the parse tree
	 */
	void enterC_factor(FunctionCraftParser.C_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#c_factor}.
	 * @param ctx the parse tree
	 */
	void exitC_factor(FunctionCraftParser.C_factorContext ctx);
}