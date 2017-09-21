package exercise904;

public class Student {
	private String name;
	private char gender;
	private int studyNumber;

	public Student(String name, char gender, int studyNumber) {
		this.name = name;
		this.gender = gender;
		this.studyNumber = studyNumber;
	}

	public void setName(String setName) {
		this.name = setName;
	}

	public void setStudyNumber(int setStudyNumber) {
		this.studyNumber = setStudyNumber;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public int getStudyNumber() {
		return studyNumber;
	}

	public String toString() {
		return name + ", " + " " + gender + ", " + studyNumber;
	}
}
