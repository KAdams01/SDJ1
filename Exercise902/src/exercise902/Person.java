package exercise902;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
	private String name;
	private MyDate birthday;

	public Person(String name, MyDate birthday) {
		this.name = name;
		this.birthday = birthday.copy();
	}

	public Person(MyDate birthday) {
		this.birthday = birthday.copy();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MyDate getBirthday() {
		return this.birthday;
	}

	public int getAge() {
		Calendar now = GregorianCalendar.getInstance();

		int age = (now.get(Calendar.YEAR)-this.birthday.getYear());
		if ((now.get(Calendar.MONTH)+1) < this.birthday.getMonth()) {
			age--;
		}
		if ((now.get(Calendar.MONTH)+1) == this.birthday.getMonth() && now.get(Calendar.DAY_OF_MONTH) < this.birthday.getDay()) {
			age--;
		}
		return age;
	}

	public String toString() {
		return "\nName: " + name + "\nDate of birth: "+birthday;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return name == other.name && birthday == other.birthday;
	}
}