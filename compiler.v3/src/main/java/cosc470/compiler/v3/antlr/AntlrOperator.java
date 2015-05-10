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

	private static List<String> evaluator;
	private ArrayList<String> chest;
	int kept = 0;

	public AntlrOperator() {
		runTest();
		createEvaluator();
		evaluateExpressions();
		allOperations();
	}

	private void allOperations() {
		while (!(evaluator.isEmpty())) {
			allOperationsHelper();
			checkTypes();
		}
	}

	private void allOperationsHelper() {
		boolean found = false;
		for (int i = 0; i < evaluator.size(); i++) {
			found = ifThenEndLoop(i);
			if (found == true) {
				break;
			}

			found = userInput(i);
			if (found == true) {
				break;
			}
			found = whileLoop(i);
			if (found == true) {
				break;
			}
			found = leftHandSideOperator(i);

			if (found == true) {
				break;
			}
			found = printStatements(i);
			if (found == true) {
				break;
			}
		}
	}
	
	private void checkTypes(){
		
	}

	private void printEvaluator() {
		System.out.println("\n");
		for (String temp : evaluator) {
			System.out.println("" + temp);
		}
		System.out.println("\n");
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

	private void createEvaluator() {
		try {
			String holder = "";
			evaluator = new ArrayList<String>(Arrays.asList(cosc470.compiler.v3.database.Database.getAntlrOperationsList().split(",")));
			// evaluator = new
			// ArrayList<String>(Arrays.asList(value.split(",")));

			for (int i = 0; i < evaluator.size(); i++) {
				if (evaluator.get(i).isEmpty()) {
					evaluator.remove(i);
				} else {
					holder = evaluator.get(i).trim();
					evaluator.remove(i);
					evaluator.add(i, holder);
				}
			}

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	private void evaluateExpressions() {
		String holder = "";
		for (int i = 0; i < evaluator.size(); i++) {
			if (evaluator.get(i).contains("Expression(")) {
				holder = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();
				holder = processExpression(holder);
				evaluator.remove(i);
				evaluator.add(i, holder);
			}
		}
	}

	private boolean ifThenEndLoop(int i) {
		boolean found = false;
		int pacer, counter;
		if (evaluator.get(i).equals("IF{")) {
			found = true;
			pacer = i;
			counter = 0;
			while (!(evaluator.get(pacer).equals("}End"))) {
				counter++;
				pacer++;
			}
			counter++;
			if (evaluator.get(i + 1).equals("TRUE")) {
				evaluator.remove(pacer);
				evaluator.remove(i);
				evaluator.remove(i);
				evaluator.remove(i);
			} else {
				for (int k = 0; k < counter; k++) {
					evaluator.remove(i);
				}
				i = i - 1;
			}
		}
		return found;
	}

	// fix accepted
	private boolean whileLoop(int i) {
		boolean found = false, accepted;
		int pacer, counter, keeper, block;
		if (evaluator.get(i).equals("WHILE{")) {
			found = true;
			pacer = i;
			counter = 0;
			while (!(evaluator.get(pacer).equals("}End"))) {
				counter++;
				pacer++;
			}
			counter++;

			accepted = false;
			if (evaluator.get(i + 1).matches("-?\\d+(\\.\\d+)?")) {
				if ((Integer.parseInt(evaluator.get(i + 1))) >= 0) {
					accepted = true;
				}
			}

			if (accepted == true) {
				chest = new ArrayList<String>();
				keeper = i + 3;
				while (keeper < pacer) {
					chest.add(evaluator.get(keeper));
					keeper++;
				}

				pacer = Integer.parseInt(evaluator.get(i + 1));

				keeper = 0;
				while (keeper < counter) {
					evaluator.remove(i);
					keeper++;
				}

				for (int j = 0; j < pacer; j++) {
					for (int k = 0; k < chest.size(); k++) {
						evaluator.add(i, chest.get(k));
					}
				}

			} else {
				for (int k = 0; k < counter; k++) {
					evaluator.remove(i);
				}
				i = i - 1;
			}
		}
		return found;
	}

	// Will handle casting (DECLARE's casting has already been handled, only
	// left_hand_side casting needed).
	// identifier, value, OWtype, OWsize
	private boolean leftHandSideOperator(int i) {
		boolean found = false;
		int pacer, counter;
		if (evaluator.get(i).equals("AntlrOperator.leftHandSideOperator{")) {
			found = true;
			chest = new ArrayList<String>();
			pacer = i;
			counter = 0;
			while (!(evaluator.get(pacer).equals("}"))) {
				if (counter > 0) {
					chest.add(evaluator.get(pacer));
				}
				counter++;
				pacer++;
			}
			counter++;
			for (int j = 0; j < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); j++) {
				if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getName().equals(chest.get(0))) {
					cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).setValue(chest.get(1));
					evaluator.remove(i);
					evaluator.remove(i);
					evaluator.remove(i);
					evaluator.remove(i);
					if (chest.size() > 1) {
						cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).setType(chest.get(2));
						evaluator.remove(i);
						if (chest.size() > 2) {
							cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).setSize(chest.get(3));
							evaluator.remove(i);
						}
					}
					break;
				}
			}
		}
		return found;
	}

	private boolean userInput(int i) {
		boolean found = false;
		String identifier = "";
		if (evaluator.get(i).contains("AntlrOperator.userInput(")) {
			found = true;
			identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();

			// user input
			Scanner scanner = new Scanner(System.in);
			System.out.printf("\n\nPlease input new value for identifier %s: ", identifier);
			String value = scanner.nextLine();

			// sets symbol table value
			for (int j = 0; j < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); j++) {
				if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
					cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).setValue(value);
					break;
				}
			}
			evaluator.remove(i);
			i = i - 1;
		}
		return found;
	}

	private boolean printStatements(int i) {
		boolean found = false;
		String identifier = "", value = "";
		if (evaluator.get(i).contains("System.out.print_NEW_LINE(")) {
			// cosc470.compiler.v3.database.Database.printSymbolTableItems();
			found = true;
			identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();

			if (!(identifier.equals(""))) {
				for (int j = 0; j < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); j++) {
					if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
						identifier = cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getValue();
						break;
					}
				}
			}
			System.out.printf("\n%s", identifier);
			evaluator.remove(i);
			i = i - 1;

		} else if (evaluator.get(i).contains("System.out.print(")) {
			// cosc470.compiler.v3.database.Database.printSymbolTableItems();
			found = true;
			identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();

			if (!(identifier.equals(""))) {
				for (int j = 0; j < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); j++) {
					if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
						identifier = cosc470.compiler.v3.database.Database.getSymbolTableItems().get(j).getValue();
						break;
					}
				}
			}
			System.out.printf("%s", identifier);
			evaluator.remove(i);
			i = i - 1;
		}
		return found;

	}

	public static String processExpression(String expression) {
		try {
			List<String> expressionSplit = new ArrayList<String>(Arrays.asList(expression.split("(?<=[-,+,*,/,%,<,>,=])|(?=[-,+,*,/,%,<,>,=])")));
			String holder = "", op1 = "", op2 = "";
			int a = 0, b = 0, answer = 0;
			boolean operation = false;
			int counter = 0;

			for (int i = 0; i < expressionSplit.size(); i++) {
				if (expressionSplit.get(i).equals("<")) {
					if (expressionSplit.get(i + 1).equals(">")) {
						expressionSplit.remove(i);
						expressionSplit.remove(i);
						expressionSplit.add(i, "<>");
					} else if (expressionSplit.get(i + 1).equals("=")) {
						expressionSplit.remove(i);
						expressionSplit.remove(i);
						expressionSplit.add(i, "<=");
					}
				} else if (expressionSplit.get(i).equals(">")) {
					if (expressionSplit.get(i + 1).equals("=")) {
						expressionSplit.remove(i);
						expressionSplit.remove(i);
						expressionSplit.add(i, ">=");
					}
				} else if (expressionSplit.get(i).equals("=")) {
					if (expressionSplit.get(i + 1).equals("=")) {
						expressionSplit.remove(i);
						expressionSplit.remove(i);
						expressionSplit.add(i, "==");
					}
				}
			}

			// for (String temp : expressionSplit) {
			// System.out.print(temp); } System.out.println("\n");

			while (counter < expressionSplit.size() - 1) {
				operation = false;
				for (int i = 0; i < expressionSplit.size() - 1; i++) {
					if (operation == false) {
						if (expressionSplit.get(i + 1).equals("%")) {
							if ((expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) && ((expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")))) {
								a = Integer.parseInt(expressionSplit.get(i));
								b = Integer.parseInt(expressionSplit.get(i + 2));
								answer = a % b;
								holder = Integer.toString(answer);
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals("*")) {
							if ((expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) && ((expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")))) {
								a = Integer.parseInt(expressionSplit.get(i));
								b = Integer.parseInt(expressionSplit.get(i + 2));
								answer = a * b;
								holder = Integer.toString(answer);
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals("/")) {
							if ((expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) && ((expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")))) {
								a = Integer.parseInt(expressionSplit.get(i));
								b = Integer.parseInt(expressionSplit.get(i + 2));
								answer = a / b;
								holder = Integer.toString(answer);
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else {
							counter++;
						}
					}
				}
			}

			counter = 0;
			while (counter != expressionSplit.size() - 1) {
				operation = false;
				for (int i = 0; i < expressionSplit.size() - 1; i++) {
					if (operation == false) {
						if (expressionSplit.get(i + 1).equals("+")) {
							if ((expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) && ((expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")))) {
								a = Integer.parseInt(expressionSplit.get(i));
								b = Integer.parseInt(expressionSplit.get(i + 2));
								answer = a + b;
								holder = Integer.toString(answer);
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals("-")) {
							if ((expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) && ((expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")))) {
								a = Integer.parseInt(expressionSplit.get(i));
								b = Integer.parseInt(expressionSplit.get(i + 2));
								answer = a - b;
								holder = Integer.toString(answer);
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else {
							counter++;
						}
					}
				}
			}

			counter = 0;
			while (counter < expressionSplit.size() - 1) {
				operation = false;
				for (int i = 0; i < expressionSplit.size() - 1; i++) {
					if (operation == false) {
						if (expressionSplit.get(i + 1).equals("<")) {
							if (expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) {
								if (expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")) {
									a = Integer.parseInt(expressionSplit.get(i));
									b = Integer.parseInt(expressionSplit.get(i + 2));
									if (a < b) {
										holder = "TRUE";
									} else {
										holder = "FALSE";
									}
								} else {
									holder = "NULL";
								}
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals(">")) {
							if (expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) {
								if (expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")) {
									a = Integer.parseInt(expressionSplit.get(i));
									b = Integer.parseInt(expressionSplit.get(i + 2));
									if (a > b) {
										holder = "TRUE";
									} else {
										holder = "FALSE";
									}
								} else {
									holder = "NULL";
								}
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals("<=")) {
							if (expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) {
								if (expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")) {
									a = Integer.parseInt(expressionSplit.get(i));
									b = Integer.parseInt(expressionSplit.get(i + 2));
									if (a <= b) {
										holder = "TRUE";
									} else {
										holder = "FALSE";
									}
								} else {
									holder = "NULL";
								}
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals(">=")) {
							if (expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) {
								if (expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")) {
									a = Integer.parseInt(expressionSplit.get(i));
									b = Integer.parseInt(expressionSplit.get(i + 2));
									if (a >= b) {
										holder = "TRUE";
									} else {
										holder = "FALSE";
									}
								} else {
									holder = "NULL";
								}
							} else {
								holder = "NULL";
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else if (expressionSplit.get(i + 1).equals("==")) {
							if (expressionSplit.get(i).matches("\\d+(\\.\\d+)?")) {
								if (expressionSplit.get(i + 2).matches("\\d+(\\.\\d+)?")) {
									a = Integer.parseInt(expressionSplit.get(i));
									b = Integer.parseInt(expressionSplit.get(i + 2));
									if (a == b) {
										holder = "TRUE";
									} else {
										holder = "FALSE";
									}
								} else {
									holder = "NULL";
								}
							} else {
								op1 = expressionSplit.get(i);
								op2 = expressionSplit.get(i + 2);
								if ((op1.equals("TRUE") && op2.equals("TRUE")) || (op1.equals("FALSE") && op2.equals("FALSE")) || (op1.equals("NULL") && op2.equals("NULL"))) {
									holder = "TRUE";
								} else {
									holder = "FALSE";
								}
							}
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.remove(i);
							expressionSplit.add(i, holder);
							operation = true;
							/*
							 * for (String temp : expressionSplit) {
							 * System.out.print(temp); } System.out.println();//
							 */
						} else {
							counter++;
						}
					}
				}
			}

			cosc470.compiler.v3.database.Database.addExpressionListItem("Expression: " + expression);
			holder = "";
			for (String temp : expressionSplit) {
				holder = holder + temp;
			}
			holder = "Answer: " + holder;
			cosc470.compiler.v3.database.Database.addExpressionListItem(holder);

			expression = "";
			for (String temp : expressionSplit) {
				expression = expression + temp;
			}

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
		return expression;
	}

}