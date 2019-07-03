/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourlifeinmovies;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class YourLifeInMovies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        int year;
        Scanner input = new Scanner(System.in);

        System.out.println("Hey, let's play a game! What's your name?");
        name = input.nextLine();
        System.out.println("Ok, " + name + " when were you born?");
        year = Integer.parseInt(input.nextLine());
        System.out.println("Well " + name + "...");

        if (year < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out half a decade ago.");
        }
        if (year < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
        if (year < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
        if (year < 1975) {
            System.out.println("Oh man, did you know Jurassic Park release is closer to the date of the first lunar landing than it is today!");
        }
        if (year < 1965) {
            System.out.println("MASH TV series has been around for almost half a century!");
        }
    }

}
