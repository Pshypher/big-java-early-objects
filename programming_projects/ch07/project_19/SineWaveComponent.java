import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SineWaveComponent extends JComponent 
{
    public void paintComponent(Graphics g)
    {
        final int FULL_PERIOD = 360;
        
        // recover graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        int step = 5;
        int[] degrees = new int[FULL_PERIOD / step];
        int x = getWidth() / 2 - degrees.length * step / 2;
        
        int angle = 0;
        for (int i = 0; i < degrees.length; i++)
        {
            degrees[i] = angle;
            angle = angle + step;
        }
        
        SineWave wave = new SineWave(x, getHeight(), step, degrees);
        wave.draw(g2);
    }
}