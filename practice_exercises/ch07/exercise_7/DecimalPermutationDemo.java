import java.util.Arrays;

/**
    This program prints a sequence of unordered numbers between 1 and 10 inclusive.
*/
public class DecimalPermutationDemo
{
    public static void main(String[] args)
    {
        DecimalPermutator generator = new DecimalPermutator();
        int[] decimals = generator.nextPermutation();
        System.out.println(Arrays.toString(decimals));
        System.out.println(generator);
    }
}