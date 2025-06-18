package Ex2;

public class Student extends Person implements StudentInterface {

	@Override
	public void eatPizza() {
		System.out.println("Student is eating pizza!");
	}

	@Override
	public void CanHaveRetake() {
		System.out.println("Student Got retake From OOP");
	}

	@Override
	public void CanHaveParty() {
		System.out.println("Student is at the club with his buddies!");
	}

	@Override
	public void Movable() {
		System.out.println("Student is not movable");
	}
	
	static {
		Person.P();
	}

}
