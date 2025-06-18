package Ex3;

import Ex2.Cat; 
import Ex2.Student; 


public class Test {

	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		
		boolean askPaymentFromCat = restaurant.servePizza(new Cat());
		
		System.out.println("Asking cat for payment? " + askPaymentFromCat);
		
		boolean askPaymentFromStudent = restaurant.servePizza(new Student());
		
		System.out.println("Asking student for payment? " + askPaymentFromStudent);
		
		
	}

}
