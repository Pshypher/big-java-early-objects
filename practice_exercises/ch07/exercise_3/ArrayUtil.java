public class ArrayUtil
{
    private double[] values;
    private int currentSize;
    
    /**
        Constructor assigns an array reference of the specified 
        maximum length to values
        @param capacity the maximum length of the array
    */
    public ArrayUtil(int capacity)
    {
        values = new double[capacity];
    }
    
    /**
        Adds an element to the array variable values.
        @return true if the element is added to the array, false otherwise
    */
    public boolean add(double n)
    {
        if (currentSize < values.length)
        {
            values[currentSize] = n;
            currentSize++;
        }
        else
        {
            return false;
        }
        
        return true;
    }
    
    /**
        Adds the numbers in values excluding the smallest value
        @return the sum of elements in values
    */
    public double sumWithoutSmallest()
    {
        double smallest = values[0];
        double total = values[0];
        
        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] < smallest)
            {
                smallest = values[i];
            }
            total = total + values[i];
        }
        
        return total - smallest;
    }
}