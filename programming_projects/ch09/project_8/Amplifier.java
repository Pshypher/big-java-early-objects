public abstract class Amplifier
{
    private double resistance1;
    private double resistance2;
    
    /**
        Construct an amplifier with two resistances, used to
        calculate the gain of this amplifier
        @param r1 one of both resistance values
        @param r2 value of the other resistance
    */
    public Amplifier(double r1, double r2)
    {
        resistance1 = r1;
        resistance2 = r2;
    }
    
    public String getDescription()
    {
        return "Amplifier";
    }
    
    /**
        Get the value of the first resistance
        @return the first resistance
    */
    public double getR1()
    {
        return resistance1;
    }
    
    /**
        Compute the value of the second resistance
        @return the second resistance
    */
    public double getR2()
    {
        return resistance2;
    }
    
    /**
        Sets the value of the first resistance
        @param r value of the resistance
    */
    public void setR1(double r)
    {
        resistance1 = r;
    }
    
    /**
        Sets the value of the second resistance
        @param r value of the resistance
    */
    public void setR2(double r)
    {
        resistance2 = r;
    }
    
    /**
        Compute the value of the gain for this amplifier.
        @return the gain
    */
    public abstract double getGain();
}