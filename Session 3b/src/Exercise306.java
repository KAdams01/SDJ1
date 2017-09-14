   import java.util.Scanner;
public class Exercise306
{

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      System.out.println("Type gender (M or F): ");
      
      String line = input.nextLine();
      char gender = line.charAt(0);
      
      System.out.println("Please enter your age: ");
      int age=input.nextInt();
      
      if (gender == 'M' && age>=18)
         System.out.print("Man");
      else if (gender == 'M' && age<18)
         System.out.print("Boy");
      else if (gender == 'F' && age>=18)
         System.out.print("Woman");
      else if (gender == 'F' && age<18)
         System.out.print("Girl");
      else
         System.out.println("Next time only enter 'M' or 'F'");
      input.close();
   }
}
