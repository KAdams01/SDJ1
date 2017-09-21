package exercise901;

public class Name {
	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		return firstName +" "+ lastName;
	}

	public String getFormalName() {
		return lastName + ", " + firstName;
	}
	public String fullName() {
		return firstName+ " "+lastName;
	}
	public String toString() {
		return "Your first name is: " +firstName+ " and your last name is: "+lastName;
	}
}
