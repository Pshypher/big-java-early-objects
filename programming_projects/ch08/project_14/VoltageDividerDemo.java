public class VoltageDividerDemo
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            VoltageDivider circuit = new VoltageDivider(250, 750, 5);
            System.out.print("nominal gain: " + circuit.getNominalGain());
            System.out.println(", actual gain: " + circuit.getActualGain());
        }
    }
}