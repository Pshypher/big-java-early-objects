import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SpiralComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        SquareSpiral squareSpiral = new SquareSpiral(143, 170, 30);
        squareSpiral.draw(g2); 
    }
}