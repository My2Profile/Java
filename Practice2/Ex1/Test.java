package Ex1;
public class Test {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Sophomore");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Year of Study: " + student.getYearOfStudy());

        student.setYearOfStudy("Junior");
        System.out.println("Updated Year of Study: " + student.getYearOfStudy());
    }
}
