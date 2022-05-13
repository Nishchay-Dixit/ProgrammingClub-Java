/**
 * java_00014 Definition: Write a java program to print multiplication table of entered number.
 *
 * Author: Nishchay Dixit
 * Creation Date: 16 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 6:35 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class MultiplicationTable {
    public static void main(String[] args) {
        int fact = 1;

        // Get Number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The value of number: ");
        int number = scanner.nextInt();

        // Print table
        for (int i = 1; i <= number; i++) {
            fact = multi(i, fact);
        }

        System.out.println(fact);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: two integer variables
    RETURN TYPE: integer
    This function returns reverse of binary
    */
    static int multi(int a, int b) {
        int ans = 0;
        for (int i = 0; i < b; i++) {
            ans = a + ans;
        }
        return ans;
    }
}
