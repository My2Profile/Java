package Ex5;

enum Gender {
	B,
	G
};

public class Person {
	
	private Gender gender;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return "Gender: " + gender;
	}
	
	
	
}
