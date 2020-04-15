/**
    This program tests the circuit class and all its subclasses
*/
public class CircuitTester
{
    public static void main(String[] main)
    {
        Resistor r1 = new Resistor(4.5);
        Resistor r2 = new Resistor(2);
        Resistor r3 = new Resistor(7);
        
        Serial series = new Serial();
        series.addCircuit(r1);
        series.addCircuit(r2);
        
        System.out.println("Resistance: " + series.getResistance());
        System.out.println("Expected: 6.5");
        
        Parallel parallel = new Parallel();
        parallel.addCircuit(r3);
        parallel.addCircuit(series);
        
        System.out.println("Resistance: " + parallel.getResistance());
        System.out.println("Expected: 3.37");
    }
}