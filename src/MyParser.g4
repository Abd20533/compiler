parser grammar MyParser;
options {
    tokenVocab = MyLexer;
}

program
    : form* EOF
    ;
form:
variableDefinition|varAssignment|varDeclaration|ifStatement|forStatement|multipleValueBindStatement
|whileStatement|doStatement|listStatement|tryStatement|printStatement|importStatement|returnStatement|breakStatement
|defclassStatement|elementTypeArrayStatement|exportStatement|functionDefinition1
|usePackageStatement|defpackageStatement|finallyStatement|catchStatement|mapcarStatement
|test_expr | tagbodyStatement|functionDefinition
                | goStatement|returnFromStatement
                |
                throwStatement
                    | structDefinition
                    | typeSpecifier
                    | mathExpression
                    | logicalOperation
                    | keyValueList|macroDefinition|tryCatchFinally
                    number|inPackageStatement|loopStatement|lambdaStatement
;

  variableDefinition
        : LPAREN SETQ ID expr RPAREN
        | LPAREN DEFVAR ID (expr)? RPAREN
        | LPAREN DEFCONSTANT ID expr RPAREN
        ;

//
expr
    : NUMBER
    | FLOAT
    | STRING
    | ID|printStatement|number|usingLogicalOperation
    |logicalOperation
    |operation|listStatement
    |returnStatement|breakStatement|typeSpecifier
    |elementTypeArrayStatement|exportStatement|usePackageStatement|defpackageStatement
    |tryStatement
    |finallyStatement
    | catchStatement|evalStatement
    |quoteStatement|sumStatement|mapcarStatement
    | LPAREN expr+ RPAREN

    ;

   expr1
       : NUMBER
       | FLOAT
       | STRING
       | ID
       | operation
       | returnStatement
       | breakStatement
       | listStatement
       | tryStatement
       | catchStatement
       | finallyStatement
       | LPAREN expr+ RPAREN
       ;






varAssignment
    : LPAREN SETQ ID expr RPAREN
    ;


varDeclaration
    : LPAREN DEFVAR ID (expr)? RPAREN;



ifStatement
    : LPAREN IF condition expr (expr)? RPAREN
    ;

condition
    : expr
    ;

operation:
EQ|NEQ|GT|LT |GE |LE |
PLUS |
MINUS |
MULT|MOD |EVAL;

forStatement
    : LPAREN FOR LPAREN ID expr expr expr RPAREN expr+ RPAREN
    ;

test_expr:
(condition)? expr|(condition expr)+;
////########################
whileStatement:
     LPAREN WHILE condition expr+ RPAREN

    |
     LPAREN WHILE test_expr   form form RPAREN
    ;



doStatement
    : LPAREN DO LPAREN LPAREN ID expr expr RPAREN RPAREN LPAREN condition RPAREN expr+ RPAREN
    ;




importStatement
    : LPAREN QW_IMPORT expr RPAREN
    ;


listStatement
    : LPAREN LIST expr+ RPAREN
    ;
printStatement
    : LPAREN PRINT expr RPAREN
    ;

returnStatement
    : LPAREN 'return' expr RPAREN
    | LPAREN RETURN  ifStatement RPAREN

    ;
breakStatement
    : LPAREN BREAK RPAREN
    ;

slotDefinition
    : LPAREN ID (typeSpecifier)? RPAREN
    ;


defclassStatement
    : LPAREN QW_DEFCLASS ID LPAREN slotDefinition* RPAREN RPAREN|
    QW_DEFCLASS  COLON ID
    ;

typeSpecifier
    : COLON ID
    ;


elementTypeArrayStatement
    : LPAREN QW_ELEMENT_TYPE_ARRAY ID expr RPAREN
    ;



exportStatement
    : LPAREN QW_EXPORT ID+ RPAREN
    ;
usePackageStatement
    : LPAREN QW_USE_PACKAGE ID+ RPAREN
    ;
inPackageStatement
    : LPAREN QW_IN_PACKAGE STRING RPAREN
    ;
//%%%%%%%%%%%%%%%%%%%


defpackageStatement
    : LPAREN QW_DEFPACKAGE STRING (packageOption)* RPAREN
    ;

packageOption
    : LPAREN QW_EXPORT ID+ RPAREN
    | LPAREN USE STRING+ RPAREN
    | LPAREN SHADOW ID+ RPAREN
    ;

tryStatement
    : LPAREN QW_TRY expr+ catchStatement+ (finallyStatement)? RPAREN
    ;



catchStatement
    : LPAREN QW_CATCH ID expr+ RPAREN
    ;

finallyStatement
    : LPAREN QW_FINALLY expr+ RPAREN
    ;
evalStatement
    : LPAREN EVAL expr RPAREN
    ;
quoteStatement
    : LPAREN QUOTE expr RPAREN
    ;
sumStatement
    : LPAREN SUM expr+ RPAREN
    ;
mapcarStatement
    : LPAREN QW_MAPCAR ID LPAREN expr+ RPAREN RPAREN
    ;


multipleValueBindStatement
    : LPAREN QW_MULTIPLE_VALUE_BIND LPAREN ID+ RPAREN expr+ RPAREN|test_expr

    ;
tagbodyStatement
    : LPAREN QW_TAGBODY (ID expr*)* RPAREN
    ;
goStatement
    : LPAREN QW_GO ID RPAREN
    ;
returnFromStatement
    : LPAREN QW_RETURN_FROM ID (expr)? RPAREN
    ;
//########0000000000000000
lambdaStatement
    : LPAREN LAMBDA LPAREN (ID)* RPAREN expr+ RPAREN
    ;
logicalOperation
    : AND | OR | NOT
    ;


usingLogicalOperation:
  LPAREN logicalOperation   (expr)? RPAREN
;

    keyValuePair
        : LPAREN ID expr RPAREN
        ;

    keyValueList
        : LPAREN keyValuePair+ RPAREN
        ;

loopStatement
    : LPAREN LOOP (loopClause)+ RPAREN
    ;

loopClause
    : FOR ID IN expr
    | WHILE condition
    | DO expr
    ;

macroDefinition
    : LPAREN DEFMACRO ID LPAREN (ID)* RPAREN expr+ RPAREN
    ;

mathExpression
    : LPAREN (ADD | SUB | MUL | DIV | MOD) expr+ RPAREN
    ;
number
    : DECIMAL
    | BINARY
    | OCTAL
    | HEXADECIMAL
    ;


throwStatement
    : LPAREN THROW expr RPAREN
    ;

tryCatchFinally
    : LPAREN QW_TRY expr+ (QW_CATCH LPAREN ID expr+ RPAREN)* (QW_FINALLY expr+)? RPAREN
    ;

structDefinition
    : LPAREN DEFSTRUCT ID LPAREN (slotDefinition)* RPAREN RPAREN
    ;

functionDefinition
    : LPAREN DEFUN ID LPAREN (ID)* RPAREN STRING form+ RPAREN
    ;
functionDefinition1
    : LPAREN DEFUN ID  expr   form+     RPAREN
    ;