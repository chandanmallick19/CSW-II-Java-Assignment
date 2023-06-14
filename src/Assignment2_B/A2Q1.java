/*
Write a program to create an TreeSet of Integer type and perform the
below operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it
present in the list or not.
(c.) Remove an element from tree.
 */

package Assignment2_B;

import java.util.*;

public class A2Q1 {

    public static void main(String[] args) {

        // Create a TreeSet of Integer type
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Display the TreeSet
        System.out.println("The TreeSet: " + treeSet);

        // Ask the user to enter a number
        System.out.println("Enter a number to search: ");
        int number = Integer.parseInt(System.console().readLine());

        // Search the number in the TreeSet
        boolean isPresent = treeSet.contains(number);

        // Display the result
        if (isPresent) {
            System.out.println("The number " + number + " is present in the TreeSet");
        } else {
            System.out.println("The number " + number + " is not present in the TreeSet");
        }

        // Remove an element from the TreeSet
        System.out.println("Enter a number to remove: ");
        int removeNumber = Integer.parseInt(System.console().readLine());

        treeSet.remove(removeNumber);

        // Display the updated TreeSet
        System.out.println("The updated TreeSet: " + treeSet);
    }
}


/* OUPTPUT */

/*
The TreeSet: [10, 20, 30, 40, 50]
Enter a number to search: 30
The number 30 is present in the TreeSet
Enter a number to remove: 40
The updated TreeSet: [10, 20, 30, 50]

 */

