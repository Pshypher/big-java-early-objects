import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class TrajectoryComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g; // recover Graphics2D object
        Cannonball ball = new Cannonball(15);
        ArrayList<Point> points = ball.shoot(60, 58.575, 0.05);
        for (int i = 1; i < points.size(); i++)
        {
            Point2D.Double prev = new Point2D.Double(points.get(i - 1).getX(), 
                getHeight() - points.get(i - 1).getY());
            Point2D.Double current = new Point2D.Double(points.get(i).getX(),
                getHeight() - points.get(i).getY());
            Line2D.Double curve = new Line2D.Double(prev, current);
            g2.draw(curve);
        }       
    }
}