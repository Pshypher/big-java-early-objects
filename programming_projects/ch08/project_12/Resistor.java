import java.util.Random;

/**
    Simulates a resistor with a nominal, actual resistance values 
    and a tolerance used to calculate the actual resistance.
*/
public class Resistor
{
    private double nominal;
    private double tolerance;
    
    /**
        Construct a resistor with the given nominal resistance
        and a tolerance that determines the actual resistance
        randomly.
        @param resistance value of the nominal resistance in ohms
        @param delta tolerance value used to calculate the range of
        acceptable values for the actual resistance.
    */
    public Resistor(double resistance, double delta)
    {
        nominal = resistance;
        tolerance = delta;
    }
    
    /**
        Get the nominal resistance of this resistor.
        @return nominal value for this resistor 
    */
    public double getNominalResistance()
    {
        return nominal;
    }
    
    /**
        Get the tolerance of this resistor.
        @return the tolerance
    */
    public double getToleranceValue()
    {
        return tolerance;
    }
    
    /**
        Compute the actual resistance value for this resistor
        @return random value of the actual resistance
    */
    public double getActualResistance()
    {
        Random generator = new Random();
        int length = (int) tolerance * 2 * 100;
        double percentage = (generator.nextInt(length) - tolerance 
            * 100) / 100;
        double actual = nominal * (1 + percentage / 100);
        return actual;          
    }
}