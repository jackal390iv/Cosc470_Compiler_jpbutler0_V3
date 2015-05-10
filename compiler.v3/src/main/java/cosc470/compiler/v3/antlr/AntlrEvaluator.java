package cosc470.compiler.v3.antlr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AntlrEvaluator {

	private static List<String> evaluator;

	public AntlrEvaluator() {
		createEvaluator();
		evaluateExpressions();
		ifThenEndLoop();
		whileLoop();
		printEvaluator();
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

	private void ifThenEndLoop() {
		int pacer, counter;
		for (int i = 0; i < evaluator.size(); i++) {
			if (evaluator.get(i).equals("IF{")) {
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
		}
	}

	private void whileLoop() {
		int pacer, counter;
		for (int i = 0; i < evaluator.size(); i++) {
			
		}
	}

	private void printEvaluator() {
		System.out.println("\n");
		for (String temp : evaluator) {
			System.out.println("" + temp);
		}
		System.out.println("\n");
	}

	// Will handle casting (DECLARE's casting has already been handled, only
	// left_hand_side casting needed), and will/can also return identifier
	// ('string_literal' or 'c') or expression.
	private void leftHandSideOperator(String identifier, String value, String OWtype, String OWsize) {
		try {

		} catch (Exception ex) {
			System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(),
					ex.getMessage(), ex.getLocalizedMessage());
			// ex.printStackTrace();
			System.exit(0);
		}
	}

	private void userInput(String identifier) {
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
