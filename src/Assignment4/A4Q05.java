/*
Given an array, find the maximum and minimum value in the array and
also find the values in range minimum and maximum that are absent in
the array.
 */

package Assignment4;

import java.util.*;

public class A4Q05 {

    public static void main(String[] args) {
        int[] list = {1, 4, 5};

        // Find the maximum and minimum values in the array.
        int max = list[0];
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }

        // Find the values in range minimum and maximum that are absent in the array.
        Set<Integer> absentValues = new HashSet<>();
        for (int i = min; i <= max; i++) {
            if (!Arrays.asList(list).contains(i)) {
                absentValues.add(i);
            }
        }

        // Print the maximum, minimum, and absent values.
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Absent values: " + absentValues);
    }
}

/* OUTPUT */

/*
Maximum value: 5
Minimum value: 1
Absent values: [2, 3]
 */