// FileName    : MiniJLexer.g4
// Student ID  : <Your ID>
// Student Name: <Your Name>
lexer grammar MiniJLexer;

// header declarations which are 
// copied to the generated code
@lexer::header{
package om.edu.ibrict.itse4102.lab1;
}

// Keywords
INT:                'int';
PUBLIC:             'public';
RETURN:             'return';
STATIC:             'static';
WHILE:              'while';

// Literals
DECIMAL_LITERAL:    ('0' | [1-9] Digits?);


// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
SEMI:               ';';
COMMA:              ',';


// Operators
ASSIGN:             '=';
NOTEQUAL:           '!=';
MOD:                '%';

// Identifiers
IDENTIFIER:         Letter LetterOrDigit*;


// Whitespace and comments

// skip: through it all away
WS: WhiteSpace+ ->  skip;

// channel(HIDDEN): put the matched text in the HIDDEN channel
// put don't pass it to the parser. This way we can access comments
// if we wanted without having to put hidden tokens in the parser grammar
COMMENT:            '/*' .*? '*/'    -> skip;
LINE_COMMENT:       '//' ~[\r\n]*    -> skip;


// Fragments

// A fragment is a lexer rules does not result in creation of 
// tokens and are only present for grammar simplification.
fragment Digits: [0-9]+ ;
fragment LetterOrDigit: Letter | [0-9];
fragment Letter: [a-zA-Z$_];
fragment LineTerminator: '\r'|'\n'|'\r\n';
fragment WhiteSpace: LineTerminator | [ \t\f];


