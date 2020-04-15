import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
        A class for an Olympic Ring image
*/
public class OlympicRing
{
        private int xLeft;
        private int yTop;
        private double radius;
        /**
                Constructor for a OlympicRing of five colored circles
        */
        public OlympicRing(int x, int y, double ringSize)
        {
                xLeft = x;
                yTop = y;
                radius = ringSize;
        }
        
        /**
                Draws five colored circles each with a radius of 40px
                @param g2 The Graphics2D context
        */
        public void draw(Graphics2D g2)
        {
                // draw the blue colored circle
                Ellipse2D.Double blueCircle = new Ellipse2D.Double(xLeft, yTop, radius, radius);
                g2.setColor(Color.BLUE);
                g2.draw(blueCircle);
                
                // draw the black colored circle
                Ellipse2D.Double blackCircle = new Ellipse2D.Double(
                        xLeft + radius + 2, yTop, radius, radius);
                g2.setColor(Color.BLACK);
                g2.draw(blackCircle);
                
                // draw the red colored circle
                Ellipse2D.Double redCircle = new Ellipse2D.Double(
                        xLeft + 4 + radius * 2, yTop, radius, radius);
                g2.setColor(Color.RED);
                g2.draw(redCircle);
                
                // draw the yellow colored circle
                Ellipse2D.Double yellowCircle = new Ellipse2D.Double(
                        xLeft + 1 + radius / 2 , yTop + 1 + radius / 2, radius, radius);
                g2.setColor(Color.YELLOW);
                g2.draw(yellowCircle);
                
                // draw the green colored circle
                Ellipse2D.Double greenCircle = new Ellipse2D.Double(
                        xLeft + radius + radius / 2 + 2 + 1,  yTop + 1 + radius / 2, radius, radius);
                g2.setColor(Color.GREEN);
                g2.draw(greenCircle);
        }      
}