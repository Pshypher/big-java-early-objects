public class ResistorTester
{
    public static void main(String[] args)
    {
        Resistor r = new Resistor(2700000, 5);
        System.out.println(r.getColorBand());
        System.out.println("Colors: Red, Violet, Green, Gold"); 
    }
}