/**
 * Java_00019 Definition: Write a java program to print all the subsets fo given array.
 *
 * Author: Nishchay Dixit
 * Creation Date: 13 May 2022
 */

/*
MODIFICATION HISTORY

Modified on 13 May 7:34 by Nishchay Dixit [Written core program]
*/

import java.util.*;

//Core Logic
public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        //Get array from user
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        //Function call
        findSubSet(array);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one integer array
    RETURN TYPE: none
    This function returns all subsets of given array.
    */
    public static void findSubSet(int[] array) {

        //size stores the total numbers of subsets
        int size = (int) Math.pow(2, array.length);
        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(array);

        // generate each subset one by one
        for (int i = 0; i < size; i++) {
            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < array.length; j++) { // check every bit of i

                // if j'th bit of `i` is set, append `array[j]` to the subset
                if ((i & (1 << j)) != 0) {
                    subset.add(array[j]);
                }
            }
            set.add(subset);
        }

        // print all subsets present in the set
        System.out.println(set);
    }
}
