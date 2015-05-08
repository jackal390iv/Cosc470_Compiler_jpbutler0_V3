package cosc470.compiler.v3.database;

import java.util.ArrayList;

public class Database {

	private static String commentSymbol, commentBlockStartSymbol,
			commentBlockEndSymbol;

	private static ArrayList<String> reserveWords, unknownVariables,
			combinableWords, nonCombinableReserveWords, codeText, codeList;

	private static ArrayList<cosc470.compiler.v3.database.Token> tokens;

	public Database() {
		commentSymbol = null;
		commentBlockStartSymbol = null;
		commentBlockEndSymbol = null;

		reserveWords = new ArrayList<String>();
		unknownVariables = new ArrayList<String>();
		combinableWords = new ArrayList<String>();
		nonCombinableReserveWords = new ArrayList<String>();
		codeText = new ArrayList<String>();
		codeList = new ArrayList<String>();
		tokens = new ArrayList<cosc470.compiler.v3.database.Token>();
	}

	public static void setCommentSymbol(String symbol) {
		commentSymbol = symbol;
	}

	public static String getCommentSymbol() {
		return commentSymbol;
	}

	public static void setCommentBlockStartSymbol(String symbol) {
		commentBlockStartSymbol = symbol;
	}

	public static String getCommentBlockStartSymbol() {
		return commentBlockStartSymbol;
	}

	public static void setCommentBlockEndSymbol(String symbol) {
		commentBlockEndSymbol = symbol;
	}

	public static String getCommentBlockEndSymbol() {
		return commentBlockEndSymbol;
	}

	public static void printCommentSymbols() {
		System.out.printf("\n\nComment Symbols:\n");
		System.out.printf("%-15s: %-30s", "Comment Symbol", getCommentSymbol());
		System.out.printf("%-15s: %-30s", "Comment Block Start Symbol",
				getCommentBlockStartSymbol());
		System.out.printf("%-15s: %-30s", "Comment Block End Symbol",
				getCommentBlockEndSymbol());
	}

	public static void addReserveWord(String reserveWord) {
		try {
			reserveWords.add(reserveWord);
		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<String> getReserveWords() {
		return reserveWords;
	}

	public static void printReserveWords() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nReserve Words List:\n");
		for (String temp : reserveWords) {
			System.out.printf("%-3d: %-30s", holder, temp);
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static void addUnknownVariable(String unknownVariable) {
		try {
			unknownVariables.add(unknownVariable);
		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<String> getUnknownVariables() {
		return unknownVariables;
	}

	public static void printUnknownVariables() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nUnknown Variables List:\n");
		for (String temp : unknownVariables) {
			System.out.printf("%-3d: %-30s", holder, temp);
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static void addCombinableWord(String combinableWord) {
		try {
			if (combinableWords.isEmpty()) {
				combinableWords.add(combinableWord);
			} else {
				for (int i = 0; i < combinableWords.size(); i++) {
					if (combinableWords.get(i).length() < combinableWord
							.length()) {
						combinableWords.add(i, combinableWord);
						break;
					} else if (i == combinableWords.size() - 1) {
						combinableWords.add(combinableWord);
						break;
					}
				}
			}
		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<String> getCombinableWords() {
		return combinableWords;
	}

	public static void printCombinableWords() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nCombinables List:\n");
		for (String temp : combinableWords) {
			System.out.printf("%-3d: %-30s", holder, temp);
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static void addNonCombinableReserveWord(
			String nonCombinableReserveWord) {
		try {
			nonCombinableReserveWords.add(nonCombinableReserveWord);
		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<String> getNonCombinableReserveWords() {
		return nonCombinableReserveWords;
	}

	public static void printNonCombinableReserveWords() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nNon-Combinable Reserve Words List:\n");
		for (String temp : nonCombinableReserveWords) {
			System.out.printf("%-3d: %-30s", holder, temp);
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static ArrayList<String> getCodeText() {
		return codeText;
	}

	public static void printCodeText() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nCode Text:\n");
		for (String temp : codeText) {
			if (temp.isEmpty()) {
				System.out.printf("%-3d: %-30s", holder, "__");
			} else {
				System.out.printf("%-3d: %-30s", holder, temp);
			}
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static ArrayList<String> getCodeList() {
		return codeList;
	}

	public static void printCodeList() {
		int counter = 0, holder = 0;
		System.out.printf("\n\nCode List:\n");
		for (String temp : codeList) {
			System.out.printf("%-3d: %-30s", holder, temp);
			if (counter == 2) {
				System.out.printf("\n");
				counter = -1;
			}
			counter++;
			holder++;
		}
		System.out.printf("\n");
	}

	public static void addToken(Token token) {
		try {
			tokens.add(token);
		} catch (Exception ex) {
			System.out
					.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n",
							ex.getClass().getName(), ex.getStackTrace()[2],
							ex.getCause(), ex.getMessage(),
							ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<cosc470.compiler.v3.database.Token> getTokens() {
		return tokens;
	}

	public static void printTokens() {
		System.out.printf("\n\nTokens:");
		for (cosc470.compiler.v3.database.Token temp : tokens) {
			temp.printIdAndValue();
		}
		System.out.println("\n");
	}

	public static void printDatabaseAndProcesses() {
		System.out.printf("\n\nDatabase And Processes:");
		printCommentSymbols();
		printReserveWords();
		printUnknownVariables();
		printCombinableWords();
		printNonCombinableReserveWords();
		printCodeText();
		printCodeList();
		printTokens();
	}

}