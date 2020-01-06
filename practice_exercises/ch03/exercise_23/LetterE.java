import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LetterE
{
        private int xLeft;
        private int yTop;
        private int strokeSize;
        
        public LetterE(int x, int y, int size)
        {
                xLeft = x;
                yTop = y;
                strokeSize = size;
        }
        
        public void draw(Graphics2D g2)
        {
                // The vertical bar at the left of the alphabet E
                Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
                Point2D.Double p2 = new Point2D.Double(xLeft, yTop + strokeSize * 2);
                Line2D.Double verticalBar = new Line2D.Double(p1, p2);
                
                // The horizontal bar at the top of the alphabet E
                Point2D.Double p3 = new Point2D.Double(xLeft + strokeSize, yTop);
                Line2D.Double topHorizontalBar = new Line2D.Double(p1, p3);
                
                // The horizontal bar at the middle of the alphabet E
                Point2D.Double p4 = new Point2D.Double(xLeft, yTop + strokeSize);
                Point2D.Double p5 = new Point2D.Double(xLeft + strokeSize * 8/ 9, yTop + strokeSize);
                Line2D.Double middleHorizontalBar = new Line2D.Double(p4, p5);
                
                // The horizontal bar at the bottom of the alphabet E
                Point2D.Double p6 = new Point2D.Double(xLeft + strokeSize, yTop + strokeSize * 2);
                Line2D.Double bottomHorizontalBar = new Line2D.Double(p2, p6); 
                
                g2.draw(verticalBar);
                g2.draw(topHorizontalBar);
                g2.draw(middleHorizontalBar);
                g2.draw(bottomHorizontalBar);
        }
}
