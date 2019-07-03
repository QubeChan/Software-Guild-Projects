/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knockknock;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class KnockKnock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine().toLowerCase();
        
        // if you change .equals to == it'll go run the else block
        if (nameGuess.equals("Marty McFly".toLowerCase())) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }

}
