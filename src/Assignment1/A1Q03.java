/*
Write a program to find the reverse of a number and find its time
complexity.
 */
package Assignment1;
import java.util.Scanner;

public class A1Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;
        }
        System.out.println("Reverse of " + number + " is " + reverse);
    }
}

/*
The time complexity of this program is O(log n).
 */

/* OUTPUT
Enter a number: 1234
Reverse of 0 is 4321
 */