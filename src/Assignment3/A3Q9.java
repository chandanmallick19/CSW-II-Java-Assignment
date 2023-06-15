/*
In given integer list that support three functions findMin, findMax, find-
Median. Sort the array. arrays..
 */

package Assignment3;
import java.util.*;

public class A3Q9 {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 6, 5, 8, 7};

        System.out.println("Original array: " + Arrays.toString(array));

        // Find the minimum, maximum, and median of the array.
        int min_value = findMin(array);
        int max_value = findMax(array);
        int median_value = findMedian(array);

        // Partition the array around the median value.
        int[] smaller_elements = new int[array.length];
        int[] larger_elements = new int[array.length];

        int small_index = 0;
        int large_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < median_value) {
                smaller_elements[small_index++] = array[i];
            } else {
                larger_elements[large_index++] = array[i];
            }
        }

        // Sort the smaller and larger elements.
        Arrays.sort(smaller_elements);
        Arrays.sort(larger_elements);

        // Combine the smaller and larger elements into a single sorted array.
        int[] sorted_array = new int[array.length];
        int index = 0;

        for (int i = 0; i < smaller_elements.length; i++) {
            sorted_array[index++] = smaller_elements[i];
        }
        sorted_array[index++] = median_value;
        for (int i = 0; i < larger_elements.length; i++) {
            sorted_array[index++] = larger_elements[i];
        }

        System.out.println("Sorted array: " + Arrays.toString(sorted_array));
    }

    private static int findMin(int[] array) {
        int min_value = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min_value) {
                min_value = array[i];
            }
        }

        return min_value;
    }

    private static int findMax(int[] array) {
        int max_value = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_value) {
                max_value = array[i];
            }
        }

        return max_value;
    }

    private static int findMedian(int[] array) {
        int median_index = (array.length - 1) / 2;

        return array[median_index];
    }
}

/* OUTPUT */

/*
Original array: [1, 3, 4, 2, 6, 5, 8, 7]
Sorted array: [1, 2, 3, 4, 5, 6, 7, 8]
 */

