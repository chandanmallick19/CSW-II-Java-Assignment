/*
Given an array of n numbers, print the duplicate elements in the array.
 */

package Assignment4;

import java.util.*;

public class A4Q02 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 5};
        int n = list.length;

        // Create a map to store the elements of the list.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the list and add the elements to the map.
        for (int i = 0; i < n; i++) {
            map.put(list[i], map.getOrDefault(list[i], 0) + 1);
        }

        // Print the duplicate elements.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

/* OUTPUT */

/*
2
 */