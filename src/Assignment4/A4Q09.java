/*
In given List of integers, both +ve and -ve. You need to find the two
elements such that their sum is closest to zero.
 */

package Assignment4;
import java.util.*;
import static java.lang.Math.abs;

public class A4Q09 {

    public static List<Integer> findClosestToZero(List<Integer> list) {
        int minSum = Integer.MAX_VALUE;
        List<Integer> closestNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int currentSum = list.get(i) + list.get(j);
                if (abs(currentSum) < abs(minSum)) {
                    minSum = currentSum;
                    closestNumbers = Arrays.asList(list.get(i), list.get(j));
                }
            }
        }
        return closestNumbers;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, -2, -8, 3, 2, 9);
        List<Integer> closestNumbers = findClosestToZero(list);
        System.out.println("Closest numbers: " + closestNumbers);
    }
}

/* output */

/*
Closest numbers: [1, -2]
 */