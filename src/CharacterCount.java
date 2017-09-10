import java.util.Scanner;

/**
 * Program to count the number of occurrences of a character in a given string
 * @author Laura Witherspoon
 * Assignment 6.23
 * Date: 9/1/2017
 */

public class CharacterCount {

    /**
     *
     * @param str alphanumeric string in which to count character
     * @param a character to count
     * @return count of how many times given character appears in given string
     */
    static int count(String str, char a) {
        int counter = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a) {
                counter++;
            }
        }

        return counter;
    }

    /**
     *
     * @param string user provided string to test against
     * @return true if provided string is alphanumeric (inclusive of standard punctuation)
     */
    private static boolean isAllowed(String string) {
        return string.matches("[a-zA-Z0-9 ,.!;:']+");
    }

    /**
     *
     * @param c1 user provided character to test
     * @return true if character is a letter
     */
    private static boolean isAllowed(char c1) {
        return Character.isLetter(c1);
    }


    public static void main(String[] args) {

        System.out.print("Please enter a word or phrase: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        // If string is not alphanumeric with standard punctuation, prompt user for another string
        while (!isAllowed(input)) {
            System.out.println("You entered a string with special characters.");
            System.out.println("Please input an alphanumeric string with only standard punctuation.");
            input = keyboard.nextLine();
        }

        System.out.print("Which letter should be counted? ");
        char character = keyboard.next().charAt(0);

        // If character is not a letter, prompt user for another character
        while (!isAllowed(character)) {
            System.out.print("You must enter a letter, example: 'a'. ");
            System.out.print("Please try again: ");
            character = keyboard.next().charAt(0);
        }

        System.out.print("The character '" + character + "' is used ");
        System.out.print(count(input, character) + " times.");

    }
}
