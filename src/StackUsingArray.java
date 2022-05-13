/**
 * Java_00001 Definition: Write a program to implement stack using array with push, pop and display functions.
 *
 * Author: Nishchay Dixit
 * Creation Date: 19 March 2022
 */

/*
MODIFICATION HISTORY

Modified on 19 March 2:33 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

// Core Logic
class Stack {

    // Global Variable for class Stack
    static final int SIZEOFSTACK = 100;
    int top;
    int[] stack = new int[SIZEOFSTACK];

    // The user define constructor to initialize top at object creation time.
    Stack() {
        top = -1;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function gets input value from user and push that value into Stack.
    */
    void push() {
        if (top >= (SIZEOFSTACK - 1)) { // Check for Stack Overflow
            System.out.println("Stack Overflow");
        } else {
            // Get value from user at unction call
            System.out.print("Enter Value: ");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            stack[++top] = value;
            System.out.println(value + " pushed in stack");
        }
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function pops a value from Stack and prints that value on screen.
    */
    void pop() {
        if (top < 0) { //Check for Stack Underflow
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function prints contents of stack on screen.
    */
    void display() {
        if (top < 0) { //Check for empty stack
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i] + "");
            }
        }
    }
}

// Driven Code
public class StackUsingArray {
    public static void main(String[] args) {

        // create object of Stack class.
        Stack stack = new Stack();

        int choice = 0;

        while (choice != 4) {

            // Getting user choice to perform operation on Stack.
            System.out.println("----------------------------------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> stack.push();
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> System.out.println("Exiting...........");
                default -> System.out.println("Please Enter The Appropriate Choice...");
            }
        }
    }
}