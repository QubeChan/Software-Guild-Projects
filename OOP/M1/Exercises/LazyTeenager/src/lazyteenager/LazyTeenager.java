/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lazyteenager;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class LazyTeenager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isClean = false;
        int tellCounter = 1;
        int cleanRNG = new Random().nextInt(100) + 1;

        do {

            if (cleanRNG >= 100) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS!");
                break;
            } else if (tellCounter > 15) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else {
                System.out.println("Clean your room! (x" + tellCounter + ")");
                tellCounter++;
                cleanRNG += 5;
            }
        } while (isClean != true);
    }

}
