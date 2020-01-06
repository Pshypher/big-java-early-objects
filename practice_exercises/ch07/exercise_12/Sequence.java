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
    
    public boolean sameValues(Sequence other)
    {
        boolean similar = true;
        
        int i = 0;
        int j = 0;    
        while (i < values.length && j < other.values.length)
        {
            if (!contains(values[i], other.values)
                || !contains(other.values[j], values))
            {
                similar = false;
                break;
            }
            
            i++;
            j++;
        }
        
        for ( ; i < values.length; i++)
        {
            if (!contains(values[i], other.values)) { similar = false; }
        }
        
        for ( ; j < other.values.length; j++)
        {
            if (!contains(values[j], values)) { similar = false; }
        }
        
        return similar;        
    }
    
    private boolean contains(int n, int[] numbers)
    {
        int i = 0;
        boolean found = false;
        while (!found && i < numbers.length)
        {
            if (n == numbers[i])
            {
                found = true;
            }
            i++;
        }
        
        return found;
    }
}