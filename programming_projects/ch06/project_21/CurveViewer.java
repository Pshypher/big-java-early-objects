import javax.swing.JFrame;


public class CurveViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Curve");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CurveComponent component = new CurveComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}