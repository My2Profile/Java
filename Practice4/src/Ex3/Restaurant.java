package Ex3;

import Ex2.CanHavePizza;
import Ex2.Person;

public class Restaurant {
	
	boolean askForPayment = false;
	
	boolean servePizza(CanHavePizza eater) {
		
		eater.eatPizza();
		
		if(eater instanceof Person) {
			askForPayment = true;
		}
		
		return askForPayment;
		
	}

}
