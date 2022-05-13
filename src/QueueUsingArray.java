/**
 * Java_00002 Definition: Write a program to implement queue using array with enqueue, dequeue and display functions.
 *
 * Author: Nishchay Dixit
 * Creation Date: 1 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 1 April 2:33 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

// Core Logic
class Queue {

    // Global Variable for class Queue
    static final int SIZEOFQUEUE = 5;
    int front, rear;
    int[] queue = new int[SIZEOFQUEUE];

    // The user define constructor to initialize front and rear at object creation time.
    Queue() {
        front = -1;
        rear = -1;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function gets input value from user and Enqueue that value into Queue.
    */
    void enQueue() {
        if (front == 0 && rear == SIZEOFQUEUE - 1) {
            System.out.println("----------------------------------");
            System.out.println("Queue is Overflow");
        } else {
            System.out.println("----------------------------------");
            System.out.print("Enter Value: ");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            queue[++rear] = value;
            System.out.println(value + " Enqueued in Queue");
            if (front == -1) {
                front = 0;
            }
        }
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function pops a value from Queue and prints that value on screen.
    */
    void deQueue() {
        if (front == -1) {
            System.out.println("----------------------------------");
            System.out.println("Queue is Underflow");
        } else {
            System.out.println("----------------------------------");
            int value = queue[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                ++front;
            }
            System.out.println(value + " Dequeued from Queue");
        }
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function prints contents of Queue on screen in array format.
    */
    void display() {
        if (front == -1) {
            System.out.println("----------------------------------");
            System.out.println("Queue is Empty");
        } else {
            System.out.println("----------------------------------");
            //System.out.println(Arrays.toString(queue));
            int flag = 0;
            System.out.print("[");
            for (int i = front; i <= rear; i++) {
                if (flag != 0)
                    System.out.print(", ");
                flag = 1;
                System.out.print(queue[i]);
            }
            System.out.println("]");
        }
    }

}

// Driven Code
public class QueueUsingArray {
    public static void main(String[] args) {

        // create object of Queue class.
        Queue queue = new Queue();

        int choice = 0;

        while (choice != 4) {

            // Getting user choice to perform operation on Stack.
            System.out.println("----------------------------------");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> queue.enQueue();
                case 2 -> queue.deQueue();
                case 3 -> queue.display();
                case 4 -> System.out.println("Exiting...........");
                default -> System.out.println("Please Enter The Appropriate Choice...");
            }
        }
    }
}
