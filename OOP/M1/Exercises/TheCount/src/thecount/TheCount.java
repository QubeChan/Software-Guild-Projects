/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecount;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class TheCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputStart, inputEnd, inputIncrement, laughCounter = 3;

        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.println("Start at: ");
        inputStart = Integer.parseInt(input.nextLine());
        System.out.println("Stop at: ");
        inputEnd = Integer.parseInt(input.nextLine());
        System.out.println("Count by: ");
        inputIncrement = Integer.parseInt(input.nextLine());

        for (int i = inputStart; i < inputEnd; i += inputIncrement) {
            System.out.print(i);
            if (laughCounter > 1) {
                System.out.print(" ");
                laughCounter--;
            } else {
                System.out.println(" - Ah ah ah!");
                laughCounter = 3;
            }
        }
    }

}
