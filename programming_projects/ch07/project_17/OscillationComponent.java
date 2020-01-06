import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class OscillationComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // recover Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        Oscillation oscillation = new Oscillation(getWidth(), 1, 0.5);
        oscillation.setDisplacements();
        oscillation.toCentimeters();
        oscillation.draw(g2);
    }
}