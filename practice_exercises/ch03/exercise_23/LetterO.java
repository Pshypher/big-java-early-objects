import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class LetterO
{
        private int xLeft;
        private int yTop;
        private int strokeSize;
        
        public LetterO(int x, int y, int size)
        {
                xLeft = x;
                yTop = y;
                strokeSize = size;
        }
        
        public void draw(Graphics2D g2)
        {
                Ellipse2D.Double O = new Ellipse2D.Double(xLeft, yTop, strokeSize *10 / 7, strokeSize * 2);
                g2.draw(O);
        }
}