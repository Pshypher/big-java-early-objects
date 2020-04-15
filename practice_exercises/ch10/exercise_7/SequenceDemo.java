package exercise_7;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        Sequence squares = new SquareSequence();
        LastDigitDistribution dist1 = new LastDigitDistribution();
        squares.process(dist1, 1000);
        dist1.display();
        System.out.println();
        
        Sequence randomSeq = new RandomSequence();
        LastDigitDistribution dist2 = new LastDigitDistribution();
        randomSeq.process(dist2, 1000);
        dist2.display();
    }
}
