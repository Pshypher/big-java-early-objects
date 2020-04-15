import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CurveComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Curve curve = new Curve(50, 50);
        curve.draw(g2);
    }
}