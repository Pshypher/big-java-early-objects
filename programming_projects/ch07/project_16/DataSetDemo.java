import java.util.Scanner;

public class DataSetDemo
{
    public static void main(String[] args)
    {
        Data data = new Data();
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter values to smoothed out: ");
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (!data.add(value))
            {
                data.increase();
                data.add(value);
            }
        }
        
        System.out.println("Before: " + data);
        data.smooth();
        System.out.println("After: " +  data);
    }
}