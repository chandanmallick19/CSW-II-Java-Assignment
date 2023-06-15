/*
Given two unsorted arrays, find union and intersection of these two.
 */

package Assignment3;
import java.util.*;

public class A3Q8 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Original arrays:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        // Find union of the two arrays
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            union.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            union.add(array2[i]);
        }
        System.out.println("Union of the two arrays: " + union);

        // Find intersection of the two arrays
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersection.add(array1[i]);
                }
            }
        }
        System.out.println("Intersection of the two arrays: " + intersection);
    }
}

/* OUTPUT */

/*
Original arrays:
array1: [1, 2, 3, 4, 5]
array2: [6, 7, 8, 9, 10]
Union of the two arrays: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Intersection of the two arrays: []
 */



