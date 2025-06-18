package Ex5;

public class Test {

    public static void main(String[] args) {
        // Create an instance of DragonLunch
        DragonLunch dl = new DragonLunch();
        
        // Create some Person objects with specific genders.
        Person p1 = new Person(Gender.G);
        Person p2 = new Person(Gender.G);
        Person p3 = new Person(Gender.B);
        Person p4 = new Person(Gender.B);
        
        // Kidnap the Person objects by adding them to the DragonLunch instance.
        dl.kidnap(p1);
        dl.kidnap(p2);
        dl.kidnap(p3);
        dl.kidnap(p4);
        
        // Process the list to decide if the Dragon will eat (this will remove some pairs)
        dl.willDragonEatOrNot();
        
        // Print the outcome. The toString() message will indicate if the Dragon will have lunch.
        System.out.println(dl);
    }
}
