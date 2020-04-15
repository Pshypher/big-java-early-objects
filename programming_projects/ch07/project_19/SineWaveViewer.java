import javax.swing.JFrame;

public class SineWaveViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(395, 375);
        frame.setTitle("Sine wave");
        
        SineWaveComponent component = new SineWaveComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}