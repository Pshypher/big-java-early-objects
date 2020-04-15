import javax.swing.JFrame;

public class RandomShapesViewer
{
    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 600;
        final int FRAME_HEIGHT = 500;
        
        JFrame frame = new JFrame();
        frame.setTitle("Random shapes");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        ShapeComponent shapesComponent = new ShapeComponent();
        frame.add(shapesComponent);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}