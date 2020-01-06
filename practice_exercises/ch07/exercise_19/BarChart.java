public class BarChart
{
    public final static int MAX_LENGTH = 20;
    private int[] heights;
    private int currentSize;
    
    /**
        Constructs a BarChart with the maximum number of asterisks for each bar
        specified along with the largest number of heights the BarChart can display
        @param capacity the total number of heights that can be displayed
    */
    public BarChart(int capacity)
    {
        heights = new int[capacity];
        currentSize = 0;
    }
    
    /**
        Adds a value to the array of int,heights
        @param value the heights of the bar added to this BarChart
    */
    public boolean add(int value)
    {
        if (currentSize < heights.length)
        {
            
            heights[currentSize] = value;
            currentSize++;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
        Computes the heights of the largest bar in this BarChart
        @return the largest value in the BarChart
    */
    private int maximum(int[] values)
    {
        int largest = values[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        return largest;
    }
    
    /**
        Scales a value from this BarChart such that number of asterisk
        for a bar does not exceed the maximum length
        @param value the heights of the bar to be scaled up to the
        maximum number of asterisks allowed
    */
    private int asterisks(int value)
    {
        return (int) (value * 1.0 / maximum(heights) * MAX_LENGTH); 
    }
    
    /**
        Prints each bar in this BarChart using asterisks whose length is
        proportional to its heights
    */
    public void display()
    {
        int[] bars = new int[currentSize];
        
        for (int i = 0; i < currentSize; i++)
        {
            bars[i] = asterisks(heights[i]);
        }
        
        int tallest = maximum(bars);
        for (int i = tallest; i > 0; i--)
        {
            for (int j = 0; j < currentSize; j++)
            {
                if (bars[j] < i)
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
}