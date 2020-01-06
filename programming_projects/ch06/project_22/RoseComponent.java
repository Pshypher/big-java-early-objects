import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RoseComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        FourLeavedRose rose = new FourLeavedRose(135, 175, 100);
        rose.draw(g2);
    }
}