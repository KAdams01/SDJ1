package session6;

import java.util.Scanner;

public class Excercise6 {

	public static void main(String[] args) {
		

		int[] userInput1= new int[4];
		int[] userInput2= new int[4];
		int[] tempNumber=new int[1];
		input(userInput1,userInput2, tempNumber);
		output(userInput1, userInput2);
	}		
	public static void input(int[] userInput1, int[] userInput2, int[] tempNumber)
	{
		Scanner keyboard=new Scanner(System.in);
		for (int count=0; count<userInput1.length; count++)
		{
			System.out.println("Please enter your " + (count+1) + " value: ");
			userInput1[count]=keyboard.nextInt();
		}
		for (int count=0; count<userInput2.length; count++)
		{
			System.out.println("Please enter your " + (count+1) + " value: ");
			userInput2[count]=keyboard.nextInt();
		}
		for (int count=0; count<userInput1.length; count++)
		{
			if (userInput1[0]>userInput1[count])
			{
				tempNumber[0]=userInput1[0];
				userInput1[0]=userInput1[count];
				userInput1[count]=tempNumber[0];
				
			}
			if (userInput1[1]>userInput1[count])
			{
				tempNumber[0]=userInput1[1];
				userInput1[1]=userInput1[count];
				userInput1[count]=tempNumber[0];
				
			}
			if (userInput1[2]>userInput1[count])
			{
				tempNumber[0]=userInput1[2];
				userInput1[2]=userInput1[count];
				userInput1[count]=tempNumber[0];
				
			}
			if (userInput1[3]>userInput1[count])
			{
				tempNumber[0]=userInput1[3];
				userInput1[3]=userInput1[count];
				userInput1[count]=tempNumber[0];
				
			}
		}
		keyboard.close();
		}
	public static void output(int[] userInput1, int[] userInput2){
		if (userInput1[0]==userInput2[0])
		{
			System.out.println("Values "+ userInput1[0] + " and " + userInput2[0]+" are the same.");
		}
	else
		{
			
			System.out.println("Values "+ userInput1[0] + " and " + userInput2[0]+" are NOT the same.");
		}
	if (userInput1[1]==userInput2[1])
		{
			System.out.println("Values "+ userInput1[1] + " and " + userInput2[1]+" are the same.");
		}
	else
		{
			
			System.out.println("Values "+ userInput1[1] + " and " + userInput2[1]+" are NOT the same.");
		}
	if (userInput1[2]==userInput2[2])
		{
			System.out.println("Values "+ userInput1[2] + " and " + userInput2[2]+" are the same.");
		}
	else
		{
			
			System.out.println("Values "+ userInput1[2] + " and " + userInput2[2]+" are NOT the same.");
		}
	if (userInput1[3]==userInput2[3])
		{
			System.out.println("Values "+ userInput1[3] + " and " + userInput2[3]+" are the same.");
		}
	else
		{
			
		System.out.println("Values " + userInput1[3] + " and " + userInput2[3] + " are NOT the same.");
	}
	}
}