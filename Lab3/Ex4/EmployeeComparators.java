package Ex4;

import java.util.Comparator;
import java.util.Date;

public class EmployeeComparators {
    public static Comparator<Employee> byName() {
        return Comparator.comparing(Employee::getName);
    }

    public static Comparator<Employee> byHireDate() {
        return Comparator.comparing(Employee::getHireDate);
    }
}
