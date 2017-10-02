package dataGetAndSet;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Member mem1 = new Member("", "");
		Member mem2 = new Member("Random", "Name", "--address--", "--email--", "--course pref--", 123456);  // can get mem2 to read from file
																						     				// later
		System.out.println("Enter a first name: ");
		mem1.setMemberFirstName(input.nextLine());
		System.out.println("Enter a last name: ");
		mem1.setMemberLastName(input.nextLine());

		System.out.println("do these objects match?: " + mem1.equals(mem2));
		if (mem1.equals(mem2)) {
			System.out.println(mem2.toString());
		} else
			System.out.println("No person of this name found");
		input.close();

	}
}
