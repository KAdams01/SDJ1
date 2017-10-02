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
		set(day, month, year);
		return day;
	}

	public int getMonth() {
		set(day, month, year);
		return month;
	}

	public int getYear() {
		set(day, month, year);
		return year;
	}

	public void set(int day, int month, int year) {
		// this.day = day;
		// this.month = month;
		// this.year = year;
		if (year < 0)
			this.year = (year * -1);
		else
			this.year = year;

		if (month < 1)
			this.month = 1;
		else
			this.month = month;

		if (month > 12)
			this.month = 12;
		
		if (day < 1)
			this.day = 1;
		else
			this.day = day;
		
		if (day > numberOfDaysInMonth())
			this.day = numberOfDaysInMonth();
		
	}

	public String toString() {
		if ((day < 10 && day > 0) && (month < 10 && month > 0))
			return "0" + day + "/0" + month + "/" + year;
		else if (day < 10 && day > 0)
			return "0" + day + "/" + month + "/" + year;
		else if (month < 10 && month > 0)
			return day + "/0" + month + "/" + year;
		else
			return day + "/" + month + "/" + year;
	}

	public boolean isLeapYear() {
		if (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int numberOfDaysInMonth() {
		int numberOfDays = 0;
		switch (this.month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays = 30;
			break;
		case 2:
			if (isLeapYear() == true) {
				numberOfDays = 29;
			} else
				numberOfDays = 28;
			break;

		}
		return numberOfDays;
	}
	public String getMonthName()
	{
		return null; //
	}
}
