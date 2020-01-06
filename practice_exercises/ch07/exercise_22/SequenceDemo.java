import java.util.Scanner;

public class SequenceDemo
{
    public static void main(String[] args)
    {
        Sequence sequenceA = new Sequence();
        Sequence sequenceB = new Sequence();
        
        System.out.println("Enter sequence of values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            sequenceA.add(in.nextInt()); 
        }
        
        System.out.println("Enter another sequence of values, Q to quit:");
        in = new Scanner(System.in);
        while (in.hasNextInt())
        {
            sequenceB.add(in.nextInt());
        }
        
        Sequence bothSequence = sequenceA.append(sequenceB);
        
        System.out.println();
        System.out.println("Sequence A: " + sequenceA);
        System.out.println("Sequence B: " + sequenceB);
        System.out.println("Both: " + bothSequence);
    }
}