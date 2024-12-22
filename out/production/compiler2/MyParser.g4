grammar MyParser;
options {
    tokenVocab = MyLexer;
}

program
    : form* EOF
    ;
form:
variableDefinition|varAssignment|varDeclaration ;


variableDefinition
: (SETQ | DEFVAR) ID value
    ;

value
    : expr
    ;

expr
    : NUMBER
    | FLOAT
    | STRING
    | ID
    | LPAREN expr+ RPAREN
    ;


varAssignment
    : LPAREN SETQ ID expr RPAREN
    ;


varDeclaration
    : LPAREN DEFVAR ID (expr)? RPAREN;
