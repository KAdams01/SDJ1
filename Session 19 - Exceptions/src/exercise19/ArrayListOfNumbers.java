package exercise19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListOfNumbers {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> AL1 = new ArrayList<>();
		boolean end = false;
		int total = 0;

		while (end == false) {
			try {
				System.out.print("Type an integer: ");
				int temp = keyboard.nextInt();
				AL1.add(temp);
			} catch (InputMismatchException e) {

				String temp = keyboard.nextLine();
				if (!(temp.equalsIgnoreCase("end"))) {
					System.out.println("The input is not an integer, try again");
				}
				if (temp.equalsIgnoreCase("end")) {
					end = true;
				}
			}

		}
		for (int i = 0; i < AL1.size(); i++) {
			total += AL1.get(i);

		}
		System.out.println("The sum of the " + AL1.size() + " integers is " + total);
		keyboard.close();
	}

}
