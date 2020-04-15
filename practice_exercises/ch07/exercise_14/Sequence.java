import java.util.Arrays;

public class Sequence
{
    private int[] values;
    
    public Sequence(int size)
    {
        values = new int[size];
    }
    
    public void set(int i, int n)
    {
        values[i] = n;
    }
    
    public int get(int i)
    {
        return values[i];
    }
    
    public int size()
    {
        return values.length;
    }
    
    public boolean equals(Sequence other)
    {
        if (values.length != other.values.length) { return false; }
        
        int i = 0;
        while (i < values.length)
        {
            if (get(i) != other.get(i))
            {
                return false;
            }
            i++;
        }
        
        return true;
    }
    
    public int[] sum(Sequence other)
    {
        int[] result;
        if (values.length > other.values.length)
        {
            result = Arrays.copyOf(values, values.length);
            for (int i = 0; i < other.values.length; i++)
            {
                result[i] = result[i] + other.values[i];
            }
        }
        else
        {
            result = Arrays.copyOf(other.values, other.values.length);
            for (int i = 0; i < values.length; i++)
            {
                result[i] = result[i] + values[i];
            }
        }
        
        return result;
    }
}