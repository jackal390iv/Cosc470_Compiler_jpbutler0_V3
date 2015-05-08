grammar GrammarV3;

options {
  language = Java;
}

@header {
  package cosc470.compiler.v3.antlr;
  import java.util.ArrayList;
   import cosc470.compiler.v3.database.Database;
  }

@members{
int idCount=0;
int strCount=0;
int charCount=0;
}

@lexer::header {
  package cosc470.compiler.v3.antlr;
}

block: declarations compound_statement end_program;

declarations: 'DECLARE' declare_rest|empty;

declare_rest: identifier_main type end_block declare_rest{System.out.println($identifier_main.name + $type.type + $type.size+$type.value + $type.overwrite);}|empty; 

identifier_main returns [String name]: (('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'|'!'|'~'|'`'|'@'|'#'|'$'|'^'|'_'|'?')+){$name=$identifier_main.text;idCount++;};

type returns [String type,String size, String value, String overwrite]: data_type mis {$type=$data_type.type;$size=$data_type.size;$value=$mis.value;$overwrite=$mis.overwrite;};

mis returns [String value,String overwrite]: equals right_hand_side {$value=$right_hand_side.value;$overwrite=$right_hand_side.overwrite;}|empty{$value="";$overwrite="";};

data_type returns [String type,String size]: characters{$type=$characters.type;$size=$characters.size;} |numbers{$type=$numbers.type;$size=$numbers.size;}|'BOOLEAN'{$type="BOOLEAN";$size="5";};

characters returns [String type,String size]: 'CHAR'{$type="CHAR";$size="3";}|'VARCHAR2' size_mis{$type="VARCHAR2";$size=$size_mis.size;};

numbers returns [String type,String size]: 'NUMBER' size_mis {$type="NUMBER";$size=$size_mis.size;}|'SMALLINT' size_mis{$type="SMALLINT";$size=$size_mis.size;}| 'POSITIVE' size_mis{$type="POSITIVE";$size=$size_mis.size;};

size_mis returns [String size]: semicolon_left num semicolon_right {$size=$num.size;};

compound_statement: 'BEGIN' optional_statements 'END' end_block;

optional_statements: 'NULL' end_block| statement_list;

statement_list: h i;       

i: end_block h i |empty;

h: statement;

statement: left_hand_side| compound_statement| output_line| and identifier end_block| looping_statements;

output_line: 'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block {System.out.println($identifier.value);}
| 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block {System.out.print($identifier.value);}
| 'DBMS_OUTPUT.NEW_LINE' end_block{System.out.println();};

looping_statements: 'IF BEGIN' expression 'THEN' statement 'END IF' end_block| 'WHILE' expression 'LOOP' statement 'END LOOP' end_block;

left_hand_side: identifier equals right_hand_side;

right_hand_side returns [String value, String overwrite]: expression{$value="vo";$overwrite="ow";}|string_literal{$value="vo";$overwrite="ow";}|single_char{$value="vo";$overwrite="ow";}|casting semicolon_left expression semicolon_right{$value="vo";$overwrite="ow";};

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
identifier returns [String value]: ('identifier') {$value=Database.findID(idCount);idCount++;};
end_block: (';');
equals: (':=');
semicolon_left: ('(');
num returns [String size]:('-')(('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+){$size=$num.text;}|(('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+) {$size=$num.text;} ;
semicolon_right: (')');
and: ('&');
string_literal returns [String value]: ('string_literal'){$value=Database.findStringLiteral(strCount);strCount++;};
single_char returns [String value]:('c'){$value=Database.findChar(charCount);charCount++;};
relop:('>'|'>='|'=='|'<='|'<'|'<>');
addop:('+'|'-');
mulop:('*'|'/'|'%');



