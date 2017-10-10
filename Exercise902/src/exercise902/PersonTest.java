package exercise902;

public class PersonTest {

	public static void main(String[] args) {
		MyDate dob = new MyDate(03,10,1994);
		MyDate dob1 = new MyDate(03,10,1994);
		Person testPerson = new Person("Lukas", dob);
		
		System.out.println(testPerson);
		System.out.println("Age: " + testPerson.getAge());
		System.out.println("dob and dob1 match: "+dob.equals(dob1));
		
	}

}