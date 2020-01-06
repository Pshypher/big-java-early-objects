import javax.swing.JFrame;

public class OscillationViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(250, 100);
        frame.setTitle("Plot");
        
        OscillationComponent component = new OscillationComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
}