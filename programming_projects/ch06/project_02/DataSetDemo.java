import java.util.Scanner;

/**
    This program calculates the mean, standard-deviation of
    a sequence of floating-point values.
*/
public class DataSetDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        DataSet dataSet = new DataSet();
    
        System.out.println("Enter set of numbers, Q to terminate ");
        while (in.hasNextDouble())
        {
            double nextValue = in.nextDouble();
            dataSet.add(nextValue);
        }
    
        System.out.println("Mean " + dataSet.getAverage());
        System.out.println("Standard deviation " + dataSet.getStandardDeviation());
    }
}