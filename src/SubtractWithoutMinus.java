/**
 * Java_00009 Definition: Write a java program to subtract one number to another without using minus sign.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 4:46 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class SubtractWithoutMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get first number
        System.out.print("Enter First number: ");
        int first_number = scanner.nextInt();

        //Get second number
        System.out.print("Enter second number: ");
        int second_number = scanner.nextInt();

        //Performing subtract using 2's complement of second number
        //And add that number with first number
        System.out.println("Answer is: " + Math.abs((first_number + (~second_number) + 1)));
    }
}
