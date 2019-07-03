/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staypositive;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class StayPositive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int itemsPrinted;

        System.out.println("What number should I count down from?");
        userInput = Integer.parseInt(input.nextLine());
        System.out.println("Here goes!");

        while (userInput >= 0) {
            itemsPrinted = 10;
            while (itemsPrinted > 0) {
                if (userInput < 0) {
                    break;
                } else {
                    System.out.print(userInput + " ");
                    userInput--;
                    itemsPrinted--;
                }
            }
            System.out.println("");
        }
        System.out.println("Whew, better stop there...!");
    }

}
