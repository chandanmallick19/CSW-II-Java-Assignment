/*
Write a program to read N number from user and keep it in suitable
data structure so that no duplicate element is present in that.
 */

package Assignment2_B;
import java.util.*;

public class A2Q7 {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of numbers to read from user
        int n = scanner.nextInt();

        // Create a HashSet to store the numbers without duplicates
        Set<Integer> numbers = new HashSet<>();

        // Read n numbers from user and add them to the HashSet
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // Display the numbers in the HashSet
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}



/* OUTPUT  */
/*
Enter the number of numbers: 5
Enter the number 1: 1
Enter the number 2: 2
Enter the number 3: 3
Enter the number 4: 4
Enter the number 5: 5

The numbers without duplicates are:
1
2
3
4
5
 */