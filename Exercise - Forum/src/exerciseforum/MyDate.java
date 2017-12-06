package exerciseforum;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	private int day;
	private int month;
	private int year;
	Calendar now = GregorianCalendar.getInstance();

	public MyDate() {
		this.day = now.get(Calendar.DAY_OF_MONTH);
		this.month = now.get(Calendar.MONTH) + 1;
		this.year = now.get(Calendar.YEAR);
	}

	public MyDate(int day, int month, int year) {
		set(day, month, year);
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

	public String getMonthName() {
		String monthName = "";
		switch (this.month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}
		return monthName;
	}

	public void stepForwardOneDay() {
		this.day++;
		if (this.day > numberOfDaysInMonth()) {
			this.day = 1;
			this.month++;
		}
		if (this.month > 12) {
			this.month = 1;
			this.year++;
		}
	}

	public void stepForward(int days) {
		for (int i = 0; i < days; i++) {
			stepForwardOneDay();
		}
	}

	public static int convertToMonthNumber(String monthName) {
		int monthNumber = 1;
		switch (monthName) {
		case "January":
			monthNumber = 1;
			break;
		case "February":
			monthNumber = 2;
			break;
		case "March":
			monthNumber = 3;
			break;
		case "April":
			monthNumber = 4;
			break;
		case "May":
			monthNumber = 5;
			break;
		case "June":
			monthNumber = 6;
			break;
		case "July":
			monthNumber = 7;
			break;
		case "August":
			monthNumber = 8;
			break;
		case "September":
			monthNumber = 9;
			break;
		case "October":
			monthNumber = 10;
			break;
		case "November":
			monthNumber = 11;
			break;
		case "December":
			monthNumber = 12;
			break;
		}
		return monthNumber;
	}

	public void set(int day, String month, int year) {
		int mon = convertToMonthNumber(month);
		set(day, mon, year);
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof MyDate))
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public MyDate copy() {
		MyDate temp = new MyDate(day, month, year);
		return temp;
	}
}