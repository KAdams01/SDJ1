package lecturerTest;

import java.util.ArrayList;
/** LecturerModel
 * This class describes a Lecturer Object.
 * 
 * */

public class LecturerModel {
	private String name, email, subject;
	private double salary;
	ArrayList<LecturerModel> arrListLect = new ArrayList<>();
/**Four-argument constructor. Allows for Lecturer Objects to be stored in an ArrayList.
 * Allows for searching of a Lecturer Object based on Subject.
 * @param name
 * @param email
 * @param subject
 * @param salary
 * @author Kead
 * @version 1.0 29/11/2017
 **/
	public LecturerModel(String name, String email, String subject, double salary) {
		this.name=name;
		this.email=email;
		this.subject=subject;
		this.salary=salary;
	}
	public void addLecturer(LecturerModel lec1) {
		arrListLect.add(lec1);
	}
	public ArrayList<LecturerModel> findBySubject(String subject) {
		ArrayList<LecturerModel> tempArrLi = new ArrayList<>();
		for (int i = 0; i < arrListLect.size(); i++) {
			if (arrListLect.get(i).getSubject().equals(subject)) {
				tempArrLi.add(arrListLect.get(i));
			}
		}
		return tempArrLi;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: " + name + "-- Email: " + email + "-- Subject: " +subject+ "-- Salary: "+salary + "\n";
	}
}
