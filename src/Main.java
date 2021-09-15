import java.util.*;

public class Main {

    static boolean pureHalf(){
        Scanner sc= new Scanner(System.in);                 //System.in is a standard input stream
        System.out.print("Would you prefer pure randomisation over 50:50? ");
        String preference = sc.nextLine();                  //Reads string
        return preference.equalsIgnoreCase("y") || preference.equalsIgnoreCase("yes");
    }


    /**
     * Method to get user input
     * Checks accuracy by immediately outputting the string
     * @return The string entered by the user to main();
     */
    static String userInput(){
        Scanner sc= new Scanner(System.in);                 //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.nextLine();                          //Reads string
        System.out.print("You have entered: "+str+"\n");
        return str;                                         //Returns string to main();

    }


    /**
     * Method to randomise capitalisation and to perform this action
     * @param text - the string from the userInput method
     * @return Returns a string with the changes already made
     */
    static String pureRandom(String text) {
        List<String> textList = new ArrayList<>();          //Creates list array to store characters
        Random status = new Random();                       //Creates Random object to be updated with coin toss
        String[] arrOfStr = text.split("", 0);   //Separates the string at each character
        for (String a : arrOfStr) {
            boolean random = status.nextBoolean();          //Sets random Boolean value
            if (random) {
                textList.add(a.toUpperCase());
            } else textList.add(a);
        }
        return String.join("", textList);           //Returns the string to main();
    }

    /**
     * Method to alternate capitalisation and perform this action
     * @param text - the string from the userInput method
     * @return Returns a string with the changes already made
     */
    static String halfRandom(String text) {
        List<String> textList = new ArrayList<>();          //Creates list array to store characters
        String[] arrOfStr = text.split("", 0);   //Separates the string at each character
        for (int i = 0; i < arrOfStr.length; i++) {         //Iterates through the String[] and increase a counter
            if (i % 2 == 0) {                               //If counter is even capitalise the letter
                textList.add(arrOfStr[i].toUpperCase());
            } else textList.add(arrOfStr[i]);
        }
        return String.join("", textList);           //Returns the string to main();
    }


    /**
     * main Method
     * @param args Not sure
     */
    public static void main(String[] args) {
        String input = userInput();                         //Stores user input as a string
        if (pureHalf()){
            System.out.println(pureRandom(input));          //Prints the output string with pure random capitalisation
        } else{
            System.out.println(halfRandom(input));              //Prints the output string swapping capitalisation
        }
    }
}