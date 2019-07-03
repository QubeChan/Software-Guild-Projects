/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.howmanydaysuntilfriday;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class App {

    public static void main(String[] args) {
        System.out.println(howManyDaysUntilFriday());
    }

    public static int howManyDaysUntilFriday() {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it?");
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(input.nextLine().toUpperCase());

        switch (day) {
            case MONDAY:
                return 4;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 2;
            case THURSDAY:
                return 1;
            case FRIDAY:
                return 0;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 5;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
