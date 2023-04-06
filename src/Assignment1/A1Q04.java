/*
Write a program to search an element using binary search and calculate
its time complexity.
 */
package Assignment1;

import java.util.Scanner;

public class A1Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int searchElement = sc.nextInt();
        int index = binarySearch(array, searchElement);
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + index + " in the array.");
        }
    }

    public static int binarySearch(int[] array, int searchElement) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == searchElement) {
                return mid;
            } else if (array[mid] < searchElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

/*
The time complexity of binary search is O(log n).
 */

/* OUTPUT
Enter the number of elements in the array: 5
Enter the elements in sorted order:
1 2 3 4 5
Enter the element to be searched: 4
Element found at index 3 in the array.
 */