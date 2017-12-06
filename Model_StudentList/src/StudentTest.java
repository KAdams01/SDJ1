import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
		StudentFile sf1 = new StudentFile("students.txt");
		ArrayList<Student> byGroup = new ArrayList<>();
		
		for (int i = 0; i<sf1.readTextFile().size();i++) {
			if (1 == sf1.readTextFile().get(i).getGroupNumber()) {
				byGroup.add(sf1.readTextFile().get(i));
				System.out.println(byGroup.get(byGroup.size()-1));
			}
			
		}
		for (int i = 0; i<sf1.readTextFile().size();i++) {
			if (2 == sf1.readTextFile().get(i).getGroupNumber()) {
				byGroup.add(sf1.readTextFile().get(i));
				System.out.println(byGroup.get(byGroup.size()-1));
			}
			
		}
		
		//sf1.readTextFile();
		
//		sf1.writeTextFile(sf1.readTextFile());
//			sf1.writeBinaryFile(sf1.readTextFile());
//			sf1.setFile("output.bin");
//			sf1.readBinaryFile();
	}

}
