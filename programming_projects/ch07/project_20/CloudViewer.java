import javax.swing.JFrame;

public class CloudViewer
{
    public static void main(String[] args)
    {   
        
        
        JFrame frame = new JFrame();
        frame.setSize(300, 270);
        frame.setTitle("Cloud");
        
        CloudComponent component = new CloudComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
