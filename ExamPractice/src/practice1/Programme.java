package practice1;

public class Programme extends Education {
	private String level;

	public Programme(String code, String title, String level) {
		super(code, title);
		this.level = level;
	}

	public String getLevel() {
		return this.level;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Programme)) {
			return false;
		}
		Programme other = (Programme) obj;
		return level.equals(other.level);
	}

	public String toString() {
		return super.toString() + "\nProgramme level: " + level;
	}
}
