import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class CheckerBoardComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        CheckerBoard board = new CheckerBoard(100, 75, 640);
        board.draw(g2);
    }
}