package cosc470.compiler.v3.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AntlrOperator {

	public AntlrOperator() {
		runTest();
	}

	private void runTest() {
		try {

			String code = "";
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				code = code + temp.getGrammarId();
			}

			cosc470.compiler.v3.database.Database.setAntlrCodeInput(code);

			// cosc470.compiler.v3.database.Database.printAntlrCodeInput();

			CharStream charStream = new ANTLRStringStream(code);
			GrammarV3Lexer lexer = new GrammarV3Lexer(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			GrammarV3Parser parser = new GrammarV3Parser(tokenStream);
			parser.block();

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	public static String getSymbolTableValue_byName(String identifier) {
		String temp = null;
		try {
			for (int i = 0; i < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); i++) {
				if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(i).getName().equals(identifier)) {
					temp = cosc470.compiler.v3.database.Database.getSymbolTableItems().get(i).getValue();
					break;
				}
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return temp;
	}

	public static String findID(int idCount) {
		String base = "FAILURE";
		try {
			boolean afterDeclare = false;
			int counter = -1;
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				if (temp.getGrammarId().equals("identifier")) {
					counter++;
					if ((counter == idCount) && (afterDeclare == false)) {
						base = temp.getValue();
					} else if ((counter == idCount) && (afterDeclare == true)) {
						for (int i = 0; i < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); i++) {
							if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(i).getName().equals(temp.getValue())) {
								base = temp.getValue();
							}
						}
					}
				} else if (temp.getGrammarId().equals("BEGIN")) {
					afterDeclare = true;
				}
			}
			if (base.equals("FAILURE")) {
				System.out.println("ERROR: Identifier could not be found");
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return base;
	}

	public static String findStringLiteral(int strCount) {
		String base = "FAILURE";
		try {
			int counter = -1;
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				if (temp.getGrammarId().equals("string_literal")) {
					counter++;
					if (counter == strCount) {
						base = temp.getValue();
					}
				}
			}
			if (base.equals("FAILURE")) {
				System.out.println("ERROR: String literal ('string_literal') could not be found");
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return base;
	}

	public static String findChar(int charCount) {
		String base = "FAILURE";
		try {
			int counter = -1;
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				if (temp.getGrammarId().equals("single_char")) {
					counter++;
					if (counter == charCount) {
						base = temp.getValue();
					}
				}
			}
			if (base.equals("FAILURE")) {
				System.out.println("ERROR: Char ('c') could not be found");
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return base;
	}

	public static String findNum(int numCount) {
		String base = "FAILURE";
		try {
			int counter = -1;
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				if (temp.getGrammarId().equals("num")) {
					counter++;
					if (counter == numCount) {
						base = temp.getValue();
					}
				}
			}
			if (base.equals("FAILURE")) {
				System.out.println("ERROR: Number could not be found");
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return base;
	}

}
