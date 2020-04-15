public class InvertingAmplifier extends Amplifier
{
    public InvertingAmplifier(double r1, double r2)
    {
        super(r1, r2);
    }
    
    public String getDescription()
    {
        return "Inverting " + super.getDescription();
    }
    
    public double getGain()
    {
        if (getR1() == 0) { return 0; }
        return -1 * getR2() / getR1();
    }
}