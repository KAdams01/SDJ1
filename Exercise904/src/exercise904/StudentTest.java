package exercise904;

public class StudentTest {


	public static void main(String[] args) {
		Student student = new Student("",'M',0);
		student.setName("Bob");
		student.setStudyNumber(10203);
		System.out.println(student.getName());
		System.out.println(student.getGender());
		System.out.println(student.getStudyNumber());
		System.out.println(student);
		student.setName("Fred");
		student.setStudyNumber(30203);
		System.out.println(student.getName());
		System.out.println(student.getGender());
		System.out.println(student.getStudyNumber());
		System.out.println(student);
		student.setName("Bill");
		student.setStudyNumber(20203);
		System.out.println(student.getName());
		System.out.println(student.getGender());
		System.out.println(student.getStudyNumber());
		System.out.println(student);
	}

}
