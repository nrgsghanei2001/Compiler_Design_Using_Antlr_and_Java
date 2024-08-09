grammar FunctionCraft;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.
DEF: 'def';
END: 'end';
MAIN: 'main';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
TRUE: 'true';
FALSE: 'false';
CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
PUTS: 'puts';
METHOD: 'method';
LEN: 'len';
PATTERN: 'pattern';
MATCH: 'match';
NEXT: 'next';
BREAK: 'break';
LOOP: 'loop';
DO: 'do';
FOR: 'for';
IN: 'in';
COLON: ':';
SEMICOLON: ';' ;
QUOTE: '"';
O_PAR: '(';
C_PAR: ')';
O_CUR: '{';
C_CUR: '}';
O_BRK: '[';
C_BRK: ']';
LAMBDA: '->';
COMMA: ',';
DOT: '.';
DEC: '--';
INC: '++';
GTE: '>=';
LT: '<';
LTE: '<=';
AND: '&&';
EQ: '==';
EQ_NEG: '!=';
OR: '||';
INDENT: '\n    |';
INDENT2: '\n\t|';
APPEND: '<<';
EQU_SUM: '+=';
EQU_SUB: '-=';
EQU_MUL: '*=';
EQU_DIV: '/=';
EQU_REMAIN: '%=';
//KHAT: '|';
EQU: '=';
SUM: '+';
SUB: '-';
MUL: '*';
DIV: '/';
REMAIN: '%';
GT: '>';
NOT: '!';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INT_VAL: '0' | [1-9][0-9]*;
FLOAT_VAL: [0-9]* '.' [0-9]+;
STRING_VAL: '"'~["]*'"';
COMMENT: '#' ~[\r\n]* -> skip;
MULTI_COMMENT: '=begin' .*? '=end' -> skip;
WS: [ \t\r\n] -> skip;



// TODO
// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// each program ends with main, comments are not effective
program :
    (COMMENT|MULTI_COMMENT|function|pattern)*
    main
    (COMMENT|MULTI_COMMENT)*
    ;

// declaration of funcions with arguments
function:
    DEF
    name = IDENTIFIER {System.out.println("FuncDec: " + $name.text);}
    O_PAR
    params
    C_PAR
    body_function
    END
    ;

// declaration of main function with no arguments
main:
    DEF
    MAIN {System.out.println("MAIN"); }
    O_PAR
    C_PAR
    body_function
    END
    ;

// declaration (with use) of lambda functions
lambda_function:
    LAMBDA {System.out.println("Structure: LAMBDA");}
    O_PAR params C_PAR
    O_CUR ((RETURN {System.out.println("RETURN");}((O_PAR expression  C_PAR) | (expression)))  | (expression)) SEMICOLON C_CUR
    (O_PAR call_params C_PAR)?
    ;

// define statements of a function
body_function:
    (statement)*
    (return_statement)?
    ;

// define function parameters
params:
    (IDENTIFIER (COMMA IDENTIFIER)*)?
    (COMMA O_BRK dflt_params C_BRK)?
    ;

// define default parameters of a function
dflt_params:
    (IDENTIFIER EQU (expression))
    (COMMA IDENTIFIER EQU (expression))*
    ;

// function pointer definition
method:
    METHOD O_PAR COLON IDENTIFIER C_PAR
    ;

// call functions
call_function:
    ((IDENTIFIER {System.out.println("Function Call");}
    O_PAR call_params C_PAR) |
    built_in)
    ;

// parameters in calling functions
call_params:
    ((expression)
     (COMMA (expression))*)?
    ;

// return with or without ()
return_statement:
    RETURN {System.out.println("RETURN");}
    ( (O_PAR expression C_PAR) | (expression) )?
    SEMICOLON
    ;

bool_val:
    TRUE | FALSE
    ;

list_val:
     O_BRK
    (valList | nestedList)?
     C_BRK
     ;

valList:
    (expression|nestedList) (COMMA (expression|nestedList))*
    ;

nestedList:
    list_val (COMMA list_val)*
    ;

index:
    (IDENTIFIER|call_function|built_in) O_BRK (expression) C_BRK (O_BRK (expression) C_BRK)*
    ;

built_in:
    puts | push | len | chop | chomp
    ;
equ:
    EQU | EQU_REMAIN | EQU_DIV | EQU_MUL | EQU_SUB | EQU_SUM
    ;

assign:
    (
    name = IDENTIFIER
    equ (expression) {System.out.println("Assignment: " + $name.text);})|
    (
    name = IDENTIFIER
    equ method {System.out.println("Assignment: " + $name.text);})
    ;

puts:
    PUTS {System.out.println("Built-In: PUTS");}
    O_PAR
    (expression)
    C_PAR
    ;

push:
    PUSH {System.out.println("Built-In: PUSH");}
    O_PAR
    (expression)
    COMMA
    (expression)
    C_PAR
    ;

len:
    LEN {System.out.println("Built-In: LEN");}
    O_PAR
    (expression)
    C_PAR
    ;

chop:
    CHOP {System.out.println("Built-In: CHOP");}
    O_PAR
    (expression)
    C_PAR
    ;

chomp:
    CHOMP {System.out.println("Built-In: CHOMP");}
    O_PAR
    (expression)
    C_PAR
    ;

condition_statement:
    (
    IF  {System.out.println("Decision: IF");}
    O_PAR condition_expression C_PAR
    (statement)*
    (ELSEIF  {System.out.println("Decision: ELSE IF");}
     condition_expression  (statement)*)*
    (ELSE  {System.out.println("Decision: ELSE");} (statement)*)?
    END)
    ;

condition_expression :
    (O_PAR condition_expression C_PAR AND O_PAR condition_expression C_PAR)|
    (O_PAR condition_expression C_PAR OR O_PAR condition_expression C_PAR)|
    (O_PAR condition_expression C_PAR) |
    (c_expr)
    ;


break_next:
    ((BREAK {System.out.println("Control: BREAK");} SEMICOLON) |
    (BREAK IF {System.out.println("Control: BREAK");} expression SEMICOLON) |
    (NEXT {System.out.println("Control: NEXT");} SEMICOLON) |
    (NEXT IF {System.out.println("Control: NEXT");} expression SEMICOLON))
    ;

loop_statement:
    ((LOOP DO {System.out.println("Loop: DO");}
    (statement|break_next)*
    END) |
    (((FOR {System.out.println("Loop: FOR");}
    IDENTIFIER IN (expression)) |
    (FOR {System.out.println("Loop: FOR");}
    IDENTIFIER IN O_PAR expression DOT DOT expression C_PAR)
    )
    (statement|break_next)*
    END
    ))
    ;

types:
     (SUB)? INT_VAL| (SUB)? FLOAT_VAL |STRING_VAL | bool_val | list_val
    ;


pattern:
    PATTERN
    name = IDENTIFIER {System.out.println("PatternDec: " + $name.text);}
    O_PAR
    params
    C_PAR
    (options)*
    SEMICOLON
    ;

options:
    (INDENT | INDENT2)
    O_PAR
    expression
    C_PAR
    EQU
    expression
    ;

pattern_call:
    IDENTIFIER
    DOT
    MATCH {System.out.println("Built-In: MATCH");}
    O_PAR
    call_params
    C_PAR
    ;


statement:
    ((O_PAR (expression |assign  ) C_PAR SEMICOLON)|
    (( expression | assign  ) SEMICOLON) |
    (condition_statement | loop_statement))
    ;


expression:
     shift;

shift:
    logical_or (APPEND logical_or{System.out.println("Operator: <<");}
                )* ;

logical_or:
    logical_and (OR logical_and{System.out.println("Operator: ||");}
                )* ;

logical_and:
    equality (AND equality{System.out.println("Operator: &&");}
             )* ;

equality:
    relational ( (EQ relational{System.out.println("Operator: ==");} |
                EQ_NEG relational{System.out.println("Operator: !=");})
                )* ;

relational: additive ( (LTE additive{System.out.println("Operator: <=");}|
                        LT additive{System.out.println("Operator: <");}|
                        GTE additive{System.out.println("Operator: >=");}|
                        GT additive{System.out.println("Operator: >");})
                        )* ;

additive: multiplicative ( (SUM multiplicative {System.out.println("Operator: +");}|
                            SUB multiplicative {System.out.println("Operator: -");})
                         )* ;

multiplicative: unary ( (MUL unary{System.out.println("Operator: *");} |
                         DIV unary{System.out.println("Operator: /");}|
                         REMAIN unary{System.out.println("Operator: %");})
                         )* ;

unary:
    (NOT {System.out.println("Operator: !");}|
     SUB {System.out.println("Operator: -");})?
     primary
     ;


primary:
    primary2 (INC {System.out.println("Operator: ++");}|
    DEC {System.out.println("Operator: --");})?
    ;


primary2:
    O_PAR expression C_PAR | indexed
    ;

indexed:
    factor (O_BRK expression C_BRK)*
    ;

factor:
    (call_function| built_in | types | IDENTIFIER | pattern_call | lambda_function | index)
    ;


c_expr:
     c_shift
     ;


c_shift:
    c_equality (APPEND c_equality{System.out.println("Operator: <<");}
                )*
                ;
c_equality:
    c_relational ( (EQ c_relational{System.out.println("Operator: ==");} |
                EQ_NEG c_relational{System.out.println("Operator: !=");})
                )* ;


c_relational: c_additive ( (LTE c_additive{System.out.println("Operator: <=");}|
                        LT c_additive{System.out.println("Operator: <");}|
                        GTE c_additive{System.out.println("Operator: >=");}|
                        GT c_additive{System.out.println("Operator: >");})
                        )* ;

c_additive: c_multiplicative ( (SUM c_multiplicative {System.out.println("Operator: +");}|
                            SUB c_multiplicative {System.out.println("Operator: -");})
                         )* ;

c_multiplicative: c_unary ( (MUL c_unary{System.out.println("Operator: *");} |
                         DIV c_unary{System.out.println("Operator: /");}|
                         REMAIN c_unary{System.out.println("Operator: %");})
                         )* ;

c_unary:
        (NOT {System.out.println("Operator: !");}|
         SUB {System.out.println("Operator: -");})?
         c_primary
         ;

c_primary:
    c_primary2 (INC {System.out.println("Operator: ++");}|
             DEC {System.out.println("Operator: --");})?
         ;

c_primary2: O_PAR c_expr C_PAR | c_indexed   ;

c_indexed: c_factor (O_BRK c_expr C_BRK)* ;

c_factor:
    (call_function | types | IDENTIFIER | pattern_call | lambda_function | index ) ;
