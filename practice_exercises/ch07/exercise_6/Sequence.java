public class Sequence
{
    private int[] values;
    private int currentSize;
    /**
        Construct a Sequence of integers with the specified maximum size
        @param capacity the maximum size of this Sequence
    */
    public Sequence(int capacity)
    {
        values = new int[capacity];
        currentSize = 0;
    }
    
    /**
        Add an integer to this Sequence
        @return true if the element was added to this Sequence,
        otherwise false
    */
    public boolean add(int n)
    {
        boolean added;
        
        if (currentSize < values.length)
        {
            values[currentSize] = n;
            currentSize++;
            added = true;
        }
        else
        {
            added = false;
        }
        
        return added;
    }
    
    /**
        Reverses the order of the elements in this Sequence
    */
    public void reverse()
    {
        int i = 0;
        int j = currentSize - 1;
        while (i < j)
        {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            i++;
            j--;
        }
    }
    
    /**
        Returns a String representation of this sequence 
    */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < currentSize; i++)
        {
            if (i > 0)
            {
                output = output.concat(", ");
            }
            output = output + values[i];
        }
        
        return output;
    }
}
