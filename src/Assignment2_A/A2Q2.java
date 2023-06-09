/*
Create a class Student having member variable name, age, mark and
required member variable. Create an LikedList of Student type and
perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a student object and print the existence of
the object. Specify is the object is search according to reference
or contain.
(c.) Remove an specified student object.
(d.) Count the number of object present in the list.
 */

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

/* OUTPUT */
/*
List of Students:
Name: Chandan, Age: 24, Mark: 85.0
Name: Sam, Age: 23, Mark: 90.0
Name: Lucy, Age: 20, Mark: 80.0

Enter the existing student name to display : Chandan
Enter the age: 24
Enter the mark: 85
The student exists in the list.

Enter the name of the student to remove: Lucy
Enter the age: 20
Enter the mark: 80
The student has been removed from the list.

The number of students in the list is: 2
 */