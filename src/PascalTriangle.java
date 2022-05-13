/**
 * Java_00017 Definition: Write a java program to print pascal triangle.
 *
 * Author: Nishchay Dixit
 * Creation Date: 13 May 2022
 */

/*
MODIFICATION HISTORY

Modified on 13 May 6:26 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        //Function call
        printTriangle(size);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one integer variable
    RETURN TYPE: none
    This function returns pascal triangle
    */
    public static void printTriangle(int size) {
        for (int line = 1; line <= size; line++) {
            for (int j = 0; j <= (size - line); j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent Coefficient(line, i)
            int coefficient = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(coefficient + " ");
                coefficient = coefficient * (line - i) / i;
            }
            System.out.println();
        }
    }
}
