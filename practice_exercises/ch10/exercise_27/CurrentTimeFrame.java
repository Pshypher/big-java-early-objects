import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
    Update the current time each second.
*/
public class CurrentTimeFrame extends JFrame
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 100;
    
    private CurrentTimeComponent time;
    
    class TimerListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            time.tick();   
        }
    }
  
    public CurrentTimeFrame()
    {
        time = new CurrentTimeComponent();
        add(time);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        ActionListener listener = new TimerListener();
                
        final int DELAY = 1000;
        Timer timer = new Timer(DELAY, listener);
        timer.start();
    }
}