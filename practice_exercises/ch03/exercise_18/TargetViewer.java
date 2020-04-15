import javax.swing.JFrame;

public class TargetViewer
{
        public static void main(String[] args)
        {
                // Constructs a new frame
                JFrame frame = new JFrame();
                frame.setSize(300, 400) ;   // Sets the width to 300px and the height of the frame to 400px
                frame.setTitle("Target");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Adds a Component to the frame object
                TargetComponent component = new TargetComponent();
                frame.add(component);
                
                frame.setVisible(true); 
        }
}