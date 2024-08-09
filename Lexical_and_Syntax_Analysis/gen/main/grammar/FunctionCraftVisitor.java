// Generated from C:/Users/pars system/Downloads/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#body_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_function(FunctionCraftParser.Body_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(FunctionCraftParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#dflt_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDflt_params(FunctionCraftParser.Dflt_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(FunctionCraftParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(FunctionCraftParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_params(FunctionCraftParser.Call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(FunctionCraftParser.Bool_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_val(FunctionCraftParser.List_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#valList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(FunctionCraftParser.ValListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#nestedList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedList(FunctionCraftParser.NestedListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(FunctionCraftParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#built_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in(FunctionCraftParser.Built_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqu(FunctionCraftParser.EquContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FunctionCraftParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_statement(FunctionCraftParser.Condition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expression(FunctionCraftParser.Condition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_next(FunctionCraftParser.Break_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(FunctionCraftParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(FunctionCraftParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptions(FunctionCraftParser.OptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_call(FunctionCraftParser.Pattern_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FunctionCraftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift(FunctionCraftParser.ShiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logical_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or(FunctionCraftParser.Logical_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logical_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and(FunctionCraftParser.Logical_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(FunctionCraftParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(FunctionCraftParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(FunctionCraftParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(FunctionCraftParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(FunctionCraftParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FunctionCraftParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primary2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary2(FunctionCraftParser.Primary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#indexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed(FunctionCraftParser.IndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FunctionCraftParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_expr(FunctionCraftParser.C_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_assignment(FunctionCraftParser.C_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_shift}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_shift(FunctionCraftParser.C_shiftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_equality(FunctionCraftParser.C_equalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_relational(FunctionCraftParser.C_relationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_additive(FunctionCraftParser.C_additiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_multiplicative(FunctionCraftParser.C_multiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_unary(FunctionCraftParser.C_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_primary(FunctionCraftParser.C_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_primary2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_primary2(FunctionCraftParser.C_primary2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_indexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_indexed(FunctionCraftParser.C_indexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#c_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_factor(FunctionCraftParser.C_factorContext ctx);
}