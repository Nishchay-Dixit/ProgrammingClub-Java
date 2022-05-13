/**
 * Java_00003 Definition: Write a java program to  reverse a string without using String inbuilt function.
 *
 * Author: Nishchay Dixit
 * Creation Date: 14 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 14 April 5:10 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get String from user
        System.out.print("Enter String: ");
        String str = scanner.next();

        //Function call
        reverse(str);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: One String Variable
    RETURN TYPE: none
    This function String variable as argument and print the reverse string of actual string.
    */
    static void reverse(String str) {
        char character;
        StringBuilder newstring = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            newstring.insert(0, character);
        }
        System.out.println("Reversed String: " + newstring);
    }
}
