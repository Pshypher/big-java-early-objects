public class Grid
{
    private int rows;
    private int columns;
    private Mark[][] grid;
    private Mark winner;
     
    /**
        Construct an empty grid with the specified row size
        and column size
        @param rowSize the number of rows in the grid
        @param columnSize number of columns in the grid  
    */
    public Grid(int rowSize, int columnSize)
    {
        rows = rowSize;
        columns = columnSize;
        winner = new Mark(' ');
        
        grid = new Mark[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                grid[i][j] = new Mark(' ');
            }
        }
    }
    
    /**
        Displays the grid
    */
    public void draw()
    {
        for (int i = 0; i < rows; i++)
        {
            if (i > 0)
            {
                System.out.println("-----------");
            }

            for (int j = 0; j < columns; j++)
            {
                if (j > 0)
                {
                    System.out.print(" | ");
                }
                else { System.out.print(" "); }
                System.out.print(grid[i][j]);
            }
            System.out.println();
                       
        }
    }
    
    /**
        Checks if the grid contains the specified mark
        @return true if the mark is present in this Grid
    */
    public boolean has(Mark mark)
    {
        boolean found = false;
        
        for (int i = 0; i < rows && !found; i++)
        {
            for (int j = 0; j < rows && !found; j++)
            {
                if (grid[i][j].getChar() == mark.getChar())
                {
                    found = true;
                }
            }
        }
        
        return found;
    }
    
    /**
        Checks whether the position in the grid has either
        an X or an O
        @param col the column of the cell
        @param row the row of the cell 
        @return true if the cell in this Grid is occupied
    */
    public boolean isOccupied(int col, int row)
    {
        return grid[row][col].getChar() == 'X' 
            || grid[row][col].getChar() == 'O';
    }
    
    /**
        Fetch the mark at the specified position in this Grid
        @param col column of the cell
        @param row the row of the cell 
        @return the Mark at the position 
    */
    public Mark getMark(int col, int row)
    {
        return grid[row][col];
    }
    
    /**
        Place a mark at the cell specified via the grid's
        row and column
        @param mark the mark to be placed on this grid
        @param col the column to place the mark
        @param row the row where the mark is placed
    */
    public void setMark(Mark mark, int col, int row)
    {
        grid[row][col] = mark;
    }
    
    /**
        Returns the winner determined by a set of rules for winning the game
        @return the Mark on the grid used to win the game 
    */
    public Mark winner()
    {
        return winner;
    }
    
    /**
        Checks if either all Xs or all Os lies on the same row
        @return true if a mark is all the same on a row
    */
    public boolean sameHorizontal()
    {
        boolean same = false;
        
        
        for (int i = 0; i < rows && !same; i++)
        {
            if (isOccupied(0, i))
            {
                if (grid[i][0].getChar() == grid[i][1].getChar()
                    && grid[i][1].getChar() == grid[i][2].getChar())
                {
                    same = true;                
                    winner = grid[i][0];
                }
            }
        }
        
        return same;
    }
    
    /**
        Checks whether all Xs or all Os lies on the same column
        @return true if the mark is the same throughout a column
    */
    public boolean sameVertical()
    {
        boolean same = false;
        
        
        for (int i = 0; i < rows && !same; i++)
        {
            if (isOccupied(i, 0))
            {
                if (grid[0][i].getChar() == grid[1][i].getChar()
                    && grid[1][i].getChar() == grid[2][i].getChar())
                {
                    same = true;
                    winner = grid[0][i];
                }
            }
        }
        
        return same;
    }
    
    /**
        Checks whether all Os or all Xs lie on a diagonal.
        @return true if the occupied cells have the same
        marks across a diagonal
    */
    public boolean sameDiagonal()
    {
        if (!isOccupied(1, 1)) { return false; }
        
        boolean same = false;
        
        if (grid[1][1].getChar() == grid[0][0].getChar()
            && grid[1][1].getChar() == grid[2][2].getChar()
            || grid[1][1].getChar() == grid[0][2].getChar()
            && grid[1][1].getChar() == grid[2][0].getChar())
        {
            same = true;
            winner = grid[1][1];
        }
        return same;
    }
}