import java.util.ArrayList;
import java.util.Arrays;

/**
    Model of a spreadsheet used to hold tabular
    data of a .CSV file
*/
public class Table
{

    private String[][] spreadSheet;
    private int rowSize;
    
    /**
        Construct an empty spreadSheet.
        @param rows the number of lines in the CSV file.
        @param columns the number of column entries on each line
    */
    public Table(int rows, int columns)
    {
        spreadSheet = new String[rows][columns];
        rowSize = 0;
    }
    
    /**
        Adds a line from the .CSV file to the
        spreadSheet.
        @param line line to be added to spreadSheet
    */
    public void addLine(String line)
    {
        if (!(rowSize < spreadSheet.length))
        {
            spreadSheet = Arrays.copyOf(spreadSheet, 2 * rowSize);
              
        } 
        
        ArrayList<String> entries = split(line);
        for (int i = 0; i < entries.size() && i < spreadSheet[0].length; i++)
        {
            spreadSheet[rowSize][i] = removeQuotationMarks(entries.get(i));
        }
        rowSize++;
    }
    
    /**
        Get entry of the tabular data at the specified row
        and column
        @param row the row from which an entry is fetched
        @param column the column where the entry to be fetched lies
        @return entry at [row][column] of this Table
    */
    public String getEntry(int row, int column)
    {   
        String entry = null;
        if (row < rowSize && column < spreadSheet[0].length)
        {
            entry = spreadSheet[row][column];
        }
        
        return entry;
    }
    
    /**
        Splits a line using the specified seperator
        @param line the line to be split
        @return a list of substrings seperated by the delimiter
    */
    private ArrayList<String> split(String line)
    {
        ArrayList<String> words = new ArrayList<String>();
        
        int offset = 0;
        while (offset < line.length())
        {
            int target = line.indexOf(",", offset);
            if (target < 0)
            {
                words.add(line.substring(offset));
                offset = line.length();
            }
            else
            {
                words.add(line.substring(offset, target));
                offset = target + 1;
            }
        }
        
        String previous = "";
        int numberDoubleQuotes = 0;
        boolean first = true;
        int i = 0;
        while (i < words.size())
        {
            if (first)
            {
                first = false;
            }
            else if ((count(words.get(i), '"') % 2 == 1 
                    && numberDoubleQuotes % 2 == 1)
                    || (count(words.get(i), '"') % 2  == 0 
                    && numberDoubleQuotes % 2 == 1) 
                    || (count(words.get(i), '"') % 2 == 1
                    && numberDoubleQuotes % 2 == 0))
            {
                words.set(i - 1, previous + "," + words.get(i));
                words.remove(i);
                i--;
            }
                     
            previous = words.get(i);
            numberDoubleQuotes = count(previous, '"');
            i++;
        }  

        
        return words;
    }
    
    public int count(String str, char ch)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch)
            {
                count++;
            }
        }
        
        return count;
    }
    
    /**
        Removes extra quotation marks in an entry within a line
        @param entry field within a row of data whose double quotes appearing
        at the beginning, end and extra ones within each entry is to be removed
        @return entry with unnecessary double quotation marks removed
    */
    private String removeQuotationMarks(String entry)
    {
        
        if (entry.startsWith("\"") && entry.endsWith("\"")) 
        {   
            // remove extra double quotes from the start and
            // end of each field
            entry = entry.substring(1, entry.length() - 1);
        }


        int i = 1;
        while (i < entry.length() - 1)
        {
            // remove unnecessary double quotation marks from within
            // each field
            if (entry.charAt(i) == '"' && entry.charAt(i + 1) == '"')
            {
                entry = entry.substring(0, i) + entry.substring(i + 1);
            }
            else
            {
                i++;
            }
        }            
        
        return entry;
    }
    
    /**
        Get the number of rows in this Table
        @return number of rows in this Table
    */
    public int rows()
    {
        return rowSize;
    }
    
    /**
        Get the number of column entries in each row of this Table
        @return number of column in each row
    */
    public int columns()
    {
        return spreadSheet[0].length;
    }
    
    /**
        Get tabular data of .CSV file formatted as a String
        containing rows and columns of data
        @return String representation of this Table
    */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < rowSize; i++)
        {
            output = output + String.format("%35s", spreadSheet[i][0]);
            for (int j = 1; j < spreadSheet[0].length; j++)
            {
                output = output + String.format("%6s", spreadSheet[i][j]);
            }
            output = output + "\n";
        }
        return output;
    }
}
