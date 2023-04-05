/*
Given a sorted array, rearrange it in maximum-minimum form.
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class A1Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        rearrangeMaxMin(array);
        System.out.println("The rearranged array in maximum-minimum form is " + Arrays.toString(array));
    }

    public static void rearrangeMaxMin(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int start = 0;
        int end = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                temp[i] = array[end--];
            } else {
                temp[i] = array[start++];
            }
            flag = !flag;
        }
        for (int i = 0; i < n; i++) {
            array[i] = temp[i];
        }
    }
}

/*
The time complexity of this program is O(n).
 */