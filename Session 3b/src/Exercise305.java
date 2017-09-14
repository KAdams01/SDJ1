import java.util.Scanner;
public class Exercise305
{

   public static void main(String[] args)
   {
      int age;
      Scanner keyboard=new Scanner(System.in);
      
      System.out.println("Please enter your age: ");
      age=keyboard.nextInt();
      
      if (age<0)
         System.out.println("Invalid age!");
      else if (age<=12)
         System.out.println("You are a child.");
      else if (age>12 && age<=19)
         System.out.println("You are a teenager.");
      else if (age>19 && age<=65)
         System.out.println("You are an adult.");
      else if (age>65 && age<=150)
         System.out.println("You are a senior citizen.");
      else if (age>150)
         System.out.println("You are an alien!");
      keyboard.close();
   }

}
