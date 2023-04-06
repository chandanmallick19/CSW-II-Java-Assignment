/*
Write a program to find the binary equivalent of a decimal number.
Calculate its time complexity.
 */
package Assignment1;
import java.util.Scanner;

public class A1Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = "";
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary equivalent: " + binary);
    }
}

/*
The time complexity of this program is O(log n)
 */

/* OUTPUT
Enter a decimal number: 100
Binary equivalent: 1100100
 */