/**
 * Java_00010 Definition: Write a java program to find maximum, minimum and average from group of numbers without using array
 * and Math functions.
 *
 * Author: Nishchay Dixit
 * Creation Date: 17 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 17 April 4:50 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

public class CustomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variable initialization
        int max = 0, min = 2 ^ 15, number;
        double avg;

        //Get length of custom array
        System.out.print("Enter number: ");
        number = scanner.nextInt();

        int count = number;
        int temp;
        int total = 0;

        //Iterate loop until number is greater then zero
        while (number > 0) {

            //Get values in custom array
            System.out.print("Enter Number " + (count - number + 1) + " : ");
            temp = scanner.nextInt();

            //compare tamp and min variable and change value of min variable accordingly
            if (temp < min) {
                min = temp;
            }

            //compare tamp and max variable and change value of max variable accordingly
            if (temp > max) {
                max = temp;
            }

            total += temp;
            number--;
        }


        avg = (double) total / count;

        //Print final answers
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Average : " + avg);
    }
}
