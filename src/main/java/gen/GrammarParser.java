package gen;// Generated from D:/labs/compiler-yapis-master/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN_PRINT=1, FUN_SCAN=2, L_FBR=3, R_FBR=4, L_CBR=5, R_CBR=6, L_BR=7, R_BR=8, 
		V_LINE=9, DOT=10, COMMA=11, DOT_COMMA=12, DOT_DOT=13, ASSIGN=14, AND=15, 
		NOT=16, OR=17, IF=18, TYPE_VALUE=19, TYPE_MATRIX=20, TYPE_VECTOR=21, PLUS=22, 
		MINUS=23, MULT=24, NULL=25, START=26, RETURN=27, WORD=28, VALUE=29, NUMBER=30, 
		WHITESPACE=31, NEWLINE=32;
	public static final int
		RULE_program = 0, RULE_start_bloc = 1, RULE_prog_declarating = 2, RULE_prog_block = 3, 
		RULE_block = 4, RULE_act = 5, RULE_declaration = 6, RULE_departed_fill = 7, 
		RULE_declarat = 8, RULE_extraction = 9, RULE_simple_extraction = 10, RULE_vector_fill = 11, 
		RULE_operation_extraction = 12, RULE_function = 13, RULE_printfunction = 14, 
		RULE_scanfunction = 15, RULE_type = 16, RULE_operation = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "start_bloc", "prog_declarating", "prog_block", "block", "act", 
			"declaration", "departed_fill", "declarat", "extraction", "simple_extraction", 
			"vector_fill", "operation_extraction", "function", "printfunction", "scanfunction", 
			"type", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'scan'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"'|'", "'.'", "','", "';'", "':'", "'='", "'and'", "'not'", "'or'", "'if'", 
			"'val'", "'matrix'", "'vector'", "'+'", "'-'", "'*'", "'null'", "'start'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN_PRINT", "FUN_SCAN", "L_FBR", "R_FBR", "L_CBR", "R_CBR", "L_BR", 
			"R_BR", "V_LINE", "DOT", "COMMA", "DOT_COMMA", "DOT_DOT", "ASSIGN", "AND", 
			"NOT", "OR", "IF", "TYPE_VALUE", "TYPE_MATRIX", "TYPE_VECTOR", "PLUS", 
			"MINUS", "MULT", "NULL", "START", "RETURN", "WORD", "VALUE", "NUMBER", 
			"WHITESPACE", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Start_blocContext start_bloc() {
			return getRuleContext(Start_blocContext.class,0);
		}
		public List<Prog_declaratingContext> prog_declarating() {
			return getRuleContexts(Prog_declaratingContext.class);
		}
		public Prog_declaratingContext prog_declarating(int i) {
			return getRuleContext(Prog_declaratingContext.class,i);
		}
		public List<TerminalNode> DOT_COMMA() { return getTokens(GrammarParser.DOT_COMMA); }
		public TerminalNode DOT_COMMA(int i) {
			return getToken(GrammarParser.DOT_COMMA, i);
		}
		public List<Prog_blockContext> prog_block() {
			return getRuleContexts(Prog_blockContext.class);
		}
		public Prog_blockContext prog_block(int i) {
			return getRuleContext(Prog_blockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					prog_declarating();
					setState(37);
					match(DOT_COMMA);
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(38);
						match(NEWLINE);
						}
						}
						setState(43);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(49);
				prog_block();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			start_bloc();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(56);
				prog_block();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_blocContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(GrammarParser.START, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Start_blocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart_bloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart_bloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart_bloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_blocContext start_bloc() throws RecognitionException {
		Start_blocContext _localctx = new Start_blocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_bloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(START);
			setState(63);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prog_declaratingContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public TerminalNode DOT_DOT() { return getToken(GrammarParser.DOT_DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Prog_declaratingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_declarating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg_declarating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg_declarating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg_declarating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prog_declaratingContext prog_declarating() throws RecognitionException {
		Prog_declaratingContext _localctx = new Prog_declaratingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog_declarating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WORD);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BR) {
				{
				setState(66);
				match(L_BR);
				setState(67);
				type();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(68);
					match(COMMA);
					setState(69);
					type();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(R_BR);
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(79);
				match(DOT_DOT);
				setState(80);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prog_blockContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(GrammarParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GrammarParser.WORD, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public TerminalNode DOT_DOT() { return getToken(GrammarParser.DOT_DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Prog_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProg_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prog_blockContext prog_block() throws RecognitionException {
		Prog_blockContext _localctx = new Prog_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prog_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WORD);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BR) {
				{
				setState(84);
				match(L_BR);
				setState(85);
				type();
				setState(86);
				match(WORD);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(87);
					match(COMMA);
					setState(88);
					type();
					setState(89);
					match(WORD);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(R_BR);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_DOT) {
				{
				setState(100);
				match(DOT_DOT);
				setState(101);
				type();
				}
			}

			setState(104);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_FBR() { return getToken(GrammarParser.L_FBR, 0); }
		public TerminalNode R_FBR() { return getToken(GrammarParser.R_FBR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public List<ActContext> act() {
			return getRuleContexts(ActContext.class);
		}
		public ActContext act(int i) {
			return getRuleContext(ActContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(106);
				match(NEWLINE);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(L_FBR);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(113);
				match(NEWLINE);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				act();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUN_PRINT) | (1L << FUN_SCAN) | (1L << TYPE_VALUE) | (1L << TYPE_MATRIX) | (1L << TYPE_VECTOR) | (1L << RETURN) | (1L << WORD))) != 0) );
			setState(124);
			match(R_FBR);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(125);
				match(NEWLINE);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActContext extends ParserRuleContext {
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Departed_fillContext departed_fill() {
			return getRuleContext(Departed_fillContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public ActContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_act; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActContext act() throws RecognitionException {
		ActContext _localctx = new ActContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_act);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(131);
				declaration();
				}
				break;
			case 2:
				{
				setState(132);
				departed_fill();
				}
				break;
			case 3:
				{
				setState(133);
				function();
				}
				break;
			}
			setState(136);
			match(DOT_COMMA);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(137);
				match(NEWLINE);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DeclaratContext> declarat() {
			return getRuleContexts(DeclaratContext.class);
		}
		public DeclaratContext declarat(int i) {
			return getRuleContext(DeclaratContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type();
			setState(144);
			declarat();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				declarat();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Departed_fillContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public List<ExtractionContext> extraction() {
			return getRuleContexts(ExtractionContext.class);
		}
		public ExtractionContext extraction(int i) {
			return getRuleContext(ExtractionContext.class,i);
		}
		public TerminalNode L_CBR() { return getToken(GrammarParser.L_CBR, 0); }
		public TerminalNode R_CBR() { return getToken(GrammarParser.R_CBR, 0); }
		public Departed_fillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departed_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeparted_fill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeparted_fill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeparted_fill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Departed_fillContext departed_fill() throws RecognitionException {
		Departed_fillContext _localctx = new Departed_fillContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_departed_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WORD);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_CBR) {
				{
				setState(153);
				match(L_CBR);
				setState(154);
				extraction();
				setState(155);
				match(R_CBR);
				}
			}

			setState(159);
			match(ASSIGN);
			setState(160);
			extraction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExtractionContext extraction() {
			return getRuleContext(ExtractionContext.class,0);
		}
		public DeclaratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclarat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclarat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDeclarat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratContext declarat() throws RecognitionException {
		DeclaratContext _localctx = new DeclaratContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(162);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(163);
				match(WORD);
				setState(164);
				match(ASSIGN);
				setState(165);
				extraction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractionContext extends ParserRuleContext {
		public Simple_extractionContext simple_extraction() {
			return getRuleContext(Simple_extractionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public Vector_fillContext vector_fill() {
			return getRuleContext(Vector_fillContext.class,0);
		}
		public Operation_extractionContext operation_extraction() {
			return getRuleContext(Operation_extractionContext.class,0);
		}
		public ExtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractionContext extraction() throws RecognitionException {
		ExtractionContext _localctx = new ExtractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_extraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(168);
				simple_extraction();
				}
				break;
			case 2:
				{
				setState(169);
				match(MINUS);
				setState(170);
				match(L_BR);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(171);
					simple_extraction();
					}
					break;
				case 2:
					{
					setState(172);
					operation_extraction();
					}
					break;
				}
				setState(175);
				match(R_BR);
				}
				break;
			case 3:
				{
				setState(177);
				vector_fill();
				}
				break;
			case 4:
				{
				setState(178);
				operation_extraction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_extractionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode VALUE() { return getToken(GrammarParser.VALUE, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public List<TerminalNode> V_LINE() { return getTokens(GrammarParser.V_LINE); }
		public TerminalNode V_LINE(int i) {
			return getToken(GrammarParser.V_LINE, i);
		}
		public List<ExtractionContext> extraction() {
			return getRuleContexts(ExtractionContext.class);
		}
		public ExtractionContext extraction(int i) {
			return getRuleContext(ExtractionContext.class,i);
		}
		public TerminalNode L_CBR() { return getToken(GrammarParser.L_CBR, 0); }
		public TerminalNode R_CBR() { return getToken(GrammarParser.R_CBR, 0); }
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public Simple_extractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_extraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimple_extraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimple_extraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSimple_extraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_extractionContext simple_extraction() throws RecognitionException {
		Simple_extractionContext _localctx = new Simple_extractionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_extraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(181);
				match(MINUS);
				}
			}

			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(184);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(185);
				match(VALUE);
				}
				break;
			case 3:
				{
				{
				setState(186);
				match(V_LINE);
				setState(187);
				extraction();
				setState(188);
				match(V_LINE);
				}
				}
				break;
			case 4:
				{
				{
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_BR:
					{
					setState(190);
					match(L_BR);
					setState(191);
					extraction();
					setState(192);
					match(R_BR);
					}
					break;
				case WORD:
					{
					setState(194);
					match(WORD);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197);
				match(L_CBR);
				setState(198);
				extraction();
				setState(199);
				match(R_CBR);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_fillContext extends ParserRuleContext {
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public List<ExtractionContext> extraction() {
			return getRuleContexts(ExtractionContext.class);
		}
		public ExtractionContext extraction(int i) {
			return getRuleContext(ExtractionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Vector_fillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVector_fill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVector_fill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVector_fill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector_fillContext vector_fill() throws RecognitionException {
		Vector_fillContext _localctx = new Vector_fillContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vector_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			match(L_BR);
			{
			setState(204);
			extraction();
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				{
				setState(206);
				extraction();
				}
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(R_BR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operation_extractionContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public List<TerminalNode> L_BR() { return getTokens(GrammarParser.L_BR); }
		public TerminalNode L_BR(int i) {
			return getToken(GrammarParser.L_BR, i);
		}
		public List<ExtractionContext> extraction() {
			return getRuleContexts(ExtractionContext.class);
		}
		public ExtractionContext extraction(int i) {
			return getRuleContext(ExtractionContext.class,i);
		}
		public List<TerminalNode> R_BR() { return getTokens(GrammarParser.R_BR); }
		public TerminalNode R_BR(int i) {
			return getToken(GrammarParser.R_BR, i);
		}
		public List<Simple_extractionContext> simple_extraction() {
			return getRuleContexts(Simple_extractionContext.class);
		}
		public Simple_extractionContext simple_extraction(int i) {
			return getRuleContext(Simple_extractionContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public Operation_extractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_extraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperation_extraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperation_extraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperation_extraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operation_extractionContext operation_extraction() throws RecognitionException {
		Operation_extractionContext _localctx = new Operation_extractionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operation_extraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(214);
				match(MINUS);
				}
				break;
			}
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(217);
				match(L_BR);
				setState(218);
				extraction();
				setState(219);
				match(R_BR);
				}
				break;
			case 2:
				{
				setState(221);
				simple_extraction();
				}
				break;
			}
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				operation();
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(225);
					match(L_BR);
					setState(226);
					extraction();
					setState(227);
					match(R_BR);
					}
					break;
				case 2:
					{
					setState(229);
					simple_extraction();
					}
					break;
				case 3:
					{
					{
					setState(230);
					match(L_BR);
					{
					setState(231);
					extraction();
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(232);
						match(COMMA);
						{
						setState(233);
						extraction();
						}
						}
						}
						setState(238);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(239);
					match(R_BR);
					}
					}
					break;
				}
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0) );
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public List<ExtractionContext> extraction() {
			return getRuleContexts(ExtractionContext.class);
		}
		public ExtractionContext extraction(int i) {
			return getRuleContext(ExtractionContext.class,i);
		}
		public PrintfunctionContext printfunction() {
			return getRuleContext(PrintfunctionContext.class,0);
		}
		public ScanfunctionContext scanfunction() {
			return getRuleContext(ScanfunctionContext.class,0);
		}
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(247);
				match(WORD);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BR) {
					{
					setState(248);
					match(L_BR);
					{
					setState(249);
					extraction();
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(250);
						match(COMMA);
						setState(251);
						extraction();
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(257);
					match(R_BR);
					}
				}

				}
				break;
			case RETURN:
				{
				setState(261);
				match(RETURN);
				setState(262);
				extraction();
				}
				break;
			case FUN_PRINT:
				{
				setState(263);
				printfunction();
				}
				break;
			case FUN_SCAN:
				{
				setState(264);
				scanfunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfunctionContext extends ParserRuleContext {
		public TerminalNode FUN_PRINT() { return getToken(GrammarParser.FUN_PRINT, 0); }
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public ExtractionContext extraction() {
			return getRuleContext(ExtractionContext.class,0);
		}
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public PrintfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfunctionContext printfunction() throws RecognitionException {
		PrintfunctionContext _localctx = new PrintfunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FUN_PRINT);
			{
			setState(268);
			match(L_BR);
			setState(269);
			extraction();
			setState(270);
			match(R_BR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanfunctionContext extends ParserRuleContext {
		public TerminalNode FUN_SCAN() { return getToken(GrammarParser.FUN_SCAN, 0); }
		public TerminalNode L_BR() { return getToken(GrammarParser.L_BR, 0); }
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode R_BR() { return getToken(GrammarParser.R_BR, 0); }
		public ScanfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScanfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScanfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitScanfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanfunctionContext scanfunction() throws RecognitionException {
		ScanfunctionContext _localctx = new ScanfunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scanfunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FUN_SCAN);
			{
			setState(273);
			match(L_BR);
			setState(274);
			match(WORD);
			setState(275);
			match(R_BR);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_VALUE() { return getToken(GrammarParser.TYPE_VALUE, 0); }
		public TerminalNode TYPE_MATRIX() { return getToken(GrammarParser.TYPE_MATRIX, 0); }
		public TerminalNode TYPE_VECTOR() { return getToken(GrammarParser.TYPE_VECTOR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_VALUE) | (1L << TYPE_MATRIX) | (1L << TYPE_VECTOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(GrammarParser.MULT, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4I\n\4\f\4\16\4L\13\4\3\4\3\4\5\4P\n\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13"+
		"\5\3\5\3\5\5\5e\n\5\3\5\3\5\5\5i\n\5\3\5\3\5\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\6\6{\n\6\r\6\16\6|\3\6\3\6\7\6"+
		"\u0081\n\6\f\6\16\6\u0084\13\6\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\7\7\u008d"+
		"\n\7\f\7\16\7\u0090\13\7\3\b\3\b\3\b\3\b\7\b\u0096\n\b\f\b\16\b\u0099"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5"+
		"\n\u00a9\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00b6\n\13\3\f\5\f\u00b9\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00c6\n\f\3\f\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\3"+
		"\r\7\r\u00d2\n\r\f\r\16\r\u00d5\13\r\3\r\3\r\3\16\5\16\u00da\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16\3\16\3\16\5\16"+
		"\u00f4\n\16\6\16\u00f6\n\16\r\16\16\16\u00f7\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00ff\n\17\f\17\16\17\u0102\13\17\3\17\3\17\5\17\u0106\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u010c\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\4\3\2\25\27\3\2\30\32\2\u0132\2\60\3\2\2\2\4@\3\2\2"+
		"\2\6C\3\2\2\2\bU\3\2\2\2\no\3\2\2\2\f\u0088\3\2\2\2\16\u0091\3\2\2\2\20"+
		"\u009a\3\2\2\2\22\u00a8\3\2\2\2\24\u00b5\3\2\2\2\26\u00b8\3\2\2\2\30\u00cd"+
		"\3\2\2\2\32\u00d9\3\2\2\2\34\u010b\3\2\2\2\36\u010d\3\2\2\2 \u0112\3\2"+
		"\2\2\"\u0117\3\2\2\2$\u0119\3\2\2\2&\'\5\6\4\2\'+\7\16\2\2(*\7\"\2\2)"+
		"(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.&\3\2\2\2"+
		"/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63"+
		"\65\5\b\5\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679"+
		"\3\2\2\28\66\3\2\2\29=\5\4\3\2:<\5\b\5\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@A\7\34\2\2AB\5\n\6\2B\5\3\2\2\2CO\7\36"+
		"\2\2DE\7\t\2\2EJ\5\"\22\2FG\7\r\2\2GI\5\"\22\2HF\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\n\2\2NP\3\2\2\2OD\3\2\2\2OP\3"+
		"\2\2\2PS\3\2\2\2QR\7\17\2\2RT\5\"\22\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2"+
		"Ud\7\36\2\2VW\7\t\2\2WX\5\"\22\2X_\7\36\2\2YZ\7\r\2\2Z[\5\"\22\2[\\\7"+
		"\36\2\2\\^\3\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a"+
		"_\3\2\2\2bc\7\n\2\2ce\3\2\2\2dV\3\2\2\2de\3\2\2\2eh\3\2\2\2fg\7\17\2\2"+
		"gi\5\"\22\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\n\6\2k\t\3\2\2\2ln\7\"\2"+
		"\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rv\7\5\2"+
		"\2su\7\"\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2y{\5\f\7\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0082"+
		"\7\6\2\2\177\u0081\7\"\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\13\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085\u0089\5\16\b\2\u0086\u0089\5\20\t\2\u0087\u0089\5\34\17\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008e\7\16\2\2\u008b\u008d\7\"\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\r\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0092\5\"\22\2\u0092\u0097\5\22\n\2\u0093\u0094"+
		"\7\r\2\2\u0094\u0096\5\22\n\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\17\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009f\7\36\2\2\u009b\u009c\7\7\2\2\u009c\u009d\5\24\13"+
		"\2\u009d\u009e\7\b\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\5\24\13"+
		"\2\u00a3\21\3\2\2\2\u00a4\u00a9\7\36\2\2\u00a5\u00a6\7\36\2\2\u00a6\u00a7"+
		"\7\20\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2"+
		"\2\u00a9\23\3\2\2\2\u00aa\u00b6\5\26\f\2\u00ab\u00ac\7\31\2\2\u00ac\u00af"+
		"\7\t\2\2\u00ad\u00b0\5\26\f\2\u00ae\u00b0\5\32\16\2\u00af\u00ad\3\2\2"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b6"+
		"\3\2\2\2\u00b3\u00b6\5\30\r\2\u00b4\u00b6\5\32\16\2\u00b5\u00aa\3\2\2"+
		"\2\u00b5\u00ab\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\25"+
		"\3\2\2\2\u00b7\u00b9\7\31\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00cb\3\2\2\2\u00ba\u00cc\7\36\2\2\u00bb\u00cc\7\37\2\2\u00bc\u00bd"+
		"\7\13\2\2\u00bd\u00be\5\24\13\2\u00be\u00bf\7\13\2\2\u00bf\u00cc\3\2\2"+
		"\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\n\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c6\7\36\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5\24\13\2\u00c9"+
		"\u00ca\7\b\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00ba\3\2\2\2\u00cb\u00bb\3\2"+
		"\2\2\u00cb\u00bc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cc\27\3\2\2\2\u00cd\u00ce"+
		"\7\t\2\2\u00ce\u00d3\5\24\13\2\u00cf\u00d0\7\r\2\2\u00d0\u00d2\5\24\13"+
		"\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\n\2\2\u00d7"+
		"\31\3\2\2\2\u00d8\u00da\7\31\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2"+
		"\2\u00da\u00e0\3\2\2\2\u00db\u00dc\7\t\2\2\u00dc\u00dd\5\24\13\2\u00dd"+
		"\u00de\7\n\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\26\f\2\u00e0\u00db\3"+
		"\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00f5\3\2\2\2\u00e2\u00f3\5$\23\2\u00e3"+
		"\u00e4\7\t\2\2\u00e4\u00e5\5\24\13\2\u00e5\u00e6\7\n\2\2\u00e6\u00f4\3"+
		"\2\2\2\u00e7\u00f4\5\26\f\2\u00e8\u00e9\7\t\2\2\u00e9\u00ee\5\24\13\2"+
		"\u00ea\u00eb\7\r\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e3\3\2"+
		"\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00e2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\33\3\2\2\2\u00f9\u0105\7\36\2\2\u00fa\u00fb\7\t\2\2\u00fb\u0100"+
		"\5\24\13\2\u00fc\u00fd\7\r\2\2\u00fd\u00ff\5\24\13\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\n\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00fa\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010c\3\2\2\2\u0107\u0108\7\35"+
		"\2\2\u0108\u010c\5\24\13\2\u0109\u010c\5\36\20\2\u010a\u010c\5 \21\2\u010b"+
		"\u00f9\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\35\3\2\2\2\u010d\u010e\7\3\2\2\u010e\u010f\7\t\2\2\u010f\u0110"+
		"\5\24\13\2\u0110\u0111\7\n\2\2\u0111\37\3\2\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\u0114\7\t\2\2\u0114\u0115\7\36\2\2\u0115\u0116\7\n\2\2\u0116!\3\2\2\2"+
		"\u0117\u0118\t\2\2\2\u0118#\3\2\2\2\u0119\u011a\t\3\2\2\u011a%\3\2\2\2"+
		"#+\60\66=JOS_dhov|\u0082\u0088\u008e\u0097\u009f\u00a8\u00af\u00b5\u00b8"+
		"\u00c5\u00cb\u00d3\u00d9\u00e0\u00ee\u00f3\u00f7\u0100\u0105\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}