import javax.swing.JFrame;

/**
    Displays the present time  
*/
public class TimeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new CurrentTimeFrame();
        frame.setTitle("Animated digital clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}