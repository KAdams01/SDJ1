package exercise19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiveIntegersArray {

	public static void main(String[] args) {
		int[] fiveIntArray = new int[5];
		Scanner keyboard = new Scanner(System.in);
		int arrayPosition = 0;
		while(arrayPosition < fiveIntArray.length) {
			try {
				System.out.print("Type an integer in the range 10-99: ");
				int temp = keyboard.nextInt();
				if (temp < 10 || temp > 99) {
					throw new InputMismatchException("The input is not an integer in the range 10-99, try again");
				}
					fiveIntArray[arrayPosition] = temp;
					arrayPosition++;
					
			} catch (InputMismatchException e) {
				System.out.println("The input is not an integer in the range 10-99, try again");
				keyboard.nextLine();
			}
		}
		System.out.println("Program successfully ended");
		keyboard.close();
	}
}
