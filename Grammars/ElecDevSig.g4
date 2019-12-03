/*
 * ElecDevSig - a grammar for defining electrical device signatures
 *              suitible for interpretation by ANTLR4
 */
 
grammar ElecDevSig;
import LexCommon;

/*
 * Parser Rules
 */
init                : startdate? timebase? signatures;
startdate           : STARTDATE date time_of_day?;
timebase            : TIMEBASE time_interval;
date                : DIGITS2 MONTH  (DIGITS2 | DIGITS4);
time_of_day         : DIGITS2 COLON DIGITS2 (COLON DIGITS2)? ;
signatures			: device_signature+;
device_signature	: LBRACE NAME COLON energy_signature (THEN energy_signature)* RBRACE
					| LBRACE NAME COLON device_signature ( THEN device_signature)* RBRACE
					;
energy_signature	: LBRACKET consumption_block (COMMA consumption_block)* RBRACKET;
consumption_block	: real_power (COMMA reactive_power)? FOR time_period;
real_power 			: power;
reactive_power		: power;
number              : (REAL_NUMBER | WHOLE_NUMBER | DIGITS2 | DIGITS4);
integer             : (WHOLE_NUMBER | DIGITS2 | DIGITS4);
power				: number POWER_UNIT;
time_period			: time_interval | VARIABLE | range;
range               : LBRACE min_time TO max_time RBRACE;
min_time            : time_interval;
max_time            : time_interval;
time_interval       : integer TIME_UNIT;
/*
 * Lexer Rules
 */

FOR				: 'for';
POWER_UNIT 		: WATT | KILOWATT;
TIME_UNIT 		: MILLISECOND | SECOND | MINUTE | HOUR;
TIMEBASE        : 'Timebase:';
STARTDATE       : 'Start:';
TO              : 'to';
VARIABLE        : 'var';
THEN            : '->';
WATT            : 'W';
KILOWATT        : 'kW';
MILLISECOND     : 'mS' | 'ms';
SECOND          : 'S' | 's';
MINUTE          : 'M' | 'm';
HOUR            : 'H' | 'h';
