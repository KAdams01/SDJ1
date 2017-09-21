package exercise803;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Person person = new Person("");
		
		System.out.println("Your name is: "+person.getName());
		System.out.println("Your Birthday is: "+person.getBirthday());
		input.close();
	}
}
