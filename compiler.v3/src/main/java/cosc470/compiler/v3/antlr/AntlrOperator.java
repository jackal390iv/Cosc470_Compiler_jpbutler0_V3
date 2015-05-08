package cosc470.compiler.v3.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

public class AntlrOperator {

	public AntlrOperator() {
		runTest();
	}

	private void runTest() {
		try {
			
			/////////////////////////////////////////////////////////////////check for begin to change
			String code = "";
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database
					.getTokens()) {
				/*if (temp.getGrammarId().equals("num")) {
					code = code + temp.getValue();
				} else {
					code = code + temp.getGrammarId();
				}*/
				code = code + temp.getValue();
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

}
