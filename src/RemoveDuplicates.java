/**
 * Java_00004 Definition: Write a java program to remove duplicates from Arraylist.
 *
 * Author: Nishchay Dixit
 * Creation Date: 14 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 14 April 5:25 by Nishchay Dixit [Written core program]
*/

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Elements of List:");
        for (int i = 0; i < 5; i++) {
            arrayList.add(scanner.next());
        }

        //print original arraylist
        System.out.println("Before converting to set: ");
        int flag = 0, flag_1 = 0;
        System.out.print("[");
        for (String list : arrayList) {
            if (flag_1 != 0)
                System.out.print(", ");
            flag_1 = 1;
            System.out.print(list);
        }
        System.out.println("]");

        //Core Logic
        Set<String> set = new LinkedHashSet<String>(arrayList);

        //print new arraylist
        System.out.println("After converting to set: ");
        System.out.print("[");
        for (String list : set) {
            if (flag != 0)
                System.out.print(", ");
            flag = 1;
            System.out.print(list);
        }
        System.out.println("]");
    }
}
