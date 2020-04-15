import javax.swing.JFrame;

public class SpiralViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 400);public
        SpiralComponent spiral = new SpiralComponent();
        frame.add(spiral);
        frame.setTitle("Square spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);   
    }
}