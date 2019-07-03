/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitsbasket;

/**
 *
 * @author Qube
 */
public class FruitsBasket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        int appleCount = 0, orangeCount = 0;

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i] == "Apple") {
                appleCount++;
            } else if (fruit[i] == "Orange") {
                orangeCount++;
            }
        }

        // This part took the most thinking with the challenge of making 2 new arrays one for each type and sort them that was intense
        String[] arrApple = new String[appleCount], arrOrange = new String[orangeCount];
        appleCount = 0;
        orangeCount = 0;
        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i] == "Apple") {
                arrApple[appleCount] = fruit[i];
                appleCount++;
            } else if (fruit[i] == "Orange") {
                arrOrange[orangeCount] = fruit[i];
                orangeCount++;
            }

        }
        System.out.println("Total # of Fruits in Basket: " + fruit);
        System.out.println("Number of Apples: " + appleCount);
        System.out.println("Number of Oranges: " + orangeCount);

        System.out.println(arrApple.length);
        System.out.println(arrOrange.length);
    }

}
