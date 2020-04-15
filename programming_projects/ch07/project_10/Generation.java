import java.util.Arrays;
import java.util.ArrayList;

public class Generation
{
    private int rows;
    private int columns;
    private String[][] currentGrid;
    
    /**
        Constructs an empty grid with a certain number of rows
        and columns
        @param rows the number of rows
        @param columns the number of columns
    */
    public Generation(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        currentGrid = new String[rows][columns];
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                currentGrid[i][j] = " ";    
            }
        }
    }
    
    /**
        Fills a row with the configuration specified in the argument line
        @param line the configuration of the row
        @param pos the position of the row
        @return true if the row of grid is filled at that position,
        otherwise false
    */
    public boolean fill(String line, int pos)
    {
        line = strip(line);
        boolean filled;
        
        if (pos < rows)
        {
            int i = 0;
            while (i < line.length())
            {
                if (i >= columns) { break; }
                else if (line.charAt(i) == 'o') 
                {
                    currentGrid[pos][i] = "o";
                }
                i++;
            }
            filled = true;
        }
        else
        {
            filled = false;
        }
        
        return filled;
    }
    
    /**
        Strips off characters from the right-end of a String
        that aren't the character o or a whitespace character.
        @return the String with the right-end stripped
    */
    private String strip(String line)
    {
        if (line.length() == 0) { return line; }
        
        int j = line.length() - 1;
        while (!(line.charAt(j) == 'o' || line.charAt(j) == ' '))
        {
            j--;
        }
        return line.substring(0, j + 1);
        
    }
    
    /**
        Generates the next configuration of empty and occupied
        cells in the grid 
    */
    public void nextGeneration()
    {
        String[][] nextGrid = new String[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                nextGrid[i][j] = " ";
            }
        }
        
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                int neighbors = getNeighbors(j, i);
                
                if (currentGrid[i][j].equals(" ") && neighbors == 3)
                {
                    nextGrid[i][j] = "o";
                }
                else if (currentGrid[i][j].equals("o") && neighbors >= 4)
                {
                    nextGrid[i][j] = " ";
                }
                else if (currentGrid[i][j].equals("o") && neighbors <= 1)
                {
                    nextGrid[i][j] = " ";
                }
                else
                {
                    nextGrid[i][j] = currentGrid[i][j];
                }
            }
        }
        currentGrid = nextGrid;
    }
    
    /**
        Counts the number of cells either empty or occupied, adjacent to
        the cell position at the specified row and column position
        @param x the column position of the cell
        @param y the row position of the cell
        @return the number of cells (empty or occupied) adjacent to the cell
        at column x, row y
    */
    private int getNeighbors(int x, int y)
    {
        int neighbors = 0;
        int[] adjacentOffsets = { -1, 0, 1 };
        
        for (int deltaY : adjacentOffsets)
        {
            for (int deltaX : adjacentOffsets)
            {
                int neighborY = y + deltaY;
                int neighborX = x + deltaX;
                if (0 <= neighborY
                    && neighborY < rows 
                    && 0 <= neighborX 
                    && neighborX < columns)
                {
                    if (neighborX == x && neighborY == y)
                    {
                        continue;
                    }
                    
                    if (currentGrid[neighborY][neighborX].equals("o"))
                    {
                        neighbors++;
                    }    
                }
            }
        }
        
        return neighbors;
    }
    
    /**
        Returns a String representation of this Generation
        @return the string of this Generation
    */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                output = output.concat(currentGrid[i][j]);
            }
            output = output.concat("\n");
        }
        
        return output;
    }
}