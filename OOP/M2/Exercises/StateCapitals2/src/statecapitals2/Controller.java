/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statecapitals2;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Qube
 */
public class Controller {
    public void run() {
        Scanner input = new Scanner(System.in);

        String[] listOfStates = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
        String[] listOfCapitals = {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"};
        LinkedHashMap<String, String> linkedMapStates = new LinkedHashMap<>();

        for (int i = 0; i < listOfStates.length; i++) {
            linkedMapStates.put(listOfStates[i], listOfCapitals[i]);
        }

        Set<String> keys = linkedMapStates.keySet();

        System.out.println("\nStates/Capital Pairs:\n====================");
        for (String key : keys) {
            promptUser();
            System.out.println(key + " - " + linkedMapStates.get(key) + " | Pop: " + population + " | Area: " + squareMilage + " sq mi");
        }
    }

    public void promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount you believe is the population in the state");
        population = Long.parseLong(input.nextLine());
        System.out.println("Please enter the amount you believe is the square footage in the state");
        squareMilage = Double.parseDouble(input.nextLine());
    }
}
