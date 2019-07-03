/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimadlibs;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class MiniMadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1,
                a1,
                n2,
                a2,
                pn1,
                pn2,
                pn3,
                vPresent,
                vPast;
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Mad Libs");

        System.out.println("I need a noun:");
        n1 = input.nextLine();
        System.out.println("Now an adj:");
        a1 = input.nextLine();
        System.out.println("Another noun:");
        n2 = input.nextLine();
        System.out.println("And a number:");
        num = Integer.parseInt(input.nextLine());
        System.out.println("Another adj:");
        a2 = input.nextLine();
        System.out.println("A plural noun:");
        pn1 = input.nextLine();
        System.out.println("Another one:");
        pn2 = input.nextLine();
        System.out.println("One more:");
        pn3 = input.nextLine();
        System.out.println("A verb (present tense):");
        vPresent = input.nextLine();
        System.out.println("Same verb (past tense):");
        vPast = input.nextLine();

        System.out.println(String.format("%s: the %s frontier. These are the voyages of the starship %s. It's %d-year mission: to explore strange %s %s to seek out %s %s and %s %s, to boldly %s where no one has %s before", n1, a1, n2, num, a2, pn1, a2, pn2, a2, pn3, vPresent, vPast));
    }

}
