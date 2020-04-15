import javax.swing.JFrame;

public class BarcodeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(250, 150);
        frame.setTitle("Bar Code");
        
        BarcodeComponent component = new BarcodeComponent();
        frame.add(component);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
