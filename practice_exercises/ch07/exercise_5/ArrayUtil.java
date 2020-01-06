/**
    A class with trivial methods for manipulating an array 
    of integers
*/
public class ArrayUtil
{
    private int[] numbers;
    private int currentSize;
    
    /**
        Constructs an empty array with the specified size
        @param capacity the maximum capacity of the array
    */
    public ArrayUtil(int capacity)
    {
        numbers = new int[capacity];
        currentSize = 0;
    }
    
    /**
        Adds an element to the array numbers
        @return true if the element was added, otherwise false
    */
    public boolean add(int n)
    {
        boolean added;
        if (currentSize < numbers.length)
        {
            numbers[currentSize] = n;
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
        Calculate the alternate sum of elements in the array numbers
        @return the alternate sum of numbers in the array
    */
    public int sum()
    {
        int total = 0;
        for (int i = 0; i < currentSize; i++)
        {
            total = (int) (total + Math.pow(-1, i) * numbers[i]);
        }
        return total;
    }
}