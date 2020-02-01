// Generated from MiniJLexer.g4 by ANTLR 4.7.2

package om.edu.ibrict.itse4102.lab1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PUBLIC=2, RETURN=3, STATIC=4, WHILE=5, DECIMAL_LITERAL=6, LPAREN=7, 
		RPAREN=8, LBRACE=9, RBRACE=10, SEMI=11, COMMA=12, ASSIGN=13, NOTEQUAL=14, 
		MOD=15, IDENTIFIER=16, WS=17, COMMENT=18, LINE_COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "PUBLIC", "RETURN", "STATIC", "WHILE", "DECIMAL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "ASSIGN", "NOTEQUAL", 
			"MOD", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT", "Digits", "LetterOrDigit", 
			"Letter", "LineTerminator", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'public'", "'return'", "'static'", "'while'", null, "'('", 
			"')'", "'{'", "'}'", "';'", "','", "'='", "'!='", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "PUBLIC", "RETURN", "STATIC", "WHILE", "DECIMAL_LITERAL", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "COMMA", "ASSIGN", "NOTEQUAL", 
			"MOD", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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


	public MiniJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00a7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\5\7V\n\7\5\7X\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\7\21o\n\21\f\21\16\21r\13"+
		"\21\3\22\6\22u\n\22\r\22\16\22v\3\22\3\22\3\23\3\23\3\23\3\23\7\23\177"+
		"\n\23\f\23\16\23\u0082\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\7\24\u008d\n\24\f\24\16\24\u0090\13\24\3\24\3\24\3\25\6\25\u0095\n"+
		"\25\r\25\16\25\u0096\3\26\3\26\5\26\u009b\n\26\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u00a2\n\30\3\31\3\31\5\31\u00a6\n\31\3\u0080\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\2+\2-\2/\2\61\2\3\2\7\3\2\63;\4\2\f\f\17\17\3\2\62;\6\2&&C"+
		"\\aac|\5\2\13\13\16\16\"\"\2\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3\63\3\2"+
		"\2\2\5\67\3\2\2\2\7>\3\2\2\2\tE\3\2\2\2\13L\3\2\2\2\rW\3\2\2\2\17Y\3\2"+
		"\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33e\3"+
		"\2\2\2\35g\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#t\3\2\2\2%z\3\2\2\2\'\u0088\3"+
		"\2\2\2)\u0094\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2/\u00a1\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7v\2\2\66\4\3\2\2\2\67"+
		"8\7r\2\289\7w\2\29:\7d\2\2:;\7n\2\2;<\7k\2\2<=\7e\2\2=\6\3\2\2\2>?\7t"+
		"\2\2?@\7g\2\2@A\7v\2\2AB\7w\2\2BC\7t\2\2CD\7p\2\2D\b\3\2\2\2EF\7u\2\2"+
		"FG\7v\2\2GH\7c\2\2HI\7v\2\2IJ\7k\2\2JK\7e\2\2K\n\3\2\2\2LM\7y\2\2MN\7"+
		"j\2\2NO\7k\2\2OP\7n\2\2PQ\7g\2\2Q\f\3\2\2\2RX\7\62\2\2SU\t\2\2\2TV\5)"+
		"\25\2UT\3\2\2\2UV\3\2\2\2VX\3\2\2\2WR\3\2\2\2WS\3\2\2\2X\16\3\2\2\2YZ"+
		"\7*\2\2Z\20\3\2\2\2[\\\7+\2\2\\\22\3\2\2\2]^\7}\2\2^\24\3\2\2\2_`\7\177"+
		"\2\2`\26\3\2\2\2ab\7=\2\2b\30\3\2\2\2cd\7.\2\2d\32\3\2\2\2ef\7?\2\2f\34"+
		"\3\2\2\2gh\7#\2\2hi\7?\2\2i\36\3\2\2\2jk\7\'\2\2k \3\2\2\2lp\5-\27\2m"+
		"o\5+\26\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\"\3\2\2\2rp\3\2\2\2"+
		"su\5\61\31\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\22"+
		"\2\2y$\3\2\2\2z{\7\61\2\2{|\7,\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7,\2\2\u0084\u0085\7\61\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\b\23\2\2\u0087&\3\2\2\2\u0088\u0089\7\61\2"+
		"\2\u0089\u008a\7\61\2\2\u008a\u008e\3\2\2\2\u008b\u008d\n\3\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\b\24\2\2\u0092"+
		"(\3\2\2\2\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097*\3\2\2\2\u0098\u009b\5"+
		"-\27\2\u0099\u009b\t\4\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		",\3\2\2\2\u009c\u009d\t\5\2\2\u009d.\3\2\2\2\u009e\u00a2\t\3\2\2\u009f"+
		"\u00a0\7\17\2\2\u00a0\u00a2\7\f\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a2\60\3\2\2\2\u00a3\u00a6\5/\30\2\u00a4\u00a6\t\6\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\62\3\2\2\2\r\2UWpv\u0080\u008e"+
		"\u0096\u009a\u00a1\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}