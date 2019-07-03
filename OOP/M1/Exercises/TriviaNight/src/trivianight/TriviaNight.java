/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivianight;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class TriviaNight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q1,
                q2,
                q3,
                a1 = 4,
                a2 = 2,
                a3 = 3,
                correct = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("It's TRIVIA NIGHT! Are you read?!");
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1)Source Code");
        System.out.println("2)Assembly");
        System.out.println("3)C#");
        System.out.println("4)Machine Code");
        q1 = Integer.parseInt(input.nextLine());
        System.out.println("YOUR ANSWER: " + q1);

        System.out.println("Second QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1)Source Code");
        System.out.println("2)Assembly");
        System.out.println("3)C#");
        System.out.println("4)Machine Code");
        q2 = Integer.parseInt(input.nextLine());
        System.out.println("YOUR ANSWER: " + q2);

        System.out.println("Third QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1)Source Code");
        System.out.println("2)Assembly");
        System.out.println("3)C#");
        System.out.println("4)Machine Code");
        q3 = Integer.parseInt(input.nextLine());
        System.out.println("YOUR ANSWER: " + q3);

        if (q1 == a1) {
            correct++;
        }
        if (q2 == a2) {
            correct++;
        }
        if (q3 == a3) {
            correct++;
        }
        if (correct == 0) {
            System.out.println("You've got nothing right, you suck!");
        } else if (correct == 3) {
            System.out.println("Everything is awesome! Everything is correct");
        } else {
            System.out.println("You got " + correct + " correct!");
        }
    }

}
