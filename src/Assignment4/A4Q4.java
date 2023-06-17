/*
In given list of n−1 elements, which are in the range of 1 to n. There are
no duplicates in the array. One of the integer is missing. Find the missing
element.
 */

package Assignment4;
import java.util.*;

public class A4Q4 {

    public static void main(String[] args) {
        int[] list = {1, 2, 4, 5};
        int n = list.length + 1;

        // Calculate the sum of all the numbers from 1 to n.
        int sumOfElements = (n * (n + 1)) / 2;

        // Calculate the sum of all the elements in the list.
        int sumOfListElements = 0;
        for (int element : list) {
            sumOfListElements += element;
        }

        // Find the missing element.
        int missingElement = sumOfElements - sumOfListElements;

        // Print the missing element.
        System.out.println("The missing element is " + missingElement);
    }
}

/* OUTPUT */
/*
The missing element is 3
 */