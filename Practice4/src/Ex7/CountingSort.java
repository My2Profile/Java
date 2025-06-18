package Ex7;

import java.util.ArrayList;
import java.util.Scanner;


public class CountingSort {
	
	static Scanner scanner = new Scanner(System.in);
	static int number_of_elements;
	
	
	//Creating The Array fields;
	private static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	
	private static int max = Integer.MIN_VALUE;
	
	
	
	public static void addNumbers() {
		
		System.out.println("Enter the count of the numbers you want to input: ");
		number_of_elements = scanner.nextInt();
		
		
		System.out.println();
		for(int i=0; i<number_of_elements; i++) {
			
			System.out.print("Enter the " + i +" number: ");
			int number = scanner.nextInt();
			
			numbers.add(number);
			System.out.println();
			
			max = (number > max) ? number : max; //Getting the max element;
			
		}
		
		
	}
	
	
	
	
	//Output Array and Print
	
	public static void print() {
		
		
		ArrayList<Integer> count = new ArrayList<Integer>(max+1);
		//Initialize Output array;
		ArrayList<Integer> prints = new ArrayList<Integer>(number_of_elements);
		
	
		for(int i = 0; i < max+1; i++) { count.add(0); }
		for(int i=0; i < number_of_elements; i++) {prints.add(0); }
		
		
		
		// Count Array and storing frequencies of each value
		// from numbers array; 
		
		for(int i = 0; i < number_of_elements; i++) {
			int value = count.get(numbers.get(i));
			count.set(numbers.get(i), value + 1);
		}
		
		
		for(int i = 1; i < max + 1; i++) {
			count.set(i, ( count.get(i) + count.get(i-1) ));
		}
		
		
		
		//Output array L:48 use and Printing the output
		
		for(int j=number_of_elements - 1; j >= 0; j--) {  //fixed by copilot
			
			int value = numbers.get(j);
			
			prints.set(count.get(value) - 1, value);
			
			count.set(value, count.get(value) - 1); //fixed by copilot
			
		}
		
		
		for(int i=0; i<number_of_elements; i++) {
			System.out.print(prints.get(i) + " ");
		}
		
		System.out.println();
		
	
	}
	
	
	
}
