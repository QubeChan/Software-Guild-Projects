/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorizor;

/**
 * 11
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorNum;
        Factorizor factorize = new Factorizor();

        factorNum = Integer.parseInt(factorize.promptUser("What number would you like to factor?"));
        System.out.println("The factors of " + factorNum + " are:");
        factorize.displayFactorials(factorNum);
        factorize.displayPerfectNumber(factorNum);
        factorize.displayPrimeNumber(factorNum);
    }

}
