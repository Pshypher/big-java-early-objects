import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LetterL
{
        private int xLeft;
        private int yTop;
        private int strokeSize;
        
        public LetterL(int x, int y, int size)
        {
                xLeft = x;
                yTop = y;
                strokeSize = size;
        }
        
        public void draw(Graphics2D g2)
        {
                // Points and Line for the left vertical bar of the alphabet L
                Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
                Point2D.Double p2 = new Point2D.Double(xLeft, yTop + strokeSize * 2);
                Line2D.Double verticalBar = new Line2D.Double(p1, p2);
                
                // Point and Line for the horizontal bar at the bottom of the alphabet L
                Point2D.Double p3 = new Point2D.Double(xLeft + strokeSize, yTop + strokeSize * 2);
                Line2D.Double bottomHorizontalBar = new Line2D.Double(p2, p3);
                
                g2.draw(verticalBar);
                g2.draw(bottomHorizontalBar);
        }
        
}