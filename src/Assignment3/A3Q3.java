/*
Write a program to find minimum swaps required to bring all elements
less than given value together at the start of array.
 */

package Assignment3;
import java.util.*;

public class A3Q3 {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 4};
        int value = 3;

        System.out.println("Original array: " + Arrays.toString(array));

        int numSwaps = minSwaps(array, value);
        System.out.println("Minimum number of swaps required: " + numSwaps);
    }

    private static int minSwaps(int[] array, int value) {
        int numSwaps = 0;

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] >= value) {
                left++;
            }

            while (array[right] < value) {
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
Original array: [1, 5, 2, 3, 4]
Minimum number of swaps required: 2
 */

