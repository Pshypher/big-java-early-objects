public class MagicSquares
{
    private int row;
    private int column;
    private int[][] values;
    
    /**
        Construct a MagicSquare of n rows and columns as
        specified in the argument size
        @param size the number of rows and columns in this 
        MagicSquare
    */
    public MagicSquares(int size)
    {
        values = new int[size][size];
        row = 0;
        column = 0;
    }
    
    /**
        Adds a number to this MagicSquare's 2D-Array
        @param num value of the integer to be added
        @return true if the number was added
    */
    public boolean add(int num)
    {
        if (row < values.length && column < values[0].length)
        {
            values[row][column] = num;
            column++;
        }
        else if (row < values.length && column >= values[0].length)
        {
            row++;
            column = 0;
            values[row][column] = num;
            column++;
        }
        else
        {
            return false;
        }
        return true;  
    }
    
    /**
        Checks whether all values provided in the user's input are
        present in the range of values 1,2,3,...n*n
        @return true if all the values in this MagicSquare are in 
        1,2,3,...n*n
    */
    public boolean hasAllValues()
    {
        boolean allFound = true;
        int size = values.length * values[0].length;
        
        for (int i = 1; i <= size && allFound; i++)
        {
            boolean found = false;
            for (int j = 0; j < values.length && !found; j++)
            {
                for (int k = 0; k < values[0].length; k++)
                {
                    if (values[j][k] == i) { found = true; }
                }    
            }
            
            if (!found) { allFound = false; }
        }
        
        return allFound;
    }
    
    /**
        Checks if the sum of the rows,columns and diagonals
        are equal
        @return true if the sum in all directions are the same 
    */
    public boolean isMagicSquare()
    {
    
        // find the sum of a single row and determine if
        // subsequent rows have the same sum
        boolean sameTotal = true;
        int rowTotal = rowSum(0);        
        for (int i = 1; i < values.length && sameTotal; i++)
        {
             if (rowTotal != rowSum(i))
             {
                sameTotal = false;
             }
        }
        
        // find the sum of a single column and checks whether the
        // remaining column have the same sum as the first
        int columnTotal = columnSum(0);
        for (int i = 1; i < values[0].length && sameTotal; i++)
        {
             if (columnTotal != columnSum(i))
             {
                sameTotal = false;
             }
        }
        
        // find the sum of the diagonals and checks if both diagonals
        // are equal to each other 
        int diagonalTotal;
        sameTotal = (diagonalTotal = diagonalSum(0, 0))
            == diagonalSum(0, values[0].length - 1) 
            && sameTotal;
        
        return sameTotal
            && columnTotal == diagonalTotal
            && diagonalTotal == rowTotal;
    }
    
    /**
        Calculate the sum of values in a specific row
        @param row the row whose sum is calculated
        @return int the total of the row
    */
    public int rowSum(int row)
    {
        int total = 0;
        for (int j = 0; j < values[row].length; j++)
        {
            total = total + values[row][j];
        }
        
        return total;
    }
    
    /**
        Calculate the sum of values in a particular column
        @param col the column whose sum is calculated
        @return the sum of values in a column
    */
    public int columnSum(int col)
    {
        int total = 0;
        for (int i = 0; i < values.length; i++)
        {
            total = total + values[i][col];
        }
        
        return total;
    }
    
    /**
        Adds the diagonal starting at the row and column,which diagonal
        sum is calculated depends on the values of the argument
        @param row the row from which the diagonal is traversed
        row <= col
        @param col the column from which the diagonal is traversed
    */
    public int diagonalSum(int row, int col)
    {
        int i; 
        int j;
        if (row < col)
        {
            i = 1;
            j = -1;
        }
        else
        {
            i = 1;
            j = 1;
        }
        
        int total = 0;
        while (row < values.length 
            && (col >= 0 || col < values[0].length))
        {
            total = total + values[row][col];
            row = row + i;
            col = col + j;        
        }
        
        return total;
    }
    
    /**
        Shows an n x n matrix of this MagicSquare
    */
    public void display()
    {
        for (int i = 0; i < values.length; i++)
        {
            for (int j = 0; j < values[0].length; j++)
            {
                if (j > 0)
                {
                    System.out.print(" ");
                }
                System.out.printf("%2d", values[i][j]);
            }
            System.out.println();
        }
    }
}