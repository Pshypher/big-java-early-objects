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
    
    public int maximum()
    {
        int largest = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        return largest;
    }
    
    public boolean isPermutationOf(Sequence other)
    {
        if (values.length != other.values.length) { return false; }
        
        int size = maximum();
        boolean[] hits = new boolean[size + 1];
        int i = 0;
        boolean stillPermutations = true;
        while (i < values.length && stillPermutations)
        {
            if (!hits[values[i]])
            {
                hits[values[i]] = true;
                int freq1 = count(values[i]);
                int freq2 = other.count(values[i]);
                
                if (freq1 != freq2) { stillPermutations = false; }
            }
            i++;
        }
        return stillPermutations;
    }
    
    public int count(int n)
    {
        int freq = 0;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] == n)
            {
                freq++;
            }
        }
        return freq;
    }
}    