import javax.swing.JFrame;

public class PolygonViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Polygons");
        
        PolygonComponent component = new PolygonComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}