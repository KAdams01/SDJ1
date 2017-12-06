import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentRead {

	public static void main(String[] args) {
		try {
			File file = new File("students.txt");
			Scanner inputFile = new Scanner(file);
			StudentList studList1 = new StudentList();
			while (inputFile.hasNext()) {
				String str = inputFile.nextLine();
				String[] token = str.split(",");
				
				byte groupNumber = Byte.parseByte(token[0].trim());
				int studentNumber = Integer.parseInt(token[1].trim());
				String name = token[2].trim();
				String nationality = token[3].trim();
				int dayOfMonthForBirthday = Integer.parseInt(token[4].trim());
				int birthMonth = Integer.parseInt(token[5].trim());
				int yearOfBirth = Integer.parseInt(token[6].trim());
				
				MyDate myDate1 = new MyDate(dayOfMonthForBirthday, birthMonth, yearOfBirth);
				Student student1 = new Student(name, studentNumber, nationality, groupNumber, myDate1);
				studList1.add(student1);
				System.out.println(studList1);
			}
			inputFile.close();
		} catch (FileNotFoundException fne) {
			System.out.println("File not found.");
		}

	}

}
