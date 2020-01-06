import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class AlphabetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        final double LETTER_SPACING = 2.5;
        final double WORD_SPACING = 20;
        
        Graphics2D g2 = (Graphics2D) g;  // recover Graphics2D object
        
        double x = getWidth() * 0.2;
        double y = getHeight() * 0.5 - Alphabets.FONT_HEIGHT * 0.5;
        
        // draw "HELLO"
        Alphabets.drawH(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawE(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawL(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawL(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawO(g2, new Point2D.Double(x, y));
        
        x = x + Alphabets.FONT_WIDTH + WORD_SPACING;
        
        // draw "HOLE"
        Alphabets.drawH(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawO(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawL(g2, new Point2D.Double(x, y));
        x = x + Alphabets.FONT_WIDTH + LETTER_SPACING;
        Alphabets.drawE(g2, new Point2D.Double(x, y));
    }
}