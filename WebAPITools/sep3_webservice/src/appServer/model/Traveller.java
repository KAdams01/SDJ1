package appServer.model;

public class Traveller implements User{
	private String userName;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private double balance;
	private String address;
	
	public Traveller(String userName, String password, String email, String firstName, String lastName, String address) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = 0;
		this.address = address;
	}
	public Traveller() {
		
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String user) {
		this.userName = user;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void updateBalance(double value) {
		balance+=value;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
