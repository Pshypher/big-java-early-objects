import java.util.Random;

public class RunMarker
{
    public static void main(String[] args)
    {
        int[] values = new int[20];
        Random generator = new Random();
        for (int i = 0; i < values.length; i++)
        {
            values[i] = generator.nextInt(6) + 1;   
        }
        
        boolean inRun = false;
        for (int i = 0; i < values.length; i++)
        {
            
            if (i > 0 && inRun)
            { 
                if (values[i] != values[i - 1])
                {
                    System.out.print(")");
                    inRun = false;
                }
            }
            
            if (i < values.length - 1 && !inRun)
            {
                if (values[i] == values[i + 1])
                {
                    System.out.print("(");
                    inRun = true;
                }
            } 
            System.out.print(values[i]);
        }
        if (inRun) { System.out.print(")"); }
    }
}