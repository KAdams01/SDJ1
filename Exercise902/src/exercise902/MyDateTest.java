package exercise902;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(00,00,2010);
		System.out.println(date.toString());
		System.out.print("Day "+date.getDay());
		System.out.print(" of Month "+date.getMonth());
		System.out.println(" of the year "+date.getYear());		
		System.out.println(date.getYear() + " is a leap year: " + date.isLeapYear());
		System.out.println("Number of days in month " + date.getMonth() + ": " + date.numberOfDaysInMonth());
	}

}