/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortimesfor;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class ForTimesFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput, userAnswer, answer, correctCounter = 0;

        System.out.println("Which times table shall I recite?");
        userInput = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= 15; i++) {
            answer = i * userInput;
            System.out.println(i + " * " + userInput + " is: ");
            userAnswer = Integer.parseInt(input.nextLine());
            if (userAnswer == answer) {
                System.out.println("Correct!");
                correctCounter++;
            } else {
                System.out.println("Sorry no, the answer is: " + answer);
            }
        }
        System.out.println("You got " + correctCounter + " correct.");
        if (correctCounter < (.5 * 15)) {
            System.out.println("You should study more");
        } else if (correctCounter > (.9 * 15)) {
            System.out.println("Great job!");
        }
    }

}
