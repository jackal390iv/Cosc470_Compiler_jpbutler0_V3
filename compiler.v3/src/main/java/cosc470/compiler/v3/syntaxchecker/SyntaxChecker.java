/*
 * Class: COSC 470-001
 * Project: Compiler
 */
package cosc470.compiler.v3.syntaxchecker;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Butler <https://github.com/jackal390iv>
 */
public class SyntaxChecker {

	private static ArrayList<String> elements;

	public SyntaxChecker() {
		elements = new ArrayList<String>();
		combineStringLiterals();
		createTokens();
		checkIdentifiers();
		setSizeDefaults();
		// createSymbolTable();
	}

	private void createTokens() {
		boolean checker;
		try {
			for (int i = 0; i < cosc470.compiler.v3.database.Database.getCodeList().size(); i++) {
				checker = false;
				for (int k = 0; k < cosc470.compiler.v3.database.Database.getReserveWords().size(); k++) {
					if (cosc470.compiler.v3.database.Database.getCodeList().get(i).equals(cosc470.compiler.v3.database.Database.getReserveWords().get(k))) {
						cosc470.compiler.v3.database.Database.addToken(new cosc470.compiler.v3.database.Token(cosc470.compiler.v3.database.Database.getCodeList().get(i),
								cosc470.compiler.v3.database.Database.getCodeList().get(i)));
						checker = true;
						break;
					}
				}
				if (checker == false) {
					cosc470.compiler.v3.database.Database.addToken(new cosc470.compiler.v3.database.Token(SyntaxChecker.defineUnknown(cosc470.compiler.v3.database.Database.getCodeList().get(i)),
							cosc470.compiler.v3.database.Database.getCodeList().get(i)));
				}
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static void combineStringLiterals() {
		String temp = "", first = "";
		int counter = 0, checker = 0, spaces = 0;
		boolean found = false;
		for (int i = 0; i < cosc470.compiler.v3.database.Database.getCodeText().size(); i++) {
			found = false;
			if (cosc470.compiler.v3.database.Database.getCodeText().get(i).startsWith("'")) {
				counter = 0;
				while ((counter < cosc470.compiler.v3.database.Database.getCodeText().size()) && (!(cosc470.compiler.v3.database.Database.getCodeText().get(i + counter).endsWith("'")))) {
					counter++;
				}
				if (cosc470.compiler.v3.database.Database.getCodeText().get(i + counter).endsWith("'")) {
					found = true;
					checker = 0;
					first = cosc470.compiler.v3.database.Database.getCodeText().get(i);
					while (checker <= counter) {
						if (cosc470.compiler.v3.database.Database.getCodeText().get(i + checker).isEmpty()) {
							temp = temp + " ";
							spaces++;
						} else {
							temp = temp + cosc470.compiler.v3.database.Database.getCodeText().get(i + checker);
						}
						checker++;
					}
				}
			}
			if (found == true) {
				for (int k = 0; k < cosc470.compiler.v3.database.Database.getCodeList().size(); k++) {
					if (cosc470.compiler.v3.database.Database.getCodeList().get(k).equals(first)) {
						checker = 0;
						while (checker <= counter - spaces) {
							cosc470.compiler.v3.database.Database.getCodeList().remove(k);
							checker++;
						}
						cosc470.compiler.v3.database.Database.getCodeList().add(k, temp);
						break;
					}
				}
			}
		}
	}

	public static String defineUnknown(String code) {
		String grammarId = "identifier";
		try {
			if ((code.startsWith("'")) && (code.endsWith("'"))) {
				if (code.length() == 3) {
					grammarId = "'c'";
				} else {
					grammarId = "'string_literal'";
				}
			} else if (code.matches("-?\\d+(\\.\\d+)?")) {
				grammarId = "num";
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
		return grammarId;
	}

	public static void checkIdentifiers() {
		String testing;
		boolean declareBlock = false, found = false, alreadyInUse = false;
		try {
			for (int i = 0; i < cosc470.compiler.v3.database.Database.getTokens().size(); i++) {
				if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("DECLARE")) {
					declareBlock = true;
				} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("BEGIN")) {
					declareBlock = false;
				} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("identifier")) {
					// System.out.println("Declare Block Active? " +
					// declareBlock+"\n"+cosc470.compiler.v3.database.Database.getTokens().get(i).getValue()+"\n");
					if (!((cosc470.compiler.v3.database.Database.getTokens().get(i).getValue().charAt(0) >= 'a') && (cosc470.compiler.v3.database.Database.getTokens().get(i).getValue().charAt(0) <= 'z'))) {
						System.out.printf("\nERROR\nThe Following Identifier Was Declared Inappropriately: %s", cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
						System.exit(0);
					} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getValue().length() > 30) {
						System.out.printf("\nERROR\nThe Following Identifier Was Too Large: %s", cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
						System.exit(0);
					}
					testing = cosc470.compiler.v3.database.Database.getTokens().get(i).getValue().replaceAll("[^0-9a-z$_#]", "").trim();
					if (testing.length() != cosc470.compiler.v3.database.Database.getTokens().get(i).getValue().length()) {
						System.out.printf("\nERROR\nThe Following Identifier Was Declared With Inappropriate Characters: %s", cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
						System.exit(0);
					}
					if (declareBlock == true) {
						for (int k = 0; k < elements.size(); k++) {
							if (elements.get(k).equals(cosc470.compiler.v3.database.Database.getTokens().get(i).getValue())) {
								alreadyInUse = true;
							}
						}
						if (alreadyInUse == true) {
							// System.out.printf("\nERROR\nThe Following Identifier Was Declared More Than Once: %s",
							// cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
							// System.exit(0);
						} else {
							elements.add(cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
						}
					}
					if (declareBlock == false) {
						for (int k = 0; k < elements.size(); k++) {
							if (elements.get(k).equals(cosc470.compiler.v3.database.Database.getTokens().get(i).getValue())) {
								// System.out.println(elements.get(k) + "\n" +
								// cosc470.compiler.v3.database.Database.getTokens().get(i).getValue()
								// + "\n");
								found = true;
							}
						}
						if (found == false) {
							System.out.printf("\nERROR\nThe Following Identifier Was Not Declared: %s", cosc470.compiler.v3.database.Database.getTokens().get(i).getValue());
							System.exit(0);
						}
					}

				}
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static void setSizeDefaults() {
		int defaultSize = 0;
		try {
			for (int i = 0; i < cosc470.compiler.v3.database.Database.getTokens().size(); i++) {
				if ((cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("VARCHAR2"))
						|| (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("NUMBER"))
						|| (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("SMALLINT"))
						|| (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("POSITIVE"))) {
					// /////////////////// CHANGED
					// HERE////////////////////////////////////////////////////////////////////////
					if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("VARCHAR2")) {
						defaultSize = 6;
						// break;
					} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("NUMBER")) {
						defaultSize = 3;
						// break;
					} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("SMALLINT")) {
						defaultSize = 3;
						// break;
					} else if (cosc470.compiler.v3.database.Database.getTokens().get(i).getGrammarId().equals("POSITIVE")) {
						defaultSize = 3;
						// break;
					}

					if (!(cosc470.compiler.v3.database.Database.getTokens().get(i + 1).getGrammarId().equals("("))) {
						if (cosc470.compiler.v3.database.Database.getTokens().get(i + 1).getGrammarId().equals(":=")) {
							if ((cosc470.compiler.v3.database.Database.getTokens().get(i + 2).getGrammarId().equals("num"))
									|| (cosc470.compiler.v3.database.Database.getTokens().get(i + 2).getGrammarId().equals("'string_literal'"))) {
								defaultSize = cosc470.compiler.v3.database.Database.getTokens().get(i + 2).getValue().length();
								// System.out.println("Default Size: " +
								// defaultSize + " Value: " +
								// cosc470.compiler.v3.database.Database.getTokens().get(i
								// + 2).getValue());
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token(")", ")"));
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("num", Integer.toString(defaultSize)));
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("(", "("));
							} else {
								// System.out.println("Default Size: " +
								// defaultSize + " Value: " +
								// cosc470.compiler.v3.database.Database.getTokens().get(i
								// + 2).getValue());
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token(")", ")"));
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("num", Integer.toString(defaultSize)));
								cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("(", "("));
							}
						} else {
							// System.out.println("Default Size: " + defaultSize
							// + " Value: " +
							// cosc470.compiler.v3.database.Database.getTokens().get(i
							// + 1).getValue());
							cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token(")", ")"));
							cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("num", Integer.toString(defaultSize)));
							cosc470.compiler.v3.database.Database.getTokens().add(i + 1, new cosc470.compiler.v3.database.Token("(", "("));
						}
					}
				}
			}
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	/*
	 * private static void createSymbolTable() { for
	 * (cosc470.compiler.v3.database.Token token :
	 * cosc470.compiler.v3.database.Database .getTokens()) { if
	 * ((token.getGrammarId().equals("identifier")) ||
	 * (token.getGrammarId().equals("'c'")) ||
	 * (token.getGrammarId().equals("'string_literal'")) ||
	 * (token.getGrammarId().equals("num"))) {
	 * cosc470.compiler.v3.database.Database.addSymbolTableItem(token); } }
	 * 
	 * }
	 */
}
