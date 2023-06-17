/*
Given an unsorted list of n elements, find the first element, which is repeated.
 */

package Assignment4;

public class A4Q1 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 5};
        int n = list.length;

        // Create a boolean array to store the elements of the list.
        boolean[] seen = new boolean[n];

        // Traverse the list and mark the elements as seen.
        for (int i = 0; i < n; i++) {
            seen[list[i] - 1] = true;
        }

        // Find the first element that is marked as seen.
        for (int i = 0; i < n; i++) {
            if (seen[i]) {
                System.out.println("The first repeated element is " + (i + 1));
                return;
            }
        }

        // If no element is repeated, print "No repeated element found".
        System.out.println("No repeated element found");
    }
}

/*OUTPUT*/

/*
The first repeated element is 2
 */