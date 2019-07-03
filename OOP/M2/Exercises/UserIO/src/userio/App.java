/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userio;

/**
 *
 * @author Qube
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test to see if my code works
        UserIOImp userIO = new UserIOImp();
        userIO.print("The returned value is " + userIO.readInt("Please enter an integer"));
        userIO.print("The returned value is " + userIO.readInt("Please enter an integer between " + 1 + " and " + 10, 1, 10));
        userIO.print("The returned value is " + userIO.readString("Please enter a string"));
        userIO.print("The returned value is " + userIO.readFloat("Please enter a float"));
        userIO.print("The returned value is " + userIO.readFloat("Please enter a float between " + 1 + " and " + 10, 1, 10));
        userIO.print("The returned value is " + userIO.readDouble("Please enter a double"));
        userIO.print("The returned value is " + userIO.readDouble("Please enter a double between " + 1 + " and " + 10, 1, 10));
        userIO.print("Thanks for testing me out");
    }

}
