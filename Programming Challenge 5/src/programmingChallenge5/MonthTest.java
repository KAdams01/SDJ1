package programmingChallenge5;

import java.util.Scanner;

public class MonthTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Month month = new Month();
//		System.out.println("Default month is: " + month.getMonthName());
//		System.out.println("Default number: " + month.getMonthNumber());
		
		month.setMonthNumber(4);
		
		System.out.println("New month number: " + month.getMonthNumber());
		System.out.println("New month: " + month.getMonthName());
		
		Month month2 = new Month();
		month2.setMonthNumber(6);
		System.out.println("Comparison month number: " + month2.getMonthNumber());
		System.out.println("Comparison month: " + month2.getMonthName());
		
//		Month month3=new Month();
		
		System.out.println("Both months are equal: " + month.equals(month2));
		System.out.println("Does " + month.getMonthName() + " come after " + month2.getMonthName() + "?: " + month.greaterThan(month2));
		System.out.println("Does " + month.getMonthName() + " come before " + month2.getMonthName() + "?: " + month.lessThan(month2));

		System.out.println("number of objects entered: " + Month.getNumberOfObjects());
		input.close();
	}

}
