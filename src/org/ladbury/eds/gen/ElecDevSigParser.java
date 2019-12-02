package org.ladbury.eds.gen;// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, FOR=36, REAL_NUMBER=37, SIGNED_INT=38, 
		INTEGER=39, SIGN=40, POWER_UNIT=41, TIME_UNIT=42, TIMEBASE=43, START=44, 
		TO=45, VARIABLE=46, THEN=47, PLUS=48, MINUS=49, WATT=50, KILOWATT=51, 
		MILLISECOND=52, SECOND=53, MINUTE=54, HOUR=55, NAME=56, WS=57, ALPHA=58, 
		DIGIT=59;
	public static final int
		RULE_init = 0, RULE_startdate = 1, RULE_timebase = 2, RULE_signatures = 3, 
		RULE_device_signature = 4, RULE_energy_signature = 5, RULE_consumption_block = 6, 
		RULE_real_power = 7, RULE_reactive_power = 8, RULE_power = 9, RULE_time_period = 10, 
		RULE_range = 11, RULE_min_time = 12, RULE_max_time = 13, RULE_time_interval = 14, 
		RULE_date_time = 15, RULE_day = 16, RULE_date = 17, RULE_month = 18, RULE_time = 19, 
		RULE_hour = 20, RULE_zone = 21, RULE_two_digit = 22, RULE_four_digit = 23, 
		RULE_alphanumeric = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "startdate", "timebase", "signatures", "device_signature", "energy_signature", 
			"consumption_block", "real_power", "reactive_power", "power", "time_period", 
			"range", "min_time", "max_time", "time_interval", "date_time", "day", 
			"date", "month", "time", "hour", "zone", "two_digit", "four_digit", "alphanumeric"
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
			"WS", "ALPHA", "DIGIT"
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

	public static class InitContext extends ParserRuleContext {
		public SignaturesContext signatures() {
			return getRuleContext(SignaturesContext.class,0);
		}
		public StartdateContext startdate() {
			return getRuleContext(StartdateContext.class,0);
		}
		public TimebaseContext timebase() {
			return getRuleContext(TimebaseContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(50);
				startdate();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMEBASE) {
				{
				setState(53);
				timebase();
				}
			}

			setState(56);
			signatures();
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

	public static class StartdateContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(ElecDevSigParser.START, 0); }
		public Date_timeContext date_time() {
			return getRuleContext(Date_timeContext.class,0);
		}
		public StartdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterStartdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitStartdate(this);
		}
	}

	public final StartdateContext startdate() throws RecognitionException {
		StartdateContext _localctx = new StartdateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(START);
			setState(59);
			date_time();
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

	public static class TimebaseContext extends ParserRuleContext {
		public TerminalNode TIMEBASE() { return getToken(ElecDevSigParser.TIMEBASE, 0); }
		public Time_intervalContext time_interval() {
			return getRuleContext(Time_intervalContext.class,0);
		}
		public TimebaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timebase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTimebase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTimebase(this);
		}
	}

	public final TimebaseContext timebase() throws RecognitionException {
		TimebaseContext _localctx = new TimebaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_timebase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(TIMEBASE);
			setState(62);
			time_interval();
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
		enterRule(_localctx, 6, RULE_signatures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				device_signature();
				}
				}
				setState(67); 
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
		enterRule(_localctx, 8, RULE_device_signature);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(NAME);
				setState(71);
				match(T__1);
				setState(72);
				energy_signature();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(73);
					match(THEN);
					setState(74);
					energy_signature();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__0);
				setState(83);
				match(NAME);
				setState(84);
				match(T__1);
				setState(85);
				device_signature();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(86);
					match(THEN);
					setState(87);
					device_signature();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
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
		enterRule(_localctx, 10, RULE_energy_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			setState(98);
			consumption_block();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(99);
				match(T__4);
				setState(100);
				consumption_block();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		enterRule(_localctx, 12, RULE_consumption_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			real_power();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(109);
				match(T__4);
				setState(110);
				reactive_power();
				}
			}

			setState(113);
			match(FOR);
			setState(114);
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
		enterRule(_localctx, 14, RULE_real_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 16, RULE_reactive_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		enterRule(_localctx, 18, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(REAL_NUMBER);
			setState(121);
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
		public Time_intervalContext time_interval() {
			return getRuleContext(Time_intervalContext.class,0);
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
		enterRule(_localctx, 20, RULE_time_period);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				time_interval();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(VARIABLE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
		public TerminalNode TO() { return getToken(ElecDevSigParser.TO, 0); }
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
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(129);
			min_time();
			setState(130);
			match(TO);
			setState(131);
			max_time();
			setState(132);
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
		public Time_intervalContext time_interval() {
			return getRuleContext(Time_intervalContext.class,0);
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
		enterRule(_localctx, 24, RULE_min_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			time_interval();
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
		public Time_intervalContext time_interval() {
			return getRuleContext(Time_intervalContext.class,0);
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
		enterRule(_localctx, 26, RULE_max_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			time_interval();
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

	public static class Time_intervalContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(ElecDevSigParser.REAL_NUMBER, 0); }
		public TerminalNode TIME_UNIT() { return getToken(ElecDevSigParser.TIME_UNIT, 0); }
		public Time_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTime_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTime_interval(this);
		}
	}

	public final Time_intervalContext time_interval() throws RecognitionException {
		Time_intervalContext _localctx = new Time_intervalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_time_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(138);
			match(REAL_NUMBER);
			setState(139);
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

	public static class Date_timeContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public Date_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterDate_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitDate_time(this);
		}
	}

	public final Date_timeContext date_time() throws RecognitionException {
		Date_timeContext _localctx = new Date_timeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_date_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				setState(141);
				day();
				setState(142);
				match(T__4);
				}
			}

			setState(146);
			date();
			setState(147);
			time();
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

	public static class DayContext extends ParserRuleContext {
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class DateContext extends ParserRuleContext {
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public List<Two_digitContext> two_digit() {
			return getRuleContexts(Two_digitContext.class);
		}
		public Two_digitContext two_digit(int i) {
			return getRuleContext(Two_digitContext.class,i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				two_digit();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA || _la==DIGIT );
			setState(156);
			month();
			setState(157);
			two_digit();
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

	public static class MonthContext extends ParserRuleContext {
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitMonth(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class TimeContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public ZoneContext zone() {
			return getRuleContext(ZoneContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			hour();
			setState(162);
			zone();
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

	public static class HourContext extends ParserRuleContext {
		public List<Two_digitContext> two_digit() {
			return getRuleContexts(Two_digitContext.class);
		}
		public Two_digitContext two_digit(int i) {
			return getRuleContext(Two_digitContext.class,i);
		}
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitHour(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			two_digit();
			setState(165);
			match(T__1);
			setState(166);
			two_digit();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(167);
				match(T__1);
				setState(168);
				two_digit();
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

	public static class ZoneContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(ElecDevSigParser.ALPHA, 0); }
		public Four_digitContext four_digit() {
			return getRuleContext(Four_digitContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ElecDevSigParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ElecDevSigParser.MINUS, 0); }
		public ZoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitZone(this);
		}
	}

	public final ZoneContext zone() throws RecognitionException {
		ZoneContext _localctx = new ZoneContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_zone);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 10);
				{
				setState(180);
				match(T__34);
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				match(ALPHA);
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				four_digit();
				}
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

	public static class Two_digitContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public Two_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_two_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTwo_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTwo_digit(this);
		}
	}

	public final Two_digitContext two_digit() throws RecognitionException {
		Two_digitContext _localctx = new Two_digitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_two_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			alphanumeric();
			setState(187);
			alphanumeric();
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

	public static class Four_digitContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public Four_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_four_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterFour_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitFour_digit(this);
		}
	}

	public final Four_digitContext four_digit() throws RecognitionException {
		Four_digitContext _localctx = new Four_digitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_four_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			alphanumeric();
			setState(190);
			alphanumeric();
			setState(191);
			alphanumeric();
			setState(192);
			alphanumeric();
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

	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(ElecDevSigParser.ALPHA, 0); }
		public TerminalNode DIGIT() { return getToken(ElecDevSigParser.DIGIT, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitAlphanumeric(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==ALPHA || _la==DIGIT) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\5\2\66\n\2\3\2\5\29\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\6\5D\n\5\r\5\16\5E\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\5\6"+
		"b\n\6\3\7\3\7\3\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"r\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0081"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\5\21\u0093\n\21\3\21\3\21\3\21\3\22\3\22\3\23\6\23\u009b\n\23"+
		"\r\23\16\23\u009c\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00bb\n\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\2\6\3\2\t\17\3\2\20\33\3\2\62\63\3\2<=\2\u00c5\2\65\3"+
		"\2\2\2\4<\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16n\3\2"+
		"\2\2\20v\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2"+
		"\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u0092\3\2\2\2"+
		"\"\u0097\3\2\2\2$\u009a\3\2\2\2&\u00a1\3\2\2\2(\u00a3\3\2\2\2*\u00a6\3"+
		"\2\2\2,\u00ba\3\2\2\2.\u00bc\3\2\2\2\60\u00bf\3\2\2\2\62\u00c4\3\2\2\2"+
		"\64\66\5\4\3\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\6\4\28\67"+
		"\3\2\2\289\3\2\2\29:\3\2\2\2:;\5\b\5\2;\3\3\2\2\2<=\7.\2\2=>\5 \21\2>"+
		"\5\3\2\2\2?@\7-\2\2@A\5\36\20\2A\7\3\2\2\2BD\5\n\6\2CB\3\2\2\2DE\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GH\7\3\2\2HI\7:\2\2IJ\7\4\2\2JO\5\f\7"+
		"\2KL\7\61\2\2LN\5\f\7\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2"+
		"\2\2QO\3\2\2\2RS\7\5\2\2Sb\3\2\2\2TU\7\3\2\2UV\7:\2\2VW\7\4\2\2W\\\5\n"+
		"\6\2XY\7\61\2\2Y[\5\n\6\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_"+
		"\3\2\2\2^\\\3\2\2\2_`\7\5\2\2`b\3\2\2\2aG\3\2\2\2aT\3\2\2\2b\13\3\2\2"+
		"\2cd\7\6\2\2di\5\16\b\2ef\7\7\2\2fh\5\16\b\2ge\3\2\2\2hk\3\2\2\2ig\3\2"+
		"\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\b\2\2m\r\3\2\2\2nq\5\20\t\2op\7"+
		"\7\2\2pr\5\22\n\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7&\2\2tu\5\26\f\2u\17"+
		"\3\2\2\2vw\5\24\13\2w\21\3\2\2\2xy\5\24\13\2y\23\3\2\2\2z{\7\'\2\2{|\7"+
		"+\2\2|\25\3\2\2\2}\u0081\5\36\20\2~\u0081\7\60\2\2\177\u0081\5\30\r\2"+
		"\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\27\3\2\2\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7/\2\2\u0085\u0086\5"+
		"\34\17\2\u0086\u0087\7\5\2\2\u0087\31\3\2\2\2\u0088\u0089\5\36\20\2\u0089"+
		"\33\3\2\2\2\u008a\u008b\5\36\20\2\u008b\35\3\2\2\2\u008c\u008d\7\'\2\2"+
		"\u008d\u008e\7,\2\2\u008e\37\3\2\2\2\u008f\u0090\5\"\22\2\u0090\u0091"+
		"\7\7\2\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\5$\23\2\u0095\u0096\5(\25\2\u0096!\3\2\2\2"+
		"\u0097\u0098\t\2\2\2\u0098#\3\2\2\2\u0099\u009b\5.\30\2\u009a\u0099\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\5&\24\2\u009f\u00a0\5.\30\2\u00a0%\3\2\2\2"+
		"\u00a1\u00a2\t\3\2\2\u00a2\'\3\2\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\5"+
		",\27\2\u00a5)\3\2\2\2\u00a6\u00a7\5.\30\2\u00a7\u00a8\7\4\2\2\u00a8\u00ab"+
		"\5.\30\2\u00a9\u00aa\7\4\2\2\u00aa\u00ac\5.\30\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac+\3\2\2\2\u00ad\u00bb\7\34\2\2\u00ae\u00bb\7\35\2"+
		"\2\u00af\u00bb\7\36\2\2\u00b0\u00bb\7\37\2\2\u00b1\u00bb\7 \2\2\u00b2"+
		"\u00bb\7!\2\2\u00b3\u00bb\7\"\2\2\u00b4\u00bb\7#\2\2\u00b5\u00bb\7$\2"+
		"\2\u00b6\u00bb\7%\2\2\u00b7\u00bb\7<\2\2\u00b8\u00b9\t\4\2\2\u00b9\u00bb"+
		"\5\60\31\2\u00ba\u00ad\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00af\3\2\2\2"+
		"\u00ba\u00b0\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3"+
		"\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb-\3\2\2\2\u00bc\u00bd\5\62\32"+
		"\2\u00bd\u00be\5\62\32\2\u00be/\3\2\2\2\u00bf\u00c0\5\62\32\2\u00c0\u00c1"+
		"\5\62\32\2\u00c1\u00c2\5\62\32\2\u00c2\u00c3\5\62\32\2\u00c3\61\3\2\2"+
		"\2\u00c4\u00c5\t\5\2\2\u00c5\63\3\2\2\2\17\658EO\\aiq\u0080\u0092\u009c"+
		"\u00ab\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}