import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/** 	 	 	 	 	 	
    This frame contains a moving rectangle.
*/
public class RectangleFrame2 extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent2 scene;
    
    class MousePressListener implements MouseListener
    {  
        public void mousePressed(MouseEvent event)
        {  
            int x = event.getX();
            int y = event.getY();
            scene.addRectangle(x, y);
        }

        // Do-nothing methods
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
         
    public RectangleFrame2()
    {
        scene = new RectangleComponent2();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
} 
