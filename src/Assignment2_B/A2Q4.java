/*
Write a program to create a hash set of type string insert some element
into it and display it.
 */

package Assignment2_B;

import java.util.*;

public class A2Q4 {

    public static void main(String[] args) {

        // Create a HashSet of String type
        Set<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Hello");
        set.add("World");
        set.add("Java");

        // Display the HashSet
        for (String element : set) {
            System.out.println(element);
        }
    }
}


/* OUTPUT /*

/*
Hello
World
Java
 */
