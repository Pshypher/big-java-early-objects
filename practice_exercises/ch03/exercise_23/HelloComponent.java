import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class HelloComponent extends JComponent
{
        public void paintComponent(Graphics g)
        {
                // Recover Graphics2D object
                Graphics2D g2 = (Graphics2D) g;
                
                int strokeSize = 10;
                int spaceBetweenLetters = strokeSize / 5;
                 int x = getWidth() / 2 - strokeSize * 5 + spaceBetweenLetters * 4;
                int y = getHeight() / 2 - 2 * strokeSize / 2;
                
                LetterH h = new LetterH(x, y, strokeSize);
                h.draw(g2);
                
                LetterE e = new LetterE(x + strokeSize + spaceBetweenLetters, 
                        y, strokeSize);
                e.draw(g2);
                
                LetterL l = new LetterL(x + strokeSize * 2 +
                        spaceBetweenLetters * 2, y, strokeSize);
                l.draw(g2);
                l = new LetterL(x + strokeSize * 3 +
                        spaceBetweenLetters * 3, y, strokeSize);
                l.draw(g2);
                
                LetterO o = new LetterO(x + strokeSize * 4
                + spaceBetweenLetters * 4, y, strokeSize);
                o.draw(g2);
        }
}