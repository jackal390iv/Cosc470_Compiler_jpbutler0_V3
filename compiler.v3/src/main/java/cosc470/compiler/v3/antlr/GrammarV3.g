grammar GrammarV3;

options {
  language = Java;
}

@header {
  package cosc470.compiler.v3.antlr;
}

@lexer::header {
  package cosc470.compiler.v3.antlr;
}

block: declarations compound_statement end_program;

declarations: 'DECLARE' declare_rest|empty;

declare_rest: identifier type end_block declare_rest|empty; 

type: data_type default_mis;

default_mis: equals right_hand_side|empty;

data_type: characters |numbers|'BOOLEAN';

characters: 'CHAR'|'VARCHAR2' size;

numbers: 'NUMBER' size|'SMALLINT' size| 'POSITIVE' size;

size: semicolon_left num semicolon_right;

compound_statement: 'BEGIN' optional_statements 'END' end_block;

optional_statements: 'NULL' end_block| statement_list;

statement_list: h i;       

i: end_block h i |empty;

h: statement;

statement: left_hand_side| compound_statement| output_line| and identifier end_block| looping_statements;

output_line: 'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block| 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block| 'DBMS_OUTPUT.NEW_LINE' end_block;

looping_statements: 'IF BEGIN' expression 'THEN' statement 'END IF' end_block| 'WHILE' expression 'LOOP' statement 'END LOOP' end_block;

left_hand_side: identifier equals right_hand_side;

right_hand_side: expression|string_literal|single_char|casting semicolon_left expression semicolon_right;

casting: data_type;

expression: a g;

g: relop a g| empty;

a: c b;

b: addop c b|empty;

c: pre_factor d;

d: mulop pre_factor d| empty;

pre_factor: 'NOT' pre_factor|factor; 

factor: identifier|num|'TRUE'|'FALSE'|'NULL';
empty: ();

end_program: ('\\');
identifier: ('identifier');
end_block: (';');
equals: (':=');
semicolon_left: ('(');
num:('num');                       //('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+);
semicolon_right: (')');
and: ('&');
string_literal: ('string_literal');
single_char:('c');
relop:('>'|'>='|'=='|'<='|'<'|'<>');
addop:('+'|'-');
mulop:('*'|'/'|'%');












