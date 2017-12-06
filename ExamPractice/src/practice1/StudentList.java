package practice1;

import java.util.ArrayList;

public class StudentList {
	private int Size;
	private ArrayList<Student> list = new ArrayList<>();

	public StudentList() {

	}

	public void addStudent(Student student) {
		list.add(student);
	}

	public Student getStudent(int index) {
		return list.get(index);
	}

	public void removeStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(student)) {
				list.remove(i);
			}
		}
	}

	public int getNumberOfStudents() {
		return list.size();
	}

	public int getNumberOfStudentsByEducation(Education education) {
		int counter = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEducation().equals(education)) {
				counter++;
			}
		}
		return counter;
	}

	public Student[] getStudentsByEducation(Education education) {
		ArrayList<Student> arrLi = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEducation().equals(education)) {
				arrLi.add(list.get(i));
			}
		}
		Student[] studentArr = new Student[arrLi.size()];
		for (int i = 0; i < arrLi.size(); i++) {
			studentArr[i] = arrLi.get(i);
		}
		return studentArr;
	}

	public int getNumberOfHighSchoolStudents() {
		int counter = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEducation() instanceof School) {
				School school = (School) list.get(i).getEducation();
				if (school.getSchoolType().equals(School.HIGH_SCHOOL)) {
					counter++;
				}
			}
		}
		return counter;
	}

	private void doubleTheListCapacity() {

	}
}
