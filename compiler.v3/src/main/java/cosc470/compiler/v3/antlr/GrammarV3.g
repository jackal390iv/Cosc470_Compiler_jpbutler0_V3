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

rule: declarations compound_statement end_program;

empty: ();
declare: ('DECLARE');
boolean: ('BOOLEAN');
char:('CHAR');
varchar2:('VARCHAR2');
number:('NUMBER');
smallint:('SMALLINT');
positive:('POSITIVE');
begin:('BEGIN');
end:('END');
null:('NULL');
output_put_line: ('DBMS_OUTPUT.PUT_LINE');
output_put:('DBMS_OUTPUT.PUT');
output_new_line:('DBMS_OUTPUT.NEW_LINE');
if_begin: ('IF BEGIN');
then:('THEN');
end_if: ('END IF');
while:('WHILE');
loop: ('LOOP');
end_loop:('END LOOP');
true: ('TRUE');
false:('FALSE');
not:('NOT');


end_program: ('\\');
identifier: ('identifier');
end_block: (';');
equals: (':=');
semicolon_left: ('(');
num:(('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+);
semicolon_right: (')');
and: ('&');
string_literal: ('string_literal');
single_char:('single_char');
relop:('>'|'>='|'=='|'<='|'<'|'<>');
addop:('+'|'-');
mulop:('*'|'/'|'%');


declarations: declare declare_rest|empty;

declare_rest: identifier type end_block declare_rest| empty; 

type: data_type default;

default: equals right_hand_side| empty;

data_type: characters |numbers|boolean;

characters: char|varchar2 size;

numbers: number size|smallint size| positive size;

size: semicolon_left num semicolon_right;

compound_statement: begin optional_statements end end_block;

optional_statements: null end_block| statement_list;

statement_list: h i;       

i: end_block h i|empty;

h: statement;

statement: left_hand_side| compound_statement| output_line| and identifier end_block| looping_statements;

output_line: output_put_line output_put_line semicolon_left identifier semicolon_right end_block| output_put semicolon_left identifier semicolon_right end_block| output_new_line end_block;

looping_statements: if_begin expression then statement end_if end_block| while expression loop statement end_loop end_block;

left_hand_side: identifier equals right_hand_side;

right_hand_side: expression|string_literal|single_char|casting semicolon_left expression semicolon_right;

casting: data_type;

expression: a g;

g: relop a g| empty;

a: c b;

b: addop c b| empty;

c: pre_factor d;

d: mulop pre_factor d| empty;

pre_factor: not pre_factor|factor; 

factor: identifier|num|true|false|null;
















