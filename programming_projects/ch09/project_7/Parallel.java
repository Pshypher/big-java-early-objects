import java.util.ArrayList;

/**
    Combination of an electric circuit connected in parallel.    
*/
public class Parallel extends Circuit
{
    private ArrayList<Circuit> circuits;
    
    public Parallel()
    {
        circuits = new ArrayList<Circuit>();
    }
    
    /**
        Adds a resistor or an entire cicuit and connects it
        in parallel with the rest of the circuit.
        @param c the circuit
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
            total = total + 1 / c.getResistance();
        }
        
        return 1 / total;
    }
}