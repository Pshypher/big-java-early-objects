import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class ColorNameComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                Graphics2D g2 = (Graphics2D) g;
                
                // place a black colored string on the component
                g2.setColor(Color.BLACK);
                g2.drawString("BLACK", 5, 14);
                
                // place a blue colored string on the component
                g2.setColor(Color.BLUE);
                g2.drawString("BLUE", 5, 38); 
                
                // place a cyan colored string on the component
                g2.setColor(Color.CYAN);
                g2.drawString("CYAN", 5, 62);
       
                // place a darkgray colored string on the component
                g2.setColor(Color.DARK_GRAY);
                g2.drawString("DARK_GRAY", 5, 86);
                
                // place a gray colored string on the component
                g2.setColor(Color.GRAY);
                g2.drawString("GRAY", 5, 110);
                
                // place a green colored string on the component
                g2.setColor(Color.GREEN);
                g2.drawString("GREEN", 5, 134);
                
                // place a lightgray colored string on the component
                g2.setColor(Color.LIGHT_GRAY);
                g2.drawString("LIGHT_GRAY", 5, 158);
                
                // place a magenta colored string on the component
                g2.setColor(Color.MAGENTA);
                g2.drawString("MAGENTA", 5, 182);
                
                // place a orange colored string on the component
                g2.setColor(Color.ORANGE);
                g2.drawString("ORANGE", 5, 206);
                
                // place a pink colored string on the component
                g2.setColor(Color.PINK);
                g2.drawString("PINK", 5, 230);
                
                // place a red colored string on the component
                g2.setColor(Color.RED);
                g2.drawString("RED", 5, 254);
                
                // place a yewllow colored string on the component
                g2.setColor(Color.YELLOW);
                g2.drawString("YELLOW", 5, 278);
        }
}