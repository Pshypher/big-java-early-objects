import java.util.Random;

/**
    This program simulates a drunkard walking along a grid of streets,
    moving from one intersection to the next.
*/
public class RandomWalk
{
    public static void main(String[] args)
    {
        final int INTERSECTIONS = impo100;
        Random generator = new Random();
        
        int x = 0;
        int y = 0;
        
        for (int step = 1; step <= 100; step++)
        {
            int deltaX;
            int deltaY;
            do
            {
                deltaX = -1 + generator.nextInt(3);
                deltaY = -1 + generator.nextInt(3);
            }
            while (!(x + deltaX >= 0) || !(y + deltaY >= 0)
                || x + deltaX == 0 && y + deltaY == 0);
            x = deltaX + x;
            y = deltaY + y;                
        }
        System.out.printf("(%d, %d)\n", x, y);  
    }
}


