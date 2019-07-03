/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortimes;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class ForTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which times table shall I recite?");
        int userInput = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + userInput + " is: " + i * userInput);
        }
    }

}
