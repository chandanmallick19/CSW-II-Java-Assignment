/*
Write a recursive function to search an element using binary search.
Analyze its time complexity.
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A1Q17 {
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in ascending order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the search value: ");
        int x = scanner.nextInt();
        int index = binarySearch(arr, 0, n - 1, x);
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}

/*
The time complexity of binary search is O(log n).
 */