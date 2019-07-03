/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doordonot;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class DoOrDoNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;
        
        // this prints out that it did it when you tell it to and when you tell it not to because it runs at least once
        do {
            iDidIt = true;
            break;
        } while (doIt);
        
        // this will not run when you tell it n because it does not execute when told not to only when told to does it run
//        while (doIt) {
//            iDidIt = true;
//            break;
//        }
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }

}
