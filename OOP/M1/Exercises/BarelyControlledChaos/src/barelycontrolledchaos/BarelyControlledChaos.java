/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barelycontrolledchaos;

import java.util.Random;

/**
 *
 * @author Qube
 */
public class BarelyControlledChaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color = randomizeColor();
        String animal = randomizeAnimal();
        String colorAgain = randomizeColor();
        int weight = randomizeNum(5, 200);
        int distance = randomizeNum(10, 20);
        int number = randomizeNum(10000, 20000);
        int time = randomizeNum(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String randomizeColor() {
        int randomNum = new Random().nextInt(5) + 1;
        String color = null;

        switch (randomNum) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "green";
                break;
            case 3:
                color = "blue";
                break;
            case 4:
                color = "pink";
                break;
            case 5:
                color = "purple";
                break;
        }
        return color;
    }

    public static String randomizeAnimal() {
        int randomNum = new Random().nextInt(5) + 1;
        String animal = null;

        switch (randomNum) {
            case 1:
                animal = "cat";
                break;
            case 2:
                animal = "dog";
                break;
            case 3:
                animal = "deer";
                break;
            case 4:
                animal = "koala";
                break;
            case 5:
                animal = "elephant";
                break;
        }
        return animal;
    }

    public static int randomizeNum(int min, int max) {
        return new Random().nextInt(max - min) + min;
    }
}
