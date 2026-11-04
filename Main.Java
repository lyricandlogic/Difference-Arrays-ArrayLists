import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Demonstrating Arrays
        System.out.println("=== ARRAY DEMONSTRATION ===");

        // Arrays have a fixed size.
        String[] students = new String[3];

        students[0] = "Ashley";
        students[1] = "Jacob";
        students[2] = "Student 3";

        // Display array elements.
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("Array length: " + students.length);

        // Demonstrating ArrayLists
        System.out.println("\n=== ARRAYLIST DEMONSTRATION ===");

        // ArrayLists can dynamically grow.
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Ashley");
        studentList.add("Jacob");
        studentList.add("Student 3");

        // Adding another element.
        studentList.add("Student 4");

        // Removing an element.
        studentList.remove("Student 3");

        // Display ArrayList elements.
        for (String student : studentList) {
            System.out.println(student);
        }

        System.out.println("ArrayList size: " + studentList.size());
    }
}
