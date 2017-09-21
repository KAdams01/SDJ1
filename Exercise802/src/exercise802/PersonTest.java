package exercise802;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Person person = new Person("Kevin", "02-FEB");
		System.out.println("Please enter your name: ");
		person.setName(input.nextLine());
		System.out.println("Please enter your Birthday: ");
		person.setBirthday(input.nextLine());
		
		System.out.println("Your name is: "+person.getName());
		System.out.println("Your Birthday is: "+person.getBirthday());
		input.close();
	}

}