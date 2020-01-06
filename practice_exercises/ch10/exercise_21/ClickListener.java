import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
    An action listener that prints a message.
*/
public class ClickListener implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        Date timestamp = new Date(event.getWhen());
        System.out.print("Clicked on " + timestamp);
    }            
}
