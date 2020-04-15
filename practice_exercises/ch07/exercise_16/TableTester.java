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
            
            // find the average of the neighbors
            System.out.println("Actual: " + medals.neighborAverage(0, 0));
            System.out.println("Expected: 1.0");
            System.out.println();
            
            System.out.println("Actual: " + medals.neighborAverage(7, 1));
            System.out.println("Expected: 0.6");
            System.out.println();
                        
            System.out.println("Actual: " + medals.neighborAverage(4, 0));
            System.out.println("Expected: 1.0");
            System.out.println();
                      
            System.out.println("Actual: " + medals.neighborAverage(2, 1));
            System.out.println("Expected: 0.375");
    }
}