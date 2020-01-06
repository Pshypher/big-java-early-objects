public class VoltageDividerAmplifier extends Amplifier
{
    public VoltageDividerAmplifier(double r1, double r2)
    {
        super(r1, r2);
    }
    
    public String getDescription()
    {
        return "Voltage Divider " + super.getDescription();
    }
    
    public double getGain()
    {
        if (getR1() + getR2() == 0) { return 0; }
        return getR2() / (getR1() + getR2());
    }   
}