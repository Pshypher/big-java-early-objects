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
    
    public String toString()
    {
        return values.toString();
    }
}