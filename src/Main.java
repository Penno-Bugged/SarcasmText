import java.util.*;
import java.io.IOException;
import java.awt.Toolkit;
import java.awt.datatransfer.*;

public class Main {

    /**
     * Method to get user input
     * Checks accuracy by immediately outputting the string
     */
    static void userInput(){
        try{
            Clipboard clip =Toolkit.getDefaultToolkit().getSystemClipboard();
            // Get data stored in the clipboard that is in the form of a string (text)
            String str = (String)clip.getData(DataFlavor.stringFlavor);
            halfRandom(str);
        } catch (IOException | UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }


    /**
     * Method to alternate capitalisation and perform this action
     * @param text - the string from the userInput method
     */
    static void halfRandom(String text) {
        List<String> textList = new ArrayList<>();          //Creates list array to store characters
        String[] arrOfStr = text.split("", 0);   //Separates the string at each character
        for (int i = 0; i < arrOfStr.length; i++) {         //Iterates through the String[] and increase a counter
            if (i % 2 == 0) {                               //If counter is even capitalise the letter
                textList.add(arrOfStr[i].toUpperCase());
            } else textList.add(arrOfStr[i].toLowerCase());
        }
        StringSelection selection = new StringSelection(String.join("", textList));
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }


    /**
     * Main Method
     * @param args None - no console call
     */
    public static void main(String[] args) {
        userInput();          //Prints the output string with pure random capitalisation
    }
}
