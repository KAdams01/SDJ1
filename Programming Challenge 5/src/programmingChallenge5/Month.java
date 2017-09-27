package programmingChallenge5;

public class Month {
	private int monthNumber;

	public Month() {
		this.monthNumber = 1;
	}

	public Month(int monthNumber) {
		this.monthNumber = monthNumber;
		if (monthNumber > 12 || monthNumber < 1) {
			this.monthNumber = 1;
		}
	}

	public Month(String monthName) {
		switch (monthName.toLowerCase()) {
		case "january":
			this.monthNumber = 1;
			break;
		case "february":
			this.monthNumber = 2;
			break;
		case "march":
			this.monthNumber = 3;
			break;
		case "april":
			this.monthNumber = 4;
			break;
		case "may":
			this.monthNumber = 5;
			break;
		case "june":
			this.monthNumber = 6;
			break;
		case "july":
			this.monthNumber = 7;
			break;
		case "august":
			this.monthNumber = 8;
			break;
		case "september":
			this.monthNumber = 9;
			break;
		case "october":
			this.monthNumber = 10;
			break;
		case "november":
			this.monthNumber = 11;
			break;
		case "december":
			this.monthNumber = 12;
			break;
		default:
			this.monthNumber = 1;
			break;
		}
	}

	public void setMonthNumber(int monthNumber) {
		this.monthNumber = monthNumber;
		if (monthNumber > 12 || monthNumber < 1) {
			this.monthNumber = 1;
		}
	}

	public int getMonthNumber() {
		return monthNumber;
	}

	public String getMonthName() {
		String monthName;
		switch (monthNumber) {
		case 1:
			monthName="January"; break;
		case 2:
			monthName="February"; break;
		case 3:
			monthName="March"; break;
		case 4:
			monthName="April"; break;
		case 5:
			monthName="May"; break;
		case 6:
			monthName="June"; break;
		case 7:
			monthName="July"; break;
		case 8:
			monthName="August"; break;
		case 9:
			monthName="September"; break;
		case 10:
			monthName="October"; break;
		case 11:
			monthName="November"; break;
		case 12:
			monthName="December"; break;
		default: monthName="January"; break;
		}
		return monthName;
	}
	public String toString() {
		return getMonthName();
	}
//	public boolean equals(Object month2)
//	{
//		if (!(month2 instanceof Month))
//			return false;
//		Month mon = (Month)month2;
//		return 
//	}

}
