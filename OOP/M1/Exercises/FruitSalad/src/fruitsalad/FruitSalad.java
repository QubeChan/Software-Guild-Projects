/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitsalad;

/**
 *
 * @author Qube
 */
public class FruitSalad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        int saladFruitCount = 12,
                appleCount = 3,
                orangeCount = 2;
        String[] fruitSalad = new String[saladFruitCount],
                arrApple,
                arrOrange,
                arrBerry;

        // Code Recipe for fruit salad should go here!
        arrApple = newStringArr(fruit, "Apple");
        arrOrange = newStringArr(fruit, "Orange");
        arrBerry = newStringArr(fruit, "berry");

        for (int i = 0; i < saladFruitCount; i++) {
            if (i < 3) {
                fruitSalad[i] = arrApple[i];
            }
            if (i < 2 && fruitSalad.length < i + appleCount) {
                fruitSalad[i + appleCount] = arrOrange[i];
            }
        }
        for (int i = 0; i < fruitSalad.length; i++) {
            System.out.println(fruitSalad[i]);
        }
    }

    public static String[] newStringArr(String[] arr, String containString) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(containString)) {
//                System.out.println(arr[i]);
                count++;
            }
        }

        String[] strArray = new String[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(containString)) {
                strArray[count] = arr[i];
                count++;
            }
        }

        return strArray;
    }

}
