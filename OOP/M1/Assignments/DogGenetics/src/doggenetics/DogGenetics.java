/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doggenetics;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class DogGenetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;

        name = promptUser("What's your dog's name? ");
        dnaGenerator(name);
        System.out.println("\nWow, that's QUITE the dog!");

    }

    public static String promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }

    public static void dnaGenerator(String name) {
        String[] dogBreeds = {"Labrador", "Pitbull", "Great Dane", "Husky", "Retriever"};
        int[] results;

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n");
        System.out.println(name + " is:\n");

        results = generateDogDNA(dogBreeds.length);

        for (int i = 0; i < results.length; i++) {
            if (results[i] != 0) {
                System.out.println(results[i] + "% " + dogBreeds[i]);
            }
        }
    }

    public static int generatePercentage() {
        int rng = new Random().nextInt(101);
        return rng;
    }

    public static int[] generateDogDNA(int dogBreeds) {
        int percentageCount = 0;
        int overOneHundred;
        int[] dnaPercentages = new int[dogBreeds];

        for (int i = 0; i < dnaPercentages.length; i++) {
            if (percentageCount < 100) {
                dnaPercentages[i] = generatePercentage();
            } else if (percentageCount > 100) {
                overOneHundred = percentageCount - 100;
                dnaPercentages[i - 1] -= overOneHundred;
                percentageCount -= overOneHundred;
            }
            percentageCount += dnaPercentages[i];
        }
        
        if (percentageCount > 100) {
            overOneHundred = percentageCount - 100;
            dnaPercentages[dnaPercentages.length - 1] -= overOneHundred;
            percentageCount -= overOneHundred;

        } else if (percentageCount < 100) {
            overOneHundred = percentageCount - 100;
            dnaPercentages[dnaPercentages.length - 1] += overOneHundred;
            percentageCount += overOneHundred;

        }

        return dnaPercentages;
    }
}
