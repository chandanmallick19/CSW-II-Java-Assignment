/*
Given an array arr[], find the maximum distance of index j and I, such
that arr[j]<arr[I].
 */
package Assignment1;
public class A1Q12 {
    public static int findMaxDistance(int[] arr) {
        int maxDistance = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i] && j - i > maxDistance) {
                    maxDistance = j - i;
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 6, 3, 7, 8, 1};
        int maxDistance = findMaxDistance(arr);
        System.out.println("Maximum distance is: " + maxDistance);
    }
}

/* OUTPUT
Maximum distance is: 7
 */