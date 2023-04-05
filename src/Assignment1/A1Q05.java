/*
Given an array, write a program to rotate its element K numbers of
times. Explain its time complexity.
 */
package Assignment1;
import java.util.Scanner;

public class A1Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();
        rotateArray(array, k);
        System.out.println("The rotated array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n;
        reverse(array, 0, n - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
    }

    public static void reverse(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

/*
The time complexity of this program is O(n).
 */