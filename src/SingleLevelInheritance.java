/**
 * Java_00005 Definition: Create a class Rect and have data member length and width and a method to find the area of the rectangle.
 * Create a subclass Cube from that add a member height to it and create a method to find the volume of the
 * Cube from that.
 *
 * Author: Nishchay Dixit
 * Creation Date: 14 April 2022
 */

/*
MODIFICATION HISTORY

Modified on 14 April 6:00 by Nishchay Dixit [Written core program]
*/

import java.util.Scanner;

//Core Logic
class Rect {
    int length, width;

    //Parameterize Constructor to initialize variables
    Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: integer
    This function returns area of rectangle
    */
    public int areaRect() {
        return (length * width);
    }
}

class Cube extends Rect {
    int height;

    //Parameterize Constructor to initialize variables
    Cube(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    /*
    Function prototype:
    INPUT PARAMETERS: none
    RETURN TYPE: none
    This function returns volume of Cube. inheritance
    */
    public void volumeCube() {
        System.out.println("Volume Of Cube: " + (length * height * width));
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get values of height, weight and length form user
        System.out.print("Enter Length: ");
        int length = scanner.nextInt();
        System.out.print("Enter Width: ");
        int width = scanner.nextInt();
        System.out.print("Enter Height: ");
        int height = scanner.nextInt();

        //Object creation of Rect class with Parameterize Constructor
        Rect rect = new Rect(length, width);

        //Object Creation of Cube class with Parameterize Constructor
        Cube cube = new Cube(length, width, height);

        System.out.println("Area Of Rectangle: " + rect.areaRect()); //Function call of Rect Class

        //Function call of Cube class
        cube.volumeCube();
    }
}
