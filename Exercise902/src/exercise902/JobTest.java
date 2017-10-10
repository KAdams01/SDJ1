package exercise902;

public class JobTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(02,02,1990);
		Person kevin=new Person("Kevin", date);
		Job job = new Job("Programmer",200);

		job.hire(kevin);
		System.out.println(job);
		job.fire();
		System.out.println(job);
	}

}