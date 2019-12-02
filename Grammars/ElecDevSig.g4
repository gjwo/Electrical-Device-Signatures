/*
 * ElecDevSig - a grammar for defining electrical device signatures
 *              suitible for interpretation by ANTLR4
 */
 
grammar ElecDevSig;
import datetime;
/*
 * Parser Rules
 */
init                : startdate? timebase? signatures;
startdate           : START date_time ;
timebase            : TIMEBASE time_interval;
signatures			: device_signature+; 
device_signature	: '('NAME ':' energy_signature (THEN energy_signature)* ')'
					| '('NAME ':' device_signature ( THEN device_signature)* ')'
					;
energy_signature	: '['consumption_block (',' consumption_block)* ']';
consumption_block	: real_power (',' reactive_power)? FOR time_period;
real_power 			: power;
reactive_power		: power;
power				: REAL_NUMBER POWER_UNIT;
time_period			: time_interval | VARIABLE | range;
range               : '(' min_time TO max_time')';
min_time            : time_interval;
max_time            : time_interval;
time_interval        :(REAL_NUMBER TIME_UNIT);

/*
 * Lexer Rules
 */

FOR				: 'for';
REAL_NUMBER		: SIGN? INTEGER ('.'DIGIT+)?;
SIGNED_INT 		: SIGN? DIGIT+;
INTEGER			: DIGIT+;
SIGN 			: PLUS | MINUS;
POWER_UNIT 		: WATT | KILOWATT;
TIME_UNIT 		: MILLISECOND | SECOND | MINUTE | HOUR;
TIMEBASE        : 'Timebase: ';
START           : 'Start: ';
TO              : 'to';
VARIABLE        : 'var';
THEN            : '->';
PLUS            : '+';
MINUS           : '-';
WATT            : 'W';
KILOWATT        : 'kW';
MILLISECOND     : 'mS' | 'ms';
SECOND          : 'S' | 's';
MINUTE          : 'M' | 'm';
HOUR            : 'H' | 'h';
NAME			: LETTER (LETTER | DIGIT)*;
fragment LCASE	: [a-z];
fragment UCASE	: [A-Z];
fragment DIGIT	: [0-9];
fragment LETTER	: (LCASE | UCASE);
WS				: [ \r\t\n]+ 		-> skip;