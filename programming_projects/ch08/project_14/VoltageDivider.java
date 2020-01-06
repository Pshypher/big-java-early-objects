public class VoltageDivider
{
    private Resistor r1;
    private Resistor r2;
    
    /**
        Constructor of a voltage divider circuit with two resistors.
        @param m nominal resistance of the first resistor.
        @param n nominal resistance of the other resistor.
        @param deltaR tolerance of both resistors. 
    */
    public VoltageDivider(double m, double n, double deltaR)
    {
        r1 = new Resistor(m, deltaR);
        r2 = new Resistor(n, deltaR);
    }
    
    /**
        Get the value of the nominal gain for this voltage divider.
        @return nominal gain value.
    */
    public double getNominalGain()
    {
        double gain = r2.getNominalResistance() /  
            (r1.getNominalResistance() + r2.getNominalResistance());
        return gain;            
    }
    
    /**
        Compute the actual value of the gain for this voltage divider circuit.
        @return the actual value of the gain.
    */
    public double getActualGain()
    {
        double gain = r2.getActualResistance() / 
            (r1.getActualResistance() + r2.getActualResistance());
        return gain;            
    }
}