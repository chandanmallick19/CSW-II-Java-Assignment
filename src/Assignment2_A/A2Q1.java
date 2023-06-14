/*
Write a program to create an ArrayList of Integer type and perform
the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from an asked position.
(d.) Add a condition to check the ArrayList is empty or not.
 */

package Assignment2_A;
import java.util.*;

public class A2Q1 {

    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display the list
        System.out.println("The list is: " + list);

        // Ask the user to enter a number
        System.out.println("Enter a number to search: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Search the number in the ArrayList
        boolean found = list.contains(number);

        // Display whether the number is present in the ArrayList or not
        if (found) {
            System.out.println("The number " + number + " is present in the list.");
        } else {
            System.out.println("The number " + number + " is not present in the list.");
        }

        // Remove an element from the ArrayList
        System.out.println("Enter a position to remove: ");
        int removePosition = sc.nextInt();

        list.remove(removePosition);

        // Display the list after removing an element
        System.out.println("The list after removing an element is: " + list);

        // Check if the ArrayList is empty or not
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
    }
}



/*
The list is: [10, 20, 30, 40, 50]
Enter a number to search: 20
The number 20 is present in the list.
Enter a position to remove: 2
The list after removing an element is: [10, 30, 40, 50]
The list is not empty.

 */