package org.ladbury.eds.gen;// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, FOR=36, REAL_NUMBER=37, SIGNED_INT=38, 
		INTEGER=39, SIGN=40, POWER_UNIT=41, TIME_UNIT=42, TIMEBASE=43, START=44, 
		TO=45, VARIABLE=46, THEN=47, PLUS=48, MINUS=49, WATT=50, KILOWATT=51, 
		MILLISECOND=52, SECOND=53, MINUTE=54, HOUR=55, NAME=56, WS=57, ALPHA=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "FOR", "REAL_NUMBER", "SIGNED_INT", "INTEGER", "SIGN", 
			"POWER_UNIT", "TIME_UNIT", "TIMEBASE", "START", "TO", "VARIABLE", "THEN", 
			"PLUS", "MINUS", "WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", 
			"HOUR", "NAME", "LCASE", "UCASE", "DIGIT", "LETTER", "WS", "CHAR", "ALPHA", 
			"NOTALPHANUMERIC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "':'", "')'", "'['", "','", "']'", "'Mon'", "'Tue'", "'Wed'", 
			"'Thu'", "'Fri'", "'Sat'", "'Sun'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", 
			"'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'", 
			"'UT'", "'GMT'", "'EST'", "'EDT'", "'CST'", "'CDT'", "'MST'", "'MDT'", 
			"'PST'", "'PDT'", "'for'", null, null, null, null, null, null, "'Timebase: '", 
			"'Start: '", "'to'", "'var'", "'->'", "'+'", "'-'", "'W'", "'kW'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"FOR", "REAL_NUMBER", "SIGNED_INT", "INTEGER", "SIGN", "POWER_UNIT", 
			"TIME_UNIT", "TIMEBASE", "START", "TO", "VARIABLE", "THEN", "PLUS", "MINUS", 
			"WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", "HOUR", "NAME", 
			"WS", "ALPHA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\5&\u0108\n&\3&\3&\3&\6"+
		"&\u010d\n&\r&\16&\u010e\5&\u0111\n&\3\'\5\'\u0114\n\'\3\'\6\'\u0117\n"+
		"\'\r\'\16\'\u0118\3(\6(\u011c\n(\r(\16(\u011d\3)\3)\5)\u0122\n)\3*\3*"+
		"\5*\u0126\n*\3+\3+\3+\3+\5+\u012c\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0158\n\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\39\79\u0163\n9\f9\169\u0166\139\3:\3"+
		":\3;\3;\3<\3<\3=\3=\5=\u0170\n=\3>\6>\u0173\n>\r>\16>\u0174\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\2\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s\2u\2w\2y\2{;}\2\177<\u0081\2\3\2\f\4\2UUuu\4\2"+
		"OOoo\4\2JJjj\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\3\2\2\u0081\4\2C"+
		"\\c|\5\2\62;C\\c|\2\u0187\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2{\3\2\2\2\2\177\3\2"+
		"\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13"+
		"\u008b\3\2\2\2\r\u008d\3\2\2\2\17\u008f\3\2\2\2\21\u0093\3\2\2\2\23\u0097"+
		"\3\2\2\2\25\u009b\3\2\2\2\27\u009f\3\2\2\2\31\u00a3\3\2\2\2\33\u00a7\3"+
		"\2\2\2\35\u00ab\3\2\2\2\37\u00af\3\2\2\2!\u00b3\3\2\2\2#\u00b7\3\2\2\2"+
		"%\u00bb\3\2\2\2\'\u00bf\3\2\2\2)\u00c3\3\2\2\2+\u00c7\3\2\2\2-\u00cb\3"+
		"\2\2\2/\u00cf\3\2\2\2\61\u00d3\3\2\2\2\63\u00d7\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00de\3\2\2\29\u00e2\3\2\2\2;\u00e6\3\2\2\2=\u00ea\3\2\2\2?\u00ee"+
		"\3\2\2\2A\u00f2\3\2\2\2C\u00f6\3\2\2\2E\u00fa\3\2\2\2G\u00fe\3\2\2\2I"+
		"\u0102\3\2\2\2K\u0107\3\2\2\2M\u0113\3\2\2\2O\u011b\3\2\2\2Q\u0121\3\2"+
		"\2\2S\u0125\3\2\2\2U\u012b\3\2\2\2W\u012d\3\2\2\2Y\u0138\3\2\2\2[\u0140"+
		"\3\2\2\2]\u0143\3\2\2\2_\u0147\3\2\2\2a\u014a\3\2\2\2c\u014c\3\2\2\2e"+
		"\u014e\3\2\2\2g\u0150\3\2\2\2i\u0157\3\2\2\2k\u0159\3\2\2\2m\u015b\3\2"+
		"\2\2o\u015d\3\2\2\2q\u015f\3\2\2\2s\u0167\3\2\2\2u\u0169\3\2\2\2w\u016b"+
		"\3\2\2\2y\u016f\3\2\2\2{\u0172\3\2\2\2}\u0178\3\2\2\2\177\u017a\3\2\2"+
		"\2\u0081\u017c\3\2\2\2\u0083\u0084\7*\2\2\u0084\4\3\2\2\2\u0085\u0086"+
		"\7<\2\2\u0086\6\3\2\2\2\u0087\u0088\7+\2\2\u0088\b\3\2\2\2\u0089\u008a"+
		"\7]\2\2\u008a\n\3\2\2\2\u008b\u008c\7.\2\2\u008c\f\3\2\2\2\u008d\u008e"+
		"\7_\2\2\u008e\16\3\2\2\2\u008f\u0090\7O\2\2\u0090\u0091\7q\2\2\u0091\u0092"+
		"\7p\2\2\u0092\20\3\2\2\2\u0093\u0094\7V\2\2\u0094\u0095\7w\2\2\u0095\u0096"+
		"\7g\2\2\u0096\22\3\2\2\2\u0097\u0098\7Y\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7f\2\2\u009a\24\3\2\2\2\u009b\u009c\7V\2\2\u009c\u009d\7j\2\2\u009d\u009e"+
		"\7w\2\2\u009e\26\3\2\2\2\u009f\u00a0\7H\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa"+
		"\7p\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7L\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7H\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7d\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7O\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7C\2\2\u00b8\u00b9\7r\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7{\2\2\u00be&\3\2\2\2\u00bf\u00c0\7L\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\7p\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7L\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7n\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\7i\2\2\u00ca,\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6"+
		"\7x\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7F\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7e\2\2\u00da\64\3\2\2\2\u00db\u00dc\7W\2\2\u00dc\u00dd\7V\2\2\u00dd\66"+
		"\3\2\2\2\u00de\u00df\7I\2\2\u00df\u00e0\7O\2\2\u00e0\u00e1\7V\2\2\u00e1"+
		"8\3\2\2\2\u00e2\u00e3\7G\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7V\2\2\u00e5"+
		":\3\2\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7V\2\2\u00e9"+
		"<\3\2\2\2\u00ea\u00eb\7E\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7V\2\2\u00ed"+
		">\3\2\2\2\u00ee\u00ef\7E\2\2\u00ef\u00f0\7F\2\2\u00f0\u00f1\7V\2\2\u00f1"+
		"@\3\2\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		"B\3\2\2\2\u00f6\u00f7\7O\2\2\u00f7\u00f8\7F\2\2\u00f8\u00f9\7V\2\2\u00f9"+
		"D\3\2\2\2\u00fa\u00fb\7R\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7V\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u00ff\7R\2\2\u00ff\u0100\7F\2\2\u0100\u0101\7V\2\2\u0101"+
		"H\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7q\2\2\u0104\u0105\7t\2\2\u0105"+
		"J\3\2\2\2\u0106\u0108\5Q)\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0110\5O(\2\u010a\u010c\7\60\2\2\u010b\u010d\5w<"+
		"\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"L\3\2\2\2\u0112\u0114\5Q)\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u0117\5w<\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119N\3\2\2\2\u011a\u011c"+
		"\5w<\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u0122\5a\61\2\u0120\u0122\5c\62\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122R\3\2\2\2\u0123\u0126\5"+
		"e\63\2\u0124\u0126\5g\64\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"T\3\2\2\2\u0127\u012c\5i\65\2\u0128\u012c\5k\66\2\u0129\u012c\5m\67\2"+
		"\u012a\u012c\5o8\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012cV\3\2\2\2\u012d\u012e\7V\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u0130\7o\2\2\u0130\u0131\7g\2\2\u0131\u0132\7d\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7u\2\2\u0134\u0135\7g\2\2\u0135\u0136\7<\2\2"+
		"\u0136\u0137\7\"\2\2\u0137X\3\2\2\2\u0138\u0139\7U\2\2\u0139\u013a\7v"+
		"\2\2\u013a\u013b\7c\2\2\u013b\u013c\7t\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7<\2\2\u013e\u013f\7\"\2\2\u013fZ\3\2\2\2\u0140\u0141\7v\2\2\u0141\u0142"+
		"\7q\2\2\u0142\\\3\2\2\2\u0143\u0144\7x\2\2\u0144\u0145\7c\2\2\u0145\u0146"+
		"\7t\2\2\u0146^\3\2\2\2\u0147\u0148\7/\2\2\u0148\u0149\7@\2\2\u0149`\3"+
		"\2\2\2\u014a\u014b\7-\2\2\u014bb\3\2\2\2\u014c\u014d\7/\2\2\u014dd\3\2"+
		"\2\2\u014e\u014f\7Y\2\2\u014ff\3\2\2\2\u0150\u0151\7m\2\2\u0151\u0152"+
		"\7Y\2\2\u0152h\3\2\2\2\u0153\u0154\7o\2\2\u0154\u0158\7U\2\2\u0155\u0156"+
		"\7o\2\2\u0156\u0158\7u\2\2\u0157\u0153\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"j\3\2\2\2\u0159\u015a\t\2\2\2\u015al\3\2\2\2\u015b\u015c\t\3\2\2\u015c"+
		"n\3\2\2\2\u015d\u015e\t\4\2\2\u015ep\3\2\2\2\u015f\u0164\5y=\2\u0160\u0163"+
		"\5y=\2\u0161\u0163\5w<\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165r\3\2\2\2"+
		"\u0166\u0164\3\2\2\2\u0167\u0168\t\5\2\2\u0168t\3\2\2\2\u0169\u016a\t"+
		"\6\2\2\u016av\3\2\2\2\u016b\u016c\t\7\2\2\u016cx\3\2\2\2\u016d\u0170\5"+
		"s:\2\u016e\u0170\5u;\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170z"+
		"\3\2\2\2\u0171\u0173\t\b\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b>"+
		"\2\2\u0177|\3\2\2\2\u0178\u0179\t\t\2\2\u0179~\3\2\2\2\u017a\u017b\t\n"+
		"\2\2\u017b\u0080\3\2\2\2\u017c\u017d\n\13\2\2\u017d\u0082\3\2\2\2\21\2"+
		"\u0107\u010e\u0110\u0113\u0118\u011d\u0121\u0125\u012b\u0157\u0162\u0164"+
		"\u016f\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}