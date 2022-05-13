/**
 * Java_00012 Definition: Write a java program to get two numbers from user and convert that numbers to binary
 * then print the difference of how many bits are different in both number's binary.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 5:50 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class BinaryBitsDifference {

    public static void main(String[] args) {

        //Initialize of variables
        int first_number, second_number;
        int binary_first, binary_second;

        Scanner scanner = new Scanner(System.in);

        //Get numbers from user
        System.out.print("Enter First number: ");
        first_number = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        second_number = scanner.nextInt();

        //Convert Decimal number to Binary
        binary_first = binary(first_number);
        binary_second = binary(second_number);

        int max = Math.max(binary_first, binary_second);
        int count = 0;

        //Iterate loop until max greater then zero
        while (max > 0) {

            if (binary_first % 10 != binary_second % 10) {
                count++;
            }
            binary_first /= 10;
            binary_second /= 10;
            max /= 10;

        }

        //print count
        System.out.println("Difference in bits is: " + count);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one integer variable
    RETURN TYPE: integer
    This function returns binary of decimal number
    */
    static int binary(int number) {
        int b;
        StringBuilder binary = new StringBuilder();

        //Iterate loop until number greater then zero
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }

        //Convert String into integer
        b = Integer.parseInt(String.valueOf(reverse(binary.toString())));

        return b;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one string variable
    RETURN TYPE: CharSequence
    This function returns reverse of binary
    */
    static CharSequence reverse(String str) {
        char character;
        StringBuilder newstring = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            newstring.insert(0, character);
        }
        return newstring;
    }
}
