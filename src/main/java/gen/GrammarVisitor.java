package gen;// Generated from D:/labs/compiler-yapis-master/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start_bloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_bloc(GrammarParser.Start_blocContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog_declarating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_declarating(GrammarParser.Prog_declaratingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg_block(GrammarParser.Prog_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#act}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct(GrammarParser.ActContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#departed_fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeparted_fill(GrammarParser.Departed_fillContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#declarat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarat(GrammarParser.DeclaratContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#extraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraction(GrammarParser.ExtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#simple_extraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_extraction(GrammarParser.Simple_extractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#vector_fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_fill(GrammarParser.Vector_fillContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operation_extraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_extraction(GrammarParser.Operation_extractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#printfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfunction(GrammarParser.PrintfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#scanfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanfunction(GrammarParser.ScanfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(GrammarParser.OperationContext ctx);
}