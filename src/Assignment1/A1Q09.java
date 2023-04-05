/*
Given an unsorted array, find the smallest positive number missing in
the array.
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A1Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int missingNumber = findSmallestMissingNumber(array);
        System.out.println("The smallest positive number missing in the array is " + missingNumber);
    }

    public static int findSmallestMissingNumber(int[] array) {
        int n = array.length;
        boolean[] present = new boolean[n + 1];
        Arrays.fill(present, false);
        for (int i = 0; i < n; i++) {
            if (array[i] > 0 && array[i] <= n) {
                present[array[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
}

/*
The time complexity of this program is O(n).
 */
