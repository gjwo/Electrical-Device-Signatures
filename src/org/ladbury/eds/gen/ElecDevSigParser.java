// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ElecDevSigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FOR=7, REAL_NUMBER=8, 
		SIGNED_INT=9, INTEGER=10, SIGN=11, POWER_UNIT=12, TIME_UNIT=13, VARIABLE=14, 
		THEN=15, PLUS=16, MINUS=17, WATT=18, KILOWATT=19, MILLISECOND=20, SECOND=21, 
		MINUTE=22, HOUR=23, NAME=24, WS=25;
	public static final int
		RULE_signatures = 0, RULE_device_signature = 1, RULE_energy_signature = 2, 
		RULE_consumption_block = 3, RULE_real_power = 4, RULE_reactive_power = 5, 
		RULE_power = 6, RULE_time_period = 7, RULE_range = 8, RULE_min_time = 9, 
		RULE_max_time = 10, RULE_elapsed_time = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"signatures", "device_signature", "energy_signature", "consumption_block", 
			"real_power", "reactive_power", "power", "time_period", "range", "min_time", 
			"max_time", "elapsed_time"
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

	@Override
	public String getGrammarFileName() { return "ElecDevSig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ElecDevSigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SignaturesContext extends ParserRuleContext {
		public List<Device_signatureContext> device_signature() {
			return getRuleContexts(Device_signatureContext.class);
		}
		public Device_signatureContext device_signature(int i) {
			return getRuleContext(Device_signatureContext.class,i);
		}
		public SignaturesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterSignatures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitSignatures(this);
		}
	}

	public final SignaturesContext signatures() throws RecognitionException {
		SignaturesContext _localctx = new SignaturesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_signatures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				device_signature();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	public static class Device_signatureContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ElecDevSigParser.NAME, 0); }
		public List<Energy_signatureContext> energy_signature() {
			return getRuleContexts(Energy_signatureContext.class);
		}
		public Energy_signatureContext energy_signature(int i) {
			return getRuleContext(Energy_signatureContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(ElecDevSigParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ElecDevSigParser.THEN, i);
		}
		public List<Device_signatureContext> device_signature() {
			return getRuleContexts(Device_signatureContext.class);
		}
		public Device_signatureContext device_signature(int i) {
			return getRuleContext(Device_signatureContext.class,i);
		}
		public Device_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterDevice_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitDevice_signature(this);
		}
	}

	public final Device_signatureContext device_signature() throws RecognitionException {
		Device_signatureContext _localctx = new Device_signatureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_device_signature);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(NAME);
				setState(31);
				match(T__1);
				setState(32);
				energy_signature();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(33);
					match(THEN);
					setState(34);
					energy_signature();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(T__0);
				setState(43);
				match(NAME);
				setState(44);
				match(T__1);
				setState(45);
				device_signature();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(46);
					match(THEN);
					setState(47);
					device_signature();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(T__2);
				}
				break;
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

	public static class Energy_signatureContext extends ParserRuleContext {
		public List<Consumption_blockContext> consumption_block() {
			return getRuleContexts(Consumption_blockContext.class);
		}
		public Consumption_blockContext consumption_block(int i) {
			return getRuleContext(Consumption_blockContext.class,i);
		}
		public Energy_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_energy_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterEnergy_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitEnergy_signature(this);
		}
	}

	public final Energy_signatureContext energy_signature() throws RecognitionException {
		Energy_signatureContext _localctx = new Energy_signatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_energy_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__3);
			setState(58);
			consumption_block();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(59);
				match(T__4);
				setState(60);
				consumption_block();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__5);
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

	public static class Consumption_blockContext extends ParserRuleContext {
		public Real_powerContext real_power() {
			return getRuleContext(Real_powerContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ElecDevSigParser.FOR, 0); }
		public Time_periodContext time_period() {
			return getRuleContext(Time_periodContext.class,0);
		}
		public Reactive_powerContext reactive_power() {
			return getRuleContext(Reactive_powerContext.class,0);
		}
		public Consumption_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consumption_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterConsumption_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitConsumption_block(this);
		}
	}

	public final Consumption_blockContext consumption_block() throws RecognitionException {
		Consumption_blockContext _localctx = new Consumption_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_consumption_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			real_power();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(69);
				match(T__4);
				setState(70);
				reactive_power();
				}
			}

			setState(73);
			match(FOR);
			setState(74);
			time_period();
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

	public static class Real_powerContext extends ParserRuleContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Real_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterReal_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitReal_power(this);
		}
	}

	public final Real_powerContext real_power() throws RecognitionException {
		Real_powerContext _localctx = new Real_powerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_real_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			power();
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

	public static class Reactive_powerContext extends ParserRuleContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public Reactive_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reactive_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterReactive_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitReactive_power(this);
		}
	}

	public final Reactive_powerContext reactive_power() throws RecognitionException {
		Reactive_powerContext _localctx = new Reactive_powerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reactive_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			power();
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

	public static class PowerContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(ElecDevSigParser.REAL_NUMBER, 0); }
		public TerminalNode POWER_UNIT() { return getToken(ElecDevSigParser.POWER_UNIT, 0); }
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(REAL_NUMBER);
			setState(81);
			match(POWER_UNIT);
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

	public static class Time_periodContext extends ParserRuleContext {
		public Elapsed_timeContext elapsed_time() {
			return getRuleContext(Elapsed_timeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(ElecDevSigParser.VARIABLE, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Time_periodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTime_period(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTime_period(this);
		}
	}

	public final Time_periodContext time_period() throws RecognitionException {
		Time_periodContext _localctx = new Time_periodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time_period);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				elapsed_time();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(VARIABLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class RangeContext extends ParserRuleContext {
		public Min_timeContext min_time() {
			return getRuleContext(Min_timeContext.class,0);
		}
		public Max_timeContext max_time() {
			return getRuleContext(Max_timeContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			min_time();
			setState(90);
			match(T__4);
			setState(91);
			max_time();
			setState(92);
			match(T__2);
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

	public static class Min_timeContext extends ParserRuleContext {
		public Elapsed_timeContext elapsed_time() {
			return getRuleContext(Elapsed_timeContext.class,0);
		}
		public Min_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterMin_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitMin_time(this);
		}
	}

	public final Min_timeContext min_time() throws RecognitionException {
		Min_timeContext _localctx = new Min_timeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_min_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			elapsed_time();
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

	public static class Max_timeContext extends ParserRuleContext {
		public Elapsed_timeContext elapsed_time() {
			return getRuleContext(Elapsed_timeContext.class,0);
		}
		public Max_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterMax_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitMax_time(this);
		}
	}

	public final Max_timeContext max_time() throws RecognitionException {
		Max_timeContext _localctx = new Max_timeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_max_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			elapsed_time();
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

	public static class Elapsed_timeContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(ElecDevSigParser.REAL_NUMBER, 0); }
		public TerminalNode TIME_UNIT() { return getToken(ElecDevSigParser.TIME_UNIT, 0); }
		public Elapsed_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elapsed_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterElapsed_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitElapsed_time(this);
		}
	}

	public final Elapsed_timeContext elapsed_time() throws RecognitionException {
		Elapsed_timeContext _localctx = new Elapsed_timeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elapsed_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			match(REAL_NUMBER);
			setState(99);
			match(TIME_UNIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3\16"+
		"\3\66\13\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2c\2\33\3\2\2\2\49\3"+
		"\2\2\2\6;\3\2\2\2\bF\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20X\3\2"+
		"\2\2\22Z\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32\34\5\4\3\2\33"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37"+
		" \7\3\2\2 !\7\32\2\2!\"\7\4\2\2\"\'\5\6\4\2#$\7\21\2\2$&\5\6\4\2%#\3\2"+
		"\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\5\2\2+:"+
		"\3\2\2\2,-\7\3\2\2-.\7\32\2\2./\7\4\2\2/\64\5\4\3\2\60\61\7\21\2\2\61"+
		"\63\5\4\3\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\678\7\5\2\28:\3\2\2\29\37\3\2\2\29,\3\2\2\2"+
		":\5\3\2\2\2;<\7\6\2\2<A\5\b\5\2=>\7\7\2\2>@\5\b\5\2?=\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\b\2\2E\7\3\2\2\2FI\5\n"+
		"\6\2GH\7\7\2\2HJ\5\f\7\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\t\2\2LM\5\20"+
		"\t\2M\t\3\2\2\2NO\5\16\b\2O\13\3\2\2\2PQ\5\16\b\2Q\r\3\2\2\2RS\7\n\2\2"+
		"ST\7\16\2\2T\17\3\2\2\2UY\5\30\r\2VY\7\20\2\2WY\5\22\n\2XU\3\2\2\2XV\3"+
		"\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\7\3\2\2[\\\5\24\13\2\\]\7\7\2\2]^\5\26"+
		"\f\2^_\7\5\2\2_\23\3\2\2\2`a\5\30\r\2a\25\3\2\2\2bc\5\30\r\2c\27\3\2\2"+
		"\2de\7\n\2\2ef\7\17\2\2f\31\3\2\2\2\t\35\'\649AIX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}