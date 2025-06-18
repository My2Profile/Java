package Ex5;

import java.util.Vector;

public class DragonLunch {			//Use counter++ if Girl and Counter-- if Girl
	
	Vector<Person> kidnappedPeople = new Vector<Person>();
	
	public void kidnap(Person p) {
		kidnappedPeople.add(p);
	}
	
	public void willDragonEatOrNot() {
		
		for(int i=0; i<kidnappedPeople.size()-1; i++) {
			Person p1 = kidnappedPeople.get(i);
			Person p2 = kidnappedPeople.get(i+1);
			if(p1.getGender()!=p2.getGender()) {
				kidnappedPeople.remove(i);
				kidnappedPeople.remove(i);
				i-=1;
			}
			else {
				continue;
			}
		}
		
	}
	
	public String toString() {
		if(kidnappedPeople.isEmpty()) {
			return "Dragon will not have a lunch";
		}
		else {
			return "Dragon will have a lunch";
		}
	}
	
}
