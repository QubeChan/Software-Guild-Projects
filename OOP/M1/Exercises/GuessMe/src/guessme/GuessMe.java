/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessme;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class GuessMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = new Random().nextInt(10) + 1,
                guess;

        Scanner input = new Scanner(System.in);

        System.out.println("I've chosen a number between 1 to 10. Betcha can't guess it!");
        guess = Integer.parseInt(input.nextLine());

        if (num == guess) {
            System.out.println("Wow, nice guess!");
        } else if (guess < num) {
            System.out.println("Ha, nice try - too low! I chose " + num);
        } else if (guess > num) {
            System.out.println("Too bad, way too high. I chose " + num);
        } else {
            System.out.println("This shouldn't happen!");
        }
    }

}
