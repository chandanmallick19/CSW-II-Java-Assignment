/*
Given an array of n numbers, find two elements such that their sum is
equal to “value”
 */

package Assignment4;
import java.util.Arrays;
import java.util.HashMap;

public class A4Q10 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 2, -10};
        int value = 6;
        System.out.println("Two elements whose sum is equal to " + value + ":");
        findTwoSum(arr, value);
    }

    private static void findTwoSum(int[] arr, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = value - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(arr[i] + ", " + map.get(complement));
            } else {
                map.put(arr[i], i);
            }
        }
    }
}

/* output */

/*
1, 5
 */