/*
Given an array of size N, the elements in the array may be repeated. You
need to find sum of distinct elements of the array. If there is some value
repeated continuously then they should be added once.
 */

package Assignment4;
import java.util.HashSet;

public class A4Q08 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                sum += arr[i];
                set.add(arr[i]);
            }
        }
        System.out.println("Sum of distinct elements: " + sum);
    }
}

/* output */

/*
Sum of distinct elements: 12
 */

