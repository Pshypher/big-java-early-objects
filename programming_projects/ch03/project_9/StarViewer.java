import javax.swing.JFrame;

public class StarViewer
{
        public static void main(String[] args)
        {
                JFrame frame = new JFrame();
        
                // Set the title, size and close action of the frame
                frame.setTitle("Three Stars");
                frame.setSize(300, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Add a StarComponent to be displayed on the frame
                StarComponent component = new StarComponent();
                frame.add(component);
                
                frame.setVisible(true);
        }
}