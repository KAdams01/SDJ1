import java.util.Scanner;

public class testLoops
{
static Scanner keyboard=new Scanner(System.in);

   public static void main(String[] args)
   {
      int one;
      System.out.println("Please enter a number that is less than 10");
      one=keyboard.nextInt();
      
      
      while (one < 10)
      {
         System.out.println("Now adding 1 to: " + one );
         one++;
         System.out.println("Your new number is: " + one);
      }

   }

}
