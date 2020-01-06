import java.util.Scanner;

/**
    Reverses the order of elements in a sequence
*/
public class ReverseSequence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter values, Q to quit:");
        
        Sequence sequence = new Sequence(100);
        
        while (in.hasNextInt())
        {
            if (!sequence.add(in.nextInt()))
            {
                System.out.println("No more integers can be added.");
                break;
            }
        }
        
        sequence.reverse();
        System.out.println(sequence);
    }
}