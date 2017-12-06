package teacher;

public class JavaTeacher extends Teacher {
	String majorCourse = "Java";

	public static void main(String[] args) {
		JavaTeacher jtObject = new JavaTeacher();
		System.out.println(jtObject.title);
		jtObject.teach();
	}
	public JavaTeacher() {
		super("Professor");
		System.out.println("I am the sub class!!");
	}
	void teach() {
		System.out.println("Teaching and Dancing");
	}
}