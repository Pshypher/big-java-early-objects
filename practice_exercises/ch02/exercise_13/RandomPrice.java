import java.util.Random;

public class RandomPrice 
{
   public static void main(String[] args)
   { 
      Random generator = new Random();
      double value = 1000 + generator.nextInt(995) + 1;
      System.out.print("Random price between $10.00 and $19.95 -> ");
      double price = value / 100;
      System.out.println(price);
   }   
}
