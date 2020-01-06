import java.util.Arrays;
import java.util.Random;

/**
    This class generates different permutations of the numbers 1 to 10.
*/
public class DecimalPermutator
{
    public static final int LENGTH = 10;
    
    private int[] decimals;
    private int currentSize;
    
    /**
        Constructs an object of a DecimalPermutator, filling the
        array variable decimals with integers 1 - 10, whilst recording
        the size in memory of the array decimals.
    */
    public DecimalPermutator()
    {
        decimals = new int[LENGTH];
        currentSize = 0;
        
        for (int i = 0; i < decimals.length; i++)
        {
            decimals[i] = i + 1;
            currentSize++;
        }
    }
    
    /**
        Get a permutation of the numbers 1 - 10. Each element in the array
        is randomly selected from the array of integers 1 - 10 in the previous
        permutation.
        @return an array of the unordered integers 1 - 10
    */
    public int[] nextPermutation()
    {
        int[] newDecimals = new int[LENGTH];
        Random generator = new Random();
        for (int i = 0; i < newDecimals.length && currentSize > 0; i++)
        {
            int pos = generator.nextInt(currentSize);
            int value = remove(pos);
            newDecimals[i] = value;
        }
        decimals = Arrays.copyOf(newDecimals, newDecimals.length);
        
        return newDecimals;
    }
    
    /**
        Removes the element at the specified position
        @param pos the index of the element to be removed
        @return the element removed at pos
    */
    public int remove(int pos)
    {
        int removedValue = decimals[pos];
        
        for (int i = pos + 1; i < currentSize; i++)
        {
            decimals[i - 1] = decimals[i];
        }
        currentSize--;
        
        return removedValue;
    }
    
    /**
        Get a string representation of a DecimalPermutator
        @return a string containing the random permutation of the numbers 1 - 10
    */
    public String toString()
    {
        return Arrays.toString(decimals);
    }
}