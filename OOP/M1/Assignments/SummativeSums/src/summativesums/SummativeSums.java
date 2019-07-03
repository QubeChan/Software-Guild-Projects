/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summativesums;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class SummativeSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] listOfArrays = {
            {1, 90, -33, -55, 67, -16, 28, -55, 15},
            {999, -60, -77, 14, 160, 301},
            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99}};
        for (int i = 0; i < listOfArrays.length; i++) {
            System.out.println("Sum of " + (i + 1) + " array is: " + sumOfArray(listOfArrays[i]));
        }
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
