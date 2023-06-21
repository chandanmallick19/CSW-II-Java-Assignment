/*
Write a program to remove duplicate from an integer list.
 */

package Assignment4;
import java.util.*;

public class A4Q03 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 5};

        // Create a set to store the unique elements.
        Set<Integer> set = new HashSet<>();

        // Traverse the list and add the elements to the set.
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }

        // Create a new list to store the unique elements.
        int[] newList = new int[set.size()];

        // Iterate over the set and add the elements to the new list.
        int index = 0;
        for (int element : set) {
            newList[index++] = element;
        }

        // Print the new list.
        for (int element : newList) {
            System.out.println(element);
        }
    }
}

/* OUTPUT */
/*
1 2 3 5
 */

