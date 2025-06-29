package Ex5;

public class Test {
    public static void main(String[] args) {
        // Test Chocolate sorting
        Chocolate[] chocolates = {
            new Chocolate("Twix", 50),
            new Chocolate("Mars", 45),
            new Chocolate("Snickers", 55)
        };
        System.out.println("Before sorting chocolates:");
        for (Chocolate c : chocolates) System.out.println(c);

        Sort.bubbleSort(chocolates);
        System.out.println("\nAfter bubble sort:");
        for (Chocolate c : chocolates) System.out.println(c);

        // Test Time sorting
        Time[] times = {
            new Time(10, 30),
            new Time(9, 45),
            new Time(10, 15)
        };
        System.out.println("\nBefore sorting times:");
        for (Time t : times) System.out.println(t);

        Sort.selectionSort(times);
        System.out.println("\nAfter selection sort:");
        for (Time t : times) System.out.println(t);
    }
}