/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthyhearts;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class HealthyHearts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age, heartRate;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");
        age = Integer.parseInt(input.nextLine());
        heartRate = 220 - age;
        System.out.println("Your age should be " + heartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + (heartRate * .5) + " - " + (heartRate * .85) + " beats per minute");
    }

}
