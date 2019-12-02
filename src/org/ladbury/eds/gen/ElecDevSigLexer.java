// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
package org.ladbury.eds.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElecDevSigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, POWER_UNIT=2, TIME_UNIT=3, TIMEBASE=4, STARTDATE=5, TO=6, VARIABLE=7, 
		THEN=8, WATT=9, KILOWATT=10, MILLISECOND=11, SECOND=12, MINUTE=13, HOUR=14, 
		NAME=15, REAL_NUMBER=16, SIGNED_INT=17, INTEGER=18, DIGITS2=19, DIGITS4=20, 
		SIGN=21, ALPHANUMERIC=22, DAYOFWEEK=23, MONTH=24, PLUS=25, MINUS=26, LBRACE=27, 
		RBRACE=28, LBRACKET=29, RBRACKET=30, LCURLY=31, RCURLY=32, COMMA=33, COLON=34, 
		SEMICOLON=35, DOT=36, COMMENT=37, ML_COMMENT=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FOR", "POWER_UNIT", "TIME_UNIT", "TIMEBASE", "STARTDATE", "TO", "VARIABLE", 
			"THEN", "WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", "HOUR", 
			"NAME", "REAL_NUMBER", "SIGNED_INT", "INTEGER", "DIGITS2", "DIGITS4", 
			"SIGN", "ALPHANUMERIC", "DAYOFWEEK", "MONTH", "PLUS", "MINUS", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "COMMA", "COLON", 
			"SEMICOLON", "DOT", "DIGIT", "HEX", "LCASE", "UCASE", "ALPHA", "NOTALPHANUMERIC", 
			"COMMENT", "ML_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", null, null, "'Timebase:'", "'Start:'", "'to'", "'var'", 
			"'->'", "'W'", "'kW'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'+'", "'-'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "':'", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "POWER_UNIT", "TIME_UNIT", "TIMEBASE", "STARTDATE", "TO", 
			"VARIABLE", "THEN", "WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", 
			"HOUR", "NAME", "REAL_NUMBER", "SIGNED_INT", "INTEGER", "DIGITS2", "DIGITS4", 
			"SIGN", "ALPHANUMERIC", "DAYOFWEEK", "MONTH", "PLUS", "MINUS", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "COMMA", "COLON", 
			"SEMICOLON", "DOT", "COMMENT", "ML_COMMENT", "WS"
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


	public ElecDevSigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ElecDevSig.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\5\3d\n\3\3\4\3\4\3\4\3\4\5\4"+
		"j\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20"+
		"\u009a\n\20\f\20\16\20\u009d\13\20\3\21\5\21\u00a0\n\21\3\21\3\21\3\21"+
		"\6\21\u00a5\n\21\r\21\16\21\u00a6\5\21\u00a9\n\21\3\22\5\22\u00ac\n\22"+
		"\3\22\6\22\u00af\n\22\r\22\16\22\u00b0\3\23\6\23\u00b4\n\23\r\23\16\23"+
		"\u00b5\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00c2\n"+
		"\26\3\27\3\27\5\27\u00c6\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00dd\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u0127\n*\3"+
		"+\3+\3,\3,\3,\3,\7,\u012f\n,\f,\16,\u0132\13,\3,\5,\u0135\n,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\7-\u013f\n-\f-\16-\u0142\13-\3-\3-\3-\3-\3-\3.\6.\u014a"+
		"\n.\r.\16.\u014b\3.\3.\4\u0130\u0140\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\2"+
		"U\2W\'Y([)\3\2\13\4\2UUuu\4\2OOoo\4\2JJjj\3\2\62;\5\2\62;CHch\3\2c|\3"+
		"\2C\\\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u016c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2W\3\2\2\2"+
		"\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5c\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13"+
		"u\3\2\2\2\r|\3\2\2\2\17\177\3\2\2\2\21\u0083\3\2\2\2\23\u0086\3\2\2\2"+
		"\25\u0088\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35"+
		"\u0095\3\2\2\2\37\u0097\3\2\2\2!\u009f\3\2\2\2#\u00ab\3\2\2\2%\u00b3\3"+
		"\2\2\2\'\u00b7\3\2\2\2)\u00ba\3\2\2\2+\u00c1\3\2\2\2-\u00c5\3\2\2\2/\u00dc"+
		"\3\2\2\2\61\u0102\3\2\2\2\63\u0104\3\2\2\2\65\u0106\3\2\2\2\67\u0108\3"+
		"\2\2\29\u010a\3\2\2\2;\u010c\3\2\2\2=\u010e\3\2\2\2?\u0110\3\2\2\2A\u0112"+
		"\3\2\2\2C\u0114\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I\u011a\3\2\2\2K"+
		"\u011c\3\2\2\2M\u011e\3\2\2\2O\u0120\3\2\2\2Q\u0122\3\2\2\2S\u0126\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u013a\3\2\2\2[\u0149\3\2\2\2]^\7h"+
		"\2\2^_\7q\2\2_`\7t\2\2`\4\3\2\2\2ad\5\23\n\2bd\5\25\13\2ca\3\2\2\2cb\3"+
		"\2\2\2d\6\3\2\2\2ej\5\27\f\2fj\5\31\r\2gj\5\33\16\2hj\5\35\17\2ie\3\2"+
		"\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\b\3\2\2\2kl\7V\2\2lm\7k\2\2mn\7o\2"+
		"\2no\7g\2\2op\7d\2\2pq\7c\2\2qr\7u\2\2rs\7g\2\2st\7<\2\2t\n\3\2\2\2uv"+
		"\7U\2\2vw\7v\2\2wx\7c\2\2xy\7t\2\2yz\7v\2\2z{\7<\2\2{\f\3\2\2\2|}\7v\2"+
		"\2}~\7q\2\2~\16\3\2\2\2\177\u0080\7x\2\2\u0080\u0081\7c\2\2\u0081\u0082"+
		"\7t\2\2\u0082\20\3\2\2\2\u0083\u0084\7/\2\2\u0084\u0085\7@\2\2\u0085\22"+
		"\3\2\2\2\u0086\u0087\7Y\2\2\u0087\24\3\2\2\2\u0088\u0089\7m\2\2\u0089"+
		"\u008a\7Y\2\2\u008a\26\3\2\2\2\u008b\u008c\7o\2\2\u008c\u0090\7U\2\2\u008d"+
		"\u008e\7o\2\2\u008e\u0090\7u\2\2\u008f\u008b\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\30\3\2\2\2\u0091\u0092\t\2\2\2\u0092\32\3\2\2\2\u0093\u0094\t"+
		"\3\2\2\u0094\34\3\2\2\2\u0095\u0096\t\4\2\2\u0096\36\3\2\2\2\u0097\u009b"+
		"\5S*\2\u0098\u009a\5-\27\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009e\u00a0\5+\26\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a8\5%\23\2\u00a2\u00a4\5I%\2\u00a3\u00a5\5K&\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\"\3\2\2\2\u00aa\u00ac\5+\26\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00ae\3\2\2\2\u00ad\u00af\5K&\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1$\3\2\2\2\u00b2"+
		"\u00b4\5K&\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b5\u00b6\3\2\2\2\u00b6&\3\2\2\2\u00b7\u00b8\5K&\2\u00b8\u00b9\5"+
		"K&\2\u00b9(\3\2\2\2\u00ba\u00bb\5K&\2\u00bb\u00bc\5K&\2\u00bc\u00bd\5"+
		"K&\2\u00bd\u00be\5K&\2\u00be*\3\2\2\2\u00bf\u00c2\5\63\32\2\u00c0\u00c2"+
		"\5\65\33\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2,\3\2\2\2\u00c3"+
		"\u00c6\5S*\2\u00c4\u00c6\5K&\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6.\3\2\2\2\u00c7\u00c8\7O\2\2\u00c8\u00c9\7q\2\2\u00c9\u00dd\7p\2"+
		"\2\u00ca\u00cb\7V\2\2\u00cb\u00cc\7w\2\2\u00cc\u00dd\7g\2\2\u00cd\u00ce"+
		"\7Y\2\2\u00ce\u00cf\7g\2\2\u00cf\u00dd\7f\2\2\u00d0\u00d1\7V\2\2\u00d1"+
		"\u00d2\7j\2\2\u00d2\u00dd\7w\2\2\u00d3\u00d4\7H\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00dd\7k\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7c\2\2\u00d8\u00dd"+
		"\7v\2\2\u00d9\u00da\7U\2\2\u00da\u00db\7w\2\2\u00db\u00dd\7p\2\2\u00dc"+
		"\u00c7\3\2\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00d0\3\2"+
		"\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd"+
		"\60\3\2\2\2\u00de\u00df\7L\2\2\u00df\u00e0\7c\2\2\u00e0\u0103\7p\2\2\u00e1"+
		"\u00e2\7H\2\2\u00e2\u00e3\7g\2\2\u00e3\u0103\7d\2\2\u00e4\u00e5\7O\2\2"+
		"\u00e5\u00e6\7c\2\2\u00e6\u0103\7t\2\2\u00e7\u00e8\7C\2\2\u00e8\u00e9"+
		"\7r\2\2\u00e9\u0103\7t\2\2\u00ea\u00eb\7O\2\2\u00eb\u00ec\7c\2\2\u00ec"+
		"\u0103\7{\2\2\u00ed\u00ee\7L\2\2\u00ee\u00ef\7w\2\2\u00ef\u0103\7p\2\2"+
		"\u00f0\u00f1\7L\2\2\u00f1\u00f2\7w\2\2\u00f2\u0103\7n\2\2\u00f3\u00f4"+
		"\7C\2\2\u00f4\u00f5\7w\2\2\u00f5\u0103\7i\2\2\u00f6\u00f7\7U\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8\u0103\7r\2\2\u00f9\u00fa\7Q\2\2\u00fa\u00fb\7e\2\2"+
		"\u00fb\u0103\7v\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7q\2\2\u00fe\u0103"+
		"\7x\2\2\u00ff\u0100\7F\2\2\u0100\u0101\7g\2\2\u0101\u0103\7e\2\2\u0102"+
		"\u00de\3\2\2\2\u0102\u00e1\3\2\2\2\u0102\u00e4\3\2\2\2\u0102\u00e7\3\2"+
		"\2\2\u0102\u00ea\3\2\2\2\u0102\u00ed\3\2\2\2\u0102\u00f0\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fc\3\2"+
		"\2\2\u0102\u00ff\3\2\2\2\u0103\62\3\2\2\2\u0104\u0105\7-\2\2\u0105\64"+
		"\3\2\2\2\u0106\u0107\7/\2\2\u0107\66\3\2\2\2\u0108\u0109\7*\2\2\u0109"+
		"8\3\2\2\2\u010a\u010b\7+\2\2\u010b:\3\2\2\2\u010c\u010d\7]\2\2\u010d<"+
		"\3\2\2\2\u010e\u010f\7_\2\2\u010f>\3\2\2\2\u0110\u0111\7}\2\2\u0111@\3"+
		"\2\2\2\u0112\u0113\7\177\2\2\u0113B\3\2\2\2\u0114\u0115\7.\2\2\u0115D"+
		"\3\2\2\2\u0116\u0117\7<\2\2\u0117F\3\2\2\2\u0118\u0119\7=\2\2\u0119H\3"+
		"\2\2\2\u011a\u011b\7\60\2\2\u011bJ\3\2\2\2\u011c\u011d\t\5\2\2\u011dL"+
		"\3\2\2\2\u011e\u011f\t\6\2\2\u011fN\3\2\2\2\u0120\u0121\t\7\2\2\u0121"+
		"P\3\2\2\2\u0122\u0123\t\b\2\2\u0123R\3\2\2\2\u0124\u0127\5O(\2\u0125\u0127"+
		"\5Q)\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127T\3\2\2\2\u0128\u0129"+
		"\n\t\2\2\u0129V\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\7\61\2\2\u012c"+
		"\u0130\3\2\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0135\7\17\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\f\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\b,\2\2\u0139X\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7,\2\2\u013c"+
		"\u0140\3\2\2\2\u013d\u013f\13\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0144\7,\2\2\u0144\u0145\7\61\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\b-\2\2\u0147Z\3\2\2\2\u0148\u014a\t\n\2\2\u0149\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\b.\2\2\u014e\\\3\2\2\2\26\2ci\u008f\u009b\u009f"+
		"\u00a6\u00a8\u00ab\u00b0\u00b5\u00c1\u00c5\u00dc\u0102\u0126\u0130\u0134"+
		"\u0140\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}