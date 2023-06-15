/*
Given two array, sort first array according to the order defined in second
array.
 */

package Assignment3;
import java.util.*;

public class A3Q4 {

    public static void main(String[] args) {
        int[] array1 = {1, 5, 2, 3, 4};
        int[] array2 = {2, 3, 1, 4, 5};

        System.out.println("Original array1: " + Arrays.toString(array1));
        System.out.println("Original array2: " + Arrays.toString(array2));

        sortArrayAccordingToOrderDefinedInAnotherArray(array1, array2);

        System.out.println("Sorted array1: " + Arrays.toString(array1));
    }

    private static void sortArrayAccordingToOrderDefinedInAnotherArray(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array2.length; i++) {
            map.put(array2[i], i);
        }

        for (int i = 0; i < array1.length; i++) {
            array1[i] = map.get(array1[i]);
        }
    }
}

/* OUTPUT */

/*
Original array1: [1, 5, 2, 3, 4]
Original array2: [2, 3, 1, 4, 5]
Sorted array1: [2, 3, 1, 4, 5]
 */