import java.util.ArrayList;

public class Sequence
{
    private ArrayList<Integer> values;
    
    public Sequence()
    {
        values = new ArrayList<Integer>();
    }
    
    public void add(int n)
    {
        values.add(n);
    }
    
    public Sequence append(Sequence other)
    {
        Sequence sequence = new Sequence();
        
        // Copy values from this Sequence
        
        sequence.values = new ArrayList<Integer>(values);
        
        // Append elements from other Sequence
        
        for (int element : other.values)
        {
            sequence.add(element);
        }
        
        return sequence;
    }
    
    public Sequence merge(Sequence other)
    {
        Sequence sequence = new Sequence();
        
        int i = 0;
        int j = 0;
        
        // Merge both array lists
        
        while (i < values.size() && j < other.values.size())
        {
            sequence.add(values.get(i));
            sequence.add(other.values.get(j));
            i++;
            j++;
        }
        
        if (i < values.size())
        {
            // Add remaining elements in this Sequence to 
            // merged Sequence
            for (i = i; i < values.size(); i++)
            {
                sequence.add(values.get(i));
            }
        }
        
        if (j < other.values.size())
        {
            // Add remaining elements in other Sequence to
            // merged Sequence
            for (j = j; j < other.values.size(); j++)
            {
                sequence.add(other.values.get(j));
            }
        }
        
        return sequence;
    }
    
    public Sequence mergeSorted(Sequence other)
    {
        Sequence sequence = new Sequence();
        
        int i = 0;
        int j = 0;
        
        int sortedPrefixSizeA = getSortedPrefix(values);
        int sortedPrefixSizeB = getSortedPrefix(other.values);
        
        while (i < sortedPrefixSizeA && j < sortedPrefixSizeB)
        {
            if (values.get(i) <= other.values.get(j))
            {
                sequence.add(values.get(i));
                i++;
            }
            else
            {
                sequence.add(other.values.get(j));
                j++;
            }
        }
                
        for ( ; i < sortedPrefixSizeA; i++)
        {
            sequence.add(values.get(i));
        }
        
        for ( ; j < sortedPrefixSizeB; j++)
        {
            sequence.add(other.values.get(j));
        }
        
        return sequence;
    }
    
    public int getSortedPrefix(ArrayList<Integer> integers)
    {
        int pos = 1;
        boolean sorted = true;
        while (sorted && pos < integers.size())
        {
            if (integers.get(pos - 1) > integers.get(pos))
            {
                sorted = false;
            }
            else
            {
                pos++;
            }
            
        }
        return pos;
    }
    
    public String toString()
    {
        return values.toString();
    }
}