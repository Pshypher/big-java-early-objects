import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class LetterComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        final double LETTER_SPACING = 2.5;
        final double WORD_SPACING = 20;
        final int FONT_HEIGHT = 20;
        final int FONT_WIDTH = 12;
        
        Graphics2D g2 = (Graphics2D) g; // recover graphics2D object
        
        double x = getWidth() * 0.2;
        double y = getHeight() * 0.5 - FONT_HEIGHT * 0.5;
        
        // draw "HELLO"
        LetterH h1 = new LetterH(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterE e1 = new LetterE(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterL l1 = new LetterL(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterL l2 = new LetterL(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterO o1 = new LetterO(new Point2D.Double(x, y));
        
        h1.draw(g2);
        e1.draw(g2);
        l1.draw(g2);
        l2.draw(g2);
        o1.draw(g2);
        
        x = x + FONT_WIDTH + WORD_SPACING;
        
        // draw "HOLE"
        LetterH h2 = new LetterH(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterO o2 = new LetterO(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterL l3 = new LetterL(new Point2D.Double(x, y));
        x = x + FONT_WIDTH + LETTER_SPACING;
        LetterE e2 = new LetterE(new Point2D.Double(x, y));
        
        h2.draw(g2);
        o2.draw(g2);
        l3.draw(g2);
        e2.draw(g2);
    }
}