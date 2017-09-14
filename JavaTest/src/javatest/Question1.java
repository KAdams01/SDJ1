package javatest;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int number = keyboard.nextInt();
		number=number%10;
		System.out.println("The last digit of your number is: "+number);
		keyboard.close();
	}

}
