import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
    This program demonstrates how to install an action listener.
*/
public class ButtonViewer
{  
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 80;
    
    public static void main(String[] args)
    {  
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        JButton buttonA = new JButton("Click me!");
        JButton buttonB = new JButton("Click me!");
        
        
        class ClickListener implements ActionListener
        {
            private int count;
            
            public ClickListener()
            {
                count = 0;
            }
            
            public void actionPerformed(ActionEvent event)
            {
                count++;
                System.out.println("I was clicked " + count + " times!");
            }
        }
        
        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        
        listener = new ClickListener();
        buttonB.addActionListener(listener);
        
        panel.add(buttonA);
        panel.add(buttonB);
        frame.add(panel);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
