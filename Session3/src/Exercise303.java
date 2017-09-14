import java.util.Scanner;
public class Exercise303
{

   public static void main(String[] args)
   {
      Scanner keyboard=new Scanner(System.in);
      System.out.print("Please enter your first value: ");
      int one=keyboard.nextInt();
      System.out.print("Please second your first value: ");
      int two=keyboard.nextInt();
      System.out.print("Please third your first value: ");
      int three=keyboard.nextInt();
      int sum=one+two+three;
      int product=one*two*three;
      System.out.println("The sum of the three values is: " + sum);
      System.out.println("The product of the three values is: " + product);
      
      keyboard.close();

   }

}
