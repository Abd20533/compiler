lexer grammar MyLexer;
// Keywords
DEFUN : 'defun';
IF : 'if';
SUM : 'sum';
NULL : 'null';
CONS : 'cons';
CAR : 'car';
CDR : 'cdr';
DEFVAR : 'defvar';
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

// Comparison Operators
EQ : '=';
NEQ : '/=';
GT : '>';
LT : '<';
GE : '>=';
LE : '<=';

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

// Strings
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
QW_DEFCONSTANT : 'defconstant';
QW_GENSYM : 'gensym';
QW_SYMBOL_VALUE : 'symbol-value';
QW_DEFPACKAGE : 'defpackage';
QW_IN_PACKAGE : 'in-package';
QW_USE_PACKAGE : 'use-package';
QW_IMPORT : 'import';
QW_EXPORT : 'export';
QW_DEFSTRUCT : 'defstruct';
QW_SETFARRAY : 'setf';
QW_GETELEM_ARRAY : 'aref';
QW_ELEMENT_TYPE_ARRAY : 'element-type';