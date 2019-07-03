/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitawhile;

/**
 *
 * @author Qube
 */
public class WaitAWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // changing bedTime to 11 will print up to 11 and changing timeNow to 11 will cause you to automatically go to bed
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            // If you comment out timeNow++ you get an infinite loop
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }

}
