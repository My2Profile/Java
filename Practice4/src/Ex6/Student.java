package Ex6;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	
	String name;
	double gpa;
	
	public Student(String name, double gpa) { this.name = name; this.gpa = gpa;}
	
	@Override
	public int compareTo(Student o) {
		
		if(gpa > o.gpa) { return 1; }
		if(gpa < o.gpa) { return -1; }
		return 0;
		
		//We can use Double.compare(gpa, o.gpa);
		
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + "\ngpa: " + gpa;
	}

}

class NameComparator implements Comparator<Student> {

	
	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.name.compareTo(o2.name) < 0) { return -1; }
		if(o1.name.compareTo(o2.name) > 0) { return 1; }
		return 0;
		
	}

}
