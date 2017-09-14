package sum;

public class Exercise105
{
   static double one=(80);
   static double two=(140);
   static double three=(230);
   static double tax=(0.75); 
   
   public static void main(String[] args)
   {
      one=(one*tax);
      two=(two*tax);
      three=(three*tax);
      System.out.println("80kr after tax becomes " + one+"kr");
      System.out.println("140kr after tax becomes " + two+"kr");
      System.out.println("230kr after tax becomes " + three+"kr");   

   }
}