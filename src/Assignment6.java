/**
 * @author Vu Nguyen
 * CSC 201-004N
 * Assignment 6
 * Problem 6.21
 * *6.21 (Phone keypads) The international standard letter/number mapping for telephones is shown in Programming Exercise 4.15.
 * Write a method that returns a number, given an uppercase letter, as follows: int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters.
 * The program translates a letter (uppercase or lowercase) to a digit and leaves all other characters intact.
 */
import java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(string.charAt(i))));
            else
                System.out.print(string.charAt(i));
        }
        System.out.println();
    }
    private static int getNumber(char uppercaseLetter) {
        // Return the character's number reference in the international
        // standard letter/number mapping for telephones
        if (uppercaseLetter >= 'W')
            return 9;
        else if (uppercaseLetter >= 'T')
            return 8;
        else if (uppercaseLetter >= 'P')
            return 7;
        else if (uppercaseLetter >= 'M')
            return 6;
        else if (uppercaseLetter >= 'J')
            return 5;
        else if (uppercaseLetter >= 'G')
            return 4;
        else if (uppercaseLetter >= 'D')
            return 3;
        else
            return 2;
    }
}

