import java.util.Scanner;
public class Exercise302
{  
      public static void main(String[] args)
      {
         Scanner keyboard = new Scanner(System.in);
         String name,address;
         byte age;
         
         System.out.println("Please enter your full name: ");
         name=keyboard.nextLine();
         System.out.println("Please enter your age: ");
         age=keyboard.nextByte();
         System.out.println("Please enter your address: ");
         keyboard.nextLine();
         address=keyboard.nextLine();
         System.out.print("Your full name is: " + name + ".\nYour age is: "+ age + ".\n"+"Your address is: "+address+".");
         
         keyboard.close();
      }
}