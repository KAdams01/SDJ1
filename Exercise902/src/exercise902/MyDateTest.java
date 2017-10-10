package exercise902;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate();
//		System.out.print(date.getDay()+"/");
//		System.out.print(date.getMonth()+"/");
//		System.out.print(date.getYear());
//		
		System.out.println(date.toString());
		System.out.print("Day "+date.getDay());
		System.out.print(" of Month "+date.getMonth());
		System.out.println(" of the year "+date.getYear());		
		System.out.println(date.getYear() + " is a leap year: " + date.isLeapYear());
		System.out.println("Number of days in month " + date.getMonth() + ": " + date.numberOfDaysInMonth());
		date.stepForwardOneDay();
		System.out.println(date);
		date.stepForward(10);
		System.out.println("Adding 10 days: " + date);
		System.out.println(MyDate.convertToMonthNumber(date.getMonthName()));
	}

}