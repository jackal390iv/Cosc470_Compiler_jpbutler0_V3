/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc470.compiler.v3.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jpbutler0
 */
public class IntermediateCodeGenerator {

    private static ArrayList<String> evaluator;
    private static ArrayList<Integer> whileIn, whileOut, ifIn, ifOut;

    public IntermediateCodeGenerator() {
        evaluator = new ArrayList<String>();
        whileIn = new ArrayList<Integer>();
        whileOut = new ArrayList<Integer>();
        ifIn = new ArrayList<Integer>();
        ifOut = new ArrayList<Integer>();
    }

    public static void generateIntermediateCode() {
        addEvaluatorMain();
        //addTempCariablesToIntermediateCode();
        addSymbolTableToIntermediateCode();
        //printEvaluatorMain();
        allOperations();
        //Database.printSymbolTableItems();
        //Database.printIntermediateCode();
    }

    private static void addEvaluatorMain() {
        for (String temp : Database.getEvaluatorMain()) {
            evaluator.add(temp);
        }
    }

    private static void printEvaluatorMain() {
        System.out.printf("\n\nEvaluator Main:\n");
        for (String temp : evaluator) {
            System.out.println(temp);
        }
        System.out.println("\n");
    }

    private static void addSymbolTableToIntermediateCode() {
        String holder = "";
        for (int i = 0; i < Database.getSymbolTableItems().size(); i++) {
            if ((Database.getSymbolTableItems().get(i).getType().equals("NUMBER")) || (Database.getSymbolTableItems().get(i).getType().equals("SMALLINT")) || (Database.getSymbolTableItems().get(i).getType().equals("POSITIVE"))) {
                holder = "sto ";
                holder = holder + Database.getSymbolTableItems().get(i).getValue();
                holder = holder + ",,";
                holder = holder + Database.getSymbolTableItems().get(i).getName();
                Database.addIntermediateCode(holder);
            } else if (Database.getSymbolTableItems().get(i).getType().equals("BOOLEAN")) {
                holder = "sto ";
                if (Database.getSymbolTableItems().get(i).getValue().equals("TRUE")) {
                    holder = holder + "T";
                } else if (Database.getSymbolTableItems().get(i).getValue().equals("FALSE")) {
                    holder = holder + "F";
                }
                holder = holder + ",,";
                holder = holder + Database.getSymbolTableItems().get(i).getName();
                Database.addIntermediateCode(holder);
            } else if ((Database.getSymbolTableItems().get(i).getType().equals("CHAR")) || (Database.getSymbolTableItems().get(i).getType().equals("VARCHAR2"))) {
                for (int k = 0; k < Integer.parseInt(Database.getSymbolTableItems().get(i).getSize()); k++) {
                    holder = "sto ";
                    holder = holder + Database.getSymbolTableItems().get(i).getValue().charAt(k);
                    holder = holder + ",,";
                    if (k == 0) {
                        holder = holder + Database.getSymbolTableItems().get(i).getName();
                    } else {
                        holder = holder + Database.getSymbolTableItems().get(i).getName() + k;
                    }
                    Database.addIntermediateCode(holder);
                }
            }
        }
    }

    private static void addTempCariablesToIntermediateCode() {
        Database.addIntermediateCode("sto #0,,if_then_loop");
        Database.addIntermediateCode("sto #0,,while_loop");
    }

    private static void allOperations() {
        while (!(evaluator.isEmpty())) {
            // printEvaluator();
            //setEvaluator();
            //checkTypes();
            allOperationsHelper();
            //checkTypes();
        }
    }

    private static void allOperationsHelper() {
        boolean found = false;
        for (int i = 0; i < evaluator.size(); i++) {
            found = ifThenEndLoop(i);
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
            found = userInput(i);
            if (found == true) {
                break;
            }
        }
    }

    private static boolean ifThenEndLoop(int i) {
        boolean found = false;
        String holder = "";
        if (evaluator.get(i).equals("IF{")) {
            found = true;

            //ADD EXPRESSION IF_THEN_LOOP_VAR TO INTERMEDIATE CODE-> LOCATION = IF_THEN_START-2
            holder = expressionHandelerIfThenLoop(evaluator.get(i + 1));

            //WILL JMP TO LOCATION OF IF_THEN_END
            Database.addIntermediateCode("JMP ,,IF_THEN_START_#");
            ifIn.add(Database.getIntermediateCode().size());

            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        } else if (evaluator.get(i).equals("}THEN{")) {
            found = true;
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        } else if (evaluator.get(i).equals("}IFEnd")) {
            found = true;

            //WILL DECREMENT IF_THEN_LOOP_VAR -> IN ARRAYLIST -> LOCATION = IF_THEN_START-2
            //FOR THIS TO WORK PROPERLY; IF IF_THEN_LOOP_VAR IS ACCEPTABLE THEN IT MUST BE SET TO EQUAL 1
            Database.addIntermediateCode("DEC #1,,IF_THEN_LOOP_VAR_#");

            //IF IN PARAMETERS (OP1 > OP2); WILL JMP TO LOCATION OF IF_THEN_START+1
            Database.addIntermediateCode("JGT ,#0,IF_THEN_END_#");
            ifOut.add(Database.getIntermediateCode().size());
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        }
        //printEvaluatorMain();
        //Database.printIntermediateCode();
        //System.exit(0);
        return found;
    }

    //FOR THIS TO WORK PROPERLY; IF IF_THEN_LOOP_VAR IS ACCEPTABLE THEN IT MUST BE SET TO EQUAL 1
    private static String expressionHandelerIfThenLoop(String expression) {
        expression = expressionProcessor(expression);
        Database.addIntermediateCode("sto " + expression + ",,if_then_loop_var_" + (Database.getIntermediateCode().size()));
        return expression;
    }

    private static boolean whileLoop(int i) {
        boolean found = false;
        String holder = "";
        if (evaluator.get(i).equals("WHILE{")) {
            found = true;

            //ADD EXPRESSION WHILE_LOOP_VAR TO INTERMEDIATE CODE-> LOCATION = WHILE_START-2
            holder = expressionHandelerWhileLoop(evaluator.get(i + 1));

            //WILL JMP TO LOCATION OF WHILE_END
            Database.addIntermediateCode("JMP ,,WHILE_START_#");
            whileIn.add(Database.getIntermediateCode().size());

            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        } else if (evaluator.get(i).equals("}Loop{")) {
            found = true;
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        } else if (evaluator.get(i).equals("}WHILEEnd")) {
            found = true;

            //WILL DECREMENT WHILE_VAR -> IN ARRAYLIST -> LOCATION = WHILE_START-2
            Database.addIntermediateCode("DEC #1,,WHILE_LOOP_VAR_#");

            //IF IN PARAMETERS (OP1 > OP2); WILL JMP TO LOCATION OF WHILE_START+1
            Database.addIntermediateCode("JGT ,#0,WHILE_END_#");
            whileOut.add(Database.getIntermediateCode().size());
            evaluator.remove(i);
            if (i != 0) {
                i = i - 1;
            }
        }
        //printEvaluatorMain();
        //Database.printIntermediateCode();
        //System.exit(0);
        return found;
    }

    private static String expressionHandelerWhileLoop(String expression) {
        expression = expressionProcessor(expression);
        Database.addIntermediateCode("sto " + expression + ",,while_loop_var_" + (Database.getIntermediateCode().size()));
        return expression;
    }

    private static boolean leftHandSideOperator(int i) {
        boolean found = false;
        int pacer = 0, counter = 0;
        if (evaluator.get(i).equals("AntlrOperator.leftHandSideOperator{")) {
            found = true;
            ArrayList<String> chest = new ArrayList<String>();
            pacer = i;
            counter = 0;
            while (!(evaluator.get(pacer).equals("}"))) {
                if (counter > 0) {
                    chest.add(evaluator.get(pacer));
                }
                pacer++;
                counter++;
            }

            expressionHandelerLHS((evaluator.get(i + 1)), (evaluator.get(i + 2)));

            for (int j = 0; j < chest.size() + 2; j++) {
                evaluator.remove(i);
                if (i != 0) {
                    i = i - 1;
                }
            }
        }
        return found;
    }

    //CHECK HOW TO OVERWRITE STO
    private static String expressionHandelerLHS(String identifier, String expression) {
        expression = expressionProcessor(expression);
        Database.addIntermediateCode("sto " + expression + ",," + identifier);
        return expression;
    }

    private static boolean printStatements(int i) {
        boolean found = false;
        String identifier = "", type = "";
        if (evaluator.get(i).contains("System.out.print_NEW_LINE(")) {
            found = true;
            identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();
            Database.addIntermediateCode("sys #0,,");
            for (int j = 0; j < Database.getSymbolTableItems().size(); j++) {
                if (Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
                    type = Database.getSymbolTableItems().get(j).getType();
                    if (type.equals("CHAR")) {
                        Database.addIntermediateCode("sys #-2," + identifier + ",");
                    } else if (type.equals("VARCHAR2")) {
                        Database.addIntermediateCode("sys #-5,#" + identifier + ",#0");
                    } else if ((type.equals("NUMBER")) || (type.equals("POSITIVE")) || (type.equals("SMALLINT"))) {
                        Database.addIntermediateCode("sys #-1," + identifier + ",");
                    } else if (type.equals("BOOLEAN")) {
                        Database.addIntermediateCode("sys #-3," + identifier + ",");
                    }
                }
            }
            evaluator.remove(i);
            i = i - 1;
        } else if (evaluator.get(i).contains("System.out.print(")) {
            found = true;
            identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();
            Database.addIntermediateCode("sys #0,,");
            for (int j = 0; j < Database.getSymbolTableItems().size(); j++) {
                if (Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
                    type = Database.getSymbolTableItems().get(j).getType();
                    if (type.equals("CHAR")) {
                        Database.addIntermediateCode("sys #-2," + identifier + ",");
                    } else if (type.equals("VARCHAR2")) {
                        Database.addIntermediateCode("sys #-5,#" + identifier + ",#0");
                    } else if ((type.equals("NUMBER")) || (type.equals("POSITIVE")) || (type.equals("NEGATIVE"))) {
                        Database.addIntermediateCode("sys #-1," + identifier + ",");
                    } else if (type.equals("BOOLEAN")) {
                        Database.addIntermediateCode("sys #-3," + identifier + ",");
                    }
                }
            }
            evaluator.remove(i);
            i = i - 1;
        }
        return found;
    }

    private static boolean userInput(int i) {
        boolean found = false;
        String identifier = "", type = "", size = "";
        if (evaluator.get(i).contains("AntlrOperator.userInput(")) {
            found = true;
            identifier = evaluator.get(i).substring((evaluator.get(i).indexOf('(') + 1), (evaluator.get(i).indexOf(')'))).trim();
            for (int j = 0; j < Database.getSymbolTableItems().size(); j++) {
                if (Database.getSymbolTableItems().get(j).getName().equals(identifier)) {
                    type = Database.getSymbolTableItems().get(j).getType();
                    if (type.equals("CHAR")) {
                        Database.addIntermediateCode("sys #2,," + identifier);
                    } else if (type.equals("VARCHAR2")) {
                        size = Database.getSymbolTableItems().get(j).getSize();
                        //IF SIZE=0; SETS A DEFAULT VARCHAR2 SIZE OF 6
                        if (size.equals("0")) {
                            size = "6";
                        }
                        Database.addIntermediateCode("sys #5,#" + size + ",#" + identifier);
                    } else if ((type.equals("NUMBER")) || (type.equals("POSITIVE")) || (type.equals("SMALLINT"))) {
                        Database.addIntermediateCode("sys #1,," + identifier);
                    } else if (type.equals("BOOLEAN")) {
                        Database.addIntermediateCode("sys #3,," + identifier);
                    }
                }
            }
            evaluator.remove(i);
            i = i - 1;
        }
        //printEvaluatorMain();
        //Database.printIntermediateCode();
        //Database.printSymbolTableItems();
        //System.exit(0);
        return found;
    }

    //ADDS ALL EXPRESSIONS TO INTERMEDIATE CODE AND THEN RETURNS THE LAST EXPRESSION GIVEN -> AKA THE MAIN LOOKUP
    private static String expressionProcessor(String expression) {
        String lastExpression = "", kepter = "", holder = "";
        int counter = 0;
        boolean not = false;
        expression = expression.substring((expression.indexOf("(") + 1), (expression.indexOf(")")));

        System.out.println(expression + "\n\n");

        List<String> expressionSplit = new ArrayList<String>(Arrays.asList(expression.split("(?<=[-,+,*,/,%,<,>,=])|(?=[-,+,*,/,%,<,>,=])")));

        for (int i = 0; i < expressionSplit.size(); i++) {
            if (expressionSplit.get(i).isEmpty()) {
                expressionSplit.remove(i);
            }
        }

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

        kepter = "";
        for (int i = 0; i < expressionSplit.size(); i++) {
            if (expressionSplit.get(i).equals("-")) {
                if (expressionSplit.get(i + 1).matches("\\d+(\\.\\d+)?")) {
                    if (i != 0) {
                        if ((expressionSplit.get(i - 1).equals("*")) || (expressionSplit.get(i - 1).equals("/")) || (expressionSplit.get(i - 1).equals("%"))
                                || (expressionSplit.get(i - 1).equals("-")) || (expressionSplit.get(i - 1).equals("+")) || (expressionSplit.get(i - 1).equals("<"))
                                || (expressionSplit.get(i - 1).equals("<=")) || (expressionSplit.get(i - 1).equals(">")) || (expressionSplit.get(i - 1).equals(">="))
                                || (expressionSplit.get(i - 1).equals("==")) || (expressionSplit.get(i - 1).equals("<>")) || (expressionSplit.get(i - 1).equals(""))) {
                            kepter = "-" + expressionSplit.get(i + 1);
                            expressionSplit.remove(i);
                            expressionSplit.remove(i);
                            expressionSplit.add(i, kepter);
                        }
                    } else {
                        kepter = "-" + expressionSplit.get(i + 1);
                        expressionSplit.remove(i);
                        expressionSplit.remove(i);
                        expressionSplit.add(i, kepter);

                    }
                }
            }
        }

        for (int i = 0; i < expressionSplit.size(); i++) {
            if (expressionSplit.get(i).contains("NOT")) {
                holder = expressionSplit.get(i);
                counter = 0;
                while (holder.contains("NOT")) {
                    holder = holder.substring(holder.indexOf("NOT") + 3);
                    counter++;
                }
                if (counter % 2 == 0) {
                    //System.out.println("No Change In: " + holder);
                    expressionSplit.remove(i);
                    expressionSplit.add(i, holder);
                } else if (counter % 2 == 1) {
                    //System.out.println("Will Be Change In: " + holder);
                    if (holder.equals("TRUE")) {
                        holder = "FALSE";
                    } else if (holder.equals("FALSE")) {
                        holder = "TRUE";
                    } else if (holder.equals("NULL")) {
                        holder = "NULL";
                    } else if (holder.matches("-?\\d+(\\.\\d+)?")) {
                        holder = Integer.toString((Integer.parseInt(holder)) * -1);
                    } else {
                        expressionSplit.remove(i);
                        expressionSplit.add(i, "NOT" + holder);
                    }
                }
            }
        }

        for (int i = 0; i < expressionSplit.size(); i++) {
            if ((expressionSplit.get(i).equals("+"))) {
                not = false;
                if ((i > 0) && (i < expressionSplit.size() - 1)) {
                    if (!((expressionSplit.get(i + 1).equals("TRUE")) || (expressionSplit.get(i + 1).equals("FALSE")) || (expressionSplit.get(i + 1).equals("NULL")) || (expressionSplit.get(i + 1).matches("-?\\d+(\\.\\d+)?")))) {
                        //System.out.println(expressionSplit.get(i + 1));
                        not = true;
                    } else if (!((expressionSplit.get(i - 1).equals("TRUE")) || (expressionSplit.get(i - 1).equals("FALSE")) || (expressionSplit.get(i - 1).equals("NULL")) || (expressionSplit.get(i - 1).matches("-?\\d+(\\.\\d+)?")))) {
                        //System.out.println(expressionSplit.get(i - 1));
                        not = true;
                    }
                }
            } else if ((expressionSplit.get(i).equals("-"))) {

            }
        }

        //USE TO CREATE RIGHT AMOUNT OF TEMP VARIABLES 
        int theSize = expressionSplit.size() / 2;

        System.out.println(expressionSplit.size());
        System.out.println(theSize + "\n\n");

        for (String temp : expressionSplit) {
            System.out.println(temp);
        }

        //printEvaluatorMain();
        //Database.printSymbolTableItems();
        //Database.printIntermediateCode();
        lastExpression = "LAST_EXPRESSION";
        return lastExpression;
    }

}
