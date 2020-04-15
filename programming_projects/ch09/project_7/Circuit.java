/**
    Model of an electric circuit with a resistance.
*/
public class Circuit
{
    private double resistance;
    
    /**
        Assign the resistance of this circuit the given value
        @param r the value of the resistance
    */
    public void setResistance(double r)
    {
        resistance = r;
    }
    
    /**
        Compute the total resistance of this circuit
    */
    public double getResistance()
    {
        return resistance;
    }
}