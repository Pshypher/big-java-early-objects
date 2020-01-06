import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class FaceComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover the Graphics2D object from the Graphics arg g 
                Graphics2D g2 =(Graphics2D) g;
                
                // Draw the outline of the face
                Color color = new Color(195, 0, 225);
                Ellipse2D.Double face = new Ellipse2D.Double(75, 25, 100, 100);
                g2.setColor(color);
                g2.draw(face);
                
                // Draw the eyes
                Ellipse2D.Double leftEye = new Ellipse2D.Double(100, 50, 5, 5);
                Ellipse2D.Double rightEye = new Ellipse2D.Double(145, 50, 5, 5);
                g2.draw(leftEye);
                g2.draw(rightEye);
                
                // Draw the lips
                Line2D.Double lip = new Line2D.Double(100, 100, 145, 100);
                g2.draw(lip);
        }
}