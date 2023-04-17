package Assignment2_A;
import java.util.LinkedList;
import java.util.Scanner;
    class Student {
        String name;
        int age;
        double mark;

        public Student(String name, int age, double mark) {
            this.name = name;
            this.age = age;
            this.mark = mark;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Mark: " + mark;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Student) {
                Student other = (Student) obj;
                return this.name.equals(other.name) && this.age == other.age && this.mark == other.mark;
            }
            return false;
        }
    }

public class A2Q2 {
        public static void main(String[] args) {
            LinkedList<Student> list = new LinkedList<>();

            list.add(new Student("Chandan", 24, 85.0));
            list.add(new Student("Sam", 23, 90.0));
            list.add(new Student("Lucy", 20, 80.0));

            Scanner scanner = new Scanner(System.in);

            // Display the list
            System.out.println("List of Students:");
            for (Student s : list) {
                System.out.println(s);
            }
            System.out.println();

            // Ask the user to enter a student object and print the existence of the object.
            System.out.print("Enter the existing student name to display : ");
            String name = scanner.nextLine();
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();
            System.out.print("Enter the mark: ");
            double mark = scanner.nextDouble();
            Student s = new Student(name, age, mark);
            boolean found = list.contains(s);
            System.out.println(found ? "The student exists in the list." : "The student does not exist in the list.");
            System.out.println();

            // Remove a specified student object.
            System.out.print("Enter the name of the student to remove: ");
            name = scanner.next();
            System.out.print("Enter the age: ");
            age = scanner.nextInt();
            System.out.print("Enter the mark: ");
            mark = scanner.nextDouble();
            s = new Student(name, age, mark);
            boolean removed = list.remove(s);
            System.out.println(removed ? "The student has been removed from the list." : "The student was not found in the list.");
            System.out.println();

            // Count the number of objects present in the list.
            System.out.println("The number of students in the list is: " + list.size());
        }
    }

