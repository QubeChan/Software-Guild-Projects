/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minizork;

import java.util.Scanner;

/**
 *
 * @author Qube
 */
public class MiniZork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You stuck your hand in");
                System.out.println("It's pretty deep...");
                System.out.println("Keep reaching or go back?");
                action = userInput.nextLine();
                
                if (action.equals("keep reaching")){
                    System.out.println("You kept reaching around but suddenly you feel something inside");
                    System.out.println("You fool you got eaten by the grue!");
                } else if (action.equals("go back")){
                    System.out.println("You head back and decide to go home.");
                    System.out.println("A pair of eyes suddenly appear as you walk away... Good move heading home");
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You decided to go to the house");
            System.out.println("The door is locked but there's a window.");
            System.out.println("Look for a key or head towards the window?");
            action = userInput.nextLine();
            
            if (action.equals("look for a key")) {
                System.out.println("You look for a key");
                System.out.println("You search around the outside and you spot two keys");
                System.out.println("A skull key in one hand and a smiley key in the other.");
                System.out.println("Use the skull key or use the smiley key?");
                action = userInput.nextLine();
                
                if (action.equals("use the skull key")) {
                    System.out.println("The door opens and you  step inside");
                    System.out.println("Suddenly the door closes behind you!");
                    System.out.println("Curiosity killed the cat young one...");
                    System.out.println("You get eaten by the grue!");
                } else if (action.equals("use the smiley key")) {
                    System.out.println("As you attempt to use the smiley key it transforms!");
                    System.out.println("They key was a mimic!");
                    System.out.println("You got eaten by the mimic and that was that!");
                }
                
            } else if (action.equals("head towards the window")) {
                System.out.println("You spot someone looking at through the glass");
                System.out.println("Get a better look or run away");
                action = userInput.nextLine();
                
                if (action.equals("get a better look")) {
                    System.out.println("Yeah... you tried getting a better look but...");
                    System.out.println("The figure breaks the window and snaps your neck.");
                    System.out.println("Why so curious?");
                    
                } else if (action.equals("run away")) {
                    System.out.println("You attempt to make a run for it.");
                    System.out.println("But it's too late you've been surrounded.");
                    System.out.println("The pack of grue devours you for being a fool.");
                }
            }
        }
    }

}
