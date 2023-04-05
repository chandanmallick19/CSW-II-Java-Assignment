/*
Given an array of size N, containing elements from 0 to N-1. All values
from 0 to N-1 are present in array and if they are not there than -1 is
there to take place. Write a program to arrange values of the array so
that value i is stored at arr[i].
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        arrangeArray(array);
        System.out.println("The array arranged such that value i is stored at arr[i] is " + Arrays.toString(array));
    }

    public static void arrangeArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            while (array[i] != i && array[i] != -1) {
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
        }
    }
}

/*
The time complexity of this program is O(n).
 */
