/*
Write a java program to convert a decimal to binary equivalent using
stack(Stack collection).
 */

package Assignment2_A;
import java.util.Scanner;
import java.util.Stack;

public class A2Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        Stack<Integer> binaryStack = new Stack<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryStack.push(remainder);
            decimal = decimal / 2;
        }

        System.out.print("Binary equivalent: ");
        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop());
        }
    }
}

/* OUTPUT */
/*
Enter a decimal number: 15
Binary equivalent: 1111
 */