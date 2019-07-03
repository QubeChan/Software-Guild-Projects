/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplesort;

/**
 *
 * @author Qube
 */
public class SimpleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};
        int[] wholeNumbers = new int[firstHalf.length + secondHalf.length];
        int temp;

        for (int i = 0; i < firstHalf.length; i++) {
            wholeNumbers[i] = firstHalf[i];
            wholeNumbers[i + firstHalf.length] = secondHalf[i];
        }

        for (int i = 0; i < wholeNumbers.length; i++) {
            for (int j = 0; j < wholeNumbers.length - 1; j++) {
                if (wholeNumbers[j] > wholeNumbers[j + 1]) {
                    temp = wholeNumbers[j];
                    wholeNumbers[j] = wholeNumbers[j + 1];
                    wholeNumbers[j + 1] = temp;
                }
            }
            System.out.println(wholeNumbers[i]);
        }
    }

}
