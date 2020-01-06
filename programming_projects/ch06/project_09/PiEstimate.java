import java.util.Random;
/**
    This program calculates an estimate for pi as devised in the Buffon
    needle experiment by Comte Georges-Louis Leclerc de Buffon (1707-1788)
*/

public class PiEstimate
{
    public static void main(String[] args)
    {
        final int TRIES = 10000;
        
        Random generator = new Random();
        
        int hits = 0;
        for (int attempts = 1; attempts <= TRIES; attempts++)
        {
            double yLow = generator.nextDouble() * 2;
            double angle = generator.nextDouble() + generator.nextInt(180);
            
            double yHigh = yLow + Math.sin(Math.toRadians(angle));
            
            if (yHigh >= 2.0)
            {
                // the needle is above or just touches the 2 inch line
                hits++;
            }
        }
        System.out.println("Pi " + TRIES * 1.0 / hits); 
    }
}