import java.util.Random;

/**
    Simulates a resistor with a nominal, actual resistance values 
    and a tolerance used to calculate the actual resistance.
*/
public class Resistor
{
    private double nominal;
    private double tolerance;
   
    private static String[] colors = { "Black", "Brown", "Red", "Orange",
        "Yellow", "Green", "Blue", "Violet","Gray", "White", "Gold", "Silver",
        "None" };
    
    private static double[][] values = {
        { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 },
        { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -2 },
        { 0, 1, 2, 0, 0, 0.5, 0.25, 0.1, 0.05, 0, 5, 10, 20 }
    };     
    
    /**
        Construct a resistor with the given nominal resistance
        and a tolerance that determines the actual resistance
        randomly.
        @param resistance value of the nominal resistance in ohms
        @param delta tolerance value used to calculate the range of
        acceptable values for the actual resistance.
    */
    public Resistor(double resistance, double delta)
    {
        nominal = resistance;
        tolerance = delta;
    }
    
    /**
        Get the nominal resistance of this resistor.
        @return nominal value for this resistor 
    */
    public double getNominalResistance()
    {
        return nominal;
    }
    
    /**
        Get the tolerance of this resistor.
        @return the tolerance
    */
    public double getToleranceValue()
    {
        return tolerance;
    }
    
    /**
        Compute the actual resistance value for this resistor
        @return random value of the actual resistance
    */
    public double getActualResistance()
    {
        Random generator = new Random();
        int length = (int) tolerance * 2 * 100;
        double percentage = (generator.nextInt(length) - tolerance 
            * 100) / 100;
        double actual = nominal * (1 + percentage / 100);
        return actual;          
    }
    
    /**
        Get the description of the color bands for the nominal resistance
        and tolerance of this resistance.
        @return color bands description of this resistor.
    */
    public String getColorBand()
    {
        int exponent = (int) Math.floor(Math.log10(nominal));
        int multiplier = exponent - 1;
        int digits = (int) (nominal / Math.pow(10, multiplier));
        int first = digits / 10;    // first significant digit
        int second = digits % 10;   // second significant digit
        
        
        String color1 = getColor(0, first);     // get color of the first 
                                                // significant digit
        String color2 = getColor(0, second);    // get color of the second
                                                // significant  digit
        String color3 = getColor(1, multiplier);// get color of multiplier
        String color4;                          // get color of tolerance
        if (tolerance == 0) { color4 = ""; }
        else { color4 = getColor(2, tolerance); }
        
        String out = "%s, %s, %s, %s";
        return String.format(out, color1, color2, color3, color4);            
    }
    
    private String getColor(int row, double n)
    {
        int i = 0;
        boolean found = false; 
        while (i < values[row].length && !found)
        {
            if (values[row][i] == n) { found = true; }
            else { i++; }
        }
        
        return colors[i];
    }
}