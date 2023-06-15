/*
Given an array of even and odd numbers, write a program to separate
even numbers from the odd numbers.
 */

package Assignment3;
import java.util.*;

public class A3Q5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array: " + Arrays.toString(array));

        int[] evenNumbers = new int[array.length];
        int[] oddNumbers = new int[array.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers[evenIndex++] = array[i];
            } else {
                oddNumbers[oddIndex++] = array[i];
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
    }
}

/* OUTPUT */

/*
Original array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Even numbers: [2, 4, 6, 8, 10]
Odd numbers: [1, 3, 5, 7, 9]
 */