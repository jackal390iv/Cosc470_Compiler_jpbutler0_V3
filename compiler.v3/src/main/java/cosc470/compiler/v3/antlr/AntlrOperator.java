package cosc470.compiler.v3.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import java.util.Scanner;

public class AntlrOperator {

	public AntlrOperator() {
		runTest();
	}

	private void runTest() {
		try {

			String code = "";
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database
					.getTokens()) {
				code = code + temp.getGrammarId();
			}

			System.out.println(code);

			CharStream charStream = new ANTLRStringStream(code);
			GrammarV3Lexer lexer = new GrammarV3Lexer(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			GrammarV3Parser parser = new GrammarV3Parser(tokenStream);
			parser.block();

		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	public static void userInput(String identifier) {
		try {

			Scanner scanner = new Scanner(System.in);
			System.out.printf("\n\nPlease input new value for identifier %s: ",
					identifier);
			String value = scanner.nextLine();

			for (int i = 0; i < cosc470.compiler.v3.database.Database
					.getSymbolTableItems().size(); i++) {
				if (cosc470.compiler.v3.database.Database.getSymbolTableItems()
						.get(i).getName().equals(identifier)) {
					cosc470.compiler.v3.database.Database.getSymbolTableItems()
							.get(i).setValue(value);
					break;
				}
			}

		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}


	  // ///////////////////////FIX THIS/////////////////////////////////////////
	
	//Will handle casting (DECLARE's casting has already been handled, only left_hand_side casting needed), and will/can also return identifier ('string_literal' or 'c') or expression. 
	public static void leftHandSideOperator(String identifier, String value,String OWtype, String OWsize) {
		
		
		
		
		
	}
	
	public static void evaluator(String evaluationLine) {
		
		
		
		
		
	}

}
