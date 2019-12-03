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
		FLAT=8, RISING=9, FALLING=10, RANDOM=11, THEN=12, WATT=13, KILOWATT=14, 
		MILLISECOND=15, SECOND=16, MINUTE=17, HOUR=18, DIGITS2=19, DIGITS4=20, 
		REAL_NUMBER=21, WHOLE_NUMBER=22, DAYOFWEEK=23, MONTH=24, NAME=25, PLUS=26, 
		MINUS=27, LBRACE=28, RBRACE=29, LBRACKET=30, RBRACKET=31, LCURLY=32, RCURLY=33, 
		COMMA=34, COLON=35, SEMICOLON=36, DOT=37, COMMENT=38, ML_COMMENT=39, WS=40;
	public static final int
		RULE_init = 0, RULE_startdate = 1, RULE_timebase = 2, RULE_date = 3, RULE_year = 4, 
		RULE_day_of_month = 5, RULE_time_of_day = 6, RULE_signatures = 7, RULE_device_signature = 8, 
		RULE_energy_signature = 9, RULE_consumption_block = 10, RULE_real_power = 11, 
		RULE_reactive_power = 12, RULE_number = 13, RULE_integer = 14, RULE_power = 15, 
		RULE_power_range = 16, RULE_shape = 17, RULE_time_period = 18, RULE_range = 19, 
		RULE_min_time = 20, RULE_max_time = 21, RULE_time_interval = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "startdate", "timebase", "date", "year", "day_of_month", "time_of_day", 
			"signatures", "device_signature", "energy_signature", "consumption_block", 
			"real_power", "reactive_power", "number", "integer", "power", "power_range", 
			"shape", "time_period", "range", "min_time", "max_time", "time_interval"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTDATE) {
				{
				setState(46);
				startdate();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMEBASE) {
				{
				setState(49);
				timebase();
				}
			}

			setState(52);
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
			setState(54);
			match(STARTDATE);
			setState(55);
			date();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGITS2) {
				{
				setState(56);
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
			setState(59);
			match(TIMEBASE);
			setState(60);
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

	public static class DateContext extends ParserRuleContext {
		public Day_of_monthContext day_of_month() {
			return getRuleContext(Day_of_monthContext.class,0);
		}
		public TerminalNode MONTH() { return getToken(ElecDevSigParser.MONTH, 0); }
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
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
		enterRule(_localctx, 6, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			day_of_month();
			setState(63);
			match(MONTH);
			setState(64);
			year();
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

	public static class YearContext extends ParserRuleContext {
		public TerminalNode DIGITS2() { return getToken(ElecDevSigParser.DIGITS2, 0); }
		public TerminalNode DIGITS4() { return getToken(ElecDevSigParser.DIGITS4, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_year);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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

	public static class Day_of_monthContext extends ParserRuleContext {
		public TerminalNode DIGITS2() { return getToken(ElecDevSigParser.DIGITS2, 0); }
		public Day_of_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_of_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterDay_of_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitDay_of_month(this);
		}
	}

	public final Day_of_monthContext day_of_month() throws RecognitionException {
		Day_of_monthContext _localctx = new Day_of_monthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_day_of_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DIGITS2);
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
		enterRule(_localctx, 12, RULE_time_of_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(DIGITS2);
			setState(71);
			match(COLON);
			setState(72);
			match(DIGITS2);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(73);
				match(COLON);
				setState(74);
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
		enterRule(_localctx, 14, RULE_signatures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				device_signature();
				}
				}
				setState(80); 
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
		enterRule(_localctx, 16, RULE_device_signature);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(LBRACE);
				setState(83);
				match(NAME);
				setState(84);
				match(COLON);
				setState(85);
				energy_signature();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(86);
					match(THEN);
					setState(87);
					energy_signature();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(LBRACE);
				setState(96);
				match(NAME);
				setState(97);
				match(COLON);
				setState(98);
				device_signature();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(99);
					match(THEN);
					setState(100);
					device_signature();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
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
		enterRule(_localctx, 18, RULE_energy_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LBRACKET);
			setState(111);
			consumption_block();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				consumption_block();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		enterRule(_localctx, 20, RULE_consumption_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			real_power();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(122);
				match(COMMA);
				setState(123);
				reactive_power();
				}
			}

			setState(126);
			match(FOR);
			setState(127);
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
		enterRule(_localctx, 22, RULE_real_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 24, RULE_reactive_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode REAL_NUMBER() { return getToken(ElecDevSigParser.REAL_NUMBER, 0); }
		public TerminalNode WHOLE_NUMBER() { return getToken(ElecDevSigParser.WHOLE_NUMBER, 0); }
		public TerminalNode DIGITS2() { return getToken(ElecDevSigParser.DIGITS2, 0); }
		public TerminalNode DIGITS4() { return getToken(ElecDevSigParser.DIGITS4, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS2) | (1L << DIGITS4) | (1L << REAL_NUMBER) | (1L << WHOLE_NUMBER))) != 0)) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode WHOLE_NUMBER() { return getToken(ElecDevSigParser.WHOLE_NUMBER, 0); }
		public TerminalNode DIGITS2() { return getToken(ElecDevSigParser.DIGITS2, 0); }
		public TerminalNode DIGITS4() { return getToken(ElecDevSigParser.DIGITS4, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGITS2) | (1L << DIGITS4) | (1L << WHOLE_NUMBER))) != 0)) ) {
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

	public static class PowerContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode POWER_UNIT() { return getToken(ElecDevSigParser.POWER_UNIT, 0); }
		public Power_rangeContext power_range() {
			return getRuleContext(Power_rangeContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_power);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS2:
			case DIGITS4:
			case REAL_NUMBER:
			case WHOLE_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				number();
				setState(138);
				match(POWER_UNIT);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				power_range();
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

	public static class Power_rangeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ElecDevSigParser.LBRACE, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> POWER_UNIT() { return getTokens(ElecDevSigParser.POWER_UNIT); }
		public TerminalNode POWER_UNIT(int i) {
			return getToken(ElecDevSigParser.POWER_UNIT, i);
		}
		public TerminalNode COLON() { return getToken(ElecDevSigParser.COLON, 0); }
		public TerminalNode RBRACE() { return getToken(ElecDevSigParser.RBRACE, 0); }
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public Power_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterPower_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitPower_range(this);
		}
	}

	public final Power_rangeContext power_range() throws RecognitionException {
		Power_rangeContext _localctx = new Power_rangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_power_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LBRACE);
			setState(144);
			number();
			setState(145);
			match(POWER_UNIT);
			setState(146);
			match(COLON);
			setState(147);
			number();
			setState(148);
			match(POWER_UNIT);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAT) | (1L << RISING) | (1L << FALLING) | (1L << RANDOM))) != 0)) {
				{
				setState(149);
				shape();
				}
			}

			setState(152);
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

	public static class ShapeContext extends ParserRuleContext {
		public TerminalNode FLAT() { return getToken(ElecDevSigParser.FLAT, 0); }
		public TerminalNode RISING() { return getToken(ElecDevSigParser.RISING, 0); }
		public TerminalNode FALLING() { return getToken(ElecDevSigParser.FALLING, 0); }
		public TerminalNode RANDOM() { return getToken(ElecDevSigParser.RANDOM, 0); }
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ElecDevSigListener ) ((ElecDevSigListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shape);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLAT) | (1L << RISING) | (1L << FALLING) | (1L << RANDOM))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_time_period);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS2:
			case DIGITS4:
			case WHOLE_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				time_interval();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(VARIABLE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
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
		enterRule(_localctx, 38, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LBRACE);
			setState(162);
			min_time();
			setState(163);
			match(TO);
			setState(164);
			max_time();
			setState(165);
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
		enterRule(_localctx, 40, RULE_min_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 42, RULE_max_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_time_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			integer();
			setState(172);
			match(TIME_UNIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\5\2\65\n\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\6\tQ\n\t\r\t\16"+
		"\tR\3\n\3\n\3\n\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\n\3\n\5\no\n\n\3\13\3\13\3\13"+
		"\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\3\f\3\f\3\f\5\f\177\n\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\5"+
		"\21\u0090\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0099\n\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u00a2\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\25\26\3\2\25\30\4\2\25\26\30\30"+
		"\3\2\n\r\2\u00a7\2\61\3\2\2\2\48\3\2\2\2\6=\3\2\2\2\b@\3\2\2\2\nD\3\2"+
		"\2\2\fF\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2\22n\3\2\2\2\24p\3\2\2\2\26{\3"+
		"\2\2\2\30\u0083\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u0089\3\2"+
		"\2\2 \u008f\3\2\2\2\"\u0091\3\2\2\2$\u009c\3\2\2\2&\u00a1\3\2\2\2(\u00a3"+
		"\3\2\2\2*\u00a9\3\2\2\2,\u00ab\3\2\2\2.\u00ad\3\2\2\2\60\62\5\4\3\2\61"+
		"\60\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\3\2\2\2\66\67\5\20\t\2\67\3\3\2\2\289\7\7\2\29;\5\b"+
		"\5\2:<\5\16\b\2;:\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\7\6\2\2>?\5.\30\2?\7"+
		"\3\2\2\2@A\5\f\7\2AB\7\32\2\2BC\5\n\6\2C\t\3\2\2\2DE\t\2\2\2E\13\3\2\2"+
		"\2FG\7\25\2\2G\r\3\2\2\2HI\7\25\2\2IJ\7%\2\2JM\7\25\2\2KL\7%\2\2LN\7\25"+
		"\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OQ\5\22\n\2PO\3\2\2\2QR\3\2\2\2RP"+
		"\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TU\7\36\2\2UV\7\33\2\2VW\7%\2\2W\\\5\24"+
		"\13\2XY\7\16\2\2Y[\5\24\13\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]_\3\2\2\2^\\\3\2\2\2_`\7\37\2\2`o\3\2\2\2ab\7\36\2\2bc\7\33\2\2cd\7%"+
		"\2\2di\5\22\n\2ef\7\16\2\2fh\5\22\n\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij"+
		"\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\37\2\2mo\3\2\2\2nT\3\2\2\2na\3\2\2\2"+
		"o\23\3\2\2\2pq\7 \2\2qv\5\26\f\2rs\7$\2\2su\5\26\f\2tr\3\2\2\2ux\3\2\2"+
		"\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7!\2\2z\25\3\2\2\2{~\5\30"+
		"\r\2|}\7$\2\2}\177\5\32\16\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\7\3\2\2\u0081\u0082\5&\24\2\u0082\27\3\2\2\2\u0083\u0084"+
		"\5 \21\2\u0084\31\3\2\2\2\u0085\u0086\5 \21\2\u0086\33\3\2\2\2\u0087\u0088"+
		"\t\3\2\2\u0088\35\3\2\2\2\u0089\u008a\t\4\2\2\u008a\37\3\2\2\2\u008b\u008c"+
		"\5\34\17\2\u008c\u008d\7\4\2\2\u008d\u0090\3\2\2\2\u008e\u0090\5\"\22"+
		"\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090!\3\2\2\2\u0091\u0092"+
		"\7\36\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\4\2\2\u0094\u0095\7%\2\2"+
		"\u0095\u0096\5\34\17\2\u0096\u0098\7\4\2\2\u0097\u0099\5$\23\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\37\2\2"+
		"\u009b#\3\2\2\2\u009c\u009d\t\5\2\2\u009d%\3\2\2\2\u009e\u00a2\5.\30\2"+
		"\u009f\u00a2\7\t\2\2\u00a0\u00a2\5(\25\2\u00a1\u009e\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\'\3\2\2\2\u00a3\u00a4\7\36\2\2\u00a4"+
		"\u00a5\5*\26\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\7\37"+
		"\2\2\u00a8)\3\2\2\2\u00a9\u00aa\5.\30\2\u00aa+\3\2\2\2\u00ab\u00ac\5."+
		"\30\2\u00ac-\3\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\5\2\2\u00af/"+
		"\3\2\2\2\17\61\64;MR\\inv~\u008f\u0098\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}