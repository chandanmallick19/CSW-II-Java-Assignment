/*
Given two sorted arrays. Sort the elements of these arrays so that first
half of sorted elements will lie in first array and second half lies in second
array. Extra space allowed is O(1)
 */

package Assignment3;
import java.util.*;

public class A3Q7 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        System.out.println("Original arrays:");
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));

        int[] sortedArray = sortArrays(array1, array2);

        System.out.println("Sorted arrays:");
        System.out.println("sortedArray: " + Arrays.toString(sortedArray));
    }

    private static int[] sortArrays(int[] array1, int[] array2) {
        int[] sortedArray = new int[array1.length + array2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < sortedArray.length; k++) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] <= array2[j]) {
                    sortedArray[k] = array1[i];
                    i++;
                } else {
                    sortedArray[k] = array2[j];
                    j++;
                }
            } else if (i < array1.length) {
                sortedArray[k] = array1[i];
                i++;
            } else {
                sortedArray[k] = array2[j];
                j++;
            }
        }

        return sortedArray;
    }
}

/* OUTPUT */

/*
Original arrays:
array1: [1, 2, 3, 4, 5]
array2: [6, 7, 8, 9, 10]
Sorted arrays:
sortedArray: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

