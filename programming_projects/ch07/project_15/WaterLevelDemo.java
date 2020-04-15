import java.util.Scanner;

public class WaterLevelDemo
{
    public static void main(String[] args)
    {
        final int SIZE = 10;
        final int POINTS = 100;
        
        double[][] heights = new double[SIZE][SIZE];
        
        Scanner in = new Scanner(System.in);       
        System.out.println("Heights of 100 points on a terrain:");
        int count = 0;
        while (in.hasNextDouble())
        {
            if (count < POINTS)
            {
                int row = count / SIZE;
                int column = count % SIZE;
                heights[row][column] = in.nextDouble();
                count++;
            }
            else
            {
                break;
            }
        }
        
        Terrain terrain = new Terrain(heights);
        double smallest = terrain.lowest();
        double largest = terrain.highest();
        
        double step = (largest - smallest) / 10;
        
        for (double level = smallest; level < largest; level = level + step)
        {
            System.out.println();
            terrain.printFloodMap(level);
            System.out.println();
        }
    }
}