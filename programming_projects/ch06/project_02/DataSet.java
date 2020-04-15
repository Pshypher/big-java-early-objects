/**
    A class that computes total, mean and standard-deviation of
    a set of floating-point values.
*/
public class DataSet
{
    private double total;
    private double sumOfSquares;
    private int count;
    
    /**
        Constructor for an empty DataSet
    */
    public DataSet()
    {
        total = 0;
        sumOfSquares = 0;
        count = 0;
    }
    
    /**
        Adds a value to the set of values.
        Increasing the number of values, the sum and the
        sum of squares whenever a new value is entered
        @param value a number in the sequence of values
    */
    public void add(double value)
    {
        total = total + value;
        sumOfSquares = sumOfSquares + value * value;
        count++;
    }
    
    /**
        Computes the average of the data set
        @return the mean of this DataSet
    */
    public double getAverage()
    {
        double avg = 0;
        if (count > 0)
        {
            avg = total / count;
        }
        return avg;
    }
    
    /**
        Calculates the standard deviation of the data set
        @return the standard deviation for this DataSet
    */
    public double getStandardDeviation()
    {
        double stdDeviation = 0;
        if (count > 0)
        {
            stdDeviation = Math.sqrt((sumOfSquares - total * total / count)
                 / (count - 1));
        }
        return stdDeviation;
    }
}