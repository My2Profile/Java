package Ex4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double annualSalary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.hireDate = (Date) hireDate.clone();
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(Employee other) {
        super(other);
        this.annualSalary = other.annualSalary;
        this.hireDate = (Date) other.hireDate.clone();
        this.nationalInsuranceNumber = other.nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getHireDate() {
        return (Date) hireDate.clone();
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = (Date) hireDate.clone();
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + annualSalary +
                ", hireDate=" + hireDate +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.annualSalary, annualSalary) == 0 &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(nationalInsuranceNumber, employee.nationalInsuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), annualSalary, hireDate, nationalInsuranceNumber);
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.annualSalary, o.annualSalary);
    }

    @Override
    public Employee clone() {
        return new Employee(this);
    }
}
