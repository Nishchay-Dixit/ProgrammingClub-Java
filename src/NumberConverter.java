/**
 * java_00006 Definition: Write a java program to convert decimal to roman number and roman to decimal number.
 *
 * Author: Nishchay Dixit
 * Creation Date: 16 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 16 April 5:30 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
public class NumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        romanConverter(number);
        System.out.print("Enter roman number: ");
        scanner.nextLine();
        String roman = scanner.nextLine();
        decimalConverter(roman);
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one integer variable
    RETURN TYPE: non
    This function returns roman number in string format
    */
    public static void romanConverter(int num) {
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_numbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < decimal.length; i++) {
            while (num >= decimal[i]) {
                num -= decimal[i];
                roman.append(roman_numbers[i]);
            }
        }
        System.out.println("Roman: " + roman.toString());
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one char variable
    RETURN TYPE: integer
    This function returns decimal values of roman symbol
    */
    public static int romanToNumber(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if (ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        if (ch == 'M') {
            return 1000;
        }
        return -1;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: one string variable
    RETURN TYPE: none
    This function returns decimal number in integer
    */
    public static void decimalConverter(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {

            //Get value of symbol s[i]
            int first_symbol = romanToNumber(roman.charAt(i));
            if ((i + 1) < roman.length()) {

                //Get value of symbol s[i+1]
                int second_symbol = romanToNumber(roman.charAt(i + 1));

                //Comparing both values
                if (first_symbol >= second_symbol) {
                    result += first_symbol;
                } else {
                    result += first_symbol - second_symbol;
                    i++;
                }
            } else {
                result += first_symbol;
            }
        }
        System.out.println("Decimal: " + result);
    }
}
