import java.util.Random;

public class LongestRunMarker
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int[] values = new int[20];
    
        for (int i = 1; i <= values.length ; i++)
        {
            values[i - 1] = generator.nextInt(6) + 1;    
        } 
    
        int start = 0;
        int end = 0;
        int startLongestRun = 0;
        int endLongestRun = 0;
        
        boolean inRun = false;
        for (int i = 0; i < values.length - 1; i++)
        {
            int next = values[i + 1];
            if (!inRun && values[i] == next) 
            {
                inRun = true;
                start = i; 
            }
            
            if (inRun && values[i] != next)
            {
                inRun = false;
                end = i;
            }
            
            if (end - start > endLongestRun - startLongestRun)
            {
                    startLongestRun = start;
                    endLongestRun = end;
            }
               
        }
        
        for (int i = 0; i < values.length; i++)
        {
            if (i == startLongestRun)
            {
                System.out.print("(");
            }
            
            System.out.print(values[i]);
            
            if (i == endLongestRun)
            {
                System.out.print(")");
            }
        }
    }
}