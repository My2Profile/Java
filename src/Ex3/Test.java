package Ex3;

public class Test {

	public static void main(String[] args) {
		
		Temperature temperature = new Temperature(32);
		
		System.out.println(temperature);
		//System.out.println(temperature.toString());
		System.out.println("F to C: " + Temperature.toCelcius(35));

	}

}
