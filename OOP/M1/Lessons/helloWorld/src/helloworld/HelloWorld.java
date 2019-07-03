/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Hello World, My name is Jason");
        String myHero = "Goku";
        int level = 0;
        int maxHP = r.nextInt(50 - 1) + 1;
        int currentHP = maxHP;

        System.out.println("What is your name Hero?");
        myHero = myScanner.nextLine();

        System.out.println("Your hero name is: " + myHero);
        System.out.println(currentHP + "/" + maxHP);

        int numSteps = 0;
        int numFloors = 0;
        int gold = 10;
        while (currentHP > 0) {
            // Play the game
            for (int i = 0; i < 10; i++) {
                numSteps++;
                if (r.nextBoolean()) {
                    System.out.println("You've enncountered a goblin");
                    currentHP -= 2;
                    if (currentHP <= 0) {
                        break;
                    }
                    gold += 3;
                }
            }
            if (numSteps % 10 == 0 && currentHP > 0) {
                System.out.println("You've cleared " + ++numFloors);
            }
        }
        System.out.println("You have Died!");
        System.out.println("You've reached floor " + numFloors);
        System.out.println("You've taken " + numSteps + "steps");
        System.out.println("You've obtained " + gold + " gold");

//        String p1 = "bob";
//        String p2 = "sally";
//        String p3 = p1;
//
//        switch (p1) {
//            case "bob":
//                // do this
//                break;
//
//            case "sally":
//                // do something else
//                break;
//
//            default:
//                // do something if nothing else matches
//                break;
//        }
//
//        if (p1 == p2) {
//            //do this
//        } else if (p1 == p3) {
//            // do something else
//        } else {
//            // do this
//        }
//
//        // do while will always run at least once
//        do {
//            System.out.println(myHero + " punches something " + level++);
//        } while (level < 10);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(myHero + " punches something " + level++);
//        }
//
//        while (level < 10) {
//            System.out.println(myHero + " punches something " + level++);
//        }
//
    }

}
