import java.util.Random;

public class RandomPointsGenerator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        for (int i = 1; i <= 100; i++)
        {
            double point = 80 + generator.nextInt(200) 
            + generator.nextDouble();
            System.out.println(point);
        }
    }
}