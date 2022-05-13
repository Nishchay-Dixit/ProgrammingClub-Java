/**
 * Java_00011 Definition: Write a java program to convert decimal to binary number.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 5:30 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get decimal number from user
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        String binary = "";

        //Iterate loop until number is greater then zero
        while (number > 0) {
            binary += number % 2;
            number /= 2;
        }

        //Reverse binary number
        reverse(binary);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one string variable
    RETURN TYPE: none
    This function returns reverse of binary
    */
    static void reverse(String str) {
        char character;
        StringBuilder newstring = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            newstring.insert(0, character);
        }
        System.out.println("Binary is: " + newstring);
    }
}
