
public interface Animal {
	
	public void makeSound();

	public void setAge(int age);

	public int getAge();

}

interface Dog extends Animal{

	public void setBreed(String breed);

	public String getBreed();

	public void Guard();

}


interface Cat extends Animal {

	public void setBreed();

	public String getBreed();

	public void Play();
}
