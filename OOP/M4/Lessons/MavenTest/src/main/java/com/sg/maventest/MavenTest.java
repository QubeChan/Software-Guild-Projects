/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.maventest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class MavenTest {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

//        LocalDate date = readLocalDate("Please enter a date formatted by MMddyyyy.");
//        System.out.println(date.format(DateTimeFormatter.ofPattern("MMddyyyy")));
//        String stringDate = date.format(DateTimeFormatter.ofPattern("MMddyyyy"));
//        System.out.println(stringDate);
//        System.out.println(readLocalDate("Please enter a date formatted by MMddyyyy."));
//        LocalDate date;
//
//        try {
//            date = readLocalDate("Please enter a date formatted by MMddyyyy.");
//        } catch (DateTimeParseException e) {
//            System.out.println("Date format should be a valid date.");
//            date = readLocalDate("Please enter a date formatted by MMddyyyy.");
//        }
//
//        System.out.println(date);
//        System.out.println(readLocalDate("Please enter a date formatted by MMddyyyy.").format(DateTimeFormatter.ofPattern("MMddyyyy")));
    }

    public static String createRandomNumber() {
        String randomNum = "";
        Random random = new Random();
        boolean keepGoing = true;
        int nextNum, removeNum;

        ArrayList<Integer> poolOfNums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            poolOfNums.add(i);
        }

        for (int i = 0; i < 4; i++) {
            do {
                nextNum = random.nextInt(10);
                if (poolOfNums.contains(nextNum)) {
                    randomNum += nextNum;
                    removeNum = poolOfNums.indexOf(nextNum);
                    poolOfNums.remove(removeNum);
                    keepGoing = false;
                } else {
                    keepGoing = true;
                }
            } while (keepGoing);
        }
//        LinkedHashMap<Integer,Integer> poolOfNumbers = new LinkedHashMap<>();
        return randomNum;
    }

    public static LocalDate readLocalDate(String prompt) {
//        System.out.println(prompt);
//        LocalDate userInput = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("MMddyyyy"));
//        return userInput;
        System.out.println(prompt);
        LocalDate userInput;
        try {
            userInput = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("MMddyyyy"));
        } catch (DateTimeParseException e) {
            userInput = readLocalDate(prompt);
        }
        return userInput;
    }

}
