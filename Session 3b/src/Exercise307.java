import java.util.Scanner;

public class Exercise307
{

   public static void main(String[] args)
   {
      
      Scanner keyboard=new Scanner(System.in);
      double a,b,c;
      
      System.out.println("Please enter a value for: a");
      a=keyboard.nextDouble();
      System.out.println("Please enter a value for: b");
      b=keyboard.nextDouble();
      System.out.println("Please enter a value for: c");
      c=keyboard.nextDouble();
      keyboard.close();
      
      double result=Math.pow(b, 2)-4*a*c;
      
      if (result<0)
         System.out.println("This equation has no solutions");
      
      else if (result==0)
         {
            System.out.println("One solution given: ");
            System.out.println("x = " + ( b / (2*a)  )  );
         }
         
      else if (result>0)
         {
            System.out.println("Two solutions given: ");
            System.out.println("x = " + (-b + Math.sqrt(result) ) / (2*a) );
            System.out.println("x = " + (-b - Math.sqrt(result) ) / (2*a) );
         }
      
   }

}
