/*
Write a java program to check whether a number is prime or not.
Calculate its time complexity with proper explanation.
 */
package Assignment1;
import java.util.Scanner;

public class A1Q01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if (isPrime(n)) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }

        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
/*
The time complexity of this algorithm is O(sqrt(n)).
 */

/* OUTPUT
Enter a number: 1234
1234 is not a prime number
 */