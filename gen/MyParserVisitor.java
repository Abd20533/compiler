// Generated from C:/Users/⁄»œ«·—Õ„‰/IdeaProjects/compiler2/src/MyParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(MyParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(MyParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(MyParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MyParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MyParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(MyParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MyParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#test_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_expr(MyParser.Test_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MyParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(MyParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#listStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStatement(MyParser.ListStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MyParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MyParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#slotDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlotDefinition(MyParser.SlotDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#defclassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefclassStatement(MyParser.DefclassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(MyParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#elementTypeArrayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementTypeArrayStatement(MyParser.ElementTypeArrayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(MyParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#usePackageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsePackageStatement(MyParser.UsePackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#inPackageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPackageStatement(MyParser.InPackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#defpackageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefpackageStatement(MyParser.DefpackageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#packageOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOption(MyParser.PackageOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(MyParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(MyParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(MyParser.FinallyStatementContext ctx);
}