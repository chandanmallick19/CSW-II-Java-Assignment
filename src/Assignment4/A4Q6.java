/*
Given an array in which all the elements appear even number of times
except one, which appear odd number of times. Find the element which
appear odd number of times.
 */

package Assignment4;
import java.util.*;

public class A4Q6 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 3, 1, 3};

        // Create a hashmap to store the count of each element.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : list) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Find the element with odd count.
        int oddElement = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddElement = entry.getKey();
                break;
            }
        }

        // Print the element with odd count.
        System.out.println("The element with odd count is " + oddElement);
    }
}

/* OUTPUT */
/*
The element with odd count is 3
 */