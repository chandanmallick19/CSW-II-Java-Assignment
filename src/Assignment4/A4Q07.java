/*
Given an array in which all the elements appear even number of times
except two, which appear odd number of times. Find the elements which
appear odd number of times in O(n) time complexity and O(1) space
complexity.
 */

package Assignment4;
import java.util.*;

public class A4Q07 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 3, 1, 3};

        // Find the xor of all the elements in the array.
        int xorResult = 0;
        for (int element : list) {
            xorResult ^= element;
        }

        // Find the rightmost set bit in the xor result.
        int rightmostSetBit = xorResult & -xorResult;

        // Find the two elements which have the rightmost set bit set.
        List<Integer> oddElements = new ArrayList<>();
        for (int element : list) {
            if ((element & rightmostSetBit) != 0) {
                oddElements.add(element);
            }
        }

        // Print the two elements with odd count.
        System.out.println("The elements with odd count are " + oddElements);
    }
}

/* OUTPUT */
/*
The elements with odd count are [3, 3]
 */