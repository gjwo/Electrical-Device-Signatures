lexer grammar LexCommon;

NAME			: ALPHA (ALPHA | DIGIT)*;

REAL_NUMBER		: SIGN? INTEGER ( DOT DIGIT+)?;
SIGNED_INT 		: SIGN? DIGIT+;
INTEGER			: DIGIT+;
DIGITS2         : DIGIT DIGIT;
DIGITS4         : DIGIT DIGIT DIGIT DIGIT;
SIGN 			: PLUS | MINUS;

DAYOFWEEK       : 'Mon'
                | 'Tue'
                | 'Wed'
                | 'Thu'
                | 'Fri'
                | 'Sat'
                | 'Sun'
;
MONTH           : 'Jan'
                | 'Feb'
                | 'Mar'
                | 'Apr'
                | 'May'
                | 'Jun'
                | 'Jul'
                | 'Aug'
                | 'Sep'
                | 'Oct'
                | 'Nov'
                | 'Dec'
;

PLUS            : '+';
MINUS           : '-';

LBRACE          : '(';
RBRACE          : ')';
LBRACKET        : '[';
RBRACKET        : ']';
LCURLY          : '{';
RCURLY          : '}';
COMMA           : ',';
COLON           : ':';
SEMICOLON       : ';';
DOT             : '.';

fragment DIGIT  : [0-9];
fragment HEX    : [0-9a-fA-F] ;

fragment LCASE	: [a-z];
fragment UCASE	: [A-Z];
fragment ALPHA	: (LCASE | UCASE);
fragment NOTALPHANUMERIC  : ~ [a-zA-Z0-9];

COMMENT         : '//' .*? '\r'? '\n'   -> skip;
ML_COMMENT      :  '/*' .*? '*/'        -> skip;
WS				: [ \r\t\n]+ 		    -> skip;