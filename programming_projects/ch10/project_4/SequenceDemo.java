package project_4;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        FirstDigitDistribution dist1 = new FirstDigitDistribution();
        dist1.process(new SquareSequence(), 1000);
        dist1.display();
        System.out.println();

        FirstDigitDistribution dist2 = new FirstDigitDistribution();
        dist2.process(new RandomSequence(), 1000);
        dist2.display();
    }
}
