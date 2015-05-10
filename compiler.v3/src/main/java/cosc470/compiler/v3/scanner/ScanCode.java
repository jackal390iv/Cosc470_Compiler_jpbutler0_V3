/*
 * Class: COSC 470-001
 * Project: Compiler
 */
package cosc470.compiler.v3.scanner;

import java.io.File;
import java.util.Scanner;

/**
 * This class is responsible for reading in the code text file, separating the
 * code text according to the grammar, and placing the separated code elements
 * into into a static ArrayList.
 *
 * @author Jonathan Butler <https://github.com/jackal390iv>
 */
public class ScanCode {

    private Scanner scanner;
    private final String codeTextLocation;

    public ScanCode(String codeTextLocation) {
        this.codeTextLocation = codeTextLocation;
        readCode();
        seperateSpaces();
        checkForBasicReserveWords();
        checkForCombinables();
        removeEmptyElements();
    }

    /**
     * This method reads the code text, who's location is designated in the
     * constructor, and adds its elements to the ArrayList 'list'. It should be
     * noted that until the 'fixSpecialCharacters()' method has been run this
     * list is not yet representative of the grammar.
     *
     */
    private void readCode() {
        String line;
        boolean multiLineComment = false;
        try {
            scanner = new Scanner(new File(codeTextLocation));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                //This section of this method checks for pre-existing multi-Line comments and removes them; designated in our current grammar as '/*' to '*/'
                if (multiLineComment == true) {
                    if (line.contains(cosc470.compiler.v3.database.Database.getCommentBlockEndSymbol())) {
                        line = line.substring(line.indexOf(cosc470.compiler.v3.database.Database.getCommentBlockEndSymbol()) + cosc470.compiler.v3.database.Database.getCommentBlockEndSymbol().length(), line.length());
                        multiLineComment = false;
                    } else {
                        line = "";
                    }
                }
                //This section of this method checks for line comments and removes them from the end of the line; designated in our current grammar as '--'
                if (line.contains(cosc470.compiler.v3.database.Database.getCommentSymbol())) {
                    line = line.substring(0, line.indexOf(cosc470.compiler.v3.database.Database.getCommentSymbol()));
                }
                //This section of this method checks for the start of multi-line comments and removes them; designated in our current grammar as '/*' to '*/'
                if (line.contains(cosc470.compiler.v3.database.Database.getCommentBlockStartSymbol())) {
                    line = line.substring(0, line.indexOf(cosc470.compiler.v3.database.Database.getCommentBlockStartSymbol()));
                    multiLineComment = true;
                }
                cosc470.compiler.v3.database.Database.getCodeText().add(line.trim());
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
            //ex.printStackTrace();
            System.exit(0);
        }
    }

    private void seperateSpaces() {
        String element;
        try {
            for (int i = 0; i < cosc470.compiler.v3.database.Database.getCodeText().size(); i++) {
                while ((cosc470.compiler.v3.database.Database.getCodeText().get(i).contains(" ")) && (!(cosc470.compiler.v3.database.Database.getCodeText().get(i).isEmpty()))) {
                    element = cosc470.compiler.v3.database.Database.getCodeText().get(i);
                    cosc470.compiler.v3.database.Database.getCodeText().remove(i);
                    cosc470.compiler.v3.database.Database.getCodeText().add(i, element.substring(element.indexOf(" ") + 1));
                    cosc470.compiler.v3.database.Database.getCodeText().add(i, "");
                    cosc470.compiler.v3.database.Database.getCodeText().add(i, element.substring(0, element.indexOf(" ")));
                }
            }
        } catch (Exception ex) {
            System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
            //ex.printStackTrace();
        }
        
      
    }

    private void checkForBasicReserveWords() {
        String[] holder;
        boolean isCombinable=false;
        try {
            for (int i = 0; i < cosc470.compiler.v3.database.Database.getCodeText().size(); i++) {
                for (int k = 0; k < cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().size(); k++) {
                    if ((cosc470.compiler.v3.database.Database.getCodeText().get(i).contains(cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k))) && (!(cosc470.compiler.v3.database.Database.getCodeText().get(i).equals(cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k))))) {
                    	/*isCombinable=false;
                    	
                    	for(int q=0;q<cosc470.compiler.v3.database.Database.getCombinableWords().size();q++){
                        	if(cosc470.compiler.v3.database.Database.getCodeText().get(i).contains(cosc470.compiler.v3.database.Database.getCombinableWords().get(q))){
                        		isCombinable=true;
                        	}
                        }//*/
                    	
                    	//if(isCombinable==false){
                    	holder = new String[]{cosc470.compiler.v3.database.Database.getCodeText().get(i).substring(0, cosc470.compiler.v3.database.Database.getCodeText().get(i).indexOf(cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k))), cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k), cosc470.compiler.v3.database.Database.getCodeText().get(i).substring(cosc470.compiler.v3.database.Database.getCodeText().get(i).indexOf(cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k)) + cosc470.compiler.v3.database.Database.getNonCombinableReserveWords().get(k).length(), cosc470.compiler.v3.database.Database.getCodeText().get(i).length())};
                        cosc470.compiler.v3.database.Database.getCodeText().remove(i);
                        for (int j = 2; j >= 0; j--) {
                            if (!(holder[j].isEmpty())) {
                                cosc470.compiler.v3.database.Database.getCodeText().add(i, holder[j]);
                            }
                        }
                    	//}
                        
                        
                        
                    }
                }
            }
        } catch (Exception ex) {
            System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
            //ex.printStackTrace();
        }
        
        //cosc470.compiler.v3.database.Database.printCodeText();
    }

    //catch glitch found
    private void checkForCombinables() {
        String element;
        int counter, clicker;
        try {
            for (int i = 0; i < cosc470.compiler.v3.database.Database.getCodeText().size(); i++) {
                for (int k = 0; k < cosc470.compiler.v3.database.Database.getCombinableWords().size(); k++) {
                    counter = 0;
                    clicker = 0;
                    element = cosc470.compiler.v3.database.Database.getCodeText().get(i);
                    while ((cosc470.compiler.v3.database.Database.getCombinableWords().get(k).contains(element)) && ((i + counter) < cosc470.compiler.v3.database.Database.getCodeText().size()) && (!(cosc470.compiler.v3.database.Database.getCombinableWords().get(k).equals(element)))) {
                        counter++;
                        if (cosc470.compiler.v3.database.Database.getCodeText().get(i + counter).isEmpty()) {
                            element = element + " ";
                        } else {
                            element = element + cosc470.compiler.v3.database.Database.getCodeText().get(i + counter);
                        }
                    }
                    if (element.equals(cosc470.compiler.v3.database.Database.getCombinableWords().get(k))) {
                        clicker = 0;
                        while (clicker != counter + 1) {
                            cosc470.compiler.v3.database.Database.getCodeText().remove(i);
                            clicker++;
                        }
                        cosc470.compiler.v3.database.Database.getCodeText().add(i, element);
                    }
                }
            }
        } catch (Exception ex) {
            //System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
            //ex.printStackTrace();
        }
    }

    private void removeEmptyElements() {
        try {
            for (String temp : cosc470.compiler.v3.database.Database.getCodeText()) {
                if (!(temp.isEmpty())) {
                    cosc470.compiler.v3.database.Database.getCodeList().add(temp);
                }
            }
        } catch (Exception ex) {
            System.out.printf("\n\nERROR\nType: %s\nLocation: %s\nThrown Exception: %s\nMessage: %s\nLocalMessage: %s\n", ex.getClass().getName(), ex.getStackTrace()[2], ex.getCause(), ex.getMessage(), ex.getLocalizedMessage());
            //ex.printStackTrace();
        }
    }
}