import java.util.Scanner;

public class Exercise301
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String name;
      byte age;
      
      System.out.println("Please enter your full name: ");
      name=keyboard.nextLine();
      System.out.println("Please enter your age: ");
      age=keyboard.nextByte();
      System.out.print("Your full name is: " + name + ".\nYour age is: "+ age + ".");
      
      keyboard.close();
      
      

   }

}
