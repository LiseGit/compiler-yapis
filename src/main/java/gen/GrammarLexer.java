package gen;// Generated from D:/labs/compiler-yapis-master/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOWERCASE", "UPPERCASE", "DIGIT", "FUN_PRINT", "FUN_SCAN", "L_FBR", 
			"R_FBR", "L_CBR", "R_CBR", "L_BR", "R_BR", "V_LINE", "DOT", "COMMA", 
			"DOT_COMMA", "DOT_DOT", "ASSIGN", "AND", "NOT", "OR", "IF", "TYPE_VALUE", 
			"TYPE_MATRIX", "TYPE_VECTOR", "PLUS", "MINUS", "MULT", "NULL", "START", 
			"RETURN", "WORD", "VALUE", "NUMBER", "WHITESPACE", "NEWLINE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\5 \u00ae\n \3 \3 \3 \3 \7 \u00b4\n \f \16 \u00b7\13 \3!\5!\u00ba\n!\3"+
		"!\3!\3!\6!\u00bf\n!\r!\16!\u00c0\5!\u00c3\n!\3\"\3\"\7\"\u00c7\n\"\f\""+
		"\16\"\u00ca\13\"\3\"\5\"\u00cd\n\"\3#\6#\u00d0\n#\r#\16#\u00d1\3#\3#\3"+
		"$\5$\u00d7\n$\3$\3$\6$\u00db\n$\r$\16$\u00dc\2\2%\3\2\5\2\7\2\t\3\13\4"+
		"\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)"+
		"\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"\3\2"+
		"\7\3\2c|\3\2C\\\3\2\62;\3\2\63;\4\2\13\13\"\"\2\u00e9\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13U\3"+
		"\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27"+
		"d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p"+
		"\3\2\2\2%r\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+}\3\2\2\2-\u0080\3\2\2\2/\u0084"+
		"\3\2\2\2\61\u008b\3\2\2\2\63\u0092\3\2\2\2\65\u0094\3\2\2\2\67\u0096\3"+
		"\2\2\29\u0098\3\2\2\2;\u009d\3\2\2\2=\u00a3\3\2\2\2?\u00ad\3\2\2\2A\u00b9"+
		"\3\2\2\2C\u00cc\3\2\2\2E\u00cf\3\2\2\2G\u00da\3\2\2\2IJ\t\2\2\2J\4\3\2"+
		"\2\2KL\t\3\2\2L\6\3\2\2\2MN\t\4\2\2N\b\3\2\2\2OP\7r\2\2PQ\7t\2\2QR\7k"+
		"\2\2RS\7p\2\2ST\7v\2\2T\n\3\2\2\2UV\7u\2\2VW\7e\2\2WX\7c\2\2XY\7p\2\2"+
		"Y\f\3\2\2\2Z[\7}\2\2[\16\3\2\2\2\\]\7\177\2\2]\20\3\2\2\2^_\7]\2\2_\22"+
		"\3\2\2\2`a\7_\2\2a\24\3\2\2\2bc\7*\2\2c\26\3\2\2\2de\7+\2\2e\30\3\2\2"+
		"\2fg\7~\2\2g\32\3\2\2\2hi\7\60\2\2i\34\3\2\2\2jk\7.\2\2k\36\3\2\2\2lm"+
		"\7=\2\2m \3\2\2\2no\7<\2\2o\"\3\2\2\2pq\7?\2\2q$\3\2\2\2rs\7c\2\2st\7"+
		"p\2\2tu\7f\2\2u&\3\2\2\2vw\7p\2\2wx\7q\2\2xy\7v\2\2y(\3\2\2\2z{\7q\2\2"+
		"{|\7t\2\2|*\3\2\2\2}~\7k\2\2~\177\7h\2\2\177,\3\2\2\2\u0080\u0081\7x\2"+
		"\2\u0081\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083.\3\2\2\2\u0084\u0085\7"+
		"o\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7k\2\2\u0089\u008a\7z\2\2\u008a\60\3\2\2\2\u008b\u008c\7x\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7e\2\2\u008e\u008f\7v\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7t\2\2\u0091\62\3\2\2\2\u0092\u0093\7-\2\2\u0093\64\3\2\2\2\u0094"+
		"\u0095\7/\2\2\u0095\66\3\2\2\2\u0096\u0097\7,\2\2\u00978\3\2\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b\7n\2\2\u009b\u009c\7n\2\2"+
		"\u009c:\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7c\2"+
		"\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7v\2\2\u00a2<\3\2\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7p\2\2\u00a9>\3\2\2\2\u00aa\u00ae\5\3\2\2\u00ab\u00ae"+
		"\5\5\3\2\u00ac\u00ae\7a\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00b5\3\2\2\2\u00af\u00b4\5\3\2\2\u00b0\u00b4\5\5"+
		"\3\2\u00b1\u00b4\5\7\4\2\u00b2\u00b4\7a\2\2\u00b3\u00af\3\2\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6@\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00ba\5\65\33\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00c2\5C\"\2\u00bc\u00be\5\33\16\2\u00bd\u00bf"+
		"\5\7\4\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3B\3\2\2\2\u00c4\u00c8\t\5\2\2\u00c5\u00c7\5\7\4\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cd\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\62\2\2\u00cc\u00c4\3"+
		"\2\2\2\u00cc\u00cb\3\2\2\2\u00cdD\3\2\2\2\u00ce\u00d0\t\6\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\b#\2\2\u00d4F\3\2\2\2\u00d5\u00d7\7\17\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db"+
		"\7\f\2\2\u00d9\u00db\7\17\2\2\u00da\u00d6\3\2\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddH\3"+
		"\2\2\2\17\2\u00ad\u00b3\u00b5\u00b9\u00c0\u00c2\u00c8\u00cc\u00d1\u00d6"+
		"\u00da\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}