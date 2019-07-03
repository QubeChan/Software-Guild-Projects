/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowmaster;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class WindowMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declared but have not initialized height width area and perimeter to be a type float
        float height, width, area, perimeter, costOfReplacement;
        float glass = 3.5f;
        float trim = 2.25f;

        // declare a Scanner object called scan which scans the user's input
        Scanner scan = new Scanner(System.in);

//        // prompt user for the height
//        System.out.println("How many feet is the height of the window?");
//        // declares a variable of data type float called height and initialize it to the user's input by converting the string to a float
//        height = Float.parseFloat(scan.nextLine());
//        // prompt user for the width
//        System.out.println("How many feet is the width of the window?");
//        // // declares a variable of data type float called width and initialize it to the user's input by converting the string to a float
//        width = Float.parseFloat(scan.nextLine());

        height = readValue("How many feet is the height of the window?");
        width = readValue("How many feet is the width of the window?");
        
        // calculates the area
        area = height * width;
        // calculates the perimeter
        perimeter = 2 * (width + height);
        // calculates the cost for the glass and trim combined
        costOfReplacement = area * glass + perimeter * trim;

        System.out.println("Window height " + height + " feet");
        System.out.println("Window width " + width + " feet");
        System.out.println("The area of the window is " + area + " feet");
        System.out.println("The perimeter of the window is " + perimeter + " feet");
        System.out.println("The total cost of the window will be $" + costOfReplacement);
    }

    // method takes in a String prompt and returns a float
    public static float readValue(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return Float.parseFloat(input.nextLine());
    }

}
