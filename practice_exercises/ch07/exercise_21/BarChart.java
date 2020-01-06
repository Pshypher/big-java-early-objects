public class BarChart
{
    public final static int MAX_LENGTH = 40;
    private Bar[] bars;
    private int currentSize;
    
    /**
        Constructs a BarChart with the maximum number of asterisks for each bar
        specified along with the largest number of bars the BarChart can display
        @param capacity the total number of bars that can be displayed
    */
    public BarChart(int capacity)
    {
        bars = new Bar[capacity];
        currentSize = 0;
    }
    
    /**
        Adds a Bar to this BarChart
        @param Bar the caption and magnitude of the bar 
        to be added to this BarChart
    */
    public boolean add(Bar bar)
    {
        if (currentSize < bars.length)
        {
            
            bars[currentSize] = bar;
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
        int largest = bars[0].getLength();
        for (int i = 1; i < currentSize; i++)
        {
            if (bars[i].getLength() > largest)
            {
                largest = bars[i].getLength();
            }
        }
        return largest;
    }
    
    /**
        The Bar in this BarChart whose caption has the largest number 
        of characters
        @return the Bar with the highest number of characters in its title
    */
    private int getLongestCaptionSize()
    {
        int longest = bars[0].getCaption().length();
        for (int i = 0; i < currentSize; i++)
        {
            String title = bars[i].getCaption();
            if (title.length() > longest)
            {
                longest = title.length();
            }
        }
        
        return longest;
    }
    
    /**
        Scales a value from this BarChart such that number of asterisk
        for a bar does not exceed the maximum length
        @param value the magnitude of the bar to be scaled up to the
        maximum number of asterisks allowed
    */
    private int asterisks(int value)
    {
        return (int) (value * 1.0 / maximum() * MAX_LENGTH); 
    }
    
    /**
        Prints each bar in this BarChart using asterisks whose length is
        proportional to its magnitude
    */
    public void display()
    {
        for (int i = 0; i < currentSize; i++)
        {
            String title = bars[i].getCaption();
            int spaces = getLongestCaptionSize() - title.length();
            for (int count = 1; count <= spaces; count++)
            {
                System.out.print(" ");
            }
            System.out.print(title + " ");
            
            int numAsterisks = asterisks(bars[i].getLength());
            for (int count = 1; count <= numAsterisks; count++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}