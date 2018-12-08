package dk.via.user;

public class User {
	private int id;
	private String email;
	private String password;

	public User() {
		this.id = 0;
		this.email = "";
		this.password = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object o) {
		boolean result;
		if (o instanceof User) {
			User tempUser = (User) o;
			result = id == tempUser.id && email.equals(tempUser.getEmail()) && password.equals(tempUser.password);
		} else {
			result = false;
		}
		return result;
	}

}
