/**
 * Java_00007 Definition: Write a java program to calculate power without using inbuilt function.
 *
 * Author: Nishchay Dixit
 * Creation Date: 16 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 16 April 6:20 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//core logic
public class CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pow, number;
        System.out.print("Enter Number: ");
        number = scanner.nextInt();
        System.out.print("Enter power: ");
        pow = scanner.nextInt();
        int ans = 1;
        while (pow > 0) {
            ans = pow(ans, number);
            pow--;
        }
        System.out.println(ans);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: two integer variables
    RETURN TYPE: integer
    This function returns power of given number
    */
    static int pow(int first_number, int second_number) {
        int sum = 0;
        while (second_number > 0) {
            sum += first_number;
            second_number--;
        }
        return sum;
    }
}
