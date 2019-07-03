/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacerustlers;

/**
 *
 * @author Qube
 */
public class SpaceRustlers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        // checks if aliens is greater than spaceships if it is run the code in the if otherwise run the else block
        if (aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        // first if checks if the cows are equal to spaceships else it'll check the second if cows is greater than spaceships otherwise run last block
        // if you remove the else from the else if the else if than the if becomes a seperate if statement to be checked and the else will only run for that if statement and not the one before it
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if (aliens > cows ) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if(cows > aliens){
            System.out.println("Oh no! The herds got restless and took over! Looks like_we're_hamburger now!!");
        }
    }

}
