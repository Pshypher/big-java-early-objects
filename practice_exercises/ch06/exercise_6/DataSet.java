/**
    A dataset is used to smallest the largest, smallest, calculate
    the average, and the range of a set of floating-point values.
*/
public class DataSet
{
    private double total;
    private double smallest;
    private double largest;
    
    /**
        Constructor of a DataSet with at least one value.
        @param initialValue the first value in the set of floating point 
        numbers.
    */
    public DataSet(double initialValue)
    {
        total = initialValue;
        smallest = initialValue;
        largest = initialValue;
    }
    
    /**
        Adds a floating-point value to this DataSet, updates the 
        total, smallest, and largest of this DataSet
        @param value a floating point value
    */
    public void add(double value)
    {
         total = total + value;
         
         if (value < smallest)
         {
            smallest = value;
         }
         
         if (value > largest)
         {
            largest = value;
         }
    }
    
    /**
        Computes the average of this DataSet
        @param count the number of floating-point values in this DataSet
        @return the average value for this DataSet
    */
    public double getAverage(int count)
    {
        return total / count;        
    }
    
    /**
        The smallest number in the set of floating-point numbers
        @return the smallest number in this DataSet
    */
    public double getSmallest()
    {
        return smallest;
    }
    
    /**
        The largest number in the set of floating-point numbers
        @return the largest number in this DataSet
    */
    public double getLargest()
    {
        return largest;
    }
    
    /**
        Calculates the difference between the largest and smallest number in the DataSet
        @return the range of this DataSet
    */
    public double getRange()
    {
        return largest - smallest;
    }
    
}