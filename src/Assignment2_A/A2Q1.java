package Assignment2_A;
import java.util.ArrayList;
import java.util.Scanner;

public class A2Q1 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            Scanner scanner = new Scanner(System.in);
            int choice;
            do {
                System.out.println("Enter your choice:");
                System.out.println("1. Display the list");
                System.out.println("2. Search for a number in the list");
                System.out.println("3. Remove an element from the list");
                System.out.println("4. Add an element to the list");
                System.out.println("5. Check if the list is empty");
                System.out.println("6. Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        displayList(list);
                        break;
                    case 2:
                        searchNumber(list, scanner);
                        break;
                    case 3:
                        removeElement(list, scanner);
                        break;
                    case 4:
                        addElement(list, scanner);
                        break;
                    case 5:
                        checkEmpty(list);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } while (choice != 6);
        }

        private static void displayList(ArrayList<Integer> list) {
            if (list.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                System.out.print("The list contains: ");
                for (Integer number : list) {
                    System.out.print(number + " ");
                }
                System.out.println();
            }
        }

        private static void searchNumber(ArrayList<Integer> list, Scanner scanner) {
            System.out.println("Enter the number to search:");
            int number = scanner.nextInt();
            if (list.contains(number)) {
                System.out.println(number + " is present in the list");
            } else {
                System.out.println(number + " is not present in the list");
            }
        }

        private static void removeElement(ArrayList<Integer> list, Scanner scanner) {
            if (list.isEmpty()) {
                System.out.println("The list is empty, cannot remove element");
                return;
            }
            System.out.println("Enter the position of the element to remove (0-indexed):");
            int position = scanner.nextInt();
            if (position < 0 || position >= list.size()) {
                System.out.println("Invalid position");
            } else {
                int removedNumber = list.remove(position);
                System.out.println(removedNumber + " was removed from position " + position);
            }
        }

        private static void addElement(ArrayList<Integer> list, Scanner scanner) {
            System.out.println("Enter the number to add:");
            int number = scanner.nextInt();
            list.add(number);
            System.out.println(number + " was added to the list");
        }

        private static void checkEmpty(ArrayList<Integer> list) {
            if (list.isEmpty()) {
                System.out.println("The list is empty");
            } else {
                System.out.println("The list is not empty");
            }
        }
    }
