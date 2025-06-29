package Ex4;

import java.util.Date;
import java.util.Vector;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, new Date(120, 0, 1), "NI123");
        Employee e2 = new Employee("Bob", 60000, new Date(119, 5, 15), "NI456");
        Employee e3 = new Employee("Charlie", 50000, new Date(121, 3, 10), "NI789");

        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("e1.equals(e2): " + e1.equals(e2));
        System.out.println("e1.compareTo(e2): " + e1.compareTo(e2));

        Manager m1 = new Manager("Dana", 80000, new Date(118, 2, 20), "NI111", 5000);
        m1.getTeam().add(e1);
        m1.getTeam().add(e2);
        Manager m2 = new Manager("Eve", 80000, new Date(117, 7, 5), "NI222", 7000);
        m2.getTeam().add(e3);

        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("m1.compareTo(m2): " + m1.compareTo(m2));

        // Test comparators
        Vector<Employee> employees = new Vector<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(m1);
        employees.add(m2);

        Collections.sort(employees, EmployeeComparators.byName());
        System.out.println("\nSorted by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, EmployeeComparators.byHireDate());
        System.out.println("\nSorted by hire date:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Test clone
        Employee e1Clone = e1.clone();
        System.out.println("\ne1Clone: " + e1Clone);
        System.out.println("e1 == e1Clone: " + (e1 == e1Clone));
        System.out.println("e1.equals(e1Clone): " + e1.equals(e1Clone));

        Manager m1Clone = m1.clone();
        System.out.println("\nm1Clone: " + m1Clone);
        System.out.println("m1 == m1Clone: " + (m1 == m1Clone));
        System.out.println("m1.equals(m1Clone): " + m1.equals(m1Clone));
    }
}
