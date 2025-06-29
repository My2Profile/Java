package Ex4;

import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>, Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double annualSalary, java.util.Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, annualSalary, hireDate, nationalInsuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Manager(Manager other) {
        super(other);
        this.team = new Vector<>();
        for (Employee e : other.team) {
            this.team.add(e.clone());
        }
        this.bonus = other.bonus;
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", annualSalary=" + getAnnualSalary() +
                ", hireDate=" + getHireDate() +
                ", nationalInsuranceNumber='" + getNationalInsuranceNumber() + '\'' +
                ", bonus=" + bonus +
                ", teamSize=" + team.size() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 &&
                Objects.equals(team, manager.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }

    @Override
    public int compareTo(Employee o) {
        if (o instanceof Manager) {
            int cmp = Double.compare(this.getAnnualSalary(), o.getAnnualSalary());
            if (cmp == 0) {
                return Double.compare(this.bonus, ((Manager) o).bonus);
            }
            return cmp;
        } else {
            return Double.compare(this.getAnnualSalary(), o.getAnnualSalary());
        }
    }

    @Override
    public Manager clone() {
        return new Manager(this);
    }
}
