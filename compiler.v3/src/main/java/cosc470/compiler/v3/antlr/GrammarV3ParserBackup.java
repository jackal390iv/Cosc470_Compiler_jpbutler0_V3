// $ANTLR 3.5.2 C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g 2015-05-18 04:25:41

  package cosc470.compiler.v3.antlr;
  //import cosc470.compiler.v3.database.Database;
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarV3ParserBackup extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "'%'", "'&'", "'('", "')'", "'*'", 
		"'+'", "'-'", "'/'", "':='", "';'", "'<'", "'<='", "'<>'", "'=='", "'>'", 
		"'>='", "'BEGIN'", "'BOOLEAN'", "'CHAR'", "'DBMS_OUTPUT.NEW_LINE'", "'DBMS_OUTPUT.PUT'", 
		"'DBMS_OUTPUT.PUT_LINE'", "'DECLARE'", "'END IF'", "'END LOOP'", "'END'", 
		"'FALSE'", "'IF BEGIN'", "'LOOP'", "'NOT'", "'NULL'", "'NUMBER'", "'POSITIVE'", 
		"'SMALLINT'", "'THEN'", "'TRUE'", "'VARCHAR2'", "'WHILE'", "'\\\\'", "'identifier'", 
		"'num'", "'single_char'", "'string_literal'"
	};
	public static final int EOF=-1;
	public static final int T__4=4;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammarV3ParserBackup(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarV3ParserBackup(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GrammarV3ParserBackup.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g"; }


	int idCount=0;
	int strCount=0;
	int charCount=0;
	int numCount=0;



	// $ANTLR start "block"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:23:1: block : declarations compound_statement end_program ;
	public final void block() throws RecognitionException {
		String compound_statement1 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:23:6: ( declarations compound_statement end_program )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:23:8: declarations compound_statement end_program
			{
			pushFollow(FOLLOW_declarations_in_block43);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_compound_statement_in_block45);
			compound_statement1=compound_statement();
			state._fsp--;

			pushFollow(FOLLOW_end_program_in_block47);
			end_program();
			state._fsp--;

			cosc470.compiler.v3.database.Database.setAntlrOperationsList(compound_statement1);
			//AntlrOperator.evaluator(compound_statement1);

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "declarations"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:28:1: declarations : ( 'DECLARE' declare_rest | empty );
	public final void declarations() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:28:13: ( 'DECLARE' declare_rest | empty )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==26) ) {
				alt1=1;
			}
			else if ( ((LA1_0 >= 6 && LA1_0 <= 7)||(LA1_0 >= 9 && LA1_0 <= 10)||(LA1_0 >= 12 && LA1_0 <= 20)||LA1_0==29||LA1_0==32||LA1_0==38) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:28:15: 'DECLARE' declare_rest
					{
					match(input,26,FOLLOW_26_in_declarations56); 
					pushFollow(FOLLOW_declare_rest_in_declarations58);
					declare_rest();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:28:38: empty
					{
					pushFollow(FOLLOW_empty_in_declarations60);
					empty();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "declare_rest"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:30:1: declare_rest : ( identifier type end_block declare_rest | empty );
	public final void declare_rest() throws RecognitionException {
		String identifier2 =null;
		ParserRuleReturnScope type3 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:30:13: ( identifier type end_block declare_rest | empty )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==43) ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= 6 && LA2_0 <= 7)||(LA2_0 >= 9 && LA2_0 <= 10)||(LA2_0 >= 12 && LA2_0 <= 20)||LA2_0==29||LA2_0==32||LA2_0==38) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:30:15: identifier type end_block declare_rest
					{
					pushFollow(FOLLOW_identifier_in_declare_rest67);
					identifier2=identifier();
					state._fsp--;

					pushFollow(FOLLOW_type_in_declare_rest69);
					type3=type();
					state._fsp--;

					pushFollow(FOLLOW_end_block_in_declare_rest71);
					end_block();
					state._fsp--;

					pushFollow(FOLLOW_declare_rest_in_declare_rest73);
					declare_rest();
					state._fsp--;


					  String name,type,size,value;
					  name=identifier2;
					  type= (type3!=null?((GrammarV3ParserBackup.type_return)type3).type:null);
					  size=(type3!=null?((GrammarV3ParserBackup.type_return)type3).size:null);
					  value=(type3!=null?((GrammarV3ParserBackup.type_return)type3).value:null);    

					 if(!((type3!=null?((GrammarV3ParserBackup.type_return)type3).OWtype:null).equals(""))){
					    type=(type3!=null?((GrammarV3ParserBackup.type_return)type3).OWtype:null);
					    size=(type3!=null?((GrammarV3ParserBackup.type_return)type3).OWsize:null);
					  }
					   
					  if(value.contains("Expression(")){
					    value=value.substring((value.indexOf('(')+1),(value.indexOf(')'))).trim(); 
					  } 
					  
					  //System.out.println("\n\nName: "+name+"\nType: "+type+"\nSize: "+size+"\nValue: "+value);
					  
					  cosc470.compiler.v3.database.Database.addSymbolTableItem(name,type,size,value);
					  

					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:51:3: empty
					{
					pushFollow(FOLLOW_empty_in_declare_rest77);
					empty();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declare_rest"


	public static class type_return extends ParserRuleReturnScope {
		public String type;
		public String size;
		public String value;
		public String OWtype;
		public String OWsize;
	};


	// $ANTLR start "type"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:53:1: type returns [String type,String size, String value, String OWtype, String OWsize] : data_type mis ;
	public final GrammarV3ParserBackup.type_return type() throws RecognitionException {
		GrammarV3ParserBackup.type_return retval = new GrammarV3ParserBackup.type_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope data_type4 =null;
		ParserRuleReturnScope mis5 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:53:83: ( data_type mis )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:54:1: data_type mis
			{
			pushFollow(FOLLOW_data_type_in_type90);
			data_type4=data_type();
			state._fsp--;

			pushFollow(FOLLOW_mis_in_type92);
			mis5=mis();
			state._fsp--;

			retval.type =(data_type4!=null?((GrammarV3ParserBackup.data_type_return)data_type4).type:null);retval.size =(data_type4!=null?((GrammarV3ParserBackup.data_type_return)data_type4).size:null);retval.value =(mis5!=null?((GrammarV3ParserBackup.mis_return)mis5).value:null);retval.OWtype =(mis5!=null?((GrammarV3ParserBackup.mis_return)mis5).OWtype:null);retval.OWsize =(mis5!=null?((GrammarV3ParserBackup.mis_return)mis5).OWsize:null);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class mis_return extends ParserRuleReturnScope {
		public String value;
		public String OWtype;
		public String OWsize;
	};


	// $ANTLR start "mis"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:56:1: mis returns [String value,String OWtype, String OWsize] : ( equals right_hand_side | empty );
	public final GrammarV3ParserBackup.mis_return mis() throws RecognitionException {
		GrammarV3ParserBackup.mis_return retval = new GrammarV3ParserBackup.mis_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope right_hand_side6 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:56:56: ( equals right_hand_side | empty )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==12) ) {
				alt3=1;
			}
			else if ( (LA3_0==13) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:57:1: equals right_hand_side
					{
					pushFollow(FOLLOW_equals_in_mis106);
					equals();
					state._fsp--;

					pushFollow(FOLLOW_right_hand_side_in_mis108);
					right_hand_side6=right_hand_side();
					state._fsp--;

					retval.value =(right_hand_side6!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side6).value:null);retval.OWtype =(right_hand_side6!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side6).OWtype:null);retval.OWsize =(right_hand_side6!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side6).OWsize:null);
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:58:2: empty
					{
					pushFollow(FOLLOW_empty_in_mis113);
					empty();
					state._fsp--;

					retval.value ="";retval.OWtype ="";retval.OWsize ="";
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mis"


	public static class data_type_return extends ParserRuleReturnScope {
		public String type;
		public String size;
	};


	// $ANTLR start "data_type"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:60:1: data_type returns [String type,String size] : ( characters | numbers | 'BOOLEAN' );
	public final GrammarV3ParserBackup.data_type_return data_type() throws RecognitionException {
		GrammarV3ParserBackup.data_type_return retval = new GrammarV3ParserBackup.data_type_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope characters7 =null;
		ParserRuleReturnScope numbers8 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:60:44: ( characters | numbers | 'BOOLEAN' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 22:
			case 40:
				{
				alt4=1;
				}
				break;
			case 35:
			case 36:
			case 37:
				{
				alt4=2;
				}
				break;
			case 21:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:61:1: characters
					{
					pushFollow(FOLLOW_characters_in_data_type126);
					characters7=characters();
					state._fsp--;

					retval.type =(characters7!=null?((GrammarV3ParserBackup.characters_return)characters7).type:null);retval.size =(characters7!=null?((GrammarV3ParserBackup.characters_return)characters7).size:null);
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:62:2: numbers
					{
					pushFollow(FOLLOW_numbers_in_data_type131);
					numbers8=numbers();
					state._fsp--;

					retval.type =(numbers8!=null?((GrammarV3ParserBackup.numbers_return)numbers8).type:null);retval.size =(numbers8!=null?((GrammarV3ParserBackup.numbers_return)numbers8).size:null);
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:63:2: 'BOOLEAN'
					{
					match(input,21,FOLLOW_21_in_data_type135); 
					retval.type ="BOOLEAN";retval.size ="6";
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "data_type"


	public static class characters_return extends ParserRuleReturnScope {
		public String type;
		public String size;
	};


	// $ANTLR start "characters"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:65:1: characters returns [String type,String size] : ( 'CHAR' | 'VARCHAR2' size_mis );
	public final GrammarV3ParserBackup.characters_return characters() throws RecognitionException {
		GrammarV3ParserBackup.characters_return retval = new GrammarV3ParserBackup.characters_return();
		retval.start = input.LT(1);

		String size_mis9 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:65:45: ( 'CHAR' | 'VARCHAR2' size_mis )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==22) ) {
				alt5=1;
			}
			else if ( (LA5_0==40) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:66:1: 'CHAR'
					{
					match(input,22,FOLLOW_22_in_characters148); 
					retval.type ="CHAR";retval.size ="3";
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:67:2: 'VARCHAR2' size_mis
					{
					match(input,40,FOLLOW_40_in_characters152); 
					pushFollow(FOLLOW_size_mis_in_characters154);
					size_mis9=size_mis();
					state._fsp--;

					retval.type ="VARCHAR2";retval.size =size_mis9;if(retval.size==""){retval.size ="6";}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "characters"


	public static class numbers_return extends ParserRuleReturnScope {
		public String type;
		public String size;
	};


	// $ANTLR start "numbers"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:69:1: numbers returns [String type,String size] : ( 'NUMBER' size_mis | 'SMALLINT' size_mis | 'POSITIVE' size_mis );
	public final GrammarV3ParserBackup.numbers_return numbers() throws RecognitionException {
		GrammarV3ParserBackup.numbers_return retval = new GrammarV3ParserBackup.numbers_return();
		retval.start = input.LT(1);

		String size_mis10 =null;
		String size_mis11 =null;
		String size_mis12 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:69:42: ( 'NUMBER' size_mis | 'SMALLINT' size_mis | 'POSITIVE' size_mis )
			int alt6=3;
			switch ( input.LA(1) ) {
			case 35:
				{
				alt6=1;
				}
				break;
			case 37:
				{
				alt6=2;
				}
				break;
			case 36:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:70:1: 'NUMBER' size_mis
					{
					match(input,35,FOLLOW_35_in_numbers167); 
					pushFollow(FOLLOW_size_mis_in_numbers169);
					size_mis10=size_mis();
					state._fsp--;

					retval.type ="NUMBER";retval.size =size_mis10;if(retval.size==""){retval.size ="3";}
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:71:2: 'SMALLINT' size_mis
					{
					match(input,37,FOLLOW_37_in_numbers174); 
					pushFollow(FOLLOW_size_mis_in_numbers176);
					size_mis11=size_mis();
					state._fsp--;

					retval.type ="SMALLINT";retval.size =size_mis11;if(retval.size==""){retval.size ="3";}
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:72:3: 'POSITIVE' size_mis
					{
					match(input,36,FOLLOW_36_in_numbers181); 
					pushFollow(FOLLOW_size_mis_in_numbers183);
					size_mis12=size_mis();
					state._fsp--;

					retval.type ="POSITIVE";retval.size =size_mis12;if(retval.size==""){retval.size ="3";}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numbers"



	// $ANTLR start "size_mis"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:74:1: size_mis returns [String size] : ( semicolon_left num semicolon_right | empty );
	public final String size_mis() throws RecognitionException {
		String size = null;


		String num13 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:74:31: ( semicolon_left num semicolon_right | empty )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==6) ) {
				switch ( input.LA(2) ) {
				case 44:
					{
					int LA7_3 = input.LA(3);
					if ( (LA7_3==7) ) {
						alt7=1;
					}
					else if ( (LA7_3==4||(LA7_3 >= 8 && LA7_3 <= 11)||(LA7_3 >= 14 && LA7_3 <= 19)) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 10:
					{
					int LA7_4 = input.LA(3);
					if ( (LA7_4==44) ) {
						int LA7_6 = input.LA(4);
						if ( (LA7_6==7) ) {
							alt7=1;
						}
						else if ( (LA7_6==4||(LA7_6 >= 8 && LA7_6 <= 11)||(LA7_6 >= 14 && LA7_6 <= 19)) ) {
							alt7=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 30:
				case 33:
				case 34:
				case 39:
				case 43:
					{
					alt7=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( ((LA7_0 >= 12 && LA7_0 <= 13)) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:75:1: semicolon_left num semicolon_right
					{
					pushFollow(FOLLOW_semicolon_left_in_size_mis196);
					semicolon_left();
					state._fsp--;

					pushFollow(FOLLOW_num_in_size_mis198);
					num13=num();
					state._fsp--;

					pushFollow(FOLLOW_semicolon_right_in_size_mis200);
					semicolon_right();
					state._fsp--;

					size =num13;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:76:2: empty
					{
					pushFollow(FOLLOW_empty_in_size_mis205);
					empty();
					state._fsp--;

					size ="";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "size_mis"



	// $ANTLR start "compound_statement"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:78:1: compound_statement returns [String operations] : 'BEGIN' optional_statements 'END' end_block ;
	public final String compound_statement() throws RecognitionException {
		String operations = null;


		String optional_statements14 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:78:47: ( 'BEGIN' optional_statements 'END' end_block )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:79:1: 'BEGIN' optional_statements 'END' end_block
			{
			match(input,20,FOLLOW_20_in_compound_statement219); 
			pushFollow(FOLLOW_optional_statements_in_compound_statement221);
			optional_statements14=optional_statements();
			state._fsp--;

			match(input,29,FOLLOW_29_in_compound_statement223); 
			pushFollow(FOLLOW_end_block_in_compound_statement225);
			end_block();
			state._fsp--;

			operations =optional_statements14;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "compound_statement"



	// $ANTLR start "optional_statements"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:82:1: optional_statements returns [String operations] : ( 'NULL' end_block | statement_list );
	public final String optional_statements() throws RecognitionException {
		String operations = null;


		String statement_list15 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:82:48: ( 'NULL' end_block | statement_list )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==34) ) {
				alt8=1;
			}
			else if ( (LA8_0==5||LA8_0==20||(LA8_0 >= 23 && LA8_0 <= 25)||LA8_0==31||LA8_0==41||LA8_0==43) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:83:1: 'NULL' end_block
					{
					match(input,34,FOLLOW_34_in_optional_statements239); 
					pushFollow(FOLLOW_end_block_in_optional_statements241);
					end_block();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:83:19: statement_list
					{
					pushFollow(FOLLOW_statement_list_in_optional_statements244);
					statement_list15=statement_list();
					state._fsp--;

					operations =statement_list15;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "optional_statements"



	// $ANTLR start "statement_list"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:86:1: statement_list returns [String operations] : h i ;
	public final String statement_list() throws RecognitionException {
		String operations = null;


		String h16 =null;
		String i17 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:86:43: ( h i )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:87:1: h i
			{
			pushFollow(FOLLOW_h_in_statement_list258);
			h16=h();
			state._fsp--;

			pushFollow(FOLLOW_i_in_statement_list260);
			i17=i();
			state._fsp--;

			operations =h16+","+i17;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "statement_list"



	// $ANTLR start "i"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:90:1: i returns [String operations] : ( h t | empty );
	public final String i() throws RecognitionException {
		String operations = null;


		String h18 =null;
		String t19 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:90:30: ( h t | empty )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==5||LA9_0==20||(LA9_0 >= 23 && LA9_0 <= 25)||LA9_0==31||LA9_0==41||LA9_0==43) ) {
				alt9=1;
			}
			else if ( (LA9_0==29) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:91:1: h t
					{
					pushFollow(FOLLOW_h_in_i281);
					h18=h();
					state._fsp--;

					pushFollow(FOLLOW_t_in_i283);
					t19=t();
					state._fsp--;

					operations =h18+","+t19;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:93:1: empty
					{
					pushFollow(FOLLOW_empty_in_i288);
					empty();
					state._fsp--;

					operations ="";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "i"



	// $ANTLR start "t"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:96:1: t returns [String operations] : i ;
	public final String t() throws RecognitionException {
		String operations = null;


		String i20 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:96:29: ( i )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:97:1: i
			{
			pushFollow(FOLLOW_i_in_t300);
			i20=i();
			state._fsp--;

			operations =i20;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "t"



	// $ANTLR start "h"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:99:1: h returns [String operations] : statement ;
	public final String h() throws RecognitionException {
		String operations = null;


		String statement21 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:99:30: ( statement )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:100:1: statement
			{
			pushFollow(FOLLOW_statement_in_h314);
			statement21=statement();
			state._fsp--;

			operations =statement21;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "h"



	// $ANTLR start "statement"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:103:1: statement returns [String operations] : ( left_hand_side | compound_statement | output_line | and identifier end_block | looping_statements );
	public final String statement() throws RecognitionException {
		String operations = null;


		String left_hand_side22 =null;
		String compound_statement23 =null;
		String output_line24 =null;
		String identifier25 =null;
		String looping_statements26 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:103:38: ( left_hand_side | compound_statement | output_line | and identifier end_block | looping_statements )
			int alt10=5;
			switch ( input.LA(1) ) {
			case 43:
				{
				alt10=1;
				}
				break;
			case 20:
				{
				alt10=2;
				}
				break;
			case 23:
			case 24:
			case 25:
				{
				alt10=3;
				}
				break;
			case 5:
				{
				alt10=4;
				}
				break;
			case 31:
			case 41:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:104:1: left_hand_side
					{
					pushFollow(FOLLOW_left_hand_side_in_statement328);
					left_hand_side22=left_hand_side();
					state._fsp--;

					operations =left_hand_side22;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:106:3: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement334);
					compound_statement23=compound_statement();
					state._fsp--;

					operations =compound_statement23;
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:108:3: output_line
					{
					pushFollow(FOLLOW_output_line_in_statement341);
					output_line24=output_line();
					state._fsp--;

					operations =output_line24;
					}
					break;
				case 4 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:110:3: and identifier end_block
					{
					pushFollow(FOLLOW_and_in_statement347);
					and();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_statement349);
					identifier25=identifier();
					state._fsp--;

					pushFollow(FOLLOW_end_block_in_statement351);
					end_block();
					state._fsp--;

					operations =",AntlrOperator.userInput("+identifier25+")";
					}
					break;
				case 5 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:112:3: looping_statements
					{
					pushFollow(FOLLOW_looping_statements_in_statement358);
					looping_statements26=looping_statements();
					state._fsp--;

					operations =looping_statements26;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "statement"



	// $ANTLR start "output_line"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:115:1: output_line returns [String operations] : ( 'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block | 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block | 'DBMS_OUTPUT.NEW_LINE' end_block );
	public final String output_line() throws RecognitionException {
		String operations = null;


		String identifier27 =null;
		String identifier28 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:115:40: ( 'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block | 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block | 'DBMS_OUTPUT.NEW_LINE' end_block )
			int alt11=3;
			switch ( input.LA(1) ) {
			case 25:
				{
				alt11=1;
				}
				break;
			case 24:
				{
				alt11=2;
				}
				break;
			case 23:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:116:1: 'DBMS_OUTPUT.PUT_LINE' semicolon_left identifier semicolon_right end_block
					{
					match(input,25,FOLLOW_25_in_output_line372); 
					pushFollow(FOLLOW_semicolon_left_in_output_line374);
					semicolon_left();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_output_line376);
					identifier27=identifier();
					state._fsp--;

					pushFollow(FOLLOW_semicolon_right_in_output_line378);
					semicolon_right();
					state._fsp--;

					pushFollow(FOLLOW_end_block_in_output_line380);
					end_block();
					state._fsp--;

					operations =",System.out.print_NEW_LINE("+identifier27+")";
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:118:3: 'DBMS_OUTPUT.PUT' semicolon_left identifier semicolon_right end_block
					{
					match(input,24,FOLLOW_24_in_output_line387); 
					pushFollow(FOLLOW_semicolon_left_in_output_line389);
					semicolon_left();
					state._fsp--;

					pushFollow(FOLLOW_identifier_in_output_line391);
					identifier28=identifier();
					state._fsp--;

					pushFollow(FOLLOW_semicolon_right_in_output_line393);
					semicolon_right();
					state._fsp--;

					pushFollow(FOLLOW_end_block_in_output_line395);
					end_block();
					state._fsp--;

					operations =",System.out.print("+identifier28+")";
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:120:3: 'DBMS_OUTPUT.NEW_LINE' end_block
					{
					match(input,23,FOLLOW_23_in_output_line402); 
					pushFollow(FOLLOW_end_block_in_output_line404);
					end_block();
					state._fsp--;

					operations =",System.out.print_NEW_LINE()";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "output_line"



	// $ANTLR start "looping_statements"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:123:1: looping_statements returns [String operations] : ( 'IF BEGIN' expression 'THEN' statement 'END IF' end_block | 'WHILE' expression 'LOOP' statement 'END LOOP' end_block );
	public final String looping_statements() throws RecognitionException {
		String operations = null;


		ParserRuleReturnScope expression29 =null;
		String statement30 =null;
		ParserRuleReturnScope expression31 =null;
		String statement32 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:123:47: ( 'IF BEGIN' expression 'THEN' statement 'END IF' end_block | 'WHILE' expression 'LOOP' statement 'END LOOP' end_block )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==31) ) {
				alt12=1;
			}
			else if ( (LA12_0==41) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:124:1: 'IF BEGIN' expression 'THEN' statement 'END IF' end_block
					{
					match(input,31,FOLLOW_31_in_looping_statements418); 
					pushFollow(FOLLOW_expression_in_looping_statements420);
					expression29=expression();
					state._fsp--;

					match(input,38,FOLLOW_38_in_looping_statements422); 
					pushFollow(FOLLOW_statement_in_looping_statements424);
					statement30=statement();
					state._fsp--;

					match(input,27,FOLLOW_27_in_looping_statements426); 
					pushFollow(FOLLOW_end_block_in_looping_statements428);
					end_block();
					state._fsp--;

					//if expression then do statement, otherwise don't do statement
					  operations =",IF{"+(expression29!=null?((GrammarV3ParserBackup.expression_return)expression29).value:null)+",}THEN{"+statement30+",}IFEnd";
					  /*if((expression29!=null?((GrammarV3Parser.expression_return)expression29).value:null).equals("TRUE")){
					    operations =statement30;
					  }else{
					    operations ="";
					  }*/

					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:133:3: 'WHILE' expression 'LOOP' statement 'END LOOP' end_block
					{
					match(input,41,FOLLOW_41_in_looping_statements434); 
					pushFollow(FOLLOW_expression_in_looping_statements436);
					expression31=expression();
					state._fsp--;

					match(input,32,FOLLOW_32_in_looping_statements438); 
					pushFollow(FOLLOW_statement_in_looping_statements440);
					statement32=statement();
					state._fsp--;

					match(input,28,FOLLOW_28_in_looping_statements442); 
					pushFollow(FOLLOW_end_block_in_looping_statements444);
					end_block();
					state._fsp--;

					//while expression do statement
					  operations =",WHILE{"+(expression31!=null?((GrammarV3ParserBackup.expression_return)expression31).value:null)+",}Loop{"+statement32+",}WHILEEnd";
					 /*if((expression31!=null?((GrammarV3Parser.expression_return)expression31).value:null).matches("-?\\d+(\\.\\d+)?")){
					    int counter=0;
					    while(counter<(Integer.parseInt((expression31!=null?((GrammarV3Parser.expression_return)expression31).value:null)))){
					      operations =operations+statement32;
					      counter++;
					      } 
					  } else{
					    operations ="";
					  }
					  */

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "looping_statements"



	// $ANTLR start "left_hand_side"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:148:1: left_hand_side returns [String operations] : identifier equals right_hand_side end_block ;
	public final String left_hand_side() throws RecognitionException {
		String operations = null;


		String identifier33 =null;
		ParserRuleReturnScope right_hand_side34 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:148:43: ( identifier equals right_hand_side end_block )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:149:1: identifier equals right_hand_side end_block
			{
			pushFollow(FOLLOW_identifier_in_left_hand_side458);
			identifier33=identifier();
			state._fsp--;

			pushFollow(FOLLOW_equals_in_left_hand_side460);
			equals();
			state._fsp--;

			pushFollow(FOLLOW_right_hand_side_in_left_hand_side462);
			right_hand_side34=right_hand_side();
			state._fsp--;

			pushFollow(FOLLOW_end_block_in_left_hand_side464);
			end_block();
			state._fsp--;

			operations =",AntlrOperator.leftHandSideOperator{,"+identifier33+","+ (right_hand_side34!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side34).value:null)+","+ (right_hand_side34!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side34).OWtype:null)+","+(right_hand_side34!=null?((GrammarV3ParserBackup.right_hand_side_return)right_hand_side34).OWsize:null)+",}";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return operations;
	}
	// $ANTLR end "left_hand_side"


	public static class right_hand_side_return extends ParserRuleReturnScope {
		public String value;
		public String OWtype;
		public String OWsize;
	};


	// $ANTLR start "right_hand_side"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:152:1: right_hand_side returns [String value, String OWtype, String OWsize] : ( expression | string_literal | single_char | casting semicolon_left expression semicolon_right );
	public final GrammarV3ParserBackup.right_hand_side_return right_hand_side() throws RecognitionException {
		GrammarV3ParserBackup.right_hand_side_return retval = new GrammarV3ParserBackup.right_hand_side_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope expression35 =null;
		String string_literal36 =null;
		String single_char37 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope casting39 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:152:69: ( expression | string_literal | single_char | casting semicolon_left expression semicolon_right )
			int alt13=4;
			switch ( input.LA(1) ) {
			case 10:
			case 30:
			case 33:
			case 34:
			case 39:
			case 43:
			case 44:
				{
				alt13=1;
				}
				break;
			case 46:
				{
				alt13=2;
				}
				break;
			case 45:
				{
				alt13=3;
				}
				break;
			case 21:
			case 22:
			case 35:
			case 36:
			case 37:
			case 40:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:153:1: expression
					{
					pushFollow(FOLLOW_expression_in_right_hand_side478);
					expression35=expression();
					state._fsp--;

					retval.value =(expression35!=null?((GrammarV3ParserBackup.expression_return)expression35).value:null);retval.OWtype ="";retval.OWsize =(expression35!=null?((GrammarV3ParserBackup.expression_return)expression35).OWsize:null);
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:154:2: string_literal
					{
					pushFollow(FOLLOW_string_literal_in_right_hand_side482);
					string_literal36=string_literal();
					state._fsp--;

					retval.value =string_literal36;retval.OWtype ="";retval.OWsize ="";
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:155:2: single_char
					{
					pushFollow(FOLLOW_single_char_in_right_hand_side486);
					single_char37=single_char();
					state._fsp--;

					retval.value =single_char37;retval.OWtype ="";retval.OWsize ="";
					}
					break;
				case 4 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:156:2: casting semicolon_left expression semicolon_right
					{
					pushFollow(FOLLOW_casting_in_right_hand_side490);
					casting39=casting();
					state._fsp--;

					pushFollow(FOLLOW_semicolon_left_in_right_hand_side492);
					semicolon_left();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_right_hand_side494);
					expression38=expression();
					state._fsp--;

					pushFollow(FOLLOW_semicolon_right_in_right_hand_side496);
					semicolon_right();
					state._fsp--;

					retval.value =(expression38!=null?((GrammarV3ParserBackup.expression_return)expression38).value:null);retval.OWtype =(casting39!=null?((GrammarV3ParserBackup.casting_return)casting39).OWtype:null);retval.OWsize =(casting39!=null?((GrammarV3ParserBackup.casting_return)casting39).OWsize:null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "right_hand_side"


	public static class casting_return extends ParserRuleReturnScope {
		public String OWtype;
		public String OWsize;
	};


	// $ANTLR start "casting"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:158:1: casting returns [String OWtype, String OWsize] : data_type ;
	public final GrammarV3ParserBackup.casting_return casting() throws RecognitionException {
		GrammarV3ParserBackup.casting_return retval = new GrammarV3ParserBackup.casting_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope data_type40 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:158:47: ( data_type )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:159:1: data_type
			{
			pushFollow(FOLLOW_data_type_in_casting509);
			data_type40=data_type();
			state._fsp--;

			retval.OWtype =(data_type40!=null?((GrammarV3ParserBackup.data_type_return)data_type40).type:null);retval.OWsize =(data_type40!=null?((GrammarV3ParserBackup.data_type_return)data_type40).size:null);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "casting"


	public static class expression_return extends ParserRuleReturnScope {
		public String value;
		public String OWsize;
	};


	// $ANTLR start "expression"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:161:1: expression returns [String value, String OWsize] : a g ;
	public final GrammarV3ParserBackup.expression_return expression() throws RecognitionException {
		GrammarV3ParserBackup.expression_return retval = new GrammarV3ParserBackup.expression_return();
		retval.start = input.LT(1);

		String a41 =null;
		String g42 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:161:49: ( a g )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:162:1: a g
			{
			pushFollow(FOLLOW_a_in_expression523);
			a41=a();
			state._fsp--;

			pushFollow(FOLLOW_g_in_expression525);
			g42=g();
			state._fsp--;


			retval.value =",Expression("+a41+g42+")";
			retval.OWsize ="";

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"



	// $ANTLR start "g"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:168:1: g returns [String value] : ( relop a g_help | empty );
	public final String g() throws RecognitionException {
		String value = null;


		ParserRuleReturnScope relop43 =null;
		String a44 =null;
		String g_help45 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:168:25: ( relop a g_help | empty )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= 14 && LA14_0 <= 19)) ) {
				alt14=1;
			}
			else if ( (LA14_0==7||LA14_0==13||LA14_0==32||LA14_0==38) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:169:1: relop a g_help
					{
					pushFollow(FOLLOW_relop_in_g540);
					relop43=relop();
					state._fsp--;

					pushFollow(FOLLOW_a_in_g542);
					a44=a();
					state._fsp--;

					pushFollow(FOLLOW_g_help_in_g544);
					g_help45=g_help();
					state._fsp--;

					value =(relop43!=null?((GrammarV3ParserBackup.relop_return)relop43).symbol:null)+a44+g_help45;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:171:3: empty
					{
					pushFollow(FOLLOW_empty_in_g551);
					empty();
					state._fsp--;

					value ="";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "g"



	// $ANTLR start "g_help"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:174:1: g_help returns [String value] : g ;
	public final String g_help() throws RecognitionException {
		String value = null;


		String g46 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:174:30: ( g )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:175:1: g
			{
			pushFollow(FOLLOW_g_in_g_help565);
			g46=g();
			state._fsp--;

			value =g46;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "g_help"



	// $ANTLR start "a"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:177:1: a returns [String value] : c b ;
	public final String a() throws RecognitionException {
		String value = null;


		String c47 =null;
		String b48 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:177:25: ( c b )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:178:1: c b
			{
			pushFollow(FOLLOW_c_in_a578);
			c47=c();
			state._fsp--;

			pushFollow(FOLLOW_b_in_a580);
			b48=b();
			state._fsp--;

			value =c47+b48;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "a"



	// $ANTLR start "b"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:181:1: b returns [String value] : ( addop c b_help | empty );
	public final String b() throws RecognitionException {
		String value = null;


		ParserRuleReturnScope addop49 =null;
		String c50 =null;
		String b_help51 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:181:25: ( addop c b_help | empty )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( ((LA15_0 >= 9 && LA15_0 <= 10)) ) {
				alt15=1;
			}
			else if ( (LA15_0==7||(LA15_0 >= 13 && LA15_0 <= 19)||LA15_0==32||LA15_0==38) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:182:1: addop c b_help
					{
					pushFollow(FOLLOW_addop_in_b594);
					addop49=addop();
					state._fsp--;

					pushFollow(FOLLOW_c_in_b596);
					c50=c();
					state._fsp--;

					pushFollow(FOLLOW_b_help_in_b598);
					b_help51=b_help();
					state._fsp--;

					value =(addop49!=null?((GrammarV3ParserBackup.addop_return)addop49).symbol:null)+c50+b_help51;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:184:2: empty
					{
					pushFollow(FOLLOW_empty_in_b604);
					empty();
					state._fsp--;

					value ="";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "b"



	// $ANTLR start "b_help"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:187:1: b_help returns [String value] : b ;
	public final String b_help() throws RecognitionException {
		String value = null;


		String b52 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:187:30: ( b )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:188:1: b
			{
			pushFollow(FOLLOW_b_in_b_help618);
			b52=b();
			state._fsp--;

			value =b52;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "b_help"



	// $ANTLR start "c"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:190:1: c returns [String value] : pre_factor d ;
	public final String c() throws RecognitionException {
		String value = null;


		String pre_factor53 =null;
		String d54 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:190:25: ( pre_factor d )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:191:1: pre_factor d
			{
			pushFollow(FOLLOW_pre_factor_in_c631);
			pre_factor53=pre_factor();
			state._fsp--;

			pushFollow(FOLLOW_d_in_c633);
			d54=d();
			state._fsp--;

			value =pre_factor53+d54;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "c"



	// $ANTLR start "d"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:194:1: d returns [String value] : ( mulop pre_factor d_help | empty );
	public final String d() throws RecognitionException {
		String value = null;


		ParserRuleReturnScope mulop55 =null;
		String pre_factor56 =null;
		String d_help57 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:194:25: ( mulop pre_factor d_help | empty )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==4||LA16_0==8||LA16_0==11) ) {
				alt16=1;
			}
			else if ( ((LA16_0 >= 6 && LA16_0 <= 7)||(LA16_0 >= 9 && LA16_0 <= 10)||(LA16_0 >= 12 && LA16_0 <= 20)||LA16_0==29||LA16_0==32||LA16_0==38) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:195:1: mulop pre_factor d_help
					{
					pushFollow(FOLLOW_mulop_in_d647);
					mulop55=mulop();
					state._fsp--;

					pushFollow(FOLLOW_pre_factor_in_d649);
					pre_factor56=pre_factor();
					state._fsp--;

					pushFollow(FOLLOW_d_help_in_d651);
					d_help57=d_help();
					state._fsp--;

					value =(mulop55!=null?((GrammarV3ParserBackup.mulop_return)mulop55).symbol:null)+pre_factor56+d_help57;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:197:3: empty
					{
					pushFollow(FOLLOW_empty_in_d658);
					empty();
					state._fsp--;

					value ="";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "d"



	// $ANTLR start "d_help"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:200:1: d_help returns [String value] : d ;
	public final String d_help() throws RecognitionException {
		String value = null;


		String d58 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:200:30: ( d )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:201:1: d
			{
			pushFollow(FOLLOW_d_in_d_help672);
			d58=d();
			state._fsp--;

			value =d58;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "d_help"



	// $ANTLR start "pre_factor"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:203:1: pre_factor returns [String value] : ( 'NOT' helper_factor | factor );
	public final String pre_factor() throws RecognitionException {
		String value = null;


		String helper_factor59 =null;
		String factor60 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:203:34: ( 'NOT' helper_factor | factor )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==33) ) {
				alt17=1;
			}
			else if ( (LA17_0==10||LA17_0==30||LA17_0==34||LA17_0==39||(LA17_0 >= 43 && LA17_0 <= 44)) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:204:1: 'NOT' helper_factor
					{
					match(input,33,FOLLOW_33_in_pre_factor685); 
					pushFollow(FOLLOW_helper_factor_in_pre_factor687);
					helper_factor59=helper_factor();
					state._fsp--;

					  value ="NOT" + helper_factor59;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:206:2: factor
					{
					pushFollow(FOLLOW_factor_in_pre_factor693);
					factor60=factor();
					state._fsp--;

					value =factor60;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "pre_factor"



	// $ANTLR start "helper_factor"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:209:1: helper_factor returns [String value] : pre_factor ;
	public final String helper_factor() throws RecognitionException {
		String value = null;


		String pre_factor61 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:209:36: ( pre_factor )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:210:1: pre_factor
			{
			pushFollow(FOLLOW_pre_factor_in_helper_factor705);
			pre_factor61=pre_factor();
			state._fsp--;

			value =pre_factor61;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "helper_factor"



	// $ANTLR start "factor"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:212:1: factor returns [String value] : ( identifier | num | 'TRUE' | 'FALSE' | 'NULL' );
	public final String factor() throws RecognitionException {
		String value = null;


		String identifier62 =null;
		String num63 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:212:30: ( identifier | num | 'TRUE' | 'FALSE' | 'NULL' )
			int alt18=5;
			switch ( input.LA(1) ) {
			case 43:
				{
				alt18=1;
				}
				break;
			case 10:
			case 44:
				{
				alt18=2;
				}
				break;
			case 39:
				{
				alt18=3;
				}
				break;
			case 30:
				{
				alt18=4;
				}
				break;
			case 34:
				{
				alt18=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:213:1: identifier
					{
					pushFollow(FOLLOW_identifier_in_factor720);
					identifier62=identifier();
					state._fsp--;

					value =identifier62;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:214:2: num
					{
					pushFollow(FOLLOW_num_in_factor725);
					num63=num();
					state._fsp--;

					value =num63;
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:215:2: 'TRUE'
					{
					match(input,39,FOLLOW_39_in_factor730); 
					value ="TRUE";
					}
					break;
				case 4 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:216:2: 'FALSE'
					{
					match(input,30,FOLLOW_30_in_factor734); 
					value ="FALSE";
					}
					break;
				case 5 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:217:2: 'NULL'
					{
					match(input,34,FOLLOW_34_in_factor738); 
					value ="NULL";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "factor"



	// $ANTLR start "identifier"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:219:1: identifier returns [String value] : ( 'identifier' ) ;
	public final String identifier() throws RecognitionException {
		String value = null;


		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:219:34: ( ( 'identifier' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:220:2: ( 'identifier' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:220:2: ( 'identifier' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:220:2: 'identifier'
			{
			match(input,43,FOLLOW_43_in_identifier752); 
			}

			value =AntlrOperator.findID(idCount);idCount++;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "identifier"



	// $ANTLR start "num"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:223:1: num returns [String size] : ( 'num' | negative 'num' );
	public final String num() throws RecognitionException {
		String size = null;


		ParserRuleReturnScope negative64 =null;

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:223:26: ( 'num' | negative 'num' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==44) ) {
				alt19=1;
			}
			else if ( (LA19_0==10) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:224:1: 'num'
					{
					match(input,44,FOLLOW_44_in_num767); 
					size =AntlrOperator.findNum(numCount);numCount++;
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:226:1: negative 'num'
					{
					pushFollow(FOLLOW_negative_in_num774);
					negative64=negative();
					state._fsp--;

					match(input,44,FOLLOW_44_in_num776); 
					size =(negative64!=null?((GrammarV3ParserBackup.negative_return)negative64).value:null)+AntlrOperator.findNum(numCount);numCount++;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "num"


	public static class negative_return extends ParserRuleReturnScope {
		public String value;
	};


	// $ANTLR start "negative"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:229:1: negative returns [String value] : ( '-' ) ;
	public final GrammarV3ParserBackup.negative_return negative() throws RecognitionException {
		GrammarV3ParserBackup.negative_return retval = new GrammarV3ParserBackup.negative_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:229:32: ( ( '-' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:229:34: ( '-' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:229:34: ( '-' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:229:35: '-'
			{
			match(input,10,FOLLOW_10_in_negative791); 
			}

			retval.value =input.toString(retval.start,input.LT(-1));
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negative"



	// $ANTLR start "string_literal"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:231:1: string_literal returns [String value] : ( 'string_literal' ) ;
	public final String string_literal() throws RecognitionException {
		String value = null;


		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:231:38: ( ( 'string_literal' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:232:2: ( 'string_literal' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:232:2: ( 'string_literal' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:232:2: 'string_literal'
			{
			match(input,46,FOLLOW_46_in_string_literal806); 
			}

			value =AntlrOperator.findStringLiteral(strCount);strCount++;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "string_literal"



	// $ANTLR start "single_char"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:235:1: single_char returns [String value] : ( 'single_char' ) ;
	public final String single_char() throws RecognitionException {
		String value = null;


		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:235:35: ( ( 'single_char' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:236:2: ( 'single_char' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:236:2: ( 'single_char' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:236:2: 'single_char'
			{
			match(input,45,FOLLOW_45_in_single_char821); 
			}

			value =AntlrOperator.findChar(charCount);charCount++;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "single_char"



	// $ANTLR start "empty"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:239:1: empty : () ;
	public final void empty() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:239:6: ( () )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:240:2: ()
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:240:2: ()
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:240:2: 
			{
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "empty"



	// $ANTLR start "end_program"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:242:1: end_program : ( '\\\\' ) ;
	public final void end_program() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:242:12: ( ( '\\\\' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:242:14: ( '\\\\' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:242:14: ( '\\\\' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:242:15: '\\\\'
			{
			match(input,42,FOLLOW_42_in_end_program841); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end_program"



	// $ANTLR start "end_block"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:244:1: end_block : ( ';' ) ;
	public final void end_block() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:244:10: ( ( ';' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:245:2: ( ';' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:245:2: ( ';' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:245:2: ';'
			{
			match(input,13,FOLLOW_13_in_end_block851); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end_block"



	// $ANTLR start "equals"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:247:1: equals : ( ':=' ) ;
	public final void equals() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:247:7: ( ( ':=' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:248:2: ( ':=' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:248:2: ( ':=' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:248:2: ':='
			{
			match(input,12,FOLLOW_12_in_equals861); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "equals"



	// $ANTLR start "semicolon_left"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:250:1: semicolon_left : ( '(' ) ;
	public final void semicolon_left() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:250:15: ( ( '(' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:251:2: ( '(' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:251:2: ( '(' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:251:2: '('
			{
			match(input,6,FOLLOW_6_in_semicolon_left871); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "semicolon_left"



	// $ANTLR start "semicolon_right"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:253:1: semicolon_right : ( ')' ) ;
	public final void semicolon_right() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:253:16: ( ( ')' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:254:2: ( ')' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:254:2: ( ')' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:254:2: ')'
			{
			match(input,7,FOLLOW_7_in_semicolon_right881); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "semicolon_right"



	// $ANTLR start "and"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:256:1: and : ( '&' ) ;
	public final void and() throws RecognitionException {
		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:256:4: ( ( '&' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:257:2: ( '&' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:257:2: ( '&' )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:257:2: '&'
			{
			match(input,5,FOLLOW_5_in_and891); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "and"


	public static class relop_return extends ParserRuleReturnScope {
		public String symbol;
	};


	// $ANTLR start "relop"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:259:1: relop returns [String symbol] : ( '>' | '>=' | '==' | '<=' | '<' | '<>' ) ;
	public final GrammarV3ParserBackup.relop_return relop() throws RecognitionException {
		GrammarV3ParserBackup.relop_return retval = new GrammarV3ParserBackup.relop_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:259:29: ( ( '>' | '>=' | '==' | '<=' | '<' | '<>' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:260:2: ( '>' | '>=' | '==' | '<=' | '<' | '<>' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:260:2: ( '>' | '>=' | '==' | '<=' | '<' | '<>' )
			int alt20=6;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt20=1;
				}
				break;
			case 19:
				{
				alt20=2;
				}
				break;
			case 17:
				{
				alt20=3;
				}
				break;
			case 15:
				{
				alt20=4;
				}
				break;
			case 14:
				{
				alt20=5;
				}
				break;
			case 16:
				{
				alt20=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:260:2: '>'
					{
					match(input,18,FOLLOW_18_in_relop903); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:261:2: '>='
					{
					match(input,19,FOLLOW_19_in_relop907); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:262:2: '=='
					{
					match(input,17,FOLLOW_17_in_relop911); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 4 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:263:2: '<='
					{
					match(input,15,FOLLOW_15_in_relop915); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 5 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:264:2: '<'
					{
					match(input,14,FOLLOW_14_in_relop919); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 6 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:265:2: '<>'
					{
					match(input,16,FOLLOW_16_in_relop923); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relop"


	public static class addop_return extends ParserRuleReturnScope {
		public String symbol;
	};


	// $ANTLR start "addop"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:267:1: addop returns [String symbol] : ( '+' | '-' ) ;
	public final GrammarV3ParserBackup.addop_return addop() throws RecognitionException {
		GrammarV3ParserBackup.addop_return retval = new GrammarV3ParserBackup.addop_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:267:29: ( ( '+' | '-' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:268:2: ( '+' | '-' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:268:2: ( '+' | '-' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==9) ) {
				alt21=1;
			}
			else if ( (LA21_0==10) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:268:2: '+'
					{
					match(input,9,FOLLOW_9_in_addop936); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:269:2: '-'
					{
					match(input,10,FOLLOW_10_in_addop940); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addop"


	public static class mulop_return extends ParserRuleReturnScope {
		public String symbol;
	};


	// $ANTLR start "mulop"
	// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:271:1: mulop returns [String symbol] : ( '*' | '/' | '%' ) ;
	public final GrammarV3ParserBackup.mulop_return mulop() throws RecognitionException {
		GrammarV3ParserBackup.mulop_return retval = new GrammarV3ParserBackup.mulop_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:271:29: ( ( '*' | '/' | '%' ) )
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:272:2: ( '*' | '/' | '%' )
			{
			// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:272:2: ( '*' | '/' | '%' )
			int alt22=3;
			switch ( input.LA(1) ) {
			case 8:
				{
				alt22=1;
				}
				break;
			case 11:
				{
				alt22=2;
				}
				break;
			case 4:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:272:2: '*'
					{
					match(input,8,FOLLOW_8_in_mulop953); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 2 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:273:2: '/'
					{
					match(input,11,FOLLOW_11_in_mulop957); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;
				case 3 :
					// C:\\Users\\Reaper\\Documents\\NetBeansProjects\\Cosc470_Compiler_jpbutler0_V3\\compiler.v3\\src\\main\\java\\cosc470\\compiler\\v3\\antlr\\GrammarV3.g:274:2: '%'
					{
					match(input,4,FOLLOW_4_in_mulop961); 
					retval.symbol = input.toString(retval.start,input.LT(-1));
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulop"

	// Delegated rules



	public static final BitSet FOLLOW_declarations_in_block43 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_compound_statement_in_block45 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_end_program_in_block47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_declarations56 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_declare_rest_in_declarations58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_declarations60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_declare_rest67 = new BitSet(new long[]{0x0000013800600000L});
	public static final BitSet FOLLOW_type_in_declare_rest69 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_declare_rest71 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_declare_rest_in_declare_rest73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_declare_rest77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_type90 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_mis_in_type92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equals_in_mis106 = new BitSet(new long[]{0x000079BE40600400L});
	public static final BitSet FOLLOW_right_hand_side_in_mis108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_mis113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characters_in_data_type126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numbers_in_data_type131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_data_type135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_characters148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_characters152 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_size_mis_in_characters154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_numbers167 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_size_mis_in_numbers169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_numbers174 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_size_mis_in_numbers176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_numbers181 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_size_mis_in_numbers183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semicolon_left_in_size_mis196 = new BitSet(new long[]{0x0000100000000400L});
	public static final BitSet FOLLOW_num_in_size_mis198 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_semicolon_right_in_size_mis200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_size_mis205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_compound_statement219 = new BitSet(new long[]{0x00000A0483900020L});
	public static final BitSet FOLLOW_optional_statements_in_compound_statement221 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_compound_statement223 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_compound_statement225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_optional_statements239 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_optional_statements241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_list_in_optional_statements244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_h_in_statement_list258 = new BitSet(new long[]{0x00000A0083900020L});
	public static final BitSet FOLLOW_i_in_statement_list260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_h_in_i281 = new BitSet(new long[]{0x00000A0083900020L});
	public static final BitSet FOLLOW_t_in_i283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_i288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_i_in_t300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_h314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_left_hand_side_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_output_line_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_and_in_statement347 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_identifier_in_statement349 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_statement351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_looping_statements_in_statement358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_output_line372 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_semicolon_left_in_output_line374 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_identifier_in_output_line376 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_semicolon_right_in_output_line378 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_output_line380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_output_line387 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_semicolon_left_in_output_line389 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_identifier_in_output_line391 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_semicolon_right_in_output_line393 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_output_line395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_output_line402 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_output_line404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_looping_statements418 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_expression_in_looping_statements420 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_looping_statements422 = new BitSet(new long[]{0x00000A0083900020L});
	public static final BitSet FOLLOW_statement_in_looping_statements424 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_looping_statements426 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_looping_statements428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_looping_statements434 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_expression_in_looping_statements436 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_looping_statements438 = new BitSet(new long[]{0x00000A0083900020L});
	public static final BitSet FOLLOW_statement_in_looping_statements440 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_looping_statements442 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_looping_statements444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_left_hand_side458 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_equals_in_left_hand_side460 = new BitSet(new long[]{0x000079BE40600400L});
	public static final BitSet FOLLOW_right_hand_side_in_left_hand_side462 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_end_block_in_left_hand_side464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_right_hand_side478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_literal_in_right_hand_side482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_single_char_in_right_hand_side486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_casting_in_right_hand_side490 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_semicolon_left_in_right_hand_side492 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_expression_in_right_hand_side494 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_semicolon_right_in_right_hand_side496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_data_type_in_casting509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_a_in_expression523 = new BitSet(new long[]{0x00000000000FC000L});
	public static final BitSet FOLLOW_g_in_expression525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relop_in_g540 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_a_in_g542 = new BitSet(new long[]{0x00000000000FC000L});
	public static final BitSet FOLLOW_g_help_in_g544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_g551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_g_in_g_help565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_c_in_a578 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_b_in_a580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addop_in_b594 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_c_in_b596 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_b_help_in_b598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_b604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_b_in_b_help618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pre_factor_in_c631 = new BitSet(new long[]{0x0000000000000910L});
	public static final BitSet FOLLOW_d_in_c633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulop_in_d647 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_pre_factor_in_d649 = new BitSet(new long[]{0x0000000000000910L});
	public static final BitSet FOLLOW_d_help_in_d651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_empty_in_d658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_d_in_d_help672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_pre_factor685 = new BitSet(new long[]{0x0000188640000400L});
	public static final BitSet FOLLOW_helper_factor_in_pre_factor687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_pre_factor693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pre_factor_in_helper_factor705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_factor725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_factor730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_factor734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_factor738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_identifier752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_num767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negative_in_num774 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_num776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_negative791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_string_literal806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_single_char821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_end_program841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_end_block851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_equals861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_semicolon_left871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_semicolon_right881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_5_in_and891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_relop903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_relop907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_relop911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_relop915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_relop919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_relop923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_addop936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_addop940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_mulop953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_mulop957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_4_in_mulop961 = new BitSet(new long[]{0x0000000000000002L});
}
