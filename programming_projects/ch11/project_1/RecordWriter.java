import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This class splits baby name records.
*/
public class RecordWriter
{
   private PrintWriter out;
   
   /**
      Construct a RecordWriter object used to write seperate
      baby name records
      @param filename name of the output file   
   */
   public RecordWriter(String filename) throws FileNotFoundException
   {
      out = new PrintWriter(filename);
   }
   
   /**
      Prints the rank of a baby name alongside other
      relevant data in the scanner
      @param rank baby name rank
      @param in the input stream
   */
   public void write(int rank, Scanner in)
   {
      String name = in.next();
      String token = in.next().replaceAll("\\,", "");
      int count = Integer.parseInt(token);
      double percent = in.nextDouble();
      out.printf("%d %s %d %f\n", rank, name, count, percent);
   }
   
   /**
      Closes and flushes the remaining data in the buffer
      to the output stream 
   */
   public void close()
   {
      out.close();
   }
}