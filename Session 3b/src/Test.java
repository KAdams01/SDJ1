import java.util.Scanner;
public class Test
{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   
   System.out.println("Please enter a value for store 1");
   int store1=input.nextInt();
   System.out.println("Please enter a value for store 2");
   int store2=input.nextInt();
   System.out.println("Please enter a value for store 3");
   int store3=input.nextInt();
   System.out.println("Please enter a value for store 4");
   int store4=input.nextInt();
   System.out.println("Please enter a value for store 5");
   int store5=input.nextInt();
   int asterisk=0;
   
   System.out.print("Store1:");
   while (asterisk<(store1/100))
   {
      System.out.print("*");
      asterisk++;
   }
   asterisk=0;
   System.out.print("\nStore2:" );
   while (asterisk<(store2/100))
   {
      System.out.print("*");
      asterisk++;
   }
   asterisk=0;
   System.out.print("\nStore3:" );
   while (asterisk<(store3/100))
   {
      System.out.print("*");
      asterisk++;
   }
   asterisk=0;
   System.out.print("\nStore4:" );
   while (asterisk<(store4/100))
   {
      System.out.print("*");
      asterisk++;
   }
   asterisk=0;
   System.out.print("\nStore5:" );
   while (asterisk<(store5/100))
   {
      System.out.print("*");
      asterisk++;
   }
   
   input.close();
}
}