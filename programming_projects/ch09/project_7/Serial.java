import java.util.ArrayList;

/**
    A combined electric circuit connected together in series
*/
public class Serial extends Circuit
{
    private ArrayList<Circuit> circuits;
    
    public Serial()
    {
        circuits = new ArrayList<Circuit>(); 
    }
    
    /**
        Adds a circuit connected in series with the rest
        of the circuits.
        @param c the ciruit
    */
    public void addCircuit(Circuit c)
    {
        circuits.add(c);
    }
    
    public double getResistance()
    {
        double total = 0;
        for (Circuit c : circuits)
        {
            total = total + c.getResistance();
        }
        
        return total;    
    }
}