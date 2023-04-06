/*
Given two arrays in increasing order you need to find the maximum
sum by choosing a few consecutive elements from one array and then
a few elements from another array. The element switching can happen
at transition points only when the element value is the same in both
arrays.
 */
package Assignment1;
public class A1Q13 {
    public static int findMaxSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, maxSum = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                maxSum += Math.max(sum1, sum2) + arr1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        while (i < arr1.length) {
            sum1 += arr1[i++];
        }
        while (j < arr2.length) {
            sum2 += arr2[j++];
        }

        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 8, 10};
        int[] arr2 = {2, 3, 5, 7, 9};
        int maxSum = findMaxSum(arr1, arr2);
        System.out.println("Maximum sum is: " + maxSum);
    }
}
