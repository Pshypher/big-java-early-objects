import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
   This program displays the details of covalent bonds
   whose fields match the values entered by the user
*/
public class RecordMatcher
{
   public static void main(String[] args) throws IOException
   {
      Scanner console = new Scanner(System.in);
      System.out.println("T)ype, Bond E)nergy,  Bond L)ength: ");
      String command = console.next();
      
      try (Scanner in = new Scanner(new File("covalent-bonds.dat")))
      {
         CovalentBondData data = new CovalentBondData();
         while (in.hasNext())
         {
            data.read(in);
         }
         
         String result;
         if (command.toUpperCase().equals("T"))
         {
            System.out.print("Type of bond i.e.(C|C, O|Si, C|||C): ");
            String value = console.next();
            result = data.match(value);
         }
         else if (command.toUpperCase().equals("E"))
         {
            System.out.print("Bond energy in KJ/mol: ");
            double amount = console.nextDouble();
            int value = (int) amount;
            result = data.match(value);
         }
         else if (command.toUpperCase().equals("L"))
         {
            System.out.print("Bond length in nm: ");
            double value = console.nextDouble();
            result = data.match(value);
         }
         else
         {
            result = "Command not recognized.";
         }
         
         System.out.println(result);
      } 
   }
}