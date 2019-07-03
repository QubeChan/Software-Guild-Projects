/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainMenu();

    }

    public static String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    public static void mainMenu() {
        SimpleCalculator sc = new SimpleCalculator();
        Scanner input = new Scanner(System.in);
        int userInput;
        double num1,
                num2,
                result;
        boolean runCalc = true;

        displayMessage("Welcome to Qube's Simple Calculator!");
        do {
            displayMessage("Please choose one of the following options:");
            displayMessage("1) Add");
            displayMessage("2) Subtract");
            displayMessage("3) Multiply");
            displayMessage("4) Divide");
            displayMessage("5) Exit");

            userInput = Integer.parseInt(input.nextLine());

            switch (userInput) {
                case 1:
                    num1 = Double.parseDouble(promptUser("Enter the first number:"));
                    num2 = Double.parseDouble(promptUser("Enter the second number:"));
                    result = sc.add(num1, num2);
                    displayMessage("The sum of " + num1 + " and " + num2 + " is " + result);
                    break;
                case 2:
                    num1 = Double.parseDouble(promptUser("Enter the first number:"));
                    num2 = Double.parseDouble(promptUser("Enter the second number:"));
                    result = sc.subtract(num1, num2);
                    displayMessage("The subtraction of " + num1 + " and " + num2 + " is " + result);
                    break;
                case 3:
                    num1 = Double.parseDouble(promptUser("Enter the first number:"));
                    num2 = Double.parseDouble(promptUser("Enter the second number:"));
                    result = sc.multiply(num1, num2);
                    displayMessage("The multiplication of " + num1 + " and " + num2 + " is " + result);
                    break;
                case 4:
                    num1 = Double.parseDouble(promptUser("Enter the first number:"));
                    num2 = Double.parseDouble(promptUser("Enter the second number:"));
                    result = sc.divide(num1, num2);
                    displayMessage("The division of " + num1 + " and " + num2 + " is " + result);
                    break;
                case 5:
                    terminateProgram();
                    runCalc = false;
                    break;
                default:
                    displayMessage("Let's follow instructions...");
            }
        } while (runCalc);
    }

    public static void terminateProgram() {
        System.out.println("Thanks for using Qube's Simple Calculator");
    }
}
