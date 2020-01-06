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
        Sequence both = new Sequence();
        
        // Copy values from this Sequence to the Sequence both
        
        both.values = new ArrayList<Integer>(values);
        
        // Append elements from other Sequence to Sequence both
        
        for (int element : other.values)
        {
            both.add(element);
        }
        
        return both;
    }
    
    public Sequence merge(Sequence other)
    {
        Sequence mergedSequence = new Sequence();
        
        int i = 0;
        int j = 0;
        
        // Merge both array lists
        
        while (i < values.size() && j < other.values.size())
        {
            mergedSequence.add(values.get(i));
            mergedSequence.add(other.values.get(j));
            i++;
            j++;
        }
        
        if (i < values.size())
        {
            // Add remaining elements in this Sequence to 
            // merged Sequence
            for (i = i; i < values.size(); i++)
            {
                mergedSequence.add(values.get(i));
            }
        }
        
        if (j < other.values.size())
        {
            // Add remaining elements in other Sequence to
            // merged Sequence
            for (j = j; j < other.values.size(); j++)
            {
                mergedSequence.add(other.values.get(j));
            }
        }
        
        return mergedSequence;
    }
    
    public String toString()
    {
        return values.toString();
    }
}