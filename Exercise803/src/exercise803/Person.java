package exercise803;

public class Person {
private String person;
private String birthday;

public Person(String p, String b) {
	person=p;
	birthday=b;
}

public Person(String b) {
	birthday="02-FEB";
	person="No Name";
}

public void setName(String p) {
	person=p;
}
public String getName() {
	return person;
}
public String getBirthday() {
	return birthday;
}

}

