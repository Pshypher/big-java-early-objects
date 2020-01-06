import static java.lang.Math.*;

public class Numeric
{
    public static double intPower(double x, int n)
    {
        double y;
        if (n > 0 && n / 2 != 0)
        {
            y = pow(x, n - 1) * x;
        }
        else if (n > 0 && n / 2 == 0)
        {
            y = pow(pow(x, n / 2), 2);
        }
        else
        {
            y = 1 / pow(x, -n); 
        }
        
        return y;
    } 
}