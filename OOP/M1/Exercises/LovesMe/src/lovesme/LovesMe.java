/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovesme;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class LovesMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int petals;
        
        System.out.println("Hey I see you have a daisy how many petals does it have?");
        petals = Integer.parseInt(input.nextLine());
        System.out.println("Well here goes nothing...");
        
        // I used a do while because I wanted to practice more with do while loops
        do {
            if (petals % 2 == 0) {
                System.out.println("It loves me NOT!");
            } else if (petals % 2 == 1) {
                System.out.println("It LOVES me!");
            }
            petals--;
        } while (petals != 0);
        System.out.println("I knew it! It LOVES ME!");
    }
    
}
