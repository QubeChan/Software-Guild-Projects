/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Qube
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArr = {6, 6, 6, 9, 6, 6, 6};
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        for (int num : myArr) {
            System.out.println(num);
        }

        String[][] nameOccupation = {{"Jason", "Full Stack"}, {"Bobo", "Dog"}, {"Kiwi", "Cat"}};

        for (String[] firstArr : nameOccupation) {
            for (String element : firstArr) {
                System.out.println(element);
            }
        }

    }

}
