package exercise_6;

import java.util.Arrays;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        Sequence squares = new SquareSequence();
        int[] valuesOfSquares = squares.values(20);
        System.out.println(Arrays.toString(valuesOfSquares));

        Sequence randomSeq = new RandomSequence();
        int[] valuesOfRandomSeq = randomSeq.values(5);
        System.out.println(Arrays.toString(valuesOfRandomSeq));
    }
}
