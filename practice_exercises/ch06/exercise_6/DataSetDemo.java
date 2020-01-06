import java.util.Scanner;

/**
    This program computes the average, smallest, largest and
    range  of a sequence of floating-point values.
*/
public class DataSetDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Floating-point numbers, Q to quit: ");
        if (in.hasNextDouble())
        {
            double initialValue = in.nextDouble();
            DataSet dataSet = new DataSet(initialValue);
            int count = 1;
            while (in.hasNextDouble())
            {
                double value = in.nextDouble();
                dataSet.add(value);
                count++;
            }
            System.out.println("Average is " 
                + dataSet.getAverage(count) + " smallest value is "
                + dataSet.getSmallest() + " largest value is " 
                + dataSet.getLargest() + " the range equals " 
                + dataSet.getRange());
        }
        else
        {
            System.out.println("Error: Cannot create an empty data set.");
        }
        
    }
}