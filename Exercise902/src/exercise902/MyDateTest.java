package exercise902;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(02,02,2018);
		System.out.println(date.toString());
		System.out.print("Day "+date.getDay());
		System.out.print(" of Month "+date.getMonth());
		System.out.println(" of the year "+date.getYear());		

	}

}
