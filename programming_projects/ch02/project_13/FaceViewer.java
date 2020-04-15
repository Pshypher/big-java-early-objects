import javax.swing.JFrame;

public class FaceViewer 
{
        public static void main(String[] args)
        {
                JFrame frame = new JFrame();
                frame.setSize(250, 175);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Add a FaceComponent object to the frame
                FaceComponent faceComponent = new FaceComponent();
                frame.add(faceComponent);
                
                frame.setVisible(true);
        }
}