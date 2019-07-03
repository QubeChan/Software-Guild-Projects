/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthstones;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class BirthStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        
        System.out.println("What month's birthstone are you wanting to know?");
        month = Integer.parseInt(input.nextLine());
        
        if(month==1){
            System.out.println(month + " - January - Garnet");
        } else if(month==2){
            System.out.println(month + " - February - Amethyst");
        } else if(month==3){
            System.out.println(month + " - March - Aquamarine");
        } else if(month==4){
            System.out.println(month + " - April - Diamond");
        } else if(month==5){
            System.out.println(month + " - May - Emerald");
        } else if(month==6){
            System.out.println(month + " - June - Pearl");
        } else if(month==7){
            System.out.println(month + " - July - Ruby");
        } else if(month==8){
            System.out.println(month + " - August - Peridot");
        } else if(month==9){
            System.out.println(month + " - September - Sapphire");
        } else if(month==10){
            System.out.println(month + " - October - Opal");
        } else if(month==11){
            System.out.println(month + " - November - Topaz");
        } else if(month==12){
            System.out.println(month + " - December - Turquoise");
        } else{
            System.out.println("Error");
        }










    }
    
}
