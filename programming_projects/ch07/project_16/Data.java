import java.util.Arrays;

public class Data
{
    private double[] values;
    private int valuesSize;
    
    public Data()
    {
        values = new double[10];
        valuesSize = 0;
    }
    
    public boolean add(double value)
    {
        if (valuesSize < values.length)
        {
            values[valuesSize] = value;
            valuesSize++;
            return true;
        }
        
        return false;
    }
    
    public void increase()
    {
        values = Arrays.copyOf(values, values.length * 2);
    }
    
    public void smooth()
    {
        for (int i = 0; i < valuesSize; i++)
        {
            if (0 < i && i < valuesSize - 1)
            {
                values[i] = (values[i - 1] + values[i]
                     + values[i + 1]) / 3;
            }
            
            if (i == 0)
            {
                values[i] = (values[i] + values[i + 1]) / 2;
            }
            
            if (i == valuesSize - 1)
            {
                values[i] = (values[i - 1] + values[i]) / 2;
            }
        }
    }
    
    public String toString()
    {
        String output = "";
        for (int i = 0; i < valuesSize; i++)
        {
            if (i > 0)
            {
                output = output + ", ";
            }
            output = output + String.format("%.2f", values[i]);
        }
        
        return output;
    }
}