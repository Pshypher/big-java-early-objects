import java.awt.Point;
import java.util.ArrayList;

public class FlightDemo
{
    public static void main(String[] args)
    {
        Cannonball ball = new Cannonball(15);
        ArrayList<Point> points = ball.shoot(75, 21.575, 0.05);
        for (Point p : points)
        {
            System.out.printf("x: %.2f, y: %.2f", p.getX(), p.getY());
            System.out.println();
        }
        
    }
}