
public class StockCommission
{

   public static void main(String[] args)
   {
      double commission=0.02;
      double price=25.5;
      int shares=1000;
      double finalCost;
      
      finalCost=(price*shares*commission)+(price*shares);
      System.out.println("The initial value of the stock was $"+ (price*shares)+".");
      System.out.println("With a commission of "+(commission*100)+"%.");
      System.out.println("Giving her a total cost of: $" + finalCost +".");

   }

}
