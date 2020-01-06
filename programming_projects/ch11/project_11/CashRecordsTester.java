import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CashRecordsTester
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Beginning amount: ");   
      double amountBeforeSales = console.nextDouble();
      System.out.print("Amount at the close of sales: ");  
      double amountEndOfSales = console.nextDouble();
      // 49.95, 225.33
      
      System.out.print("File name: ");
      String filename = console.next();
      
      double total = 0;
       
      Scanner in = new Scanner(new File(filename));
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         Scanner lineScanner = new Scanner(line);
         
         String invoiceNumber = lineScanner.next();
         
         if (!lineScanner.hasNextDouble()) 
         {
            throw new FileNotFoundException("Amount expected");
         }
         double amount = lineScanner.nextDouble();
         
         if (lineScanner.hasNext())
         {
            String status = lineScanner.next();
            
            if (!status.equals("P") 
               && !status.equals("R")) 
            {
               amount = 0;
            }
         }
         else
         {
            amount = 0;
         }
         
         total = total + amount;
      }
      in.close();
      
      System.out.println("Actual: " + total);
      double amountReceived = amountEndOfSales - amountBeforeSales;
      System.out.println("Expected: " + amountReceived);
      
   }
}