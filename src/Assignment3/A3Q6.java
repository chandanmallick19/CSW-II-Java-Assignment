/*
Element left after reductions. Given an array of positive elements. You
need to perform reduction operation. In each reduction operation smallest
positive element value is picked and all the elements are subtracted by that
value. You need to print the number of elements left after each reduction
process.
 */

package Assignment3;
import java.util.*;

public class A3Q6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(array));

        int[] reducedArray = new int[array.length];

        int count = array.length;

        while (count > 1) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            for (int i = 0; i < array.length; i++) {
                reducedArray[i] = array[i] - min;
            }

            array = reducedArray;
            reducedArray = new int[array.length];
            count = array.length;
        }

        System.out.println("Number of elements after reductions: " + count);
    }
}

/* OUTPUT */
/*
Original array: [1, 2, 3, 4, 5]
Number of elements after reductions: 1
 */

