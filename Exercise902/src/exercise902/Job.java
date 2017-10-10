package exercise902;

public class Job {
	private String title;
	private double salary;
	private Person employee;

	public Job(String title, double salary, Person employee) {
		this.title = title;
		this.salary = salary;
		this.employee = employee;
	}

	public Job(String title, double salary) {
		this.title = title;
		this.salary = salary;
		this.employee = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Person getEmployee() {
		return employee;
	}

	public void setEmployee(Person employee) {
		this.employee = employee;
	}

	public boolean isAvailable() {
		return this.employee == null;
	}
	public void hire(Person employee) {
		if (isAvailable()) {
			this.employee=employee;
		}
	}
	public void fire() {
		this.employee=null;
	}
	public String toString() {
		if (this.employee==null) {
		return title + "\n" + salary + "kr per hour\nNo Employee assigned";
		}
		else 
			return title + "\n" + salary + "kr per hour" + employee;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof MyDate))
			return false;
		Job other = (Job) obj;
		return title.equals(other.title)&& salary==other.salary && employee.equals(other.employee);
	}
}