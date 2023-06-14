/*
Write a program to create a linked hash set of type double insert some
element into it and display it.
 */

package Assignment2_B;
import java.util.*;

public class A2Q5 {

    public static void main(String[] args) {

        // Create a LinkedHashSet of Double type
        Set<Double> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add(10.0);
        set.add(20.0);
        set.add(30.0);

        // Display the LinkedHashSet
        for (Double element : set) {
            System.out.println(element);
        }
    }
}


/*OUTPUT */

/*
10.0
20.0
30.0
 */

