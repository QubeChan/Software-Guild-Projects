/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inabucket;

/**
 *
 * @author Qube
 */
public class InABucket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // You can declare all KINDS of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 3.1f; // HOW MUCH DO TEACUP PIGS WEIGH??!?!?!?
        grainsOfSand = 2147483647; // Max value of int can't even hold the amount of sand in the world

        System.out.println("Meet my pet Walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("HOW MUCH DO TEACUP PIGS WEIGH??!?!?!? Is " + weightOfTeacupPig + " too much?");
        System.out.println(grainsOfSand + " is the max value of int and it can't even hold the amount of sand in the world");
    }
    
}
