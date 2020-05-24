package gen;// Generated from D:/labs/compiler-yapis-master/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start_bloc}.
	 * @param ctx the parse tree
	 */
	void enterStart_bloc(GrammarParser.Start_blocContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start_bloc}.
	 * @param ctx the parse tree
	 */
	void exitStart_bloc(GrammarParser.Start_blocContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog_declarating}.
	 * @param ctx the parse tree
	 */
	void enterProg_declarating(GrammarParser.Prog_declaratingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog_declarating}.
	 * @param ctx the parse tree
	 */
	void exitProg_declarating(GrammarParser.Prog_declaratingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog_block}.
	 * @param ctx the parse tree
	 */
	void enterProg_block(GrammarParser.Prog_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog_block}.
	 * @param ctx the parse tree
	 */
	void exitProg_block(GrammarParser.Prog_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#act}.
	 * @param ctx the parse tree
	 */
	void enterAct(GrammarParser.ActContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#act}.
	 * @param ctx the parse tree
	 */
	void exitAct(GrammarParser.ActContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#departed_fill}.
	 * @param ctx the parse tree
	 */
	void enterDeparted_fill(GrammarParser.Departed_fillContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#departed_fill}.
	 * @param ctx the parse tree
	 */
	void exitDeparted_fill(GrammarParser.Departed_fillContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declarat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarat(GrammarParser.DeclaratContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declarat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarat(GrammarParser.DeclaratContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#extraction}.
	 * @param ctx the parse tree
	 */
	void enterExtraction(GrammarParser.ExtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#extraction}.
	 * @param ctx the parse tree
	 */
	void exitExtraction(GrammarParser.ExtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simple_extraction}.
	 * @param ctx the parse tree
	 */
	void enterSimple_extraction(GrammarParser.Simple_extractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simple_extraction}.
	 * @param ctx the parse tree
	 */
	void exitSimple_extraction(GrammarParser.Simple_extractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#vector_fill}.
	 * @param ctx the parse tree
	 */
	void enterVector_fill(GrammarParser.Vector_fillContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#vector_fill}.
	 * @param ctx the parse tree
	 */
	void exitVector_fill(GrammarParser.Vector_fillContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operation_extraction}.
	 * @param ctx the parse tree
	 */
	void enterOperation_extraction(GrammarParser.Operation_extractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operation_extraction}.
	 * @param ctx the parse tree
	 */
	void exitOperation_extraction(GrammarParser.Operation_extractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#printfunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintfunction(GrammarParser.PrintfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#printfunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintfunction(GrammarParser.PrintfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#scanfunction}.
	 * @param ctx the parse tree
	 */
	void enterScanfunction(GrammarParser.ScanfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#scanfunction}.
	 * @param ctx the parse tree
	 */
	void exitScanfunction(GrammarParser.ScanfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(GrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(GrammarParser.OperationContext ctx);
}