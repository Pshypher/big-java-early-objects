import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;
import javax.swing.JComponent;

public class CurrentTimeComponent extends JComponent
{
    private static final int TIME_X = 5;
    private static final int TIME_Y = 35;
    
    private Date now;
    
    public CurrentTimeComponent()
    {
        now = new Date();
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString(now.toString(), TIME_X, TIME_Y);
    }
    
    public void tick()
    {
        int next = (now.getSeconds() + 1) % 60;
        now.setSeconds(next);
        repaint();
    }
}