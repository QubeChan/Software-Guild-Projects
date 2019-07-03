/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class RockPaperScissors {

    public String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String userInput = input.nextLine().trim().toLowerCase();

        while (!(userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors"))) {
            System.out.println("Excuse me good sir... That is neither a 'Rock', a 'Paper', or a 'Scissor'...");
            System.out.println("Pray tell sir, use a valid choice of 'Rock', 'Paper', or 'Scissors' ");
            userInput = input.nextLine().trim().toLowerCase();
        }

        return userInput;

    }

    // Displays who won the round of RPS
    public String playRPS() {
        int userChoice,
                compChoice = new Random().nextInt(3) + 1;
        String userInput;
        userInput = promptUser("Choose 'Rock', 'Paper', or 'Scissors").trim().toLowerCase();

        switch (userInput) {
            case "rock":
                userChoice = 1;
                if (userChoice == compChoice) {
                    System.out.println("User chose: 'Rock'");
                    System.out.println("Computer chose: 'Rock'");
                    System.out.println("Tie");
                    return "tie";
                } else if (userChoice == 1 && compChoice == 2) {
                    System.out.println("User chose: 'Rock'");
                    System.out.println("Computer chose: 'Paper'");
                    System.out.println("Computer Wins");
                    return "lose";
                } else if (userChoice == 1 && compChoice == 3) {
                    System.out.println("User chose: 'Rock'");
                    System.out.println("Computer chose: 'Scissors'");
                    System.out.println("User Wins");
                    return "win";
                }
                break;

            case "paper":
                userChoice = 2;
                if (userChoice == compChoice) {
                    System.out.println("User chose: 'Paper'");
                    System.out.println("Computer chose: 'Paper'");
                    System.out.println("Tie");
                    return "tie";
                } else if (userChoice == 2 && compChoice == 1) {
                    System.out.println("User chose: 'Paper'");
                    System.out.println("Computer chose: 'Rock'");
                    System.out.println("User Wins");
                    return "win";
                } else if (userChoice == 2 && compChoice == 3) {
                    System.out.println("User chose: 'Paper'");
                    System.out.println("Computer chose: 'Scissors'");
                    System.out.println("Computer Wins");
                    return "lose";
                }
                break;

            case "scissors":
                userChoice = 3;
                if (userChoice == compChoice) {
                    System.out.println("User chose: 'Scissors'");
                    System.out.println("Computer chose: 'Scissors'");
                    System.out.println("Tie");
                    return "tie";
                } else if (userChoice == 3 && compChoice == 2) {
                    System.out.println("User chose: 'Scissors'");
                    System.out.println("Computer chose: 'Paper'");
                    System.out.println("User Wins");
                    return "win";
                } else if (userChoice == 3 && compChoice == 1) {
                    System.out.println("User chose: 'Scissors'");
                    System.out.println("Computer chose: 'Rock'");
                    System.out.println("Computer Wins");
                    return "lose";
                }
                break;

            default:
                System.out.println("My word!");
                playRPS();
                return easterEgg();
        }
        return null;
    }

    public void displayWinner(int numRound, int winCount, int loseCount, int tieCount) {
        System.out.println("Here's the results at the end of " + numRound + " round(s)!!!");
        System.out.println("Times won: " + winCount);
        System.out.println("Times loss: " + loseCount);
        System.out.println("Times tie: " + tieCount);

        if (winCount > loseCount) {
            System.out.println("Overall Winner: Player!");
            System.out.println("Wow! You beat the Computer! Sugoi!");
        } else if (winCount < loseCount) {
            System.out.println("Overall Winner: Computer!");
            System.out.println("The Computer beat you...");
            System.out.println("Better luck next time!");
        } else {
            System.out.println("There was no winner this time...");
            System.out.println("At least there were no losers!");
        }
    }

    public void promptPlayAgain() {
        Scanner input = new Scanner(System.in);
        String rematch;

        System.out.println("Play again? y/n");
        rematch = input.nextLine().trim().toLowerCase();
        if (rematch.equals("y")) {
            System.out.println("");
            letsPlayAGame();
        } else if (rematch.equals("n")) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("Invalid! Comon choose something valid!");
            promptPlayAgain();
        }
    }

    // Randall's little easteregg
    public String easterEgg() {
        return "This should never ever happen Randall!";
    }

    public void letsPlayAGame() {
        Scanner input = new Scanner(System.in);
        boolean cannotContinue = true;
        // this string[] will keep track of win and lose rates
        String[] results;
        int numRound,
                tieCount = 0,
                winCount = 0,
                loseCount = 0;

        System.out.println("We're going to play a game of Rock Paper Scissors!");
        System.out.println("How many rounds do you want to play? Please input a range between 1-10!");

        // while loop prompts the user for a valid response, if invalid continue the loop, if valid continues on with the program
        while (cannotContinue) {
            try {
                numRound = Integer.parseInt(input.nextLine().trim());

                if (numRound > 10 || numRound < 1) {
                    System.out.println("Excuse me good sir... I believe you chose a number not within my range try again!");
                } else {
                    cannotContinue = false;
                    results = new String[numRound];

                    System.out.println("You want to play " + numRound + " round(s)!\n");
                    // for loop the until it reaches the number of rounds the user chose
                    for (int i = 0; i < results.length; i++) {
                        results[i] = playRPS();
                        System.out.println("You " + results[i] + " round " + (i + 1 + "\n"));
                    }

                    // Need to make a method for this
                    for (int i = 0; i < results.length; i++) {
                        switch (results[i]) {
                            case "win":
                                winCount++;
                                break;
                            case "lose":
                                loseCount++;
                                break;
                            case "tie":
                                tieCount++;
                                break;
                            default:
                                System.out.println(easterEgg());
                                break;
                        }
                    }

                    displayWinner(numRound, winCount, loseCount, tieCount);
                    System.out.println("");
                    promptPlayAgain();

                }
            } catch (NumberFormatException nFE) {
                System.out.println("Excuse me good sir... I believe you chose a number not within my range try again!");
            }
        }
    }
}
