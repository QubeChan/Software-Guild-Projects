/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorizor;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class Factorizor {

    public String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String userInput = input.nextLine();
        input.close();
        return userInput;
    }

    public void displayFactorials(int factorNum) {
        for (int i = 1; i < factorNum; i++) {
            if (factorNum % i == 0) {
                System.out.println(i);
            }
        }
    }

    public void displayPerfectNumber(int factorNum) {
        int perfectNumber = 0;
        for (int i = 1; i < factorNum; i++) {
            if (factorNum % i == 0) {
                perfectNumber += i;
            }
        }
        if (perfectNumber == factorNum) {
            System.out.println(factorNum + " is a perfect number.");
        } else {
            System.out.println(factorNum + " is not a perfect number.");
        }
    }

    public void displayPrimeNumber(int factorNum) {
        int primeNumber = 0;
        for (int i = 1; i < factorNum; i++) {
            if (factorNum % i == 0) {
                primeNumber++;
            }
        }
        if (primeNumber > 2) {
            System.out.println(factorNum + " is not a prime number.");
        } else {
            System.out.println(factorNum + " is a prime number.");
        }
    }
}
