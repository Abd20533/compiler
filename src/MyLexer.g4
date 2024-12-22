lexer grammar MyLexer;
// Keywords
DEFUN : 'defun';
IF : 'if';
FOR:'for';
SUM : 'sum';
NULL : 'null';
CONS : 'cons';
CAR : 'car';
CDR : 'cdr';
DEFVAR : 'defvar';
DEFCONSTANT:'defconstant';
SETQ : 'setq';
LIST : 'list';
QUOTE : 'quote';
DOT : '.';
EVAL : 'eval';
// Arithmetic Operators
PLUS : '+';
MINUS : '-';
MULT : '*';
MOD : 'mod' | 'rem';
BOOL:'bool';

// Comparison Operators
EQ : '=';
NEQ : '/=';
GT : '>';
LT : '<';
GE : '>=';
LE : '<=';
QW_IMPORT : 'import';

PRINT  :'print';
COLON : ':';

// Logical Operators
AND : 'and';
OR : 'or';
NOT : 'not';

// Loops and Control
WHILE : 'while';
DO : 'do';
BREAK : 'break';
RETURN : 'return';

// Identifiers
ID : '*'? (ALLOWED_START_CHAR | [a-zA-Z]) [a-zA-Z0-9_-]* '*'?;
fragment ALLOWED_START_CHAR : [*+\-!@#$%^&_=<>?/];

// Numbers
NUMBER : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]+;

// Parentheses
LPAREN : '(';
RPAREN : ')';

STRING : '"' (ESC_SEQ | ~["\\])* '"';
fragment ESC_SEQ : '\\' ( 'n'  // newline
                        | 'r'  // carriage return
                        | 't'  // tab
                        | 'b'  // backspace
                        | 'f'  // form feed
                        | '"'  // escaped double-quote
                        | '\\' // escaped backslash
                        | '~%' // newline for format
                        | '~&' // conditional newline
                       );

// Whitespace and comments
WS : [\t \r\n]+ -> skip;
COMMENT : ';' ~[\r\n]* -> skip;

// Skip forward slash
FORWARD_SLASH : '/' -> skip;

// Catch-all rule for unknown characters
UNKNOWN : . -> channel(HIDDEN);

// Additional Keywords for Functions and Loops
QW_MAPCAR : 'mapcar';
QW_TRY : 'try';
QW_CATCH : 'catch';
QW_DEFCLASS : 'defclass';
QW_FINALLY : 'finally';
QW_MULTIPLE_VALUE_BIND : 'multiple-value-bind';
QW_RETURN_FROM : 'return-from';
QW_GO : 'go';
QW_TAGBODY : 'tagbody';
// Functions
QW_DEFSMETHOD : 'defmethod';
QW_SLOT_VALUE : 'slot-value';
QW_MAKE_INSTANCE : 'make-instance';
QW_CALL_NEXT_METHOD : 'call-next-method';
QW_GENSYM : 'gensym';
QW_SYMBOL_VALUE : 'symbol-value';
QW_DEFPACKAGE : 'defpackage';
QW_IN_PACKAGE : 'in-package';
QW_USE_PACKAGE : 'use-package';
QW_EXPORT : 'export';
QW_DEFSTRUCT : 'defstruct';
QW_SETFARRAY : 'setf';
QW_GETELEM_ARRAY : 'aref';
QW_ELEMENT_TYPE_ARRAY : 'element-type';

SHADOW:'shadow';
USE:'use';
//#####00000000
BINARY
    : '0b' [01]+
    ;
OCTAL
    : '0o' [0-7]+
    ;
HEXADECIMAL
    : '0x' [0-9a-fA-F]+
    ;
THROW:'throw';
DEFSTRUCT:'defstruct';
DEFMACRO:'defmacro';
 DECIMAL
        : [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?
        ;


ADD :'add';
 SUB  :'sub';
  MUL :'mul';
 DIV :'div';
 LOOP :'loop';
// LAMBDA
//     : 'lambda'
//     ;
IN
    : 'in'
    ;

LAMBDA
    : [lL] [aA] [mM] [bB] [dD] [aA]
    ;
