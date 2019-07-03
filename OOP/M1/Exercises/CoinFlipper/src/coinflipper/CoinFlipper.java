/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinflipper;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class CoinFlipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean headsOrTails = new Random().nextBoolean();

        System.out.println("Ready, Set, Flip...!");
        if (headsOrTails) {
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
    }

}
