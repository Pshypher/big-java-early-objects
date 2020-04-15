import javax.swing.JFrame;

public class RoseViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Four-leaf rose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        RoseComponent component = new RoseComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}