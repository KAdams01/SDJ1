package exerciseforum;

public class Member {
	private String name, password;

	public Member(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public boolean checkPassword(String password) {
		if (this.password.equals(password))
			return true;
		else
			return false;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Member mem) {
		if (mem instanceof Member && this.name.equals(mem.name)
				&& this.password.equals(mem.password))
			return true;
		else
			return false;

	}
}
