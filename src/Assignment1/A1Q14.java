/*
Write a recursive algorithm to solve the Tower of Hanoi problem.
 */
package Assignment1;
public class A1Q14 {
    public static void move(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        move(n-1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        move(n-1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        move(n, 'A', 'C', 'B'); // A = source, C = destination, B = auxiliary
    }
}

/* OUTPUT
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C
 */
