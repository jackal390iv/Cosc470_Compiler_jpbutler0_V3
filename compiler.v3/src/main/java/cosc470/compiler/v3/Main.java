package cosc470.compiler.v3;

/**
 * Hello world!
 *
 */
public class Main {

    public static void main(String[] args) {

        // Create database of program operations
        cosc470.compiler.v3.database.Database database = new cosc470.compiler.v3.database.Database();

        cosc470.compiler.v3.database.IntermediateCodeGenerator intermediateCode = new cosc470.compiler.v3.database.IntermediateCodeGenerator();

        // Scan grammar
        String reserveWords = "./src/main/resource/grammar/reserveWords.txt";
        String unknownVariables = "./src/main/resource/grammar/unknownVariables.txt";
        String commentSymbols = "./src/main/resource/grammar/commentSymbols.txt";
        String combinableWords = "./src/main/resource/grammar/combinableWords.txt";
        String nonCombinableWords = "./src/main/resource/grammar/nonCombinableReserveWords.txt";
        cosc470.compiler.v3.scanner.ScanGrammar scanGrammar = new cosc470.compiler.v3.scanner.ScanGrammar(reserveWords, unknownVariables, commentSymbols, combinableWords, nonCombinableWords);

        // Scan code
        String codeTextLocation = "./src/main/resource/code/mainTester.txt";
        cosc470.compiler.v3.scanner.ScanCode scanCode = new cosc470.compiler.v3.scanner.ScanCode(codeTextLocation);

        // Run basic syntax checker, create tokens, and creates symbol table
        cosc470.compiler.v3.syntaxchecker.SyntaxChecker syntaxChecker = new cosc470.compiler.v3.syntaxchecker.SyntaxChecker();

        //
        cosc470.compiler.v3.antlr.AntlrOperator antlrOperator = new cosc470.compiler.v3.antlr.AntlrOperator();

	// Print all program operations
        //database.printDatabaseAndProcesses();
    }
}
