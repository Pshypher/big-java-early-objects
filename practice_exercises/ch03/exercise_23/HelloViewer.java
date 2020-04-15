import javax.swing.JFrame;

public class HelloViewer
{
        public static void main(String[] args)
        {
                // Construct a new frame
                JFrame frame = new JFrame();
                
                frame.setSize(300, 400);
                frame.setTitle("Hello");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
               // Add the HelloComponent to the frame
               HelloComponent component = new HelloComponent();
               frame.add(component);
               
               frame.setVisible(true);
        }
}