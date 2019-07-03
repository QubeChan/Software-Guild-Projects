/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessmemore;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class GuessMeMore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = new Random().nextInt(201) -100;

        Scanner input = new Scanner(System.in);

        System.out.println("I've chosen a number between -100 to 100. Betcha can't guess it!");
        int guess = Integer.parseInt(input.nextLine());
        
        while (guess != num) { 
            
            if (num == guess) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (guess < num) {
                System.out.println("Ha, nice try - too low! Try again!"+num);
            } else if (guess > num) {
                System.out.println("Too bad, way too high. Try again!");
            } else {
                System.out.println("This shouldn't happen!");
            }
        }
    }

}
