/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maybeitlovesme;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class MaybeItLovesMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int petals = new Random().nextInt(76) + 13;

        System.out.println("Hey I see you have a daisy how many petals does it have?");

        System.out.println("Well here goes nothing...");

        // I didn't want a bad outcome so I made it so it will always print out a happy ending
        do {
            if (petals % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else if (petals % 2 == 1) {
                System.out.println("It LOVES me!");
            }
            petals--;
        } while (petals != 0);
        System.out.println("I knew it! It LOVES ME!");
    }

}
