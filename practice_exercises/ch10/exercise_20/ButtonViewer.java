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
        
        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        
        panel.add(buttonA);
        panel.add(buttonB);
        frame.add(panel);
        
        class ClickListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                JButton button = (JButton) event.getSource();
                System.out.println("Button " + button.getText() 
                    + " was clicked!");
            }
        }
        
        ActionListener listener = new ClickListener();
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
