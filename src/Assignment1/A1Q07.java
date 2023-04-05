/*
Given an array, write a program to arrange its elements in waveform
such that odd elements are lesser than its neighboring even elements.
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A1Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        waveSort(array);
        System.out.println("The array arranged in waveform is " + Arrays.toString(array));
    }

    public static void waveSort(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }
}

/*
The time complexity of this program is O(n log n).
 */

