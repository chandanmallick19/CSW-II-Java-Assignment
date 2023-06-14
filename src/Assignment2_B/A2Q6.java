/*
Write a program to create a hash map insert some element into it and
display it.
 */

package Assignment2_B;
import java.util.*;

public class A2Q6 {

    public static void main(String[] args) {

        // Create a HashMap of String and Integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Add elements to the HashMap
        map.put("Hello", 1);
        map.put("World", 2);
        map.put("Java", 3);

        // Display the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


/* OUTPUT  */

/*
Hello = 1
World = 2
Java = 3
 */