public class SeriesResonantCircuit extends ResonantCircuit
{
    public SeriesResonantCircuit(double frequency, double bandwidth,
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
        return 1 / getGain();
    }
    
    /**
        Computes the inductance of this series resonant circuit.
        @return the inductance
    */
    public double inductance()
    {
        return resistance() / getBandwidth();
    }
    
    /**
        Computes this resonant circuit capacitance.
        @return the capacitance
    */
    public double capacitance()
    {
        return 1 / (Math.pow(getResonantFrequency(), 2) * inductance());
    }
    
    public void display()
    {
        super.display();
        System.out.println("Resistance: " + resistance());
        System.out.println("Inductance: " + inductance());
        System.out.println("Capacitance: " + capacitance());
    }
}