/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author Qube
 */
public class HashMapTest {

    public void runHashMapTest() {
        // create an unordered list map that maps a country to its population
        // HashMap<String, Integer> populations = new HashMap<>();

        // create a ordered list map that maps a country to its population
        LinkedHashMap<String, Integer> populations = new LinkedHashMap<>();

        // adding key/value to hashmap
        populations.put("USA", 200000000);
        populations.put("Canada", 34000000);
        populations.put("United Kingdom", 63000000);
        populations.put("Japan", 127000000);
        // replacing a key's value but does not alter size
        populations.put("USA", 313000000);

        System.out.println("Map size is: " + populations.size());

        // Retrieve a key/value from hashmap
        Integer japanPopulation = populations.get("USA");
        System.out.println("The population of japan is: " + japanPopulation);

        // get the set of keys from the map
        Set<String> keys = populations.keySet();

        //prints the keys to the screen
        // - the list is unorder when using HashMap
        // - the list is ordered when using LinkedHashMap
        for (String key : keys) {
            System.out.println(key);
        }

        // print the keys and associated values to the screen
        for (String key : keys) {
            System.out.println("The population of " + key + " is " + populations.get(key));
        }

        // get the collection of values from the map
        Collection<Integer> popValues = populations.values();

        // list all of the population values
        // when gettting values it is unorganized and you can't tell which value goes to which country
        for (Integer p : popValues) {
            System.out.println(p);
        }
    }

}
