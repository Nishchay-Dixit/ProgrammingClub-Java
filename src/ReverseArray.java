/**
 * Java_00015 Definition: Write a java program to reverse an array in the same array, Without creating new array.
 *
 * Author: Nishchay Dixit
 * Creation Date: 13 May 2022
 */

/*
MODIFICATION HISTORY

Modified on 13 May 5:01 by Nishchay Dixit [Written core program]
*/

import java.util.Objects;
import java.util.Scanner;

//Core Logic
public class ReverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get size of array
        System.out.print("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of Array: ");

        //Get elements of array from user
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //Function call
        reverse(array);

    }

    /*
    Function prototype:
    INPUT PARAMETERS: one array
    RETURN TYPE: none
    This function returns reverse of given array.
    */
    public static void reverse(int[] array) {

        //Check if array is empty or not
        if (array == null || array.length <= 1) {
            System.out.println("Invalid Array");
        }

        //Array element swap logic
        for (int i = 0; i < Objects.requireNonNull(array).length / 2; i++) {
            array[i] += array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] -= array[array.length - 1 - i];
        }

        int flag = 0;

        //Print reverse array
        System.out.print("[");
        for (int i : array) {
            if (flag != 0) System.out.print(", ");
            flag = 1;
            System.out.print(i);
        }
        System.out.print("]");

    }

}
