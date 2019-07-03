/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springforwardfallback;

/**
 *
 * @author Qube
 */
public class SpringForwardFallBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // start from 0 and stops after 9
        System.out.println("It's Spring...!");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + ", ");
        }

        // starts from 10 and stops before 0
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }

}
