package cosc470.compiler.v3.scanner;

import java.io.File;
import java.util.Scanner;

public class ScanGrammar {

	public ScanGrammar(String reserveWords, String unknownVariables, String commentSymbols) {
		addReserveWords(reserveWords);
		addUnknownVariables(unknownVariables);
		addCommentSymbols(commentSymbols);
		addCombinableWords();
		addNonCombinableReserveWords();
	}

	private void addReserveWords(String reserveWords) {
		try {
			Scanner scanner = new Scanner(new File(reserveWords));
			while (scanner.hasNextLine()) {
				cosc470.compiler.v3.database.Database.addReserveWord(scanner.nextLine().trim());
			}
			scanner.close();
		} catch (Exception ex) {
			System.out.printf("\n\nERROR: Could not access reserve words list.\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(),
					ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	private void addUnknownVariables(String UnknownVariables) {
		try {
			Scanner scanner = new Scanner(new File(UnknownVariables));
			while (scanner.hasNextLine()) {
				cosc470.compiler.v3.database.Database.addUnknownVariable(scanner.nextLine().trim());
			}
			scanner.close();
		} catch (Exception ex) {
			System.out.printf("\n\nERROR: Could not access unknown variables list.\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(),
					ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	private void addCommentSymbols(String commentSymbols) {
		try {
			String temp;
			Scanner scanner = new Scanner(new File(commentSymbols));
			while (scanner.hasNextLine()) {
				temp = scanner.nextLine();
				if (temp.contains("COMMENT_SYMBOL:")) {
					cosc470.compiler.v3.database.Database.setCommentSymbol((temp.substring(temp.indexOf(':') + 1).trim()));
				} else if (temp.contains("COMMENT_BLOCK_START_SYMBOL:")) {
					cosc470.compiler.v3.database.Database.setCommentBlockStartSymbol((temp.substring(temp.indexOf(':') + 1).trim()));
				} else if (temp.contains("COMMENT_BLOCK_END_SYMBOL:")) {
					cosc470.compiler.v3.database.Database.setCommentBlockEndSymbol((temp.substring(temp.indexOf(':') + 1).trim()));
				}
			}
			scanner.close();
		} catch (Exception ex) {
			System.out.printf("\n\nERROR: Could not access unknown variables list.\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(),
					ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	private void addCombinableWords() {
		try {
			// glitch - had to manually add this line
			cosc470.compiler.v3.database.Database.addCombinableWord(":=");
			cosc470.compiler.v3.database.Database.addCombinableWord("==");

			for (String tester : cosc470.compiler.v3.database.Database.getReserveWords()) {
				for (String checker : cosc470.compiler.v3.database.Database.getReserveWords()) {
					if (((tester.contains(checker)) && (!(tester.equals(checker)))) || (tester.contains(" "))) {
						cosc470.compiler.v3.database.Database.addCombinableWord(tester);
						break;
					}
				}
			}

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
		
	}

	private void addNonCombinableReserveWords() {
		boolean exists;
		try {
			// glitch - had to manually add this line
			cosc470.compiler.v3.database.Database.addNonCombinableReserveWord("=");

			for (String temp : cosc470.compiler.v3.database.Database.getReserveWords()) {
				exists = false;
				for (String Rcombinables : cosc470.compiler.v3.database.Database.getCombinableWords()) {
					if (temp.equals(Rcombinables)) {
						exists = true;
						break;
					}
				}
				for (String Scombinables : cosc470.compiler.v3.database.Database.getCombinableWords()) {
					if (temp.equals(Scombinables)) {
						exists = true;
						break;
					}
				}
				if (exists != true) {
					cosc470.compiler.v3.database.Database.addNonCombinableReserveWord(temp);
				}
			}

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

}