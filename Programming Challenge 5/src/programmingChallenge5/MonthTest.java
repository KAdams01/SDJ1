package programmingChallenge5;

import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Month month  = new Month();
		System.out.println("Default month is: " + month.getMonthName());
		System.out.println("Default number: " + month.getMonthNumber());
		System.out.println("Please enter a month number: ");
		month.setMonthNumber(input.nextInt());
		System.out.println("New month number: " + month.getMonthNumber());
		System.out.println("New month: " + month.getMonthName());
	}

}
