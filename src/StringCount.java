/**
 * Java_00016 Definition: Write a java program to count words, characters and digits from given strings.
 *
 * Author: Nishchay Dixit
 * Creation Date: 13 May 2022
 */

/*
MODIFICATION HISTORY

Modified on 13 May 6:05 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class StringCount {

    public static void main(String[] args) {

        //Variable initialization
        int digits = 0;
        int words = 0;
        int characters = 0;

        //Get String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = scanner.nextLine();

        line = line.trim();

//        System.out.println(line);

        //Iterate loop till length of string
        for (int i = 0; i < line.length(); i++) {

            if (Character.isDigit(line.charAt(i))) { //Count digits
                digits++;
            }else if (line.charAt(i) != ' ') { //Count characters
                characters++;
            }else if ((line.charAt(i) == ' ') && (line.charAt(i + 1) != ' ')) { //Count words
                words++;
            }

        }

        //Print result
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
        System.out.println("Digits: " + digits);


    }

}
