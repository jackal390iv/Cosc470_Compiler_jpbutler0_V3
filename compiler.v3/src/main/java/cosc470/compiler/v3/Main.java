package cosc470.compiler.v3;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		// Create database of program operations
		cosc470.compiler.v3.database.Database database = new cosc470.compiler.v3.database.Database();

		// Scan grammar
		String reserveWords = "./src/main/resource/grammar/reserveWords.txt";
		String unknownVariables = "./src/main/resource/grammar/unknownVariables.txt";
		String commentSymbols = "./src/main/resource/grammar/commentSymbols.txt";
		cosc470.compiler.v3.scanner.ScanGrammar scanGrammar = new cosc470.compiler.v3.scanner.ScanGrammar(
				reserveWords, unknownVariables, commentSymbols);

		// Scan code
		String codeTextLocation = "./src/main/resource/code/codeV3.txt";
		cosc470.compiler.v3.scanner.ScanCode scanCode = new cosc470.compiler.v3.scanner.ScanCode(
				codeTextLocation);

		// Run basic syntax checker and create tokens
		cosc470.compiler.v3.syntaxchecker.SyntaxChecker syntaxChecker = new cosc470.compiler.v3.syntaxchecker.SyntaxChecker();

		//
		cosc470.compiler.v3.antlr.AntlrOperator antlrOperator = new cosc470.compiler.v3.antlr.AntlrOperator();

		// Print all program operations
		//database.printDatabaseAndProcesses();

	}
}
