package practice1;

public class School extends Education {
	private String type;
	public static final String INFANT_SCHOOL = "Infant School";
	public static final String JUNIOR_SCHOOL = "Junior School";
	public static final String SECONDARY_SCHOOL = "Secondary School";
	public static final String HIGH_SCHOOL = "High School";

	public School(String code, String title, String type) {
		super(code, title);
		this.type = type;
	}

	public String getSchoolType() {
		return type;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof School)) {
			return false;
		}
		School other = (School) obj;
		return type.equals(other.type);
	}

	public String toString() {
		return super.toString() + "\nSchool Type: " + type;
	}

}
