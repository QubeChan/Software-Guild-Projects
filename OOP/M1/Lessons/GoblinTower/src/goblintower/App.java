/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goblintower;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero myHero = new Hero("Goku");
        Goblin goblin = new Goblin();

        while (!goblin.isDead() && myHero.getCurrentHP() > 0) {
            myHero.hit(goblin);
            if (goblin.isDead()) {
                break;
            }
        }

        Scanner myScanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Hello World, My name is Randall");
        int lvl = 0;
        int maxHP = r.nextInt(50 - 1) + 1;
        int currentHP = maxHP;
//        String someVariable = null;
//        
//        if (someVariable.contains("blah")) {
//            System.out.println("");
//        }

        String[] potionNames = new String[5];

        for (int i = 0; i < potionNames.length; i++) {
            if (potionNames[i] == null) {
                System.out.println(potionNames[i]);
            }
        }

        int[] potions = new int[5];
        potions[0] = 5;
        potions[1] = 5;
        potions[2] = 5;
        potions[3] = 5;
        potions[4] = 5;

        for (int i = 0; i < potions.length; i++) {
            System.out.println("You have " + potions[i] + "potion in slot " + i);
        }

        int choice = 0;
        do {
            System.out.println("Choose a difficulty:");
            System.out.println("1.) Easy");
            System.out.println("2.) Normal");
            System.out.println("3.) Hard");
            String input = myScanner.nextLine();
            choice = Integer.parseInt(input);
        } while (choice < 1 || choice > 3);

        System.out.println("What is your name Hero?");
        myHero = myScanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("You have chosen easy difficulty!");
                break;
            case 2:
                System.out.println("You have chosen normal difficulty!");
                break;
            case 3:
                System.out.println("You have chosen hard difficulty!");
                break;
        }

        myHero = PromptUser("What is your name Hero?");

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
                    System.out.println("You've encounter a goblin");
                    currentHP -= 2;
                    if (currentHP <= 0) {
                        break;
                    }
                    gold += 3;
                }
            }
            if (currentHP > 0 && numSteps % 10 == 0) {

                System.out.println("You've cleared " + ++numFloors);

            }
        }
        System.out.println("You have Died!");
        System.out.println("You've reached floor " + numFloors);
        System.out.println("You've taken " + numSteps + "steps");
    }

    public static String PromptUser(String message) {
        String result = "";
        DisplayMessage(message);
        Scanner sc = new Scanner(System.in);
        result = sc.nextLine();
        sc.close();
        return result;
    }

    public static int PromptUser(String message, int min, int max) {

        // Recursion way
        String userInput = PromptUser(message);
        int result = Integer.parseInt(userInput);
        if (result < min || result > max) {
            System.out.println("Input is outside of the range");
            return PromptUser(message, min, max);
        }
        return result;

//        // Not recursion way
//        boolean isValid = false;
//        int result = 0;
//        while (isValid == false) {
//            String userInput = PromptUser(message);
//            result = Integer.parseInt(userInput);
//            if (result < min || result > max) {
//                System.out.println("Input is outside of the range");
//            } else{
//                isValid = true;
//            }
//        }
//        return result;
    }

    public static void DisplayMessage(String message) {
        System.out.println(message);
    }
}
