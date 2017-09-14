import java.util.Scanner;

public class OvertimeRates
{
   static double output,excessHours,hoursWorked,hourlyRate;
   static double overtime=1.5;
                                                                         //Overtime is a non-essential variable at the moment as 
                                                                         //it is assigned a literal, but may be variable later.
   
   public static void main(String[] args)
   {
      Scanner keyboard=new Scanner(System.in);
      
      System.out.println("Enter number of hours worked");
      hoursWorked=keyboard.nextFloat();
      
      System.out.println("Enter your hourly rate");
      hourlyRate=keyboard.nextFloat();
      
      if (hoursWorked>37) 
      {
         excessHours=(hoursWorked-37);
         output=((hourlyRate*overtime)*excessHours)+(hourlyRate*37);
      }
      else
      {
         output=(hoursWorked*hourlyRate);
      }
      System.out.println("Your salary is "+output+"kr");
      keyboard.close();      
      
   }
   
}
