// $ANTLR 3.5.2 GrammarV3__.g 2015-05-18 00:00:15

  package cosc470.compiler.v3.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammarV3LexerBackup extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammarV3LexerBackup() {} 
	public GrammarV3LexerBackup(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammarV3LexerBackup(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "GrammarV3__.g"; }

	// $ANTLR start "T__4"
	public final void mT__4() throws RecognitionException {
		try {
			int _type = T__4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:11:6: ( '%' )
			// GrammarV3__.g:11:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__4"

	// $ANTLR start "T__5"
	public final void mT__5() throws RecognitionException {
		try {
			int _type = T__5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:12:6: ( '&' )
			// GrammarV3__.g:12:8: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__5"

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:13:6: ( '(' )
			// GrammarV3__.g:13:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:14:6: ( ')' )
			// GrammarV3__.g:14:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:15:6: ( '*' )
			// GrammarV3__.g:15:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:16:6: ( '+' )
			// GrammarV3__.g:16:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:17:7: ( '-' )
			// GrammarV3__.g:17:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:18:7: ( '/' )
			// GrammarV3__.g:18:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:19:7: ( ':=' )
			// GrammarV3__.g:19:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:20:7: ( ';' )
			// GrammarV3__.g:20:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:21:7: ( '<' )
			// GrammarV3__.g:21:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:22:7: ( '<=' )
			// GrammarV3__.g:22:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:23:7: ( '<>' )
			// GrammarV3__.g:23:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:24:7: ( '==' )
			// GrammarV3__.g:24:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:25:7: ( '>' )
			// GrammarV3__.g:25:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:26:7: ( '>=' )
			// GrammarV3__.g:26:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:27:7: ( 'BEGIN' )
			// GrammarV3__.g:27:9: 'BEGIN'
			{
			match("BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:28:7: ( 'BOOLEAN' )
			// GrammarV3__.g:28:9: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:29:7: ( 'CHAR' )
			// GrammarV3__.g:29:9: 'CHAR'
			{
			match("CHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:30:7: ( 'DBMS_OUTPUT.NEW_LINE' )
			// GrammarV3__.g:30:9: 'DBMS_OUTPUT.NEW_LINE'
			{
			match("DBMS_OUTPUT.NEW_LINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:31:7: ( 'DBMS_OUTPUT.PUT' )
			// GrammarV3__.g:31:9: 'DBMS_OUTPUT.PUT'
			{
			match("DBMS_OUTPUT.PUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:32:7: ( 'DBMS_OUTPUT.PUT_LINE' )
			// GrammarV3__.g:32:9: 'DBMS_OUTPUT.PUT_LINE'
			{
			match("DBMS_OUTPUT.PUT_LINE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:33:7: ( 'DECLARE' )
			// GrammarV3__.g:33:9: 'DECLARE'
			{
			match("DECLARE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:34:7: ( 'END IF' )
			// GrammarV3__.g:34:9: 'END IF'
			{
			match("END IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:35:7: ( 'END LOOP' )
			// GrammarV3__.g:35:9: 'END LOOP'
			{
			match("END LOOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:36:7: ( 'END' )
			// GrammarV3__.g:36:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:37:7: ( 'FALSE' )
			// GrammarV3__.g:37:9: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:38:7: ( 'IF BEGIN' )
			// GrammarV3__.g:38:9: 'IF BEGIN'
			{
			match("IF BEGIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:39:7: ( 'LOOP' )
			// GrammarV3__.g:39:9: 'LOOP'
			{
			match("LOOP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:40:7: ( 'NOT' )
			// GrammarV3__.g:40:9: 'NOT'
			{
			match("NOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:41:7: ( 'NULL' )
			// GrammarV3__.g:41:9: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:42:7: ( 'NUMBER' )
			// GrammarV3__.g:42:9: 'NUMBER'
			{
			match("NUMBER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:43:7: ( 'POSITIVE' )
			// GrammarV3__.g:43:9: 'POSITIVE'
			{
			match("POSITIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:44:7: ( 'SMALLINT' )
			// GrammarV3__.g:44:9: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:45:7: ( 'THEN' )
			// GrammarV3__.g:45:9: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:46:7: ( 'TRUE' )
			// GrammarV3__.g:46:9: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:47:7: ( 'VARCHAR2' )
			// GrammarV3__.g:47:9: 'VARCHAR2'
			{
			match("VARCHAR2"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:48:7: ( 'WHILE' )
			// GrammarV3__.g:48:9: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:49:7: ( '\\\\' )
			// GrammarV3__.g:49:9: '\\\\'
			{
			match('\\'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:50:7: ( 'identifier' )
			// GrammarV3__.g:50:9: 'identifier'
			{
			match("identifier"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:51:7: ( 'num' )
			// GrammarV3__.g:51:9: 'num'
			{
			match("num"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:52:7: ( 'single_char' )
			// GrammarV3__.g:52:9: 'single_char'
			{
			match("single_char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// GrammarV3__.g:53:7: ( 'string_literal' )
			// GrammarV3__.g:53:9: 'string_literal'
			{
			match("string_literal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	@Override
	public void mTokens() throws RecognitionException {
		// GrammarV3__.g:1:8: ( T__4 | T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 )
		int alt1=43;
		alt1 = dfa1.predict(input);
		switch (alt1) {
			case 1 :
				// GrammarV3__.g:1:10: T__4
				{
				mT__4(); 

				}
				break;
			case 2 :
				// GrammarV3__.g:1:15: T__5
				{
				mT__5(); 

				}
				break;
			case 3 :
				// GrammarV3__.g:1:20: T__6
				{
				mT__6(); 

				}
				break;
			case 4 :
				// GrammarV3__.g:1:25: T__7
				{
				mT__7(); 

				}
				break;
			case 5 :
				// GrammarV3__.g:1:30: T__8
				{
				mT__8(); 

				}
				break;
			case 6 :
				// GrammarV3__.g:1:35: T__9
				{
				mT__9(); 

				}
				break;
			case 7 :
				// GrammarV3__.g:1:40: T__10
				{
				mT__10(); 

				}
				break;
			case 8 :
				// GrammarV3__.g:1:46: T__11
				{
				mT__11(); 

				}
				break;
			case 9 :
				// GrammarV3__.g:1:52: T__12
				{
				mT__12(); 

				}
				break;
			case 10 :
				// GrammarV3__.g:1:58: T__13
				{
				mT__13(); 

				}
				break;
			case 11 :
				// GrammarV3__.g:1:64: T__14
				{
				mT__14(); 

				}
				break;
			case 12 :
				// GrammarV3__.g:1:70: T__15
				{
				mT__15(); 

				}
				break;
			case 13 :
				// GrammarV3__.g:1:76: T__16
				{
				mT__16(); 

				}
				break;
			case 14 :
				// GrammarV3__.g:1:82: T__17
				{
				mT__17(); 

				}
				break;
			case 15 :
				// GrammarV3__.g:1:88: T__18
				{
				mT__18(); 

				}
				break;
			case 16 :
				// GrammarV3__.g:1:94: T__19
				{
				mT__19(); 

				}
				break;
			case 17 :
				// GrammarV3__.g:1:100: T__20
				{
				mT__20(); 

				}
				break;
			case 18 :
				// GrammarV3__.g:1:106: T__21
				{
				mT__21(); 

				}
				break;
			case 19 :
				// GrammarV3__.g:1:112: T__22
				{
				mT__22(); 

				}
				break;
			case 20 :
				// GrammarV3__.g:1:118: T__23
				{
				mT__23(); 

				}
				break;
			case 21 :
				// GrammarV3__.g:1:124: T__24
				{
				mT__24(); 

				}
				break;
			case 22 :
				// GrammarV3__.g:1:130: T__25
				{
				mT__25(); 

				}
				break;
			case 23 :
				// GrammarV3__.g:1:136: T__26
				{
				mT__26(); 

				}
				break;
			case 24 :
				// GrammarV3__.g:1:142: T__27
				{
				mT__27(); 

				}
				break;
			case 25 :
				// GrammarV3__.g:1:148: T__28
				{
				mT__28(); 

				}
				break;
			case 26 :
				// GrammarV3__.g:1:154: T__29
				{
				mT__29(); 

				}
				break;
			case 27 :
				// GrammarV3__.g:1:160: T__30
				{
				mT__30(); 

				}
				break;
			case 28 :
				// GrammarV3__.g:1:166: T__31
				{
				mT__31(); 

				}
				break;
			case 29 :
				// GrammarV3__.g:1:172: T__32
				{
				mT__32(); 

				}
				break;
			case 30 :
				// GrammarV3__.g:1:178: T__33
				{
				mT__33(); 

				}
				break;
			case 31 :
				// GrammarV3__.g:1:184: T__34
				{
				mT__34(); 

				}
				break;
			case 32 :
				// GrammarV3__.g:1:190: T__35
				{
				mT__35(); 

				}
				break;
			case 33 :
				// GrammarV3__.g:1:196: T__36
				{
				mT__36(); 

				}
				break;
			case 34 :
				// GrammarV3__.g:1:202: T__37
				{
				mT__37(); 

				}
				break;
			case 35 :
				// GrammarV3__.g:1:208: T__38
				{
				mT__38(); 

				}
				break;
			case 36 :
				// GrammarV3__.g:1:214: T__39
				{
				mT__39(); 

				}
				break;
			case 37 :
				// GrammarV3__.g:1:220: T__40
				{
				mT__40(); 

				}
				break;
			case 38 :
				// GrammarV3__.g:1:226: T__41
				{
				mT__41(); 

				}
				break;
			case 39 :
				// GrammarV3__.g:1:232: T__42
				{
				mT__42(); 

				}
				break;
			case 40 :
				// GrammarV3__.g:1:238: T__43
				{
				mT__43(); 

				}
				break;
			case 41 :
				// GrammarV3__.g:1:244: T__44
				{
				mT__44(); 

				}
				break;
			case 42 :
				// GrammarV3__.g:1:250: T__45
				{
				mT__45(); 

				}
				break;
			case 43 :
				// GrammarV3__.g:1:256: T__46
				{
				mT__46(); 

				}
				break;

		}
	}


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\13\uffff\1\41\1\uffff\1\43\42\uffff\1\65\22\uffff\1\105\2\uffff";
	static final String DFA1_eofS =
		"\106\uffff";
	static final String DFA1_minS =
		"\1\45\12\uffff\1\75\1\uffff\1\75\1\105\1\uffff\1\102\1\116\3\uffff\1\117"+
		"\2\uffff\1\110\5\uffff\1\151\7\uffff\1\115\1\uffff\1\104\1\uffff\1\114"+
		"\4\uffff\1\123\1\40\2\uffff\1\137\1\111\1\uffff\1\117\2\uffff\1\125\1"+
		"\124\1\120\1\125\1\124\1\56\1\116\1\uffff\1\125\1\124\1\137\2\uffff";
	static final String DFA1_maxS =
		"\1\163\12\uffff\1\76\1\uffff\1\75\1\117\1\uffff\1\105\1\116\3\uffff\1"+
		"\125\2\uffff\1\122\5\uffff\1\164\7\uffff\1\115\1\uffff\1\104\1\uffff\1"+
		"\115\4\uffff\1\123\1\40\2\uffff\1\137\1\114\1\uffff\1\117\2\uffff\1\125"+
		"\1\124\1\120\1\125\1\124\1\56\1\120\1\uffff\1\125\1\124\1\137\2\uffff";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\16\2\uffff"+
		"\1\23\2\uffff\1\33\1\34\1\35\1\uffff\1\41\1\42\1\uffff\1\45\1\46\1\47"+
		"\1\50\1\51\1\uffff\1\14\1\15\1\13\1\20\1\17\1\21\1\22\1\uffff\1\27\1\uffff"+
		"\1\36\1\uffff\1\43\1\44\1\52\1\53\2\uffff\1\37\1\40\2\uffff\1\32\1\uffff"+
		"\1\30\1\31\7\uffff\1\24\3\uffff\1\26\1\25";
	static final String DFA1_specialS =
		"\106\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\uffff\1\10\12\uffff\1"+
			"\11\1\12\1\13\1\14\1\15\3\uffff\1\16\1\17\1\20\1\21\1\22\2\uffff\1\23"+
			"\2\uffff\1\24\1\uffff\1\25\1\uffff\1\26\2\uffff\1\27\1\30\1\uffff\1\31"+
			"\1\32\4\uffff\1\33\14\uffff\1\34\4\uffff\1\35\4\uffff\1\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37\1\40",
			"",
			"\1\42",
			"\1\44\11\uffff\1\45",
			"",
			"\1\46\2\uffff\1\47",
			"\1\50",
			"",
			"",
			"",
			"\1\51\5\uffff\1\52",
			"",
			"",
			"\1\53\11\uffff\1\54",
			"",
			"",
			"",
			"",
			"",
			"\1\55\12\uffff\1\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57",
			"",
			"\1\60",
			"",
			"\1\61\1\62",
			"",
			"",
			"",
			"",
			"\1\63",
			"\1\64",
			"",
			"",
			"\1\66",
			"\1\67\2\uffff\1\70",
			"",
			"\1\71",
			"",
			"",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100\1\uffff\1\101",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__4 | T__5 | T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 );";
		}
	}

}
