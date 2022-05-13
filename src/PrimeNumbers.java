/**
 * Java_00008 Definition: Write a java program to print prime numbers in given range.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 4:25 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//core logic
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get start number of range
        System.out.print("Enter Start: ");
        int start = scanner.nextInt();

        //Get end number of range
        System.out.print("Enter End: ");
        int end = scanner.nextInt();

        int print_flag = 0;

        //Logic to print prime numbers
        System.out.print("[");

        do {
            boolean flag = false;
            int i = 2;

            do {
                if (start % i == 0) {
                    flag = true;
                    break;
                }
                i++;
            } while (i <= start / 2);

            if (!flag) {

                //Check print_flag is does not equal to zero
                if (print_flag != 0)
                    System.out.print(", ");
                print_flag = 1;
                System.out.print(start + "");

            }

            ++start;

        } while (start <= end);

        System.out.print("]");
    }
}
