/*
Given an array you need to find the maximum sum of arr[i]*(i+1) for
all elements such that you are allowed to rotate the array.
 */
package Assignment1;
public class A1Q11 {

    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 20, 2, 10};

        // Calculate the sum of arr[i]*(i+1) for the original array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (i+1);
        }

        // Calculate the sum of arr[i]*(i+1) for the rotated array and find the maximum
        int maxSum = sum;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
            sum = 0;
            for (int k = 0; k < arr.length; k++) {
                sum += arr[k] * (k+1);
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        // Print the maximum sum
        System.out.println("Maximum sum of arr[i]*(i+1) for all elements with rotation: " + maxSum);
    }
}

/* OUTPUT
Maximum sum of arr[i]*(i+1) for all elements with rotation: 105
 */