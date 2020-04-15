/**
    This program display a 10 * 10 multiplication table
*/
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        final int MAX_NUMBER = 10;
        
        for (int x = 1; x <= MAX_NUMBER; x++)
        {
            for (int y = 1; y <= MAX_NUMBER; y++)
            {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }
}