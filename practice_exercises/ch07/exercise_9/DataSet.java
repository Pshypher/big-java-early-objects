public class DataSet
{
    private double[] values;
    private int dataSize;
    
    /**
        Constructs an empty DataSet with a specified maximum number 
        of allowed values
        @param maximumNumberOfValues the maximum number of values this 
        DataSet can contain
    */
    public DataSet(int maximumNumberOfValues)
    {
        values = new double[maximumNumberOfValues];
        dataSize = 0;
    }
    
    /**
        Adds a number to this DataSet
        @return true if the number was added, otherwise
        false
    */
    public boolean add(double value)
    {
        boolean added;
        if (dataSize < values.length)
        {
            values[dataSize] = value;
            dataSize++;
            added = true;
        }
        else
        {
            added = false;     
        }
        
        return added;
    }
    
    /**
        Calculates the sum of all the numbers in this DataSet
        @return the sum of the values in the DataSet
    */
    public double sum()
    {
        double total = 0;
        for (double value : values)
        {
            total = total + value;
        }
        
        return total;
    }
    
    /**
        Calculates the average of this DataSet
        @return the average distribution of values in this DataSet
    */
    public double average()
    {
        return sum() / dataSize;
    }
    
    /**
        Fetches maximum value in this DataSet
        @return the largest value 
    */
    public double maximum()
    {
        double largest = values[0];
        for (int i = 1; i < dataSize; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        
        return largest;
    }
    
    /**
        Determines the minimum value in this DataSet
        @return the smallest value in this DataSet
    */
    public double minimum()
    {
        double smallest = values[0];     
        for (int i = 1; i < dataSize; i++)
        {
            if (values[i] < smallest)
            {
                smallest = values[i];
            }
        }
        
        return smallest;
    }
}