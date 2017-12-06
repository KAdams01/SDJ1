package exercise902;

public class Time {
	private int hour, minute, second;

	public Time(int h, int m, int s) {
		if (h > 24)
			hour = h % 24;
		else
			hour = h;
		while (m > 60) {
			m -= 60;
			hour++;
		}
		minute = m;
		while (s > 60) {
			second = s - 60;
			minute++;
		}
		second = s;

	}

	public Time(int s) {
		while (s >= 60) {
			minute++;
			s = s - 60;
		}
		second = s;
	}

	public String toString() {
		if (hour < 10 && minute < 10 && second < 10) {
			return "0" + hour + ":0" + minute + ":0" + second;
		}
		if (minute < 10 && second < 10) {
			return hour + ":0" + minute + ":0" + second;
		}
		if (hour < 10 && minute < 10) {
			return "0" + hour + ":0" + minute + ":" + second;
		}
		if (hour < 10 && second < 10) {
			return "0" + hour + ":" + minute + ":0" + second;
		}
		if (hour < 10) {
			return "0" + hour + ":" + minute + ":" + second;
		}
		if (minute < 10) {
			return hour + ":0" + minute + second;
		}
		if (second < 10) {
			return hour + ":" + minute + ":0" + second;
		}
		return hour + ":" + minute + ":" + second;
	}
}
