import java.util.Scanner;

public class testArray 
{

	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Please enter the number of values to be entered: ");
		int arrayLength = keyboard.nextInt();
		int[] arrayOne=new int[arrayLength];
		int sum = 0;
		
		
		for (arrayLength=0; arrayLength<arrayOne.length; arrayLength++)
			{
			System.out.println("Please enter your a value for "+(arrayLength+1)+":");
			arrayOne[arrayLength]=keyboard.nextInt();
			}
		for (arrayLength=0; arrayLength<arrayOne.length; arrayLength++)
			{
			System.out.println("Your values are: " + arrayOne[arrayLength]);
			}
		for (arrayLength=0; arrayLength<arrayOne.length; arrayLength++)
			{
			sum += arrayOne[arrayLength];
			}
		System.out.println("Sum of these values is: " + sum);
		keyboard.close();
	}

}