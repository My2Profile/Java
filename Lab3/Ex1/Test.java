
public class Test implements Dog { 
	
	public static void main(String[] args) {


		Test test = new Test();
		test.setAge(5);
		test.makeSound();
		System.out.println("Dog Breed: " + test.getBreed());
		test.Guard();
		

	}

	private int age;
	private String breed;

	@Override
	public void makeSound() { System.out.println("Woof Woof!"); }

	@Override
	public void setAge(int age) { this.age = age; }

	@Override
	public int getAge() { return age; }

	@Override
	public void setBreed(String breed) { this.breed = breed; }

	@Override
	public String getBreed() { return breed; }

	public void Guard() { System.out.println("Guarding the house!"); }

}