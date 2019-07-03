/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggerbetteradder;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class BiggerBetterAdder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int age, height, quirk, sum;
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("How old are you?");
        age = Integer.parseInt(input.nextLine());
        System.out.println("How tall are you? In centimeters");
        height = Integer.parseInt(input.nextLine());
        System.out.println("How many quirks or abilities do you have?");
        quirk = Integer.parseInt(input.nextLine());

        sum = age + height + quirk;
        System.out.println("So your name is " + name + ".");
        System.out.println("You're " + age + " years old.");
        System.out.println("You're " + height + " cm high.");
        System.out.println("And you have " + quirk + " quirks!");
        System.out.println("Did you know if you add your age, height, and quirk together you get " + sum + "!");

    }

}
