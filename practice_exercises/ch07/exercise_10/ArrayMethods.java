import java.util.Arrays;

public class ArrayMethods
{
    private int[] values;
        
    /**
        Constructs an ArrayMethod object with an initial array 
        of already filled in values.
        @param initialValues an array of values
    */
    public ArrayMethods(int[] initialValues) 
    {
        values = initialValues;
    }
        
    /**
        Swaps the first element in the values array with
        the last element
    */
    public void swapFirstAndLast() 
    { 
        int temp = values[0];
        values[0] = values[values.length - 1];
    }
        
    /**
        Shift all elements to the right by one and moves the last element
        into the first position
    */
    public void shiftRight() 
    { 
        int last = values[values.length - 1];   // store the value of
                                                // the last element
        // shift the values from 0 to higher index values
        // on the right
        for  (int i = values.length - 1; i > 0; i--)
        {
            values[i] = values[i - 1];
        }
            
        // insert the last element at index 0
        values[0] = last; 
    }
        
    /**
        Replace all even elements with 0.
    */
    public void replaceEvenElements() 
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 0) { values[i] = 0; }
        }
    }
        
    /**
        Replace each element except the first and last by the larger
        of its two neighbors.
    */
    public void replaceByLargerNeighbors()
    {
        for (int i = 1; i < values.length - 1; i++)
        {
            if (values[i - 1] > values[i + 1])
            {
                values[i] = values[i - 1];
            }
            else
            {
                values[i] = values[i + 1];
            }
        }
    }
        
    /**
        Removes the middle element if the array length is odd,
        or the two middle element if the array length is even.
    */
    public void removeMiddleElement()
    {
        if (values.length % 2 == 0)
        {
            remove(values.length / 2 - 1);
            remove(values.length / 2);
        }
        else
        {
            remove(values.length / 2);
        }
    }
    
    /**
        Removes element at the specified index
    */
    private void remove(int pos)
    {
        for (int i = pos + 1; i < values.length; i++)
        {
            values[i - 1] = values[i];
        }
        values = Arrays.copyOf(values, values.length - 1);  
    }
        
    /**
        Moves all even elements to the front.
    */
    public void shiftEvenElementsLeft()
    {
        int i = 0;
        int j = values.length - 1;
        while (i < j)
        {
            if (values[i] % 2 == 1)
            {
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
                j--;
            }
            else
            {
                i++;
            }
        }
    }
        
    /**
        Return the second-lergest element in the array.
        @return the second-largest element in values
    */
    public int secondLargest()
    {
        int largest = values[0];
        int secondLargest = values[values.length - 1];
        
        for (int i = 1; i < values.length - 1; i++)
        {
            if (values[i] > largest)
            {
                if (largest > secondLargest)    
                {
                    secondLargest = largest;
                    largest = values[i];
                }
                else    
                {
                    // largest <= secondLargest
                    if (values[i] > secondLargest)
                    {
                        // values[i] > secondLargest > largest
                        largest = values[i];
                    }
                    else     
                    {
                        // secondLargest > values[i] > largest
                        largest = secondLargest;
                        secondLargest = values[i];
                    }
                }
            }
            else
            {
                // values[i] <= largest
                if (values[i] > secondLargest) { secondLargest = values[i]; }
            }
        }
        
        if (largest < secondLargest) { secondLargest = largest; } 
        
        return secondLargest;
    }
            
    /**
        Return true if the array is currently sorted in increasing
        order.
        @return true if values is sorted in increasing order, otherwise
        false
    */
    public boolean isSorted() 
    {
        if (values.length <= 1) { return true; }
        
        boolean sorted = true;
        int i = 1;
        while (sorted && i < values.length)
        {
            if (values[i - 1] > values[i])
            {
                sorted = false;
            }
            i++;
        }
        return sorted;
    }
        
    /**
        Returns true if the array contains two adjacent duplicate elements
        @return true if there are two adjacent duplicatesFound in values, 
        otherwise false
    */
    public boolean containsAdjacentDuplicates() 
    {
        boolean first = true;
        int i = 0;
        while (i < values.length)
        {
            if (first)
            {
                first = false;
            }
            else if (values[i - 1] == values[i])
            {
                return true;
            }
            i++;
        }
        return false;
    }
        
    /**
        Return true if there are duplicate elements in values in any order
        @return true if there are duplicate elements, which need not
        be adjacent
    */
    public boolean containsDuplicate()
    {
        boolean duplicatesFound = false;
        int i = 0;
        outerloop:
        while (i < values.length)
        {
            int j = i + 1;
            innerloop:
            while (j < values.length)
            {
                if (values[i] == values[j])
                {
                    duplicatesFound = true;
                    break outerloop;
                }
                j++;
            }
            i++;  
        }
        return duplicatesFound;
    }
    
    /**
        Returns a String representation of this ArrayMethods object
        @return a String representation of this ArrayMethods
    */
    public String toString()
    {
        String output = "";
        for (int i = 0; i < values.length; i++)
        {
            if (i > 0)
            {
                output = output + ", ";
            }
            output = output + values[i];
        }
        
        return output;
    }
}