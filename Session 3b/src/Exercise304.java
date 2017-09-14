import java.util.Scanner;
public class Exercise304
{

   public static void main(String[] args)
   {
      Scanner keyboard=new Scanner(System.in);
      double a, b;
      
      System.out.println("Please enter your first value: ");
      a=keyboard.nextInt();
      System.out.println("Please enter your second value: ");
      b=keyboard.nextInt();
      
      if (a>b)
         System.out.println(b + " and " + a + " are now in ascending order.");
      else if (b>a)
         System.out.println(a + " and " + b + " are now in ascending order." );
      else
         System.out.println("Please don't enter the same value for both numbers");

      System.out.println("The sum of " + a + " and " + b + " is " + (a+b)+".");
         
         
         double abdiv=(a/b);        
      if (b!=0)
         System.out.println(a + " Divided by "+b+" is equal to " + abdiv+".");
      else
         System.out.println("Cannot divide by zero!");
      
      System.out.println("The modulus of both " + a + " and " + b + " is: " + (a%b)+".");
      
      
      keyboard.close();
   }

}
