/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuofchampions;

/**
 *
 * @author Qube
 */
public class MenuOfChampions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menuItem1 = "Banana Cream Pie",
                menuItem2 = "Chocolate Mousse",
                menuItem3 = "Fruit Tart";
        float priceItem1 = 8.88f,
                priceItem2 = 9.99f,
                priceItem3 = 6.66f;

        System.out.println(menuItem1+ ": $"+priceItem1);
        System.out.println(menuItem2+ ": $"+priceItem2);
        System.out.println(menuItem3+ ": $"+priceItem3);

    }

}
