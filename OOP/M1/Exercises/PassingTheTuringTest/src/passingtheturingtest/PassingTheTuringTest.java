/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingtheturingtest;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class PassingTheTuringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name,
                chopper = "Tony Tony Chopper",
                color,
                favoriteFood;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Hi There! What's your name?");
        name = input.nextLine();
        System.out.println("Howdy there " + name + " my name is " + chopper + "! What's your favorite color?");
        color = input.nextLine();
        System.out.println("You like "+color+"? Mine is cotton candy pink.");
        System.out.println("Speaking of cotton candy it's my favorite food! How about you?");
        favoriteFood=input.nextLine();
        System.out.println("You like "+favoriteFood+"? BLEH I'm cotton candy all the way. How about your favorite number?");
        num = Integer.parseInt(input.nextLine());
        System.out.println(num+" is cool. Mine is 9 for the current number of people in my crew!");
        System.out.println("Well that's all I needed to know. Nami thanks you for giving me all this info!");
        System.out.println("Time to go to the bank she says!");

    }

}
