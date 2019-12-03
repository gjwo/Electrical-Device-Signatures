lexer grammar LexCommon;

DIGITS2         : DIGIT DIGIT;
DIGITS4         : DIGIT DIGIT DIGIT DIGIT;
REAL_NUMBER		: INT? DECIMAL ;
WHOLE_NUMBER    : INT;

fragment DECIMAL        : DOT UNSIGNED_INT;
fragment INT            : (DIGITS2 | DIGITS4 | UNSIGNED_INT | SIGNED_INT);
fragment SIGNED_INT 	: SIGN UNSIGNED_INT;
fragment UNSIGNED_INT	: DIGIT+;
fragment SIGN 	        : PLUS | MINUS;

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
NAME			: ALPHA (ALPHA | DIGIT)*;

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