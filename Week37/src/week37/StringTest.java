package week37;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a city name: ");
		String city = input.nextLine();
		
		System.out.println("Number of Letters: "+city.length());
		System.out.println("Upper Case: "+city.toUpperCase());
		System.out.println("Lower Case: "+city.toLowerCase());
		System.out.println("First Character: "+city.charAt(0));
		input.close();

	}
}