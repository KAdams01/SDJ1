package practice1;

public class TestClass {

	public static void main(String[] args) {
		Education sDJ = new Programme("SDJ1", "Java1", "1st Semester");
		Student kevin = new Student("Kevin", sDJ);

		Education junSchool = new School("Really Basic", "Junior School", School.JUNIOR_SCHOOL);
		Student nadeem = new Student("Nadeem", junSchool);

		Education highSchool = new School("Basic", "High School", School.HIGH_SCHOOL);
		Student lukas = new Student("Lukas", highSchool);

		StudentList studentList1 = new StudentList();
		studentList1.addStudent(kevin);
		studentList1.addStudent(nadeem);
		studentList1.addStudent(lukas);

		for (int i = 0; i < studentList1.getNumberOfStudents(); i++) {
			System.out.println("Education for student: " + studentList1.getStudent(i).getName()
					+ studentList1.getStudent(i).getEducation() + "\n");
		}
	}

}
