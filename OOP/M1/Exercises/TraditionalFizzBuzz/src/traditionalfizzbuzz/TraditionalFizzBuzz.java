/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traditionalfizzbuzz;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class TraditionalFizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isUserInput = true;
        int counter = 0;

        System.out.println("How much units fizzing and buzzing do you need in your life?");
        int userInput = Integer.parseInt(input.nextLine());
        for (int i = 0; isUserInput; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                System.out.println("fizz buzz");
                counter++;
            } else if (i % 3 == 0 && i != 0) {
                System.out.println("fizz");
                counter++;
            } else if (i % 5 == 0 && i != 0) {
                System.out.println("buzz");
                counter++;
            } else {
                System.out.println(i);
            }

            if (counter == userInput) {
                System.out.println("TRADITION!!!!!");
                isUserInput = false;
            }
        }
    }

}
