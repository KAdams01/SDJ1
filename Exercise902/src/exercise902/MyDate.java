package exercise902;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void set(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		if (day < 10 && month < 10)
			return "0" + day + "/0" + month + "/" + year;
		else if (day<10)
			return "0" + day + "/" + month + "/" + year;
		else if (month<10)
			return day + "/0" + month + "/" + year;
		else
			return day + "/" + month + "/" + year;
	}
}
