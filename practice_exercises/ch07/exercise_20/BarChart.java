public class BarChart
{
    public final static int MAX_LENGTH = 40;
    private int[] bars;
    private int currentSize;
    
    /**
        Constructs a BarChart with the maximum number of getWidth for each bar
        specified along with the largest number of bars the BarChart can display
        @param capacity the total number of bars that can be displayed
    */
    public BarChart(int capacity)
    {
        bars = new int[capacity];
        currentSize = 0;
    }
    
    /**
        Adds a value to the array of int,bars
        @param value the magnitude of the bar added to this BarChart
    */
    public boolean add(int value)
    {
        if (currentSize < bars.length)
        {
            
            bars[currentSize] = value;
            currentSize++;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
        Computes the magnitude of the largest bar in this BarChart
        @return the largest value in the BarChart
    */
    private int maximum()
    {
        int largest = bars[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (bars[i] > largest)
            {
                largest = bars[i];
            }
        }
        return largest;
    }
    
    /**
        Scales a value from this BarChart such that number of asterisk
        for a bar does not exceed the maximum length
        @param value the magnitude of the bar to be scaled up to the
        maximum number of getWidth allowed
    */
    private int getWidth(int value)
    {
        return (int) (value * 1.0 / maximum() * MAX_LENGTH); 
    }
    
    /**
        Prints each bar in this BarChart using getWidth whose length is
        proportional to its magnitude
    */
    public void display()
    {
        for (int i = 0; i < currentSize; i++)
        {
            int asterisks = getWidth(bars[i]);
            int spaces;
            if (asterisks < 0)
            {
                spaces = MAX_LENGTH + asterisks;
                asterisks = Math.abs(asterisks);    
            }
            else
            {
                spaces = MAX_LENGTH;
            }
            
            for (int count = 1; count <= spaces; count++)
            {
                System.out.print(" ");
            }
            for(int count = 1; count <= asterisks; count++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}