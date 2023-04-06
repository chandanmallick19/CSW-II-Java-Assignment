/*
Write a program to find all permutations of an integer list recursively.
 */
package Assignment1;
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class A1Q16 {
    public static List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.size() == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        for (int i = 0; i < nums.size(); i++) {
            int first = nums.get(i);
            List<Integer> remaining = new ArrayList<>(nums.subList(0, i));
            remaining.addAll(nums.subList(i + 1, nums.size()));
            List<List<Integer>> permutations = permute(remaining);
            for (List<Integer> permutation : permutations) {
                permutation.add(0, first);
                result.add(permutation);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        List<Integer> nums = new ArrayList<>();
        while (num > 0) {
            int digit = num % 10;
            nums.add(digit);
            num /= 10;
        }
        List<List<Integer>> permutations = permute(nums);
        System.out.println("Permutations of " + nums + " are:");
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

