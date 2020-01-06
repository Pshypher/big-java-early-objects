import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader
{
   private ArrayList<String> records;
   
   /**
      Constructs a CSVReader with no record
   */
   public CSVReader()
   {
      records = new ArrayList<String>();
   }
   
   /**
      Reads the record(s) within a csv file
      @param filename path of the csv file
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      File inputFile = new File(filename);
      Scanner in = new Scanner(inputFile);
      
      while (in.hasNextLine())
      {
         records.add(in.nextLine());
      }
      in.close();
   }
   
   /**
      Get the number of lines in the csv file.
      @return the number of rows
   */
   public int numberOfRows()
   {
      return records.size();
   }
   
   /**
      Get the number of fields within a row.
      @param row the row index
      @return number of fields in a row
   */
   public int numberOfFields(int row)
   {
      return split(row).size();
   }
   
   /**
      Splits the fields within a row using the comma delimiter
      @param row the row index
      @return list of fields within the row
   */
   private ArrayList<String> split(int row)
   {
      ArrayList<String> fields = new ArrayList<String>();
      
      String line = records.get(row);
      
      int i = 0;
      boolean endOfLine = false;
      while (!endOfLine)
      {
         int j;
         if (line.charAt(i) != '"')
         {
            j = line.indexOf((int) ',', i);
         }
         else
         {
            j = nextDelimiterIndex(line, i);
         }
         
         j = (j < 0) ? line.length() : j;
         String field = line.substring(i, j);
         fields.add(field);
         
         // update the ith index
         i = j + 1;
         while (i < line.length() && Character.isWhitespace(line.charAt(i)))
         {
            i++;
         }
         
         if (i >= line.length()) { endOfLine = true; }  
      }
      
      return fields;
   }
   
   /**
      Gets the position of the delimiter within the line
      starting from the given position
      @param line the searched string 
      @param fromIndex the beginning index
   */
   private int nextDelimiterIndex(String line, int fromIndex)
   {
      int numberOfDoubleQuotes = 1;
      boolean found = false;
      int prev = fromIndex;
      int j = fromIndex + 1;
      
      while (!found && j < line.length())
      {
         if (line.charAt(j) == '"') 
         { 
            numberOfDoubleQuotes++;
         }
         
         if (line.charAt(prev) == '"' 
            && line.charAt(j) == ','
            && numberOfDoubleQuotes % 2 == 0) 
         {
            found = true;
         }
         else
         {
            j++;
            prev = j - 1;
         }
      }
      
      return j;
   }
   
   /**
      Get the value within a given field.
      @param row the row index
      @param column the column index
   */
   public String field(int row, int column)
   {
      return split(row).get(column);
   }
}