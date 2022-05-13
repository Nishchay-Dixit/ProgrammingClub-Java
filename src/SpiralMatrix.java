/**
 * Java_00018 Definition: Write a java program to print spiral matrix of n rows.
 *
 * Author: Nishchay Dixit
 * Creation Date: 13 May 2022
 */

/*
MODIFICATION HISTORY

Modified on 13 May 6:40 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        System.out.println("Spiral Matrix: \n");

        //function call
        printSpiralPattern(size);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one integer variable
    RETURN TYPE: none
    This function returns spiral matrix.
    */
    static void printSpiralPattern(int size) {
        int row = 0, col = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;

        //variables r, l, u and d are used to determine the movement
        // r = right, l = left, d = down, u = upper
        char move = 'r';

        //creating a 2D array for matrix
        int[][] matrix = new int[size][size];
        for (int i = 1; i < size * size + 1; i++) {
            matrix[row][col] = i;

            //switch-case to determine the next index
            switch (move) {
                case 'r' -> col += 1;
                case 'l' -> col -= 1;
                case 'u' -> row -= 1;
                case 'd' -> row += 1;
            }

            //checks if the matrix has reached the array boundary
            if (i == boundary) {

                //adds the left size for the next boundary
                boundary = boundary + sizeLeft;

                //decrease the size left by 1, if 2 rotations have been made
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeLeft -= 1;
                }
                switch (move) {
                    case 'r' -> move = 'd';
                    case 'd' -> move = 'l';
                    case 'l' -> move = 'u';
                    case 'u' -> move = 'r';
                }
            }
        }

        //Print spiral matrix
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                int n = matrix[row][col];
                if (n < 10)
                    System.out.print(n + "\t");
                else
                    System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
