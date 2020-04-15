public class ParallelResonantCircuit extends ResonantCircuit
{
    public ParallelResonantCircuit(double frequency, double bandwidth,
        double gain)
    {
        setResonantFrequency(frequency);
        setBandwidth(bandwidth);
        setGain(gain);
    }
    
    /**
        Calculates the resistance of this resonant circuit.
        @return the resistance
    */
    public double resistance()
    {
        return getGain();
    }
    
    /**
        Computes this resonant circuit capacitance.
        @return the capacitance
    */
    public double capacitance()
    {
        return 1 / (getBandwidth() * resistance());
    }
    
    /**
        Computes the inductance of this parallel resonant circuit.
        @return the inductance
    */
    public double inductance()
    {
        return 1 / (Math.pow(getResonantFrequency(), 2) * capacitance());
    }
    
    public void display()
    {
        super.display();
        System.out.println("Resistance: " + resistance());
        System.out.println("Capacitance: " + capacitance());
        System.out.println("Inductance: " + inductance());
    }
}