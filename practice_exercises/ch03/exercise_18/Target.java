import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
        A class that draw a target object of black and white concentric circles
*/
public class Target
{
        private double xLeft;
        private double yTop;
        private int diameter;
        
        /**
                Constructor for a target object
                @param xLeft the x axis for the left corner for the outermost circle
                @param yLeft the y axis for the top of the outermost circle
        */
        public Target(double x, double y, int size)
        {
                xLeft = x;
                yTop = y;
                diameter = size;
        }
        
        /**
                Draws the concentric circles of the target object
                @param g The Graphics2D context
        */
        public void draw(Graphics2D g)
        {
                double unitDistanceBetweenCircle = diameter / 5;
                
                // Construct all five concentric circles
                Ellipse2D.Double firstCircle = new Ellipse2D.Double(xLeft, yTop, diameter, diameter);
                Ellipse2D.Double secondCircle = new Ellipse2D.Double(
                        xLeft + unitDistanceBetweenCircle / 2, yTop + unitDistanceBetweenCircle / 2, 
                        diameter - unitDistanceBetweenCircle, diameter - unitDistanceBetweenCircle);
                Ellipse2D.Double thirdCircle = new Ellipse2D.Double(
                        xLeft + unitDistanceBetweenCircle * 2 / 2, yTop + unitDistanceBetweenCircle * 2 / 2, 
                        diameter - unitDistanceBetweenCircle * 2, diameter - unitDistanceBetweenCircle * 2);
                Ellipse2D.Double fourthCircle = new Ellipse2D.Double(
                        xLeft + unitDistanceBetweenCircle * 3 / 2, yTop + unitDistanceBetweenCircle * 3 / 2,
                        diameter - unitDistanceBetweenCircle * 3, diameter - unitDistanceBetweenCircle * 3);
                Ellipse2D.Double fifthCircle = new Ellipse2D.Double(
                        xLeft + unitDistanceBetweenCircle * 4 / 2, yTop + unitDistanceBetweenCircle * 4 / 2,
                        diameter - unitDistanceBetweenCircle * 4, diameter - unitDistanceBetweenCircle * 4);
                        
                // Draw all concentric circles
                g.setColor(Color.BLACK);
                g.fill(firstCircle);
                g.setColor(Color.WHITE);
                g.fill(secondCircle);
                g.setColor(Color.BLACK);
                g.fill(thirdCircle);
                g.setColor(Color.WHITE);
                g.fill(fourthCircle);
                g.setColor(Color.BLACK);
                g.fill(fifthCircle);                                                                                     
        }
}