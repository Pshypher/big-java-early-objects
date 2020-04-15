public class TableTester
{
    public static void main(String[] args)
    {
        final int ROWS = 8;
        final int COLUMNS = 3;
        
        Table medals = new Table(ROWS, COLUMNS);
        
        int[][] counts = {
                { 0, 3, 0 },
                { 0, 0, 1 },
                { 0, 0, 1 },
                { 1, 0, 0 },
                { 0, 0, 1 },
                { 3, 1, 1 },
                { 0, 1, 0 },
                { 1, 0, 1 } 
            };
            
            for (int i = 0; i < ROWS; i++)
            {
                for (int j = 0; j < COLUMNS; j++)
                {
                    medals.set(i, j, counts[i][j]);
                }
            }
            
            // sum rows if horizontal is true, otherwise sum columns
            System.out.println("Actual: " + medals.sum(7, true));
            System.out.println("Expected: 2");
            System.out.println();
            
            System.out.println("Actual: " + medals.sum(0, false));
            System.out.println("Expected: 5");
            System.out.println();
            
            System.out.println("Actual: " + medals.sum(5, false));
            System.out.println("Expected: 0");
    }
}