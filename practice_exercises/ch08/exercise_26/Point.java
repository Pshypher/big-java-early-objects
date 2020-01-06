/**
    A Point on 2D plane is the intersection of a row and
    column
*/
public class Point
{
    private int row;
    private int column;
    
    /**
        Construct a point at the intersection of the specified row
        and column
        @param aRow the row where the point lies
        @param aColumn the column which the point falls under
    */
    public Point(int aRow, int aColumn)
    {
        row = aRow;
        column = aColumn;
    }
    
    /**
        Get the row where this point lies
        @return row of this point
    */
    public int getRow()
    {
        return row;
    }
    
    /**
        Get this point's column
        @return column of the point
    */
    public int getColumn()
    {
        return column;
    }
    
    /**
        Change the row of the point in the 2D plane
        @param newRow the row where the point now lies
    */
    public void setRow(int newRow)
    {
        row = newRow;
    }
    
    /**
        Changes the column of this point to that specified
        by the parameter
        @param newColumn the new column of this point
    */
    public void setColumn(int newColumn)
    {
        column = newColumn;
    }
}