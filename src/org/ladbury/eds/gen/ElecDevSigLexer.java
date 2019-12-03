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
		DIGITS2=15, DIGITS4=16, REAL_NUMBER=17, WHOLE_NUMBER=18, DAYOFWEEK=19, 
		MONTH=20, NAME=21, PLUS=22, MINUS=23, LBRACE=24, RBRACE=25, LBRACKET=26, 
		RBRACKET=27, LCURLY=28, RCURLY=29, COMMA=30, COLON=31, SEMICOLON=32, DOT=33, 
		COMMENT=34, ML_COMMENT=35, WS=36;
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
			"DIGITS2", "DIGITS4", "REAL_NUMBER", "WHOLE_NUMBER", "DECIMAL", "INT", 
			"SIGNED_INT", "UNSIGNED_INT", "SIGN", "DAYOFWEEK", "MONTH", "NAME", "PLUS", 
			"MINUS", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", 
			"COMMA", "COLON", "SEMICOLON", "DOT", "DIGIT", "HEX", "LCASE", "UCASE", 
			"ALPHA", "NOTALPHANUMERIC", "COMMENT", "ML_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", null, null, "'Timebase:'", "'Start:'", "'to'", "'var'", 
			"'->'", "'W'", "'kW'", null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"','", "':'", "';'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "POWER_UNIT", "TIME_UNIT", "TIMEBASE", "STARTDATE", "TO", 
			"VARIABLE", "THEN", "WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", 
			"HOUR", "DIGITS2", "DIGITS4", "REAL_NUMBER", "WHOLE_NUMBER", "DAYOFWEEK", 
			"MONTH", "NAME", "PLUS", "MINUS", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"LCURLY", "RCURLY", "COMMA", "COLON", "SEMICOLON", "DOT", "COMMENT", 
			"ML_COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\3\3\3\5\3h\n\3\3\4"+
		"\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u00a5\n\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26"+
		"\3\26\3\27\6\27\u00b8\n\27\r\27\16\27\u00b9\3\30\3\30\5\30\u00be\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00d5\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00fb\n\32\3\33\3\33\3\33\7\33\u0100\n\33\f"+
		"\33\16\33\u0103\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\5,\u0127\n,\3-\3-\3.\3.\3.\3.\7.\u012f\n.\f.\16.\u0132\13.\3.\5."+
		"\u0135\n.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u013f\n/\f/\16/\u0142\13/\3/\3/\3"+
		"/\3/\3/\3\60\6\60\u014a\n\60\r\60\16\60\u014b\3\60\3\60\4\u0130\u0140"+
		"\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61\25\63\26\65\27\67\309\31;\32"+
		"=\33?\34A\35C\36E\37G I!K\"M#O\2Q\2S\2U\2W\2Y\2[$]%_&\3\2\13\4\2UUuu\4"+
		"\2OOoo\4\2JJjj\3\2\62;\5\2\62;CHch\3\2c|\3\2C\\\5\2\62;C\\c|\5\2\13\f"+
		"\17\17\"\"\2\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5g\3\2\2\2\7m\3\2\2\2\to\3\2\2"+
		"\2\13y\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21\u0087\3\2\2\2\23\u008a"+
		"\3\2\2\2\25\u008c\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3"+
		"\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009e\3\2\2\2#\u00a4\3\2\2\2"+
		"%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00bd\3\2\2\2\61\u00d4\3\2\2\2\63\u00fa\3\2\2\2\65\u00fc\3\2\2"+
		"\2\67\u0104\3\2\2\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0110\3\2\2\2E\u0112\3\2\2\2G\u0114\3\2\2\2I"+
		"\u0116\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2\2\2O\u011c\3\2\2\2Q\u011e\3\2"+
		"\2\2S\u0120\3\2\2\2U\u0122\3\2\2\2W\u0126\3\2\2\2Y\u0128\3\2\2\2[\u012a"+
		"\3\2\2\2]\u013a\3\2\2\2_\u0149\3\2\2\2ab\7h\2\2bc\7q\2\2cd\7t\2\2d\4\3"+
		"\2\2\2eh\5\23\n\2fh\5\25\13\2ge\3\2\2\2gf\3\2\2\2h\6\3\2\2\2in\5\27\f"+
		"\2jn\5\31\r\2kn\5\33\16\2ln\5\35\17\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml"+
		"\3\2\2\2n\b\3\2\2\2op\7V\2\2pq\7k\2\2qr\7o\2\2rs\7g\2\2st\7d\2\2tu\7c"+
		"\2\2uv\7u\2\2vw\7g\2\2wx\7<\2\2x\n\3\2\2\2yz\7U\2\2z{\7v\2\2{|\7c\2\2"+
		"|}\7t\2\2}~\7v\2\2~\177\7<\2\2\177\f\3\2\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7q\2\2\u0082\16\3\2\2\2\u0083\u0084\7x\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7t\2\2\u0086\20\3\2\2\2\u0087\u0088\7/\2\2\u0088\u0089\7@\2\2\u0089"+
		"\22\3\2\2\2\u008a\u008b\7Y\2\2\u008b\24\3\2\2\2\u008c\u008d\7m\2\2\u008d"+
		"\u008e\7Y\2\2\u008e\26\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0094\7U\2\2\u0091"+
		"\u0092\7o\2\2\u0092\u0094\7u\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0094\30\3\2\2\2\u0095\u0096\t\2\2\2\u0096\32\3\2\2\2\u0097\u0098\t"+
		"\3\2\2\u0098\34\3\2\2\2\u0099\u009a\t\4\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\5O(\2\u009c\u009d\5O(\2\u009d \3\2\2\2\u009e\u009f\5O(\2\u009f\u00a0"+
		"\5O(\2\u00a0\u00a1\5O(\2\u00a1\u00a2\5O(\2\u00a2\"\3\2\2\2\u00a3\u00a5"+
		"\5)\25\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\5\'\24\2\u00a7$\3\2\2\2\u00a8\u00a9\5)\25\2\u00a9&\3\2\2\2\u00aa"+
		"\u00ab\5M\'\2\u00ab\u00ac\5-\27\2\u00ac(\3\2\2\2\u00ad\u00b2\5\37\20\2"+
		"\u00ae\u00b2\5!\21\2\u00af\u00b2\5-\27\2\u00b0\u00b2\5+\26\2\u00b1\u00ad"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"*\3\2\2\2\u00b3\u00b4\5/\30\2\u00b4\u00b5\5-\27\2\u00b5,\3\2\2\2\u00b6"+
		"\u00b8\5O(\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba.\3\2\2\2\u00bb\u00be\5\67\34\2\u00bc\u00be"+
		"\59\35\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\60\3\2\2\2\u00bf"+
		"\u00c0\7O\2\2\u00c0\u00c1\7q\2\2\u00c1\u00d5\7p\2\2\u00c2\u00c3\7V\2\2"+
		"\u00c3\u00c4\7w\2\2\u00c4\u00d5\7g\2\2\u00c5\u00c6\7Y\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00d5\7f\2\2\u00c8\u00c9\7V\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00d5\7w\2\2\u00cb\u00cc\7H\2\2\u00cc\u00cd\7t\2\2\u00cd\u00d5\7k\2\2"+
		"\u00ce\u00cf\7U\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d5\7v\2\2\u00d1\u00d2"+
		"\7U\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d5\7p\2\2\u00d4\u00bf\3\2\2\2\u00d4"+
		"\u00c2\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00cb\3\2"+
		"\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\62\3\2\2\2\u00d6\u00d7"+
		"\7L\2\2\u00d7\u00d8\7c\2\2\u00d8\u00fb\7p\2\2\u00d9\u00da\7H\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00fb\7d\2\2\u00dc\u00dd\7O\2\2\u00dd\u00de\7c\2\2"+
		"\u00de\u00fb\7t\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7r\2\2\u00e1\u00fb"+
		"\7t\2\2\u00e2\u00e3\7O\2\2\u00e3\u00e4\7c\2\2\u00e4\u00fb\7{\2\2\u00e5"+
		"\u00e6\7L\2\2\u00e6\u00e7\7w\2\2\u00e7\u00fb\7p\2\2\u00e8\u00e9\7L\2\2"+
		"\u00e9\u00ea\7w\2\2\u00ea\u00fb\7n\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed"+
		"\7w\2\2\u00ed\u00fb\7i\2\2\u00ee\u00ef\7U\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00fb\7r\2\2\u00f1\u00f2\7Q\2\2\u00f2\u00f3\7e\2\2\u00f3\u00fb\7v\2\2"+
		"\u00f4\u00f5\7P\2\2\u00f5\u00f6\7q\2\2\u00f6\u00fb\7x\2\2\u00f7\u00f8"+
		"\7F\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fb\7e\2\2\u00fa\u00d6\3\2\2\2\u00fa"+
		"\u00d9\3\2\2\2\u00fa\u00dc\3\2\2\2\u00fa\u00df\3\2\2\2\u00fa\u00e2\3\2"+
		"\2\2\u00fa\u00e5\3\2\2\2\u00fa\u00e8\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa"+
		"\u00ee\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2"+
		"\2\2\u00fb\64\3\2\2\2\u00fc\u0101\5W,\2\u00fd\u0100\5W,\2\u00fe\u0100"+
		"\5O(\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\66\3\2\2\2\u0103\u0101\3\2\2"+
		"\2\u0104\u0105\7-\2\2\u01058\3\2\2\2\u0106\u0107\7/\2\2\u0107:\3\2\2\2"+
		"\u0108\u0109\7*\2\2\u0109<\3\2\2\2\u010a\u010b\7+\2\2\u010b>\3\2\2\2\u010c"+
		"\u010d\7]\2\2\u010d@\3\2\2\2\u010e\u010f\7_\2\2\u010fB\3\2\2\2\u0110\u0111"+
		"\7}\2\2\u0111D\3\2\2\2\u0112\u0113\7\177\2\2\u0113F\3\2\2\2\u0114\u0115"+
		"\7.\2\2\u0115H\3\2\2\2\u0116\u0117\7<\2\2\u0117J\3\2\2\2\u0118\u0119\7"+
		"=\2\2\u0119L\3\2\2\2\u011a\u011b\7\60\2\2\u011bN\3\2\2\2\u011c\u011d\t"+
		"\5\2\2\u011dP\3\2\2\2\u011e\u011f\t\6\2\2\u011fR\3\2\2\2\u0120\u0121\t"+
		"\7\2\2\u0121T\3\2\2\2\u0122\u0123\t\b\2\2\u0123V\3\2\2\2\u0124\u0127\5"+
		"S*\2\u0125\u0127\5U+\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127X"+
		"\3\2\2\2\u0128\u0129\n\t\2\2\u0129Z\3\2\2\2\u012a\u012b\7\61\2\2\u012b"+
		"\u012c\7\61\2\2\u012c\u0130\3\2\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3"+
		"\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7\17\2\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\f\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b.\2\2\u0139\\\3\2\2\2\u013a\u013b\7\61\2\2"+
		"\u013b\u013c\7,\2\2\u013c\u0140\3\2\2\2\u013d\u013f\13\2\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7,\2\2\u0144\u0145\7\61"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b/\2\2\u0147^\3\2\2\2\u0148\u014a"+
		"\t\n\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b\60\2\2\u014e`\3\2\2\2"+
		"\23\2gm\u0093\u00a4\u00b1\u00b9\u00bd\u00d4\u00fa\u00ff\u0101\u0126\u0130"+
		"\u0134\u0140\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}