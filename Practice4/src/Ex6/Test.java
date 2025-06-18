package Ex6;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Temirbek", 2.8));
		students.add(new Student("Erasyl", 3.2));
		students.add(new Student("Alsiher", 3.3));
		
		System.out.println("\nBefore sorting");
		
		for(Student s : students) { System.out.println(s.toString()); }
		
		System.out.println("\nCompare using gpa");
		
		Collections.sort(students);
		
		for(Student s : students) { System.out.println(s.toString()); }
		
		Comparator<Student> myComparator = new NameComparator();
		Collections.sort(students, myComparator);
		
		System.out.println("\nUsing Name Comparator");
		
		for(Student s : students) { System.out.println(s.toString()); }
	

	}

}
