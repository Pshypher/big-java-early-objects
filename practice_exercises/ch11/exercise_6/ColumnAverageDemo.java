import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   This program reads a file containing two columns of floating-point numbers,
   and prints the average of each column.
*/
public class ColumnAverageDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      
      double totalColumn1 = 0;
      double totalColumn2 = 0;
      int count = 0;
      while (in.hasNextDouble())
      {
         totalColumn1 = totalColumn1 + in.nextDouble();
         totalColumn2 = totalColumn2 + in.nextDouble();
         count++;
      }
      
      double avgColumn1 = totalColumn1 / count;
      double avgColumn2 = totalColumn2 / count;
      System.out.println("1st column: " + avgColumn1);
      System.out.println("2nd column: " + avgColumn2);
   }
}