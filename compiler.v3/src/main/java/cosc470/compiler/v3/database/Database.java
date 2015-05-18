package cosc470.compiler.v3.database;

import java.util.ArrayList;

public class Database {

	private static String commentSymbol, commentBlockStartSymbol, commentBlockEndSymbol, antlrCodeInput, antlrOperationsList;

	private static ArrayList<String> reserveWords, unknownVariables, combinableWords, nonCombinableReserveWords, codeText, codeList, expressionList, executionList,evaluatorList,evaluatorMain,intermediateCode;

	private static ArrayList<cosc470.compiler.v3.database.Token> tokens;

	private static ArrayList<cosc470.compiler.v3.database.SymbolTableItem> symbolTable;

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
		symbolTable = new ArrayList<cosc470.compiler.v3.database.SymbolTableItem>();
		expressionList = new ArrayList<String>();
		executionList= new ArrayList<String>();
		evaluatorList= new ArrayList<String>();
                evaluatorMain= new ArrayList<String>();
                intermediateCode= new ArrayList<String>();
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
		System.out.printf("%-15s: %-30s", "Comment Block Start Symbol", getCommentBlockStartSymbol());
		System.out.printf("%-15s: %-30s", "Comment Block End Symbol", getCommentBlockEndSymbol());
	}

	public static void addReserveWord(String reserveWord) {
		try {
			reserveWords.add(reserveWord);
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
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
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
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
					if (combinableWords.get(i).length() < combinableWord.length()) {
						combinableWords.add(i, combinableWord);
						break;
					} else if (i == combinableWords.size() - 1) {
						combinableWords.add(combinableWord);
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

	public static void addNonCombinableReserveWord(String nonCombinableReserveWord) {
		try {
			nonCombinableReserveWords.add(nonCombinableReserveWord);
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
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
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
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

	
	public static void addSymbolTableItem(String name, String type, String size, String value) {
		try {
			symbolTable.add(new SymbolTableItem(name, type, size, value));
		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
		}
	}

	public static ArrayList<cosc470.compiler.v3.database.SymbolTableItem> getSymbolTableItems() {
		return symbolTable;
	}

	public static void printSymbolTableItems() {
		System.out.printf("\n\nSymbol Table Items:");
		for (cosc470.compiler.v3.database.SymbolTableItem symbolTableItem : symbolTable) {
			symbolTableItem.printSymbolTableItemData();
		}
		System.out.println("\n");
	}

	public static void setAntlrCodeInput(String antlrCode) {
		antlrCodeInput = antlrCode;
	}

	public static String getAntlrCodeInput() {
		return antlrCodeInput;
	}

	public static void printAntlrCodeInput() {
		System.out.printf("\n\nAntlr Code Input: \n%s\n\n", antlrCodeInput);
	}

	public static void setAntlrOperationsList(String antlrOperations) {
		antlrOperationsList = antlrOperations;
	}

	public static void addExpressionListItem(String item) {
		expressionList.add(item);
	}

	public static ArrayList<String> getExpressionList() {
		return expressionList;
	}

	public static void printExpressionList() {
		System.out.printf("\n\nExpression List:");
		for (int i = 0; i < expressionList.size();) {
			System.out.printf("\n%-30s%s", expressionList.get(i), expressionList.get(i + 1));
			i = i + 2;
		}
		System.out.println("\n");
	}

	public static String getAntlrOperationsList() {
		return antlrOperationsList;
	}

	public static void printAntlrOperationsList() {
		System.out.printf("\n\nAntlr Operations: \n%s\n\n", antlrOperationsList);
	}
	
	public static void addEvaluatorListItem(String evaluator){
		evaluatorList.add(evaluator);
	}
	
	public static ArrayList<String> getEvaluatorList(){
		return evaluatorList;
	}
	
	public static void printEvaluatorList(){
		int counter=0;
		System.out.printf("\n\nEvaluator List:\n");
		for (String temp : evaluatorList) {
			System.out.printf("%-3d: %s\n",counter,temp);
			counter++;
		}
		System.out.println("\n");
	}
	
	public static ArrayList<String> getExecutionList(){
		return executionList;
	}
	
	public static void printExecutionList(){
		System.out.printf("\n\nExecution:\n");
		for (String temp : executionList) {
			System.out.println(temp);
		}
		System.out.println("\n");
	}
        
        public static void addEvaluatorMainItem(String item){
            evaluatorMain.add(item);
        }
        
        public static ArrayList<String> getEvaluatorMain(){
            return evaluatorMain;
        }
        
        public static void printEvaluatorMain(){
            System.out.printf("\n\nEvaluator Main:\n");
		for (String temp : evaluatorMain) {
			System.out.println(temp);
		}
		System.out.println("\n");
        }
        
        public static void addIntermediateCode(String code){
            int temp=intermediateCode.size();
            intermediateCode.add(temp+" "+code);
        }
        
        public static ArrayList<String> getIntermediateCode(){
            return intermediateCode;
        }
        
        public static void printIntermediateCode(){
            System.out.printf("\n\nIntermediate Code:\n");
		for (String temp : intermediateCode) {
			System.out.println(temp);
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
		printSymbolTableItems();
		printAntlrCodeInput();
		printEvaluatorList();
		printExpressionList();
		printExecutionList();
                printIntermediateCode();
	}

}
