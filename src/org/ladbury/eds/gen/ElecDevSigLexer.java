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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FOR=7, REAL_NUMBER=8, 
		SIGNED_INT=9, INTEGER=10, SIGN=11, POWER_UNIT=12, TIME_UNIT=13, VARIABLE=14, 
		THEN=15, PLUS=16, MINUS=17, WATT=18, KILOWATT=19, MILLISECOND=20, SECOND=21, 
		MINUTE=22, HOUR=23, NAME=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "FOR", "REAL_NUMBER", 
			"SIGNED_INT", "INTEGER", "SIGN", "POWER_UNIT", "TIME_UNIT", "VARIABLE", 
			"THEN", "PLUS", "MINUS", "WATT", "KILOWATT", "MILLISECOND", "SECOND", 
			"MINUTE", "HOUR", "NAME", "LCASE", "UCASE", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "':'", "')'", "'['", "','", "']'", "'for'", null, null, 
			null, null, null, null, "'var'", "'->'", "'+'", "'-'", "'W'", "'kW'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "FOR", "REAL_NUMBER", "SIGNED_INT", 
			"INTEGER", "SIGN", "POWER_UNIT", "TIME_UNIT", "VARIABLE", "THEN", "PLUS", 
			"MINUS", "WATT", "KILOWATT", "MILLISECOND", "SECOND", "MINUTE", "HOUR", 
			"NAME", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5\tO\n\t\3\t\3"+
		"\t\3\t\6\tT\n\t\r\t\16\tU\5\tX\n\t\3\n\5\n[\n\n\3\n\6\n^\n\n\r\n\16\n"+
		"_\3\13\6\13c\n\13\r\13\16\13d\3\f\3\f\5\fi\n\f\3\r\3\r\5\rm\n\r\3\16\3"+
		"\16\3\16\3\16\5\16s\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0089\n\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u0094\n\31\f\31\16"+
		"\31\u0097\13\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00a1\n\35"+
		"\3\36\6\36\u00a4\n\36\r\36\16\36\u00a5\3\36\3\36\2\2\37\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\33\3\2\t\4\2UUuu\4"+
		"\2OOoo\4\2JJjj\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u00b4\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2"+
		"\2\2\rG\3\2\2\2\17I\3\2\2\2\21N\3\2\2\2\23Z\3\2\2\2\25b\3\2\2\2\27h\3"+
		"\2\2\2\31l\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37x\3\2\2\2!{\3\2\2\2#}\3\2"+
		"\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c"+
		"\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0098\3\2\2\2\65\u009a\3\2"+
		"\2\2\67\u009c\3\2\2\29\u00a0\3\2\2\2;\u00a3\3\2\2\2=>\7*\2\2>\4\3\2\2"+
		"\2?@\7<\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7]\2\2D\n\3\2\2\2EF\7.\2"+
		"\2F\f\3\2\2\2GH\7_\2\2H\16\3\2\2\2IJ\7h\2\2JK\7q\2\2KL\7t\2\2L\20\3\2"+
		"\2\2MO\5\27\f\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PW\5\25\13\2QS\7\60\2\2R"+
		"T\5\67\34\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WQ\3\2\2"+
		"\2WX\3\2\2\2X\22\3\2\2\2Y[\5\27\f\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5"+
		"\67\34\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\24\3\2\2\2ac\5\67\34"+
		"\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\26\3\2\2\2fi\5!\21\2gi\5#"+
		"\22\2hf\3\2\2\2hg\3\2\2\2i\30\3\2\2\2jm\5%\23\2km\5\'\24\2lj\3\2\2\2l"+
		"k\3\2\2\2m\32\3\2\2\2ns\5)\25\2os\5+\26\2ps\5-\27\2qs\5/\30\2rn\3\2\2"+
		"\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\34\3\2\2\2tu\7x\2\2uv\7c\2\2vw\7t\2"+
		"\2w\36\3\2\2\2xy\7/\2\2yz\7@\2\2z \3\2\2\2{|\7-\2\2|\"\3\2\2\2}~\7/\2"+
		"\2~$\3\2\2\2\177\u0080\7Y\2\2\u0080&\3\2\2\2\u0081\u0082\7m\2\2\u0082"+
		"\u0083\7Y\2\2\u0083(\3\2\2\2\u0084\u0085\7o\2\2\u0085\u0089\7U\2\2\u0086"+
		"\u0087\7o\2\2\u0087\u0089\7u\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2"+
		"\2\u0089*\3\2\2\2\u008a\u008b\t\2\2\2\u008b,\3\2\2\2\u008c\u008d\t\3\2"+
		"\2\u008d.\3\2\2\2\u008e\u008f\t\4\2\2\u008f\60\3\2\2\2\u0090\u0095\59"+
		"\35\2\u0091\u0094\59\35\2\u0092\u0094\5\67\34\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\62\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\5\2\2\u0099\64"+
		"\3\2\2\2\u009a\u009b\t\6\2\2\u009b\66\3\2\2\2\u009c\u009d\t\7\2\2\u009d"+
		"8\3\2\2\2\u009e\u00a1\5\63\32\2\u009f\u00a1\5\65\33\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1:\3\2\2\2\u00a2\u00a4\t\b\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\b\36\2\2\u00a8<\3\2\2\2\21\2NUWZ_dhlr\u0088"+
		"\u0093\u0095\u00a0\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}