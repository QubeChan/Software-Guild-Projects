/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectinstantiation;

/**
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double myPi = Adder.PI;
        
        int sum = Adder.add(5, 4);
        System.out.println("The sum is " + sum);
    }

}
