package Ex4;

import java.util.*;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        System.out.println("Please, input grades for students:");

        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.print("Student " + ch + ": ");
            int grade = Integer.parseInt(scanner.nextLine());
            Student student = new Student("Student " + ch, 20, "Year 2");
            gradeBook.addStudent(student);
            gradeBook.assignGrade(student, grade);
        }

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
        scanner.close();
    }
}