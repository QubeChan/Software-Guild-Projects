/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldday;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class FieldDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("What's your last name?");
        name = input.nextLine().toLowerCase();
        if (name.compareTo("Baggins".toLowerCase()) <= 0) {
            System.out.println("You're on team 'Red Dragons'");
        } else if (name.compareTo("Dresden".toLowerCase()) <= 0) {
            System.out.println("Hey, you're on team 'Dark Wizards");
        } else if (name.compareTo("Howl".toLowerCase()) <= 0) {
            System.out.println("You're going to 'Moving Castles'");
        } else if (name.compareTo("Potter".toLowerCase()) <= 0) {
            System.out.println("You belong to the 'Golden Snitches'");
        } else if (name.compareTo("Vimes".toLowerCase()) <= 0) {
            System.out.println("Team 'Night Guards' you go!");
        } else {
            System.out.println("Aha! You're on the team 'Black Holes'!");
        }
        System.out.println("Good Luck in the games!");
    }

}
