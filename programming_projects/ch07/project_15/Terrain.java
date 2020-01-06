public class Terrain
{

    private double[][] heights;
    /**
        Constructs a Terrain with several points on a square of different
        heights
        @param height a two-dimensional array of values that gives the height
        of points on a square   
    */
    public Terrain(double[][] heights)
    {
        this.heights = heights;
    }
    
    /**
        Prints the extent to which this Terrain is affected by flood.
        An asterisk is used to represent points whose heights have 
        been surpassed by the water level and a space for point on this
        Terrain that remain unaffected 
    */
    public void printFloodMap(double waterLevel)
    {
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = 0; j < heights[0].length; j++)
            {
                if (j > 0) { System.out.print(" "); }
                if (waterLevel < heights[i][j])
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    /**
        Finds the lowest point on this Terrain
        @return the height of the lowest point
    */
    public double lowest()
    {
        double smallest = heights[0][0];
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = 0; j < heights[0].length; j++)
            {
                if (heights[i][j] < smallest)
                {
                    smallest = heights[i][j];
                }
            }
        }
        
        return smallest;
    }
    
    /**
        Finds the highest point on this Terrain
        @return the height of the highest point
    */
    public double highest()
    {
        double largest = heights[0][0];
        for (int i = 0; i < heights.length; i++)
        {
            for (int j = 0; j < heights[0].length; j++)
            {
                if (heights[i][j] > largest)
                {
                    largest = heights[i][j];
                }
            }
        }
        
        return largest;
    }
}