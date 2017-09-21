package exercise901;

public class NameTest {

	public static void main(String[] args) {
		Name name = new Name("Chuck", "Norris");
		System.out.println("First Name: "+name.getFirstName());
		System.out.println("Last Name: "+name.getLastName());
		System.out.println("Full Name: "+name.fullName());
		System.out.println("Formal Name: "+name.getFormalName());
		System.out.println(name.toString());
	}

}
