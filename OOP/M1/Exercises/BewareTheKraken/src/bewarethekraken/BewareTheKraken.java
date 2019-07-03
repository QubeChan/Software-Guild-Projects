/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bewarethekraken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class BewareTheKraken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        // if we change the while condition to just true it'll run until we reach the condition in the if statement to break
        while (depthDivedInFt < 36200) {
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            int randomFish = rand.nextInt(3) + 1;

            // ensures no fish appears until we've dived more than 0 ft
            if (depthDivedInFt > 0) {
                switch (randomFish) {
                    case 1:
                        System.out.println("Ooo a beta fish appeared!");
                        break;
                    case 2:
                        System.out.println("Hey is that Nemo's dad?");
                        break;
                    case 3:
                        System.out.println("Dory is that you?");
                        break;
                    default:
                        System.out.println("How did you spawn the kraken?");
                        break;
                }

            }
            
            // checks depth and breaks out of the loop
            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            System.out.println("Want to keep swimming? (y/n)");
            String userInput = input.nextLine();

            if (userInput.equals("y")) {
                // I can swim, really fast! 500ft at a time!
                depthDivedInFt += 1000;
            } else if (userInput.equals("n")) {
                System.out.println("Let's book it!");
                break;
            }

        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }

}
