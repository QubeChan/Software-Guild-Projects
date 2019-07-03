/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsandmaps;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Qube
 */
public class ArrayListTest {

    public void runArrayList() {
        ArrayList<String> stringList = new ArrayList<>();

        System.out.println("List size before adding any Strings: " + stringList.size());
        stringList.add("My first string");
        System.out.println("List size after adding a String: " + stringList.size());
        stringList.add("My second string");
        System.out.println("List size after adding a String: " + stringList.size());
        stringList.add("My third string");
        System.out.println("List size after adding a String: " + stringList.size());
        stringList.add("My forth string");
        System.out.println(stringList.size());
//        stringList.remove(2);
//        stringList.remove(1);

        for (String str : stringList) {
            System.out.println(str);
        }

        Iterator<String> i = stringList.iterator();
        while (i.hasNext()) {
            String current = i.next();
            System.out.println(current + "\n");
        }
    }
}
