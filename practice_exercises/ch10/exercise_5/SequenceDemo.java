package exercise_5;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        LastDigitDistribution dist3 = new LastDigitDistribution();
        dist3.process((MultiplierSequence) Sequence.multiplesOf(5), 1000);
        dist3.display();
        System.out.println();
        
        LastDigitDistribution dist4 = new LastDigitDistribution();
        dist4.process((PowerSequence) Sequence.powersOf(3), 1000);
        dist4.display();
    }
}
