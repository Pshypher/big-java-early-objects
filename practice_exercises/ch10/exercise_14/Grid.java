import java.util.ArrayList;

/**
    A rectangular grid that stores descriptions
*/
public class Grid
{
    private String[][] grid;
    
    /**
        Construct a grid with the given rows and columns.
        @param numRows number of rows
        @param numColumns number of columns
    */
    public Grid(int numRows, int numColumns)
    {
        grid = new String[numRows][numColumns]; 
    }
    
    /**
        Adds a description string at a given location.
        @param row position of row.
        @param column position of the column
        @param description string describing the measurement
    */
    public void add(int row, int column, String description)
    {
        if (grid[row][column] == null)
        {
            grid[row][column] = description; 
        }
    }
    
    /**
        Get the description at the specified position on
        this grid.
        @param row the row position
        @param column position of the column
        @return description at the given location of this grid
    */
    public String getDescription(int row, int column)
    {
        return grid[row][column];
    }
    
    /**
        Gets only locations on this grid that are described.
        @return an array list of described locations
    */
    public ArrayList<Location> getDescribedLocations()
    {
        ArrayList<Location> describedLocations = new ArrayList<Location>();
        
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] != null)
                {
                    describedLocations.add(new Location(i, j));
                }
            }
        }
        
        return describedLocations; 
    }
    
    class Location
    {
        private int row;
        private int column;
        
        /**
            Constructs a location formed by the intersection of the position
            of a given row and column.
            @param rowIndex position of row
            @param columnIndex position of the column 
        */
        public Location(int rowIndex, int columnIndex)
        {
            row = rowIndex;
            column = columnIndex;
        }
        
        public String toString()
        {
            return "Location[row=" + row 
                 + ",column=" + column + "]";
        }
    }
}