// Generated from C:/Users/graha/Development/Electrical_Device_Signatures/Grammars\ElecDevSig.g4 by ANTLR 4.7.2
package org.ladbury.eds.gen;
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
		FOR=1, POWER_UNIT=2, TIME_UNIT=3, TIMEBASE=4, STARTDATE=5, TO=6, VARIABLE=7, 
		THEN=8, WATT=9, KILOWATT=10, MILLISECOND=11, SECOND=12, MINUTE=13, HOUR=14, 
		NAME=15, REAL_NUMBER=16, SIGNED_INT=17, INTEGER=18, DIGITS2=19, DIGITS4=20, 
		SIGN=21, ALPHANUMERIC=22, DAYOFWEEK=23, MONTH=24, PLUS=25, MINUS=26, LBRACE=27, 
		RBRACE=28, LBRACKET=29, RBRACKET=30, LCURLY=31, RCURLY=32, COMMA=33, COLON=34, 
		SEMICOLON=35, DOT=36, COMMENT=37, ML_COMMENT=38, WS=39;
	public static final int
		RULE_init = 0, RULE_startdate = 1, RULE_timebase = 2, RULE_signatures = 3, 
		RULE_device_signature = 4, RULE_energy_signature = 5, RULE_consumption_block = 6, 
		RULE_real_power = 7, RULE_reactive_power = 8, RULE_power = 9, RULE_time_period = 10, 
		RULE_range = 11, RULE_min_time = 12, RULE_max_time = 13, RULE_time_interval = 14, 
		RULE_date = 15, RULE_time_of_day = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "startdate", "timebase", "signatures", "device_signature", "energy_signature", 
			"consumption_block", "real_power", "reactive_power", "power", "time_period", 
			"range", "min_time", "max_time", "time_interval", "date", "time_of_day"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTDATE) {
				{
				setState(34);
				startdate();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMEBASE) {
				{
				setState(37);
				timebase();
				}
			}

			setState(40);
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
		public TerminalNode STARTDATE() { return getToken(ElecDevSigParser.STARTDATE, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Time_of_dayContext time_of_day() {
			return getRuleContext(Time_of_dayContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(STARTDATE);
			setState(43);
			date();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGITS2) {
				{
				setState(44);
				time_of_day();
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
			setState(47);
			match(TIMEBASE);
			setState(48);
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				device_signature();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACE );
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
		public TerminalNode LBRACE() { return getToken(ElecDevSigParser.LBRACE, 0); }
		public TerminalNode NAME() { return getToken(ElecDevSigParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(ElecDevSigParser.COLON, 0); }
		public List<Energy_signatureContext> energy_signature() {
			return getRuleContexts(Energy_signatureContext.class);
		}
		public Energy_signatureContext energy_signature(int i) {
			return getRuleContext(Energy_signatureContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ElecDevSigParser.RBRACE, 0); }
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(LBRACE);
				setState(56);
				match(NAME);
				setState(57);
				match(COLON);
				setState(58);
				energy_signature();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(59);
					match(THEN);
					setState(60);
					energy_signature();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(LBRACE);
				setState(69);
				match(NAME);
				setState(70);
				match(COLON);
				setState(71);
				device_signature();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(72);
					match(THEN);
					setState(73);
					device_signature();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(RBRACE);
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
		public TerminalNode LBRACKET() { return getToken(ElecDevSigParser.LBRACKET, 0); }
		public List<Consumption_blockContext> consumption_block() {
			return getRuleContexts(Consumption_blockContext.class);
		}
		public Consumption_blockContext consumption_block(int i) {
			return getRuleContext(Consumption_blockContext.class,i);
		}
		public TerminalNode RBRACKET() { return getToken(ElecDevSigParser.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ElecDevSigParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ElecDevSigParser.COMMA, i);
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
			setState(83);
			match(LBRACKET);
			setState(84);
			consumption_block();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				consumption_block();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RBRACKET);
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
		public TerminalNode COMMA() { return getToken(ElecDevSigParser.COMMA, 0); }
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
			setState(94);
			real_power();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(95);
				match(COMMA);
				setState(96);
				reactive_power();
				}
			}

			setState(99);
			match(FOR);
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(106);
			match(REAL_NUMBER);
			setState(107);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				time_interval();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(VARIABLE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
		public TerminalNode LBRACE() { return getToken(ElecDevSigParser.LBRACE, 0); }
		public Min_timeContext min_time() {
			return getRuleContext(Min_timeContext.class,0);
		}
		public TerminalNode TO() { return getToken(ElecDevSigParser.TO, 0); }
		public Max_timeContext max_time() {
			return getRuleContext(Max_timeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ElecDevSigParser.RBRACE, 0); }
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
			setState(114);
			match(LBRACE);
			setState(115);
			min_time();
			setState(116);
			match(TO);
			setState(117);
			max_time();
			setState(118);
			match(RBRACE);
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
			setState(120);
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
			setState(122);
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
			setState(124);
			match(REAL_NUMBER);
			setState(125);
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS2() { return getTokens(ElecDevSigParser.DIGITS2); }
		public TerminalNode DIGITS2(int i) {
			return getToken(ElecDevSigParser.DIGITS2, i);
		}
		public TerminalNode MONTH() { return getToken(ElecDevSigParser.MONTH, 0); }
		public TerminalNode DIGITS4() { return getToken(ElecDevSigParser.DIGITS4, 0); }
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
		enterRule(_localctx, 30, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(DIGITS2);
			setState(128);
			match(MONTH);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==DIGITS2 || _la==DIGITS4) ) {
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

	public static class Time_of_dayContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS2() { return getTokens(ElecDevSigParser.DIGITS2); }
		public TerminalNode DIGITS2(int i) {
			return getToken(ElecDevSigParser.DIGITS2, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ElecDevSigParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ElecDevSigParser.COLON, i);
		}
		public Time_of_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_of_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterTime_of_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitTime_of_day(this);
		}
	}

	public final Time_of_dayContext time_of_day() throws RecognitionException {
		Time_of_dayContext _localctx = new Time_of_dayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_time_of_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(DIGITS2);
			setState(132);
			match(COLON);
			setState(133);
			match(DIGITS2);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(134);
				match(COLON);
				setState(135);
				match(DIGITS2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\5\2&\n\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\3\5\6\5\66\n\5\r\5\16\5\67\3\6\3\6\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6"+
		"C\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6"+
		"\5\6T\n\6\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\bd\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\5\fs"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u008b\n\22\3\22\2\2\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\25\26\2\u0087\2%\3\2\2"+
		"\2\4,\3\2\2\2\6\61\3\2\2\2\b\65\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16`\3\2"+
		"\2\2\20h\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26r\3\2\2\2\30t\3\2\2\2\32z\3"+
		"\2\2\2\34|\3\2\2\2\36~\3\2\2\2 \u0081\3\2\2\2\"\u0085\3\2\2\2$&\5\4\3"+
		"\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')\5\6\4\2(\'\3\2\2\2()\3\2\2\2)*\3\2"+
		"\2\2*+\5\b\5\2+\3\3\2\2\2,-\7\7\2\2-/\5 \21\2.\60\5\"\22\2/.\3\2\2\2/"+
		"\60\3\2\2\2\60\5\3\2\2\2\61\62\7\6\2\2\62\63\5\36\20\2\63\7\3\2\2\2\64"+
		"\66\5\n\6\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\t\3"+
		"\2\2\29:\7\35\2\2:;\7\21\2\2;<\7$\2\2<A\5\f\7\2=>\7\n\2\2>@\5\f\7\2?="+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\36\2\2"+
		"ET\3\2\2\2FG\7\35\2\2GH\7\21\2\2HI\7$\2\2IN\5\n\6\2JK\7\n\2\2KM\5\n\6"+
		"\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\36"+
		"\2\2RT\3\2\2\2S9\3\2\2\2SF\3\2\2\2T\13\3\2\2\2UV\7\37\2\2V[\5\16\b\2W"+
		"X\7#\2\2XZ\5\16\b\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2][\3\2\2\2^_\7 \2\2_\r\3\2\2\2`c\5\20\t\2ab\7#\2\2bd\5\22\n\2ca\3\2"+
		"\2\2cd\3\2\2\2de\3\2\2\2ef\7\3\2\2fg\5\26\f\2g\17\3\2\2\2hi\5\24\13\2"+
		"i\21\3\2\2\2jk\5\24\13\2k\23\3\2\2\2lm\7\22\2\2mn\7\4\2\2n\25\3\2\2\2"+
		"os\5\36\20\2ps\7\t\2\2qs\5\30\r\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\27\3"+
		"\2\2\2tu\7\35\2\2uv\5\32\16\2vw\7\b\2\2wx\5\34\17\2xy\7\36\2\2y\31\3\2"+
		"\2\2z{\5\36\20\2{\33\3\2\2\2|}\5\36\20\2}\35\3\2\2\2~\177\7\22\2\2\177"+
		"\u0080\7\5\2\2\u0080\37\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083\7\32"+
		"\2\2\u0083\u0084\t\2\2\2\u0084!\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\7$\2\2\u0087\u008a\7\25\2\2\u0088\u0089\7$\2\2\u0089\u008b\7\25\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b#\3\2\2\2\r%(/\67ANS[cr\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}