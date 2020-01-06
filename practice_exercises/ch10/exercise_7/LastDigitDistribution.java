package exercise_7;

/**
    This class analyzes the distribution of the last digit of values
    from a sequence.
*/
public class LastDigitDistribution
{
    private int[] counters;

    /**
        Constructs a distribution whose counters are set to zero.
    */
    public LastDigitDistribution()
    {
        counters = new int[10];
    }

    /**
        Increases the count of one counters at the ith position.
        @param i position of the counter
    */
    public void addToCounter(int i)
    {
        counters[i]++;
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
