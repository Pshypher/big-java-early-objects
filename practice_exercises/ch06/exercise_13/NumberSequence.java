/**
    Program prints powers of 2 from 2^0 to 2^20.
*/
public class NumberSequence
{
    public static void main(String[] args)
    {
        final int BASE = 2;
        
        for (int i = 0; i <= 20; i++)
        {
            int number = (int) Math.pow(BASE, i);
            System.out.print(number + " ");
        }
    }
}