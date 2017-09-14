import java.util.Scanner;

public class NameAndInitials
{


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String firstName,secondName,thirdName;
      char firstInitial,secondInitial,thirdInitial;
      
      System.out.println("Enter your first name");
      firstName=keyboard.nextLine();
      System.out.println("Enter your second name");
      secondName=keyboard.nextLine();
      System.out.println("Enter your last name");
      thirdName=keyboard.nextLine();
      
      firstInitial=firstName.charAt(0);
      secondInitial=secondName.charAt(0);
      thirdInitial=thirdName.charAt(0);
      
      System.out.println("Your name is "+firstName + " " +secondName + " " +thirdName);
      System.out.println("Your initials are " + " " + firstInitial + " " + secondInitial + " " + thirdInitial);
      
      keyboard.close();
      

   }

}
