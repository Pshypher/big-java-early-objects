import java.util.Arrays;

public class SwapHalves
{
    public static void main(String[] args)
    {
        int[] values = { 9, 13, 21, 4, 11, 7, 1, 3 };
        
        int i = 0;
        int j = values.length / 2;
        while (i < values.length / 2)
        {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            i++;
            j++;
        }
        
        System.out.println(Arrays.toString(values));
    }
}