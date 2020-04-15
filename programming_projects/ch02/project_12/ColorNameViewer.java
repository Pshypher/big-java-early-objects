import javax.swing.JFrame;

public class ColorNameViewer 
{
        public static void main(String[] args)
        {
                JFrame frame = new JFrame();
                frame.setSize(95, 325);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                ColorNameComponent colorName = new ColorNameComponent();
                frame.add(colorName);
                
                frame.setVisible(true);
        }
}