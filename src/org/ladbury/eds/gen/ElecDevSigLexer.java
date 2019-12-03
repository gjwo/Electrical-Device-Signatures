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
		FLAT=8, RISING=9, FALLING=10, RANDOM=11, THEN=12, WATT=13, KILOWATT=14, 
		MILLISECOND=15, SECOND=16, MINUTE=17, HOUR=18, DIGITS2=19, DIGITS4=20, 
		REAL_NUMBER=21, WHOLE_NUMBER=22, DAYOFWEEK=23, MONTH=24, NAME=25, PLUS=26, 
		MINUS=27, LBRACE=28, RBRACE=29, LBRACKET=30, RBRACKET=31, LCURLY=32, RCURLY=33, 
		COMMA=34, COLON=35, SEMICOLON=36, DOT=37, COMMENT=38, ML_COMMENT=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FOR", "POWER_UNIT", "TIME_UNIT", "TIMEBASE", "STARTDATE", "TO", "VARIABLE", 
			"FLAT", "RISING", "FALLING", "RANDOM", "THEN", "WATT", "KILOWATT", "MILLISECOND", 
			"SECOND", "MINUTE", "HOUR", "DIGITS2", "DIGITS4", "REAL_NUMBER", "WHOLE_NUMBER", 
			"DECIMAL", "INT", "SIGNED_INT", "UNSIGNED_INT", "SIGN", "DAYOFWEEK", 
			"MONTH", "NAME", "PLUS", "MINUS", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"LCURLY", "RCURLY", "COMMA", "COLON", "SEMICOLON", "DOT", "DIGIT", "HEX", 
			"LCASE", "UCASE", "ALPHA", "NOTALPHANUMERIC", "COMMENT", "ML_COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", null, null, "'Timebase:'", "'Start:'", "'to'", "'var'", 
			"'flat'", "'rising'", "'falling'", "'random'", "'->'", "'W'", "'kW'", 
			null, null, null, null, null, null, null, null, null, null, null, "'+'", 
			"'-'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "POWER_UNIT", "TIME_UNIT", "TIMEBASE", "STARTDATE", "TO", 
			"VARIABLE", "FLAT", "RISING", "FALLING", "RANDOM", "THEN", "WATT", "KILOWATT", 
			"MILLISECOND", "SECOND", "MINUTE", "HOUR", "DIGITS2", "DIGITS4", "REAL_NUMBER", 
			"WHOLE_NUMBER", "DAYOFWEEK", "MONTH", "NAME", "PLUS", "MINUS", "LBRACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b7\n\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\5\26\u00c8\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u00d5\n\31\3\32\3\32\3\32\3\33\6\33\u00db\n\33\r\33\16\33\u00dc"+
		"\3\34\3\34\5\34\u00e1\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f8"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011e\n\36\3\37\3\37"+
		"\3\37\7\37\u0123\n\37\f\37\16\37\u0126\13\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\5\60\u014a\n\60\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0152"+
		"\n\62\f\62\16\62\u0155\13\62\3\62\5\62\u0158\n\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\7\63\u0162\n\63\f\63\16\63\u0165\13\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\6\64\u016d\n\64\r\64\16\64\u016e\3\64\3\64\4\u0153"+
		"\u0163\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\31"+
		";\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W\2Y\2[\2]\2_\2a\2c(e)g*\3\2"+
		"\13\4\2UUuu\4\2OOoo\4\2JJjj\3\2\62;\5\2\62;CHch\3\2c|\3\2C\\\5\2\62;C"+
		"\\c|\5\2\13\f\17\17\"\"\2\u0189\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A"+
		"\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2"+
		"\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\3i\3\2\2\2\5o\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13\u0081\3\2\2"+
		"\2\r\u0088\3\2\2\2\17\u008b\3\2\2\2\21\u008f\3\2\2\2\23\u0094\3\2\2\2"+
		"\25\u009b\3\2\2\2\27\u00a3\3\2\2\2\31\u00aa\3\2\2\2\33\u00ad\3\2\2\2\35"+
		"\u00af\3\2\2\2\37\u00b6\3\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3"+
		"\2\2\2\'\u00be\3\2\2\2)\u00c1\3\2\2\2+\u00c7\3\2\2\2-\u00cb\3\2\2\2/\u00cd"+
		"\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00da\3\2\2\2\67\u00e0\3"+
		"\2\2\29\u00f7\3\2\2\2;\u011d\3\2\2\2=\u011f\3\2\2\2?\u0127\3\2\2\2A\u0129"+
		"\3\2\2\2C\u012b\3\2\2\2E\u012d\3\2\2\2G\u012f\3\2\2\2I\u0131\3\2\2\2K"+
		"\u0133\3\2\2\2M\u0135\3\2\2\2O\u0137\3\2\2\2Q\u0139\3\2\2\2S\u013b\3\2"+
		"\2\2U\u013d\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2[\u0143\3\2\2\2]\u0145"+
		"\3\2\2\2_\u0149\3\2\2\2a\u014b\3\2\2\2c\u014d\3\2\2\2e\u015d\3\2\2\2g"+
		"\u016c\3\2\2\2ij\7h\2\2jk\7q\2\2kl\7t\2\2l\4\3\2\2\2mp\5\33\16\2np\5\35"+
		"\17\2om\3\2\2\2on\3\2\2\2p\6\3\2\2\2qv\5\37\20\2rv\5!\21\2sv\5#\22\2t"+
		"v\5%\23\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\b\3\2\2\2wx\7V\2\2"+
		"xy\7k\2\2yz\7o\2\2z{\7g\2\2{|\7d\2\2|}\7c\2\2}~\7u\2\2~\177\7g\2\2\177"+
		"\u0080\7<\2\2\u0080\n\3\2\2\2\u0081\u0082\7U\2\2\u0082\u0083\7v\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085\u0086\7v\2\2\u0086\u0087\7<\2\2"+
		"\u0087\f\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7q\2\2\u008a\16\3\2\2"+
		"\2\u008b\u008c\7x\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\20\3"+
		"\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7v\2\2\u0093\22\3\2\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0097\7u\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7i\2\2"+
		"\u009a\24\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7c\2\2\u009d\u009e\7"+
		"n\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2"+
		"\7i\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\30\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\u00ac\7@\2\2\u00ac\32\3\2\2\2\u00ad"+
		"\u00ae\7Y\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7m\2\2\u00b0\u00b1\7Y\2\2\u00b1"+
		"\36\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b7\7U\2\2\u00b4\u00b5\7o\2\2\u00b5"+
		"\u00b7\7u\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7 \3\2\2\2\u00b8"+
		"\u00b9\t\2\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb$\3\2\2\2\u00bc"+
		"\u00bd\t\4\2\2\u00bd&\3\2\2\2\u00be\u00bf\5W,\2\u00bf\u00c0\5W,\2\u00c0"+
		"(\3\2\2\2\u00c1\u00c2\5W,\2\u00c2\u00c3\5W,\2\u00c3\u00c4\5W,\2\u00c4"+
		"\u00c5\5W,\2\u00c5*\3\2\2\2\u00c6\u00c8\5\61\31\2\u00c7\u00c6\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5/\30\2\u00ca,\3"+
		"\2\2\2\u00cb\u00cc\5\61\31\2\u00cc.\3\2\2\2\u00cd\u00ce\5U+\2\u00ce\u00cf"+
		"\5\65\33\2\u00cf\60\3\2\2\2\u00d0\u00d5\5\'\24\2\u00d1\u00d5\5)\25\2\u00d2"+
		"\u00d5\5\65\33\2\u00d3\u00d5\5\63\32\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\62\3\2\2\2\u00d6"+
		"\u00d7\5\67\34\2\u00d7\u00d8\5\65\33\2\u00d8\64\3\2\2\2\u00d9\u00db\5"+
		"W,\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\66\3\2\2\2\u00de\u00e1\5? \2\u00df\u00e1\5A!\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e18\3\2\2\2\u00e2\u00e3\7O\2\2\u00e3"+
		"\u00e4\7q\2\2\u00e4\u00f8\7p\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7w\2\2"+
		"\u00e7\u00f8\7g\2\2\u00e8\u00e9\7Y\2\2\u00e9\u00ea\7g\2\2\u00ea\u00f8"+
		"\7f\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7j\2\2\u00ed\u00f8\7w\2\2\u00ee"+
		"\u00ef\7H\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f8\7k\2\2\u00f1\u00f2\7U\2\2"+
		"\u00f2\u00f3\7c\2\2\u00f3\u00f8\7v\2\2\u00f4\u00f5\7U\2\2\u00f5\u00f6"+
		"\7w\2\2\u00f6\u00f8\7p\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e5\3\2\2\2\u00f7"+
		"\u00e8\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f1\3\2"+
		"\2\2\u00f7\u00f4\3\2\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7L\2\2\u00fa\u00fb"+
		"\7c\2\2\u00fb\u011e\7p\2\2\u00fc\u00fd\7H\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\u011e\7d\2\2\u00ff\u0100\7O\2\2\u0100\u0101\7c\2\2\u0101\u011e\7t\2\2"+
		"\u0102\u0103\7C\2\2\u0103\u0104\7r\2\2\u0104\u011e\7t\2\2\u0105\u0106"+
		"\7O\2\2\u0106\u0107\7c\2\2\u0107\u011e\7{\2\2\u0108\u0109\7L\2\2\u0109"+
		"\u010a\7w\2\2\u010a\u011e\7p\2\2\u010b\u010c\7L\2\2\u010c\u010d\7w\2\2"+
		"\u010d\u011e\7n\2\2\u010e\u010f\7C\2\2\u010f\u0110\7w\2\2\u0110\u011e"+
		"\7i\2\2\u0111\u0112\7U\2\2\u0112\u0113\7g\2\2\u0113\u011e\7r\2\2\u0114"+
		"\u0115\7Q\2\2\u0115\u0116\7e\2\2\u0116\u011e\7v\2\2\u0117\u0118\7P\2\2"+
		"\u0118\u0119\7q\2\2\u0119\u011e\7x\2\2\u011a\u011b\7F\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011e\7e\2\2\u011d\u00f9\3\2\2\2\u011d\u00fc\3\2\2\2\u011d"+
		"\u00ff\3\2\2\2\u011d\u0102\3\2\2\2\u011d\u0105\3\2\2\2\u011d\u0108\3\2"+
		"\2\2\u011d\u010b\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u0111\3\2\2\2\u011d"+
		"\u0114\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e<\3\2\2\2"+
		"\u011f\u0124\5_\60\2\u0120\u0123\5_\60\2\u0121\u0123\5W,\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125>\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7-\2\2\u0128"+
		"@\3\2\2\2\u0129\u012a\7/\2\2\u012aB\3\2\2\2\u012b\u012c\7*\2\2\u012cD"+
		"\3\2\2\2\u012d\u012e\7+\2\2\u012eF\3\2\2\2\u012f\u0130\7]\2\2\u0130H\3"+
		"\2\2\2\u0131\u0132\7_\2\2\u0132J\3\2\2\2\u0133\u0134\7}\2\2\u0134L\3\2"+
		"\2\2\u0135\u0136\7\177\2\2\u0136N\3\2\2\2\u0137\u0138\7.\2\2\u0138P\3"+
		"\2\2\2\u0139\u013a\7<\2\2\u013aR\3\2\2\2\u013b\u013c\7=\2\2\u013cT\3\2"+
		"\2\2\u013d\u013e\7\60\2\2\u013eV\3\2\2\2\u013f\u0140\t\5\2\2\u0140X\3"+
		"\2\2\2\u0141\u0142\t\6\2\2\u0142Z\3\2\2\2\u0143\u0144\t\7\2\2\u0144\\"+
		"\3\2\2\2\u0145\u0146\t\b\2\2\u0146^\3\2\2\2\u0147\u014a\5[.\2\u0148\u014a"+
		"\5]/\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a`\3\2\2\2\u014b\u014c"+
		"\n\t\2\2\u014cb\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7\61\2\2\u014f"+
		"\u0153\3\2\2\2\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0158\7\17\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\f\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\b\62\2\2\u015cd\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7,\2\2"+
		"\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167\u0168\7\61\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\b\63\2\2\u016af\3\2\2\2\u016b\u016d\t\n\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\b\64\2\2\u0171h\3\2\2\2\23\2ou\u00b6\u00c7"+
		"\u00d4\u00dc\u00e0\u00f7\u011d\u0122\u0124\u0149\u0153\u0157\u0163\u016e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}