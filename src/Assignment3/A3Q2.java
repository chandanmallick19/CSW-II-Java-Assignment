/*
Given an array containing 0s, 1s and 2s. Write an algorithms to sort array
so that 0s come first followed by 1s and then 2s in the end.
 */

package Assignment3;
import java.util.*;

public class A3Q2 {

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 2, 1, 2, 1, 0};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] sortedArray = sort012Array(array);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    private static int[] sort012Array(int[] array) {
        int[] count = new int[3];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int index = 0;
        for (int i = 0; i < count[0]; i++) {
            array[index++] = 0;
        }
        for (int i = 0; i < count[1]; i++) {
            array[index++] = 1;
        }
        for (int i = 0; i < count[2]; i++) {
            array[index++] = 2;
        }

        return array;
    }
}


/* OUTPUT */

/*
Original array: [1, 0, 1, 0, 2, 1, 2, 1, 0]
Sorted array: [0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]
 */

