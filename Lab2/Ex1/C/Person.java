import java.util.Objects;

public class Person {
	private String name;
	private int age;

	public String getName() { return this.name; }

	public int getAge() { return this.age; }


	public void setAge(int age) { this.age = age; }

	public void setName(String name) { this.name = name; }

	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o == null || getClass() != o.getClass()) { return false; }

		Person person = (Person) o;
		return age == person.age && name.equals(person.name);
	}

	public int hashCode() { return Objects.hash(name, age); }


	@Override
	public String toString() { return "Name: " + this.getName() + "\nAge: " + this.getAge(); }

}

class Employee extends Person {
	private String employeeId;

	public String getId() { return this.employeeId; }

	public void setId(String id) { this.employeeId = id; }
	@Override
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o == null || getClass() != o.getClass()) { return false; }

		Employee employee = (Employee) o;
		return super.getAge() == employee.getAge()
			&& Objects.equals(super.getName(), employee.getName())
			&& Objects.equals(this.employeeId, employee.getId());
	}
	}
	@Override
	public int hashCode() { return Objects.hash(getName(), getAge(), employeeId); }


	@Override
	public String toString() { return "Name: " + super.getName() + "\nAge: " + super.getAge() + "\nEmployee ID: " + getId(); }

}