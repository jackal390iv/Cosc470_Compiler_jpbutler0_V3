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
		evaluator();
	}

	private void runTest() {
		try {

			String code = "";
			for (cosc470.compiler.v3.database.Token temp : cosc470.compiler.v3.database.Database.getTokens()) {
				code = code + temp.getGrammarId();
			}

			cosc470.compiler.v3.database.Database.setAntlrCodeInput(code);

			cosc470.compiler.v3.database.Database.printAntlrCodeInput();

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

	public static void userInput(String identifier) {
		try {

			Scanner scanner = new Scanner(System.in);
			System.out.printf("\n\nPlease input new value for identifier %s: ", identifier);
			String value = scanner.nextLine();

			for (int i = 0; i < cosc470.compiler.v3.database.Database.getSymbolTableItems().size(); i++) {
				if (cosc470.compiler.v3.database.Database.getSymbolTableItems().get(i).getName().equals(identifier)) {
					cosc470.compiler.v3.database.Database.getSymbolTableItems().get(i).setValue(value);
					break;
				}
			}

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

	// ///////////////////////FIX THIS/////////////////////////////////////////

	public static void evaluator() {
		try {

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	// Will handle casting (DECLARE's casting has already been handled, only
	// left_hand_side casting needed), and will/can also return identifier
	// ('string_literal' or 'c') or expression.
	public static void leftHandSideOperator(String identifier, String value, String OWtype, String OWsize) {
		try {

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

}
