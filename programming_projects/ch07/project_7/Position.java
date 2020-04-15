/**
    Models the position of a seat in a theatre
*/
public class Position
{

    private int row;
    private int col;
    
    /**
        Construct a Position with discrete points in a 2D plane
        @param rowNumber the row where this Position lies
        @param columnNumber the column where this Position falls under.
    */
    public Position(int rowNumber, int columnNumber)
    {
        row = rowNumber;
        col = columnNumber;
    }
    
    /**
        Return this Position's row number
        @return an int
    */
    public int getRow()
    {
        return row;
    }
    
    /**
        Return this Position's column number
        @return an int the column where this Position falls 
    */
    public int getColumn()
    {
        return col;
    }
    
    /**
        String representation of this Position
        @return a String
    */
    public String toString()
    {
        return String.format("row %d, column %d", row++, col++);
    }
}