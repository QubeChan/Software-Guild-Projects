/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twoforsandtenyearsago;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class TwoForsAndTenYearsAgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();
        
        // both ways are clear to me
        // starts from 0 and increments until 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        // starts from 10 and decrements until 0
        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 20; i--) {
            System.out.println((year - i) + " years ago would be " + i);
        }
    }

}
