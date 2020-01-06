import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class StarComponent extends JComponent
{
        public void paintComponent(Graphics g) 
        {
                // Recover Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                int diameter = 30;
                
                Star first = new Star(0, 0, diameter);
                first.draw(g2);
                
               diameter = 20;
                Star second = new Star(getWidth() / 2 - diameter / 2,
                        getHeight() / 2 - diameter / 2, diameter);
                second.draw(g2);
                                       
                diameter = 25;
                Star third = new Star(getWidth() - diameter,
                        getHeight() - diameter, diameter);
                third.draw(g2);                                                
        }
}