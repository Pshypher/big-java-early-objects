import java.util.Random;

public class LotteryPrinter
{     
   public static void main(String[] args)
   { 
      // Construct Random object
      Random generator = new Random();
      System.out.print("Play this combination-it'll make you rich! ");
      
      // Print six random numbers between 0 and 49 inclusive
      System.out.print((1 + generator.nextInt(49)) + ", ");
      System.out.print((1 + generator.nextInt(49)) + ", ");
      System.out.print((1 + generator.nextInt(49)) + ", ");
      System.out.print((1 + generator.nextInt(49)) + ", ");  
      System.out.print((1 + generator.nextInt(49)) + ", ");
      System.out.print(1 + generator.nextInt(49));
   }  
}
