/**
 * Java_00013 Definition: Write a java program to find Reminder and Quotient without using division and modulo sign.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 6:14 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class ReminderAndQuotient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get Values from user
        System.out.print("Enter First number: ");
        int first_number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second_number = scanner.nextInt();

        System.out.println("Quotient: " + div(first_number, second_number));
        System.out.println("Reminder: " + reminder(first_number, second_number));

    }

    /*
    Function prototype:
    INPUT PARAMETERS: two integer variables
    RETURN TYPE: integer
    This function returns reverse of binary
    */
    static int div(int a, int b) {
        int ans = 0;
        if (a <= b) {
            return 0;
        }
        while (a > b) {
            ans++;
            a -= b;
        }
        return ans;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: two integer variables
    RETURN TYPE: integer
    This function returns reverse of binary
    */
    static int reminder(int a, int b) {
        int ans = 0;
        if (a < b) {
            return a;
        } else if (a == b) {
            return 0;
        }
        while (a > b) {
            ans++;
            a -= b;
        }
        return a;
    }
}
