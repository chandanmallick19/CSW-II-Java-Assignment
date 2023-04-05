/*
Given an array of positive and negative integers, write a program to
find a contiguous sub-array whose sum of elements is maximum.
 */
package Assignment1;
import java.util.Scanner;

public class A1Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int maxSum = findMaxSubarraySum(array);
        System.out.println("The maximum sum of a contiguous subarray is " + maxSum);
    }

    public static int findMaxSubarraySum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}

/*
The time complexity of this program is O(n^2).
 */
