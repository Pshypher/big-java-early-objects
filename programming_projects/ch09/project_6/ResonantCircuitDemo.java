/**
    This program demonstrates that all subclasses of the resonant
    circuit class works properly
*/
public class ResonantCircuitDemo
{
    public static void main(String[] args)
    {
        ParallelResonantCircuit p = new ParallelResonantCircuit(
            0.707, 1E8, 0.693);
        p.display();
        
        System.out.println();       
            
        SeriesResonantCircuit s = new SeriesResonantCircuit(0.707, 1E4, 0.693);
        s.display();
        
    }
}