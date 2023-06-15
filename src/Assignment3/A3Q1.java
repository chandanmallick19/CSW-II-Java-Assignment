/*
Given an array containing 0s and 1s. Write an algorithms to sort array
so that 0s come first followed by 1s. Also find the minimum number of
swaps required to sort the array.
 */

package Assignment3;
import java.util.*;
public class A3Q1 {

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 1, 0, 1, 1, 0};
        System.out.println("Original array: " + Arrays.toString(array));

        int numSwaps = sort01Array(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Minimum number of swaps required: " + numSwaps);
    }

    private static int sort01Array(int[] array) {
        int numSwaps = 0;

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0) {
                left++;
            }

            while (array[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                numSwaps++;
            }
        }

        return numSwaps;
    }
}


/* OUTPUT */
    /*
Original array: [1, 0, 1, 0, 1, 0, 1, 1, 0]
        Sorted array: [0, 0, 0, 0, 0, 1, 1, 1, 1]
        Minimum number of swaps required: 4
    */

