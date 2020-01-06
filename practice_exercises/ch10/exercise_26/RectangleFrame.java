import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/** 	 	 	 	 	 	
   This frame contains a moving rectangle.
*/
public class RectangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private RectangleComponent scene;

    public RectangleFrame()
    {
        scene = new RectangleComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        ActionListener listener = (ActionEvent event) ->
            {
                scene.moveRectangleBy(1, 1);
            };
        
        final int DELAY = 100; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();      
    }
}
