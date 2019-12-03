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
		DIGITS2=15, DIGITS4=16, REAL_NUMBER=17, WHOLE_NUMBER=18, DAYOFWEEK=19, 
		MONTH=20, NAME=21, PLUS=22, MINUS=23, LBRACE=24, RBRACE=25, LBRACKET=26, 
		RBRACKET=27, LCURLY=28, RCURLY=29, COMMA=30, COLON=31, SEMICOLON=32, DOT=33, 
		COMMENT=34, ML_COMMENT=35, WS=36;
	public static final int
		RULE_init = 0, RULE_startdate = 1, RULE_timebase = 2, RULE_date = 3, RULE_time_of_day = 4, 
		RULE_signatures = 5, RULE_device_signature = 6, RULE_energy_signature = 7, 
		RULE_consumption_block = 8, RULE_real_power = 9, RULE_reactive_power = 10, 
		RULE_number = 11, RULE_integer = 12, RULE_power = 13, RULE_time_period = 14, 
		RULE_range = 15, RULE_min_time = 16, RULE_max_time = 17, RULE_time_interval = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "startdate", "timebase", "date", "time_of_day", "signatures", 
			"device_signature", "energy_signature", "consumption_block", "real_power", 
			"reactive_power", "number", "integer", "power", "time_period", "range", 
			"min_time", "max_time", "time_interval"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTDATE) {
				{
				setState(38);
				startdate();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIMEBASE) {
				{
				setState(41);
				timebase();
				}
			}

			setState(44);
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
			setState(46);
			match(STARTDATE);
			setState(47);
			date();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGITS2) {
				{
				setState(48);
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
			setState(51);
			match(TIMEBASE);
			setState(52);
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
		enterRule(_localctx, 6, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(DIGITS2);
			setState(55);
			match(MONTH);
			setState(56);
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
		enterRule(_localctx, 8, RULE_time_of_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(DIGITS2);
			setState(59);
			match(COLON);
			setState(60);
			match(DIGITS2);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(61);
				match(COLON);
				setState(62);
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
		enterRule(_localctx, 10, RULE_signatures);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				device_signature();
				}
				}
				setState(68); 
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
		enterRule(_localctx, 12, RULE_device_signature);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LBRACE);
				setState(71);
				match(NAME);
				setState(72);
				match(COLON);
				setState(73);
				energy_signature();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(74);
					match(THEN);
					setState(75);
					energy_signature();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LBRACE);
				setState(84);
				match(NAME);
				setState(85);
				match(COLON);
				setState(86);
				device_signature();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==THEN) {
					{
					{
					setState(87);
					match(THEN);
					setState(88);
					device_signature();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
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
		enterRule(_localctx, 14, RULE_energy_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LBRACKET);
			setState(99);
			consumption_block();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				consumption_block();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
		enterRule(_localctx, 16, RULE_consumption_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			real_power();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(110);
				match(COMMA);
				setState(111);
				reactive_power();
				}
			}

			setState(114);
			match(FOR);
			setState(115);
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
		enterRule(_localctx, 18, RULE_real_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 20, RULE_reactive_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 24, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 26, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			number();
			setState(126);
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
		enterRule(_localctx, 28, RULE_time_period);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITS2:
			case DIGITS4:
			case WHOLE_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				time_interval();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(VARIABLE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
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
		enterRule(_localctx, 30, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LBRACE);
			setState(134);
			min_time();
			setState(135);
			match(TO);
			setState(136);
			max_time();
			setState(137);
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
		enterRule(_localctx, 32, RULE_min_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		enterRule(_localctx, 34, RULE_max_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 36, RULE_time_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			integer();
			setState(144);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\5\2-\n\2\3\2\3\2\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\6"+
		"\7E\n\7\r\7\16\7F\3\b\3\b\3\b\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\3\b\5\bc\n\b"+
		"\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\3\n\3\n\3\n\5\ns\n\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\5\3\2\21\22\3\2\21\24\4\2\21\22\24\24\2\u008d\2)\3\2\2\2\4\60"+
		"\3\2\2\2\6\65\3\2\2\2\b8\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16b\3\2\2\2\20"+
		"d\3\2\2\2\22o\3\2\2\2\24w\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2"+
		"\34\177\3\2\2\2\36\u0085\3\2\2\2 \u0087\3\2\2\2\"\u008d\3\2\2\2$\u008f"+
		"\3\2\2\2&\u0091\3\2\2\2(*\5\4\3\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\6"+
		"\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\f\7\2/\3\3\2\2\2\60\61\7\7\2\2"+
		"\61\63\5\b\5\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2"+
		"\65\66\7\6\2\2\66\67\5&\24\2\67\7\3\2\2\289\7\21\2\29:\7\26\2\2:;\t\2"+
		"\2\2;\t\3\2\2\2<=\7\21\2\2=>\7!\2\2>A\7\21\2\2?@\7!\2\2@B\7\21\2\2A?\3"+
		"\2\2\2AB\3\2\2\2B\13\3\2\2\2CE\5\16\b\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2"+
		"FG\3\2\2\2G\r\3\2\2\2HI\7\32\2\2IJ\7\27\2\2JK\7!\2\2KP\5\20\t\2LM\7\n"+
		"\2\2MO\5\20\t\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3"+
		"\2\2\2ST\7\33\2\2Tc\3\2\2\2UV\7\32\2\2VW\7\27\2\2WX\7!\2\2X]\5\16\b\2"+
		"YZ\7\n\2\2Z\\\5\16\b\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2"+
		"\2\2_]\3\2\2\2`a\7\33\2\2ac\3\2\2\2bH\3\2\2\2bU\3\2\2\2c\17\3\2\2\2de"+
		"\7\34\2\2ej\5\22\n\2fg\7 \2\2gi\5\22\n\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\35\2\2n\21\3\2\2\2or\5\24\13\2pq\7"+
		" \2\2qs\5\26\f\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\3\2\2uv\5\36\20\2v"+
		"\23\3\2\2\2wx\5\34\17\2x\25\3\2\2\2yz\5\34\17\2z\27\3\2\2\2{|\t\3\2\2"+
		"|\31\3\2\2\2}~\t\4\2\2~\33\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\7\4"+
		"\2\2\u0081\35\3\2\2\2\u0082\u0086\5&\24\2\u0083\u0086\7\t\2\2\u0084\u0086"+
		"\5 \21\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\37\3\2\2\2\u0087\u0088\7\32\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\b"+
		"\2\2\u008a\u008b\5$\23\2\u008b\u008c\7\33\2\2\u008c!\3\2\2\2\u008d\u008e"+
		"\5&\24\2\u008e#\3\2\2\2\u008f\u0090\5&\24\2\u0090%\3\2\2\2\u0091\u0092"+
		"\5\32\16\2\u0092\u0093\7\5\2\2\u0093\'\3\2\2\2\r),\63AFP]bjr\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}