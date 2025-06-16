package Ex4;

import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    public void displayGradeReport() {
        if (grades.isEmpty()) {
            System.out.println("No grades assigned yet.");
            return;
        }

        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Student maxStudent = null, minStudent = null;
        int[] distribution = new int[11];

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            Student student = entry.getKey();
            int grade = entry.getValue();
            total += grade;
            if (grade > max) {
                max = grade;
                maxStudent = student;
            }
            if (grade < min) {
                min = grade;
                minStudent = student;
            }
            distribution[grade / 10]++;
        }

        double average = total / (double) grades.size();
        System.out.printf("Class average is %.2f. ", average);
        System.out.println("Lowest grade is " + min + " (" + minStudent.getName() + ").");
        System.out.println("Highest grade is " + max + " (" + maxStudent.getName() + ").");

        System.out.println("\nGrades distribution:");
        for (int i = 0; i < distribution.length; i++) {
            String label = (i == 10) ? "100:" : (i*10 + "-" + (i*10+9) + ":");
            System.out.print(label + " ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for: " + course;
    }
}