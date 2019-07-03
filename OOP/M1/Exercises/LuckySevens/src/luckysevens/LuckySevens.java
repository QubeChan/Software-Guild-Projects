/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class LuckySevens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playLuckySevens();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        displayMessage(message);
        String userInput = input.nextLine();
        input.close();
        return userInput;
    }

    public static int rollDice() {
        int dieOne = new Random().nextInt(6) + 1;
        int dieTwo = new Random().nextInt(6) + 1;
        return dieOne + dieTwo;
    }

    public static int winOrLoseAmount() {
        int amountWonOrLoss = 0;
        int diceRolled = rollDice();
        if (diceRolled == 7) {
            amountWonOrLoss += 4;
        } else {
            amountWonOrLoss -= 1;
        }
        return amountWonOrLoss;
    }

    public static int updateRollCount(int rollCount) {
        rollCount++;
        return rollCount;
    }

    public static int updateMaxBalance(int balance, int maxBalance) {
        if (balance > maxBalance) {
            maxBalance = balance;
        }
        return maxBalance;
    }

    public static int updateRollAtMaxBalance(int rollCount, int rollAtMaxBalance, int balance, int maxBalance) {
        if (balance > maxBalance) {
            rollAtMaxBalance = rollCount;
        }
        return rollAtMaxBalance;
    }

    public static void playLuckySevens() {
        int rollCount = 0;
        int balance;
        int maxBalance = 0;
        int rollAtMaxBalance = 0;

        balance = Integer.parseInt(promptUser("How many dollars do you have to bet?"));

        while (balance > 0) {
            rollCount = updateRollCount(rollCount);
            balance += winOrLoseAmount();
            rollAtMaxBalance = updateRollAtMaxBalance(rollCount, rollAtMaxBalance, balance, maxBalance);
            maxBalance = updateMaxBalance(balance, maxBalance);
        }

        displayMessage("You went broke after " + rollCount + " rolls.");
        displayMessage("You should have quit after " + rollAtMaxBalance + " rolls when you had $" + maxBalance + ".");
    }

}
