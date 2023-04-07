/*
Write a recursive function to find the GCD of two numbers. Write the
recurrence of the function and solve it for a solution.
 */
package Assignment1;
public class A1Q15{
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int iterativeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 48;
        int b = 36;
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " using recursive algorithm is " + gcd);
        gcd = iterativeGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " using iterative algorithm is " + gcd);
    }
}

/* OUTPUT
GCD of 48 and 36 using recursive algorithm is 12
GCD of 48 and 36 using iterative algorithm is 12
 */