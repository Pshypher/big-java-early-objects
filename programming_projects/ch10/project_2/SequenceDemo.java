package project_2;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        LastDigitDistribution dist1 = new LastDigitDistribution();
        dist1.process(new PrimeSequence(), 1000);
        dist1.display();
        System.out.println();
    }
}
