import javax.swing.JFrame;

public class OlympicRingViewer
{
        public static void main(String[] args)
        {
                // Construct a frame
                JFrame frame = new JFrame();
                
                // Set the size of the frame, the default close action and the title
                frame.setTitle("Olympic Rings");
                frame.setSize(200, 150);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Construct an OlympicRing Component and display it on the frame
                OlympicRingComponent component = new OlympicRingComponent();
                frame.add(component);
                
                frame.setVisible(true);
        }
}