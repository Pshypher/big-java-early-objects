public class ResistorDemo
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            Resistor r = new Resistor(330, 10);
            System.out.printf("Resistance: %.2f",
                r.getActualResistance());
            System.out.println();                
        }
    }
}