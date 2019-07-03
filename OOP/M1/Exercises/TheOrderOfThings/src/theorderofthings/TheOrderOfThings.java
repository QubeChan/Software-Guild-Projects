/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theorderofthings;

/**
 *
 * @author Qube
 */
public class TheOrderOfThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "BRIGHT yellow";
        origin = "AlphaCentaurian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings, doesn't add it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color + " "
                + origin + " " + material + " " + purpose + " " + noun);

        System.out.println("I am not born during the year of the " + noun + ". I cannot fit into a size " + size + ". However I do like the color " + color + ".");

    }

}
