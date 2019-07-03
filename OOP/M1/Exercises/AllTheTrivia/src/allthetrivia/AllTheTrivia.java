/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allthetrivia;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class AllTheTrivia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String q1, q2, q3;
        Scanner input = new Scanner(System.in);

        System.out.println("What kind of people live on Mars?");
        q1 = input.nextLine();
        System.out.println("Roses are red, Violets are blue, Programers love to? ");
        q2 = input.nextLine();
        System.out.println("Canada is located to the...");
        q3=input.nextLine();
        System.out.println(q3 + " live on Mars.");
        System.out.println("Programmers love to "+q1);
        System.out.println("Heading "+ q2 + " will lead us to Canada!");
    }

}
