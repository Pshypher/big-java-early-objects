/**
    A resonant circuit comprises the resonant frequency, bandwidth
    and gain used to describe the resonant frequency response.
*/
public class ResonantCircuit
{

    private double frequency;
    private double bandwidth;
    private double gain;
    
    /**
        Constructor for a resonant circuit with no frequency,
        bandwith and gain.
    */
    public ResonantCircuit()
    {
        frequency = 0;
        bandwidth = 0;
        gain = 0;
    }
    
    /**
        Sets the value of the resonant frequency for this circuit.
        @param freq value of the resonant frequency
    */
    public void setResonantFrequency(double freq)
    {
        frequency = freq;
    }
    
    /**
        Get the current resonant frequency of this circuit.
        @return the resonant frequency
    */
    public double getResonantFrequency()
    {
        return frequency;
    }
    
    /**
        Sets a value for this resonant circuit's bandwidth.
        @param aBandwidth value assigned to the bandwidth 
    */
    public void setBandwidth(double aBandwidth)
    {
        bandwidth = aBandwidth;
    }
    
    /**
        Get the bandwidth fo this resonant circuit.
    */
    public double getBandwidth()
    {
        return bandwidth;   
    }
    
    /**
        Set the gain at the resonant frequency of this circuit
        @param theGain value assigned to the gain
    */
    public void setGain(double theGain)
    {
        gain = theGain;    
    }
    
    /**
        Gets the gain of this resonant circuit.
        @return the gain of the circuit
    */
    public double getGain()
    {
        return gain;
    }
    
    /**
        Prints a description of this circuit's resonant
        frequency response.
    */
    public void display()
    {
        System.out.println("Resonant frequency: " + frequency);
        System.out.println("Bandwidth: " + bandwidth);
        System.out.println("Gain: " + gain);
    }
}
