import javax.swing.JFrame;

public class LetterViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        
        frame.setTitle("Words");
        
        LetterComponent component = new LetterComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}