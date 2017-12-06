package teacher;

public class Teacher {
	String title = "Associate Professor", dept = "ICT";

	void teach() {
		System.out.println("Teaching...");
	}
	public Teacher() {
		System.out.println("I am the superclass!!");
	}
	public Teacher(String title) {
		this.title=title;
	}
}
