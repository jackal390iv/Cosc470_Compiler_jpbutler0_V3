grammar GrammarV3;

options {
  language = Java;
}

@header {
  package cosc470.compiler.v3.antlr;
  //import cosc470.compiler.v3.database.Database;
  }

@members{
int idCount=0;
int strCount=0;
int charCount=0;
int numCount=0;
}

@lexer::header {
  package cosc470.compiler.v3.antlr;
}

block: declarations compound_statement end_program
{System.out.println($compound_statement.operations);};

declarations: 'DECLARE' declare_rest|empty;

declare_rest: identifier type end_block declare_rest
{
  String name,type,size,value;
  name=$identifier.value;
  type= $type.type;
  size=$type.size;
  value=$type.value;
   
  if(!($type.OWtype.equals(""))){
    type=$type.OWtype;
    size=$type.OWsize;
  }
  
  cosc470.compiler.v3.database.Database.addSymbolTableItem(name,type,size,value);
  
}|empty; 

type returns [String type,String size, String value, String OWtype, String OWsize]: 
data_type mis {$type=$data_type.type;$size=$data_type.size;$value=$mis.value;$OWtype=$mis.OWtype;$OWsize=$mis.OWsize;};

mis returns [String value,String OWtype, String OWsize]: 
equals right_hand_side {$value=$right_hand_side.value;$OWtype=$right_hand_side.OWtype;$OWsize=$right_hand_side.OWsize;}
|empty{$value="";$OWtype="";$OWsize="";};

data_type returns [String type,String size]: 
characters{$type=$characters.type;$size=$characters.size;} 
|numbers{$type=$numbers.type;$size=$numbers.size;}
|'BOOLEAN'{$type="BOOLEAN";$size="6";};

characters returns [String type,String size]: 
'CHAR'{$type="CHAR";$size="3";}
|'VARCHAR2' size_mis{$type="VARCHAR2";$size=$size_mis.size;if($size==""){$size="6";}};

numbers returns [String type,String size]: 
'NUMBER' size_mis {$type="NUMBER";$size=$size_mis.size;if($size==""){$size="3";}}
|'SMALLINT' size_mis{$type="SMALLINT";$size=$size_mis.size;if($size==""){$size="3";}}
| 'POSITIVE' size_mis{$type="POSITIVE";$size=$size_mis.size;if($size==""){$size="3";}};

size_mis returns [String size]: 
semicolon_left num semicolon_right {$size=$num.size;};


  // ///////////////////////FIX THIS/////////////////////////////////////////
compound_statement returns [String operations]: 
'BEGIN' optional_statements 'END' end_block
{$operations=$optional_statements.operations;};

optional_statements returns [String operations]: 
'NULL' end_block| statement_list
{$operations=$statement_list.operations;};

statement_list returns [String operations]: 
h i
{$operations=$h.operations+","+$i.operations;};       

i returns [String operations]: 
h t
{$operations=$h.operations+","+$t.operations;}|
empty
{$operations="";};

t returns[String operations]:
i {$operations=$i.operations;};

h returns [String operations]: 
statement
{$operations=$statement.operations;};

statement returns [String operations]: 
left_hand_side
{$operations=$left_hand_side.operations;}
| compound_statement 
{$operations=$compound_statement.operations;}
| output_line
{$operations=$output_line.operations;}
| and identifier end_block 
{$operations="AntlrOperator.userInput("+$identifier.value+")";}
| looping_statements
{$operations=$looping_statements.operations;};

output_line returns [String operations]: 
'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block 
{$operations="System.out.print("+$identifier.value+",NEW_LINE)";}
| 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block 
{$operations="System.out.print("+$identifier.value+")";}
| 'DBMS_OUTPUT.NEW_LINE' end_block
{$operations="System.out.print(NEW_LINE)";};


  // ///////////////////////FIX THIS/////////////////////////////////////////
looping_statements returns [String operations]: 
'IF BEGIN' expression 'THEN' statement 'END IF' end_block
{//if expression then do statement, otherwise don't do statement
  boolean checker=true;
  if(checker){
    $operations=$statement.operations;
  }
  else{
    $operations="";
  }
}
| 'WHILE' expression 'LOOP' statement 'END LOOP' end_block
{//while expression do statement
  $operations="";
  int temp=0;
  while(temp<1){
    $operations=$operations+$statement.operations;
    temp++;
  }
};

left_hand_side returns [String operations]: 
identifier equals right_hand_side
{$operations="AntlrOperator.leftHandSideOperator("+$identifier.value+","+ $right_hand_side.value+","+ $right_hand_side.OWtype+","+$right_hand_side.OWsize+")";};

right_hand_side returns [String value, String OWtype, String OWsize]: 
expression{$value=$expression.value;$OWtype="";$OWsize="";}
|string_literal{$value=$string_literal.value;$OWtype="";$OWsize="";}
|single_char{$value=$single_char.value;$OWtype="";$OWsize="";}
|casting semicolon_left expression semicolon_right{$value=$expression.value;$OWtype=$casting.OWtype;$OWsize=$casting.OWsize;};

casting returns [String OWtype, String OWsize]: 
data_type {$OWtype=$data_type.type;$OWsize=$data_type.size;};


  // ///////////////////////FIX THIS/////////////////////////////////////////
expression returns [String value]: 
a g {$value="value";};

g: 
relop a g 
{System.out.println("\n\nRelop: "+$relop.symbol);}
| empty;

a: 
c b;

b: 
addop c b 
{System.out.println("\n\nAddop: "+$addop.symbol);}
|empty;

c: 
pre_factor d;

d: 
mulop pre_factor d 
{System.out.println("\n\nMulop: "+$mulop.symbol);}
| empty;

pre_factor returns [String value]: 
'NOT' pre_factor 
|factor
{$value=$factor.value;}; 

factor returns [String value]: 
identifier {$value=$identifier.value;}
|num {$value=$num.size;}
|'TRUE'{$value="TRUE";}
|'FALSE'{$value="FALSE";}
|'NULL'{$value="NULL";};

identifier returns [String value]: 
('identifier') 
{$value=cosc470.compiler.v3.database.Database.findID(idCount);idCount++;};

num returns [String size]:
('num') 
{$size=cosc470.compiler.v3.database.Database.findNum(numCount);numCount++;} ;

string_literal returns [String value]:
('string_literal')
{$value=cosc470.compiler.v3.database.Database.findStringLiteral(strCount);strCount++;};

single_char returns [String value]:
('c')
{$value=cosc470.compiler.v3.database.Database.findChar(charCount);charCount++;};

empty: 
();

end_program: ('\\');

end_block: 
(';');

equals: 
(':=');

semicolon_left: 
('(');

semicolon_right: 
(')');

and: 
('&');

relop returns[String symbol]:
('>'{$symbol = $relop.text;}
|'>='{$symbol = $relop.text;}
|'=='{$symbol = $relop.text;}
|'<='{$symbol = $relop.text;}
|'<'{$symbol = $relop.text;}
|'<>'{$symbol = $relop.text;});

addop returns[String symbol]:
('+'{$symbol = $addop.text;}
|'-'{$symbol = $addop.text;});

mulop returns[String symbol]:
('*'{$symbol = $mulop.text;}
|'/'{$symbol = $mulop.text;}
|'%'{$symbol = $mulop.text;});






















