import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
    An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{

    private int n;
    
    {
        n = 0;
    }
    
    public void actionPerformed(ActionEvent event)
    {
        n++;
        System.out.println("I was clicked " + n + " times!");
    }            
}
