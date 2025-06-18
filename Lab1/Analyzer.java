package Lab1;

import java.util.Scanner;


public class Analyzer extends Data{
		
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		Data data = new Data();

		while(run) {

			System.out.print("Enter number (Q  to quit): ");

			String checker = scanner.nextLine();	

			if(checker.equalsIgnoreCase("Q")) {

				run = false;

			} else {

				double number = Double.parseDouble(checker);

				data.addValue(number);

			}

		}



		System.out.println("Average: " + data.getAverage());
		System.out.println("Maximum: " + data.getMax());

		scanner.close();


	}
}


