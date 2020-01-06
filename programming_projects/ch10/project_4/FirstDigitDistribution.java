package project_4;

/**
    This class analyzes the distribution of the first digit of values
    from a sequence.
*/
public class FirstDigitDistribution
{
    private int[] counters;

    /**
        Constructs a distribution whose counters are set to zero.
    */
    public FirstDigitDistribution()
    {
        counters = new int[10];
    }

    /**
        Processes values from this sequence.
        @param seq the sequence from which to obtain the values
        @param valuesToProcess the number of values to process
    */
    public void process(Sequence seq, int valuesToProcess)
    {
        for (int i = 1; i <= valuesToProcess; i++)
        {
            double value = seq.next();
            while (value >= 10)
            {
               value = value / 10;
            }
            
            int firstDigit = (int) value;
            counters[firstDigit]++;
        }
    }

    /**
        Displays the counter values of this distribution.
    */
    public void display()
    {
        for (int i = 0; i < counters.length; i++)
        {
            System.out.println(i + ": " + counters[i]);
        }
    }
}
