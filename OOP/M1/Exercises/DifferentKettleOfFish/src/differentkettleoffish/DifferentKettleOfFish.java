/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differentkettleoffish;

/**
 *
 * @author Qube
 */
public class DifferentKettleOfFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // we throw the fish in as initializer and the increment in the for loop
        for (int fish = 1; fish < 10; fish++) {
            if (fish == 3) {
                System.out.println("RED fish!");
            } else if (fish == 4) {
                System.out.println("BLUE fish!");
            } else {
                System.out.println(fish + " fish!");
            }

        }
    }

}
