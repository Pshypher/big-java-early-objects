import javax.swing.JFrame;

public class EllipseViewer
{
        public static void main(String[] args)
        {
                // Construct a frame and set the size of the frame
                JFrame frame = new JFrame();
                frame.setSize(300, 400);
                frame.setTitle("Large Ellipse");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                // Add the EllipseComponent to the frame
                EllipseComponent component = new EllipseComponent();
                frame.add(component);
        
                frame.setVisible(true);
        }
}