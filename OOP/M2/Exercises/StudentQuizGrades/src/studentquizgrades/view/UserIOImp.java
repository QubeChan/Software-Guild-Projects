/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentquizgrades.view;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class UserIOImp implements UserIO {

    Scanner input = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        double userInput = Double.parseDouble(input.nextLine());
        return userInput;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double userInput = readDouble(prompt);

        if (userInput < min || userInput > max) {
            return readDouble("Please enter a new number between " + min + " and " + max, min, max);
        }
        return userInput;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        float userInput = Float.parseFloat(input.nextLine());
        return userInput;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float userInput = readFloat(prompt);

        if (userInput < min || userInput > max) {
            return readFloat("Please enter a new number between " + min + " and " + max, min, max);
        }
        return userInput;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        int userInput = Integer.parseInt(input.nextLine());
        return userInput;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int userInput = readInt(prompt);

        if (userInput < min || userInput > max) {
            return readInt("Please enter a new number between " + min + " and " + max, min, max);
        }
        return userInput;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        long userInput = Long.parseLong(input.nextLine());
        return userInput;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long userInput = readLong(prompt);

        if (userInput < min || userInput > max) {
            return readLong("Please enter a new number between " + min + " and " + max, min, max);
        }
        return userInput;
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        String userInput = input.nextLine();
        return userInput;
    }

}