import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
        A simple image of a Star
*/
public class Star
{
        private double xLeft;
        private double yTop;
        private int size;
     
        /**
                Constructs an object of the class Star.
                @param x the left corner of the star.
                @param y the top corner of the star.
                @param diameter the size of the star.
        */
        public Star(double x, double y, int diameter)
        {
                xLeft = x;
                yTop = y;
                size = diameter;
        }
        
        /**
                Draws an image of the Star
        */
        public void draw(Graphics2D g2)
        {
                // The first line runs diagonally from the top left corner to the bottom right corner
                Point2D.Double p1 = new Point2D.Double(xLeft, yTop);    // The top left corner of the star
                Point2D.Double p2 = new Point2D.Double(xLeft + size, yTop + size);      // bottom right corner of the star
                Line2D.Double l1 = new Line2D.Double(p1, p2);
                
                // The second line runs diagonally from the bottom left corner to the top right corner
                Point2D.Double p3 = new Point2D.Double(xLeft, yTop + size); 
                Point2D.Double p4 = new Point2D.Double(xLeft + size, yTop);
                Line2D.Double l2 = new Line2D.Double(p3, p4);
                
                // The third line is a vertical line running from top to bottom in the centre of the star
                Point2D.Double p5 = new Point2D.Double(xLeft + size / 2, yTop);
                Point2D.Double p6 = new Point2D.Double(xLeft + size / 2, yTop + size);
                Line2D.Double l3 = new Line2D.Double(p5, p6);
                
                // The fourth line is a horizontal running running across from left to right in the middle
                Point2D.Double p7 = new Point2D.Double(xLeft, yTop + size / 2);
                Point2D.Double p8 = new Point2D.Double(xLeft + size, yTop + size / 2);
                Line2D.Double l4 = new Line2D.Double(p7, p8);
                
                g2.draw(l1);
                g2.draw(l2);
                g2.draw(l3);
                g2.draw(l4);
        }
}