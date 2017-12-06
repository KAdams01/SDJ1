import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentFile implements Serializable {
	private File file;

	public StudentFile(String filename) {
		setFile(filename);
	}

	public void setFile(String filename) {
		file = new File(filename);
	}

	public File getFile() {
		return file;
	}

	public StudentList readTextFile() throws FileNotFoundException, ParseException {
		File file = getFile();
		Scanner inputFile = new Scanner(file);
		StudentList studList1 = new StudentList();
		try {
		while (inputFile.hasNext()) {
			String str = inputFile.nextLine();
			String[] token = str.split(",");
//			if (token.length > 7) {
//				throw new ParseException("Input String has incorrect format", 0);
//			}
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
		}
		//System.out.println(studList1);
		}
		finally {
			inputFile.close();
		}
		
		return studList1;
	}

	public StudentList readTextFile(String filename) throws FileNotFoundException, ParseException {
		setFile(filename);
		return readTextFile();
	}

	public void writeTextFile(StudentList students) throws IOException {
		File file = new File("output.txt");
		PrintWriter out = new PrintWriter(file);
		ArrayList<Student> student = new ArrayList<>();
		for(int i=0; i<students.size();i++) {
			student.add(students.get(i));
		}
		for(int i=0; i<student.size(); i++) {
			out.println(student.get(i).toString());
		}
		out.close();
	}

	public void writeTextFile(StudentList students, String filename) throws IOException {
		setFile(filename);
		writeTextFile(students);
	}

	public void writeBinaryFile(StudentList list) throws IOException{
		FileOutputStream fileOut = new FileOutputStream("output.bin");
		ObjectOutputStream write = new ObjectOutputStream(fileOut);
		write.writeObject(list);
		write.close();
	}

	public void writeBinaryFile(StudentList list, String filename) throws IOException {
		setFile(filename);
		writeBinaryFile(list);
	}

	public StudentList readBinaryFile() throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
		try {
			FileInputStream inStream = new FileInputStream(file);
			in = new ObjectInputStream(inStream);
			StudentList list = (StudentList) in.readObject();
			System.out.println(list);
			return list;
		}
		finally {
			in.close();
		}
	}

	public StudentList readBinaryFile(String filename) throws IOException, ClassNotFoundException {
		setFile(filename);
		return readBinaryFile();
	}
}
