/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthyhearts;

import java.util.Random;
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
        int age;
        int[] results;
        age = Integer.parseInt(promptUser("What is your age?"));
        results = evaluateHeartRate(age);
        displayMessage("Your maximum heart rate should be " + results[0] + " beats per minute");
        displayMessage("Your target HR Zone is " + results[1] + " - " + results[2] + " beats per minute");

    }

    public static String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        displayMessage(message);
        return input.nextLine();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static int[] evaluateHeartRate(int age) {
        int maxHR = 220 - age;
        int minTargetHR = (int) (maxHR * .5);
        int maxTargetHR = (int) (maxHR * .85);
        int[] results = {maxHR, minTargetHR, maxTargetHR};
        return results;
    }
}
