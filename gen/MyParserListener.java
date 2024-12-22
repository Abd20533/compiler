// Generated from C:/Users/⁄»œ«·—Õ„‰/IdeaProjects/compiler2/src/MyParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(MyParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(MyParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(MyParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(MyParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(MyParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(MyParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MyParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MyParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MyParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MyParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MyParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(MyParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(MyParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MyParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MyParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#test_expr}.
	 * @param ctx the parse tree
	 */
	void enterTest_expr(MyParser.Test_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#test_expr}.
	 * @param ctx the parse tree
	 */
	void exitTest_expr(MyParser.Test_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MyParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(MyParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(MyParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(MyParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(MyParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void enterListStatement(MyParser.ListStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#listStatement}.
	 * @param ctx the parse tree
	 */
	void exitListStatement(MyParser.ListStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MyParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MyParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MyParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MyParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MyParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#slotDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSlotDefinition(MyParser.SlotDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#slotDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSlotDefinition(MyParser.SlotDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defclassStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefclassStatement(MyParser.DefclassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defclassStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefclassStatement(MyParser.DefclassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(MyParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(MyParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#elementTypeArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterElementTypeArrayStatement(MyParser.ElementTypeArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#elementTypeArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitElementTypeArrayStatement(MyParser.ElementTypeArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(MyParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(MyParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#usePackageStatement}.
	 * @param ctx the parse tree
	 */
	void enterUsePackageStatement(MyParser.UsePackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#usePackageStatement}.
	 * @param ctx the parse tree
	 */
	void exitUsePackageStatement(MyParser.UsePackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#inPackageStatement}.
	 * @param ctx the parse tree
	 */
	void enterInPackageStatement(MyParser.InPackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#inPackageStatement}.
	 * @param ctx the parse tree
	 */
	void exitInPackageStatement(MyParser.InPackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defpackageStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefpackageStatement(MyParser.DefpackageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defpackageStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefpackageStatement(MyParser.DefpackageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#packageOption}.
	 * @param ctx the parse tree
	 */
	void enterPackageOption(MyParser.PackageOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#packageOption}.
	 * @param ctx the parse tree
	 */
	void exitPackageOption(MyParser.PackageOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(MyParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(MyParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void enterCatchStatement(MyParser.CatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#catchStatement}.
	 * @param ctx the parse tree
	 */
	void exitCatchStatement(MyParser.CatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void enterFinallyStatement(MyParser.FinallyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#finallyStatement}.
	 * @param ctx the parse tree
	 */
	void exitFinallyStatement(MyParser.FinallyStatementContext ctx);
}