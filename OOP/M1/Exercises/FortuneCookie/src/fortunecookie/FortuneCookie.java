/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunecookie;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class FortuneCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10);
        String fortune = "Your Geek Fortune: ";

        switch (randomNum) {
            case 0:
                System.out.println(fortune + "Those are't the droids you're looking for.");
                break;
            case 1:
                System.out.println(fortune + "Never go in against a Sicilian when death is on the line!");
                break;
            case 2:
                System.out.println(fortune + "Goonies never say die.");
                break;
            case 3:
                System.out.println(fortune + "With great power, there must also come — great responsibility");
                break;
            case 4:
                System.out.println(fortune + "Never argue with the data.");
                break;
            case 5:
                System.out.println(fortune + "Try not. Do, or do not. There is no try.");
                break;
            case 6:
                System.out.println(fortune + "You are a leaf on the wind; watch how you soar.");
                break;
            case 7:
                System.out.println(fortune + "Do absolutely nothing, and it will be everything that you thought it could be.");
                break;
            case 8:
                System.out.println(fortune + "Kneel before Zod.");
                break;
            case 9:
                System.out.println(fortune + "Make it so.");
                break;
            default:
                System.out.println("You must have screwed up the logic on the random number generator!");
                break;
        }
    }

}
