/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highroller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class HighRoller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random diceRoller = new Random();
        int diceSides;
        
        System.out.println("How many sides does the dice have?");
        diceSides = Integer.parseInt(input.nextLine());
        int rollResult = diceRoller.nextInt(diceSides) + 1;
        
        System.out.println("You have a dice with "+diceSides+" sides!");
        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        } else if (rollResult == diceSides) {
            System.out.println("You rolled a critical! Nice Job!");
        }
    }

}
