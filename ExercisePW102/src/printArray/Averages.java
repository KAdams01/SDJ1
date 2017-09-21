package printArray;

import java.util.Scanner;

public class Averages {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumOfPositive = 0;
		int sumOfNegative = 0;
		int positiveNumberCount = 0;
		int negativeNumberCount = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter value " + (i + 1) + ": ");
			int temp = input.nextInt();
			if (temp > 0) {
				sumOfPositive = sumOfPositive + temp;
				positiveNumberCount++;
			} else if (temp < 0) {
				sumOfNegative = sumOfNegative + temp;
				negativeNumberCount++;
			}
		}
		if (negativeNumberCount == 0) {
			System.out.println("No negative average available");
		}else {
			sumOfNegative = sumOfNegative / negativeNumberCount;
			System.out.println("Average of all negative integers: " + sumOfNegative);
		}
		
		
		if (positiveNumberCount == 0) {
			System.out.println("No positive average available");

		} else {
			sumOfPositive = sumOfPositive / positiveNumberCount;
			System.out.println("Average of all positive integers: " + sumOfPositive);
		}
		input.close();
	}
}
