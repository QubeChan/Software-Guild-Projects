/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doitbetter;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class DoItBetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float miles;
        int hotdogs, languages;
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles can you run?");
        miles = Float.parseFloat(input.nextLine());
        System.out.println("Oh really? I can run " + (miles * 2 + 1) + " miles.");
        System.out.println("How many hotdogs can you eat?");
        hotdogs = Integer.parseInt(input.nextLine());
        System.out.println("Really that's impressive... but I can eat " + (hotdogs * 2 + 1) + " hotdogs.");
        System.out.println("How many languages do you know?");
        languages = Integer.parseInt(input.nextLine());
        System.out.println("So you can speak " + languages + " languages I myself speak " + (languages * 2 + 1) + " languages.");
    }

}
