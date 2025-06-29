
public abstract class People {
	
	private int age;
	private String name;

	People(String name, int age) { this.name = name; this.age = age;	}


	public int getAge() {  return age;	}

	public String getName() {	return name;  }

	public abstract void Employment(boolean emp);

	

}