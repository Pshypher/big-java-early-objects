import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This program reads coin values and prints the total.
*/
public class CoinSumPrinter
{
   public static void main(String[] args)
   {
      boolean done = false;
      while (!done)
      {
         try
         {
            System.out.print("File name: ");
            Scanner console = new Scanner(System.in);
            String filename = console.next();
            
            ArrayList<Coin> coins = readFile(filename);
            double total = 0;
            for (Coin c : coins)
            {
               total = total + c.getValue();
            }
            
            System.out.printf("Total: $%.2f\n", total);
            done = true;
            
         }
         catch (IOException exception)
         {
            System.out.println(exception.getMessage());
         }
      }
   }
   
   public static ArrayList<Coin> readFile(String filename) throws IOException
   {
      File inputFile = new File(filename);
      Scanner in = new Scanner(inputFile);
      
      ArrayList<Coin> coins = new ArrayList<Coin>();
      while (in.hasNext())
      {
         Coin coin = new Coin();
         coin.read(in);
         coins.add(coin);
      }
      
      in.close();
      return coins;
   }
}