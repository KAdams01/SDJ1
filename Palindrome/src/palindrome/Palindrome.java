package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean palindrome = true;
		System.out.println("Please enter a word.");
		String text = input.nextLine();
		

		for (int i = 0; i < text.length()/2; i++) {
			if (text.charAt(i) != text.charAt(text.length()-1 - i)) {
				palindrome = false;
				break;
			}
		}

		System.out.println("Word is a palindrome: " + palindrome);
		input.close();
	}
}
