/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interestcalculator;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class InterestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        interestCalculator();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        displayMessage(message);
        String userInput = input.nextLine();
//        input.close();
        return userInput;
    }

    public static float quarterlyInterestRate(float principal, float interestQuarterly) {
        return principal * (1 + interestQuarterly);
    }

    public static void interestCalculator() {
        int years;
        float principal;
        float beginPrincipal;
        float interestAnnually = 0.10f;
        float interestQuarterly = interestAnnually / 4;

        years = Integer.parseInt(promptUser("How many years do you plan to invest?"));
        principal = Float.parseFloat(promptUser("How much money do you have to invest?"));
        beginPrincipal = principal;
        displayMessage("John has " + principal + " to invest for " + years + " year(s).");
        displayMessage("Sue's mutual fund plan pays " + (interestAnnually * 100) + "% interest annually, compounded quarterly.");
        principal = quarterlyInterestRate(principal, interestQuarterly);
        displayMessage("First principal " + principal);
    }

}
