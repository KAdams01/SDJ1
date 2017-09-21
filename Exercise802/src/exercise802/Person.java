package exercise802;

public class Person {
private String person;
private String birthday;

public Person(String p, String b) {
	person=p;
	birthday=b;
}

public void setName(String p) {
	person=p;
}
public void setBirthday(String b) {
	birthday=b;
}
public String getName() {
	return person;
}
public String getBirthday() {
	return birthday;
}

}
