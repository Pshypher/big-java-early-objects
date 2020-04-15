public class Table
{
    private int[][] values;
    
    public Table(int rows, int columns)
    {
        values = new int[rows][columns];
    }
    
    public void set(int i, int j, int n)
    {
        values[i][j] = n;
    }
    
    public double neighborAverage(int row, int column)
    {
        int total = 0;
        int neighbors = 0;
        int[] rowColumnOffset = { -1, 0, 1 };
        
        for (int deltaR : rowColumnOffset)
        {
            for (int deltaC: rowColumnOffset)
            {
                if (row + deltaR >= 0 
                    && row + deltaR < values.length
                    && column + deltaC >= 0
                    && column + deltaC < values[0].length)
                {
                    total = total + values[row + deltaR][column + deltaC];
                    neighbors++;
                }
            }
        }
        
        // remove the element at values[row + 0][column + 0]
        total = total - values[row][column];
        neighbors--;
       
        // calculate and return the average
        return total * 1.0 / neighbors;
    }
}