grammar Grammar;

/*
 * Parser Rules
 */
program: (prog_declarating  DOT_COMMA  NEWLINE*)* prog_block* start_bloc prog_block*;
start_bloc: START block;
prog_declarating: WORD (L_BR  type (COMMA  type)* R_BR)?  (DOT_DOT  type)?;
prog_block: WORD  (L_BR  type  WORD (COMMA  type  WORD)* R_BR)?  (DOT_DOT  type)? block;
block: NEWLINE*  L_FBR  NEWLINE* (act)+  R_FBR NEWLINE*;

act: (declaration | departed_fill | function)  DOT_COMMA  NEWLINE*;

declaration: type declarat ( COMMA declarat)*;
departed_fill: WORD (L_CBR  extraction  R_CBR)?  ASSIGN  extraction;
declarat: (WORD | WORD  ASSIGN  extraction);
extraction: (
    simple_extraction
    | MINUS L_BR  (simple_extraction | operation_extraction) R_BR
    | vector_fill
    | operation_extraction
);
simple_extraction: MINUS?(WORD | VALUE | (V_LINE  extraction   V_LINE) | ((L_BR  extraction  R_BR | WORD)  L_CBR  extraction  R_CBR));
vector_fill: (L_BR(extraction)( COMMA  (extraction))*R_BR);
operation_extraction: MINUS?((L_BR  extraction  R_BR | simple_extraction)(operation (L_BR  extraction  R_BR | simple_extraction | (L_BR(extraction)( COMMA  (extraction))*R_BR)))+);
function:  ( WORD (L_BR (extraction (COMMA  extraction)*) R_BR)? | RETURN  extraction | printfunction | scanfunction);
printfunction: FUN_PRINT (L_BR extraction R_BR);
scanfunction: FUN_SCAN (L_BR WORD R_BR);

type: TYPE_VALUE | TYPE_MATRIX | TYPE_VECTOR;
operation: PLUS | MINUS | MULT;

/*
 * Lexer Rules
 */

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment DIGIT  : [0-9] ;

FUN_PRINT: 'print';
FUN_SCAN: 'scan';

L_FBR: '{';
R_FBR: '}';
L_CBR: '[';
R_CBR: ']';
L_BR: '(';
R_BR: ')';
V_LINE: '|';

DOT: '.';
COMMA: ',';
DOT_COMMA: ';';
DOT_DOT: ':';
ASSIGN: '=';

AND: 'and';
NOT: 'not';
OR: 'or';
IF: 'if';

TYPE_VALUE: 'val' ;
TYPE_MATRIX: 'matrix';
TYPE_VECTOR: 'vector';

PLUS: '+';
MINUS: '-';
MULT: '*';
NULL: 'null';

START: 'start';
RETURN: 'return';
WORD                : (LOWERCASE | UPPERCASE  | '_') (LOWERCASE | UPPERCASE | DIGIT | '_') * ;
VALUE: (MINUS)? NUMBER (DOT(DIGIT)+)?;
NUMBER: [1-9]DIGIT* | '0';
WHITESPACE          : (' ' | '\t')+ -> skip;

NEWLINE             : ('\r'? '\n' | '\r')+ ;

/*
 * Parser Rules
 */
/*
trixy                : line+ EOF ;

line                : name command message NEWLINE ;

message             : (emoticon | link | color | mention | WORD | WHITESPACE)+ ;

name                : WORD WHITESPACE;

command             : (SAYS | SHOUTS) ':' WHITESPACE ;

emoticon            : ':' '-'? ')'
                    | ':' '-'? '('
                    ;

link                : TEXT TEXT ;

color               : '/' WORD '/' message '/';

mention             : '@' WORD ;


/*
 * Lexer Rules
 */
/*
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment DIGIT  : [0-9] ;

MATRIX: 'matrix';
VECTOR: 'vector';

SAYS: 'SAYS';
SHOUTS: 'SHOUTS';

WORD                : (LOWERCASE | UPPERCASE  | '_') (LOWERCASE | UPPERCASE | DIGIT | '_') * ;

WHITESPACE          : (' ' | '\t')+ ;

NEWLINE             : ('\r'? '\n' | '\r')+ ;

TEXT                : ('['|'(') ~[\])]+ (']'|')');

OPERATOR : ('+'|'-'|NORM_OPERATOR|INDEX_OPERATOR);
EXPRESSION: (WORD OPERATOR WORD) | (WORD OPERATOR) | WORD;
NORM_OPERATOR : '|' WORD '|';
INDEX_OPERATOR: WORD '[' EXPRESSION ']';

*/