import java.util.Scanner;

/**
        This program converts from the imperial system to the metric system 
        and also rejects conversion of incompatible types
*/
public class UnitConversion
{
        public static void main(String[] args)
        {       
                // Constant(s)
                final double FL_OZ_PER_ML = 0.033814;   // Fluid ounces per milliliter
                final double GAL_PER_ML = 0.000264;     // Gallons per milliliter
                final double OZ_PER_GRAM = 0.035274;    // Ounces per gram
                final double LB_PER_GRAM = 0.002205;    // Pounds per gram
                final double IN_PER_MM = 0.0393701;      // Inches per centimeter
                final double FT_PER_MM = 0.0032808;      // Feet per centimeter
                final double MI_PER_MM = 0.00000062137119;      // Miles per centimeter
                                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Convert from? ");
                String formerUnit = in.next();
                System.out.print("Convert to? ");
                String unit = in.next();
                
                System.out.print("Value? ");
                double value = in.nextDouble();
                    
                double prev = value;    
                if (formerUnit.equals("fl.oz"))
                {
                        if (unit.equals("ml"))
                                value = value / FL_OZ_PER_ML;
                        else if (unit.equals("l"))
                                value = value / (FL_OZ_PER_ML * 1E3);
                        else
                                value = -1;        
                }
                else if (formerUnit.equals("gal"))
                {
                        if (unit.equals("ml"))
                                value = value / GAL_PER_ML;
                        else if (unit.equals("l"))
                                value = value / (GAL_PER_ML * 1E3);
                        else
                                value = -1;
                }
                else if (formerUnit.equals("oz"))
                {
                        if (unit.equals("g"))
                                value = value / OZ_PER_GRAM;
                        else if (unit.equals("kg"))
                                value = value / (OZ_PER_GRAM * 1E3);
                        else
                                value = -1;
                }
                else if (formerUnit.equals("lb"))
                {
                        if (unit.equals("g"))
                                value = value / LB_PER_GRAM;
                        else if (unit.equals("kg"))
                                value = value / (LB_PER_GRAM * 1E3);
                        else
                                value = -1;
                }
                else if (formerUnit.equals("in"))
                {
                        if (unit.equals("mm"))
                                value = value / IN_PER_MM;
                        else if (unit.equals("cm"))
                                value = value / (IN_PER_MM * 10);
                        else if (unit.equals("m"))
                                value = value / (IN_PER_MM * 1E2);
                        else if (unit.equals("km"))
                                value = value / (IN_PER_MM * 1E3);
                        else
                                value = -1;                                
                }
                else if (formerUnit.equals("ft"))
                {
                        if (unit.equals("mm"))
                                value = value / FT_PER_MM;
                        else if (unit.equals("cm"))
                                value = value / (FT_PER_MM * 10);
                        else if (unit.equals("m"))
                                value = value / (FT_PER_MM * 1E2);
                        else if (unit.equals("km"))
                                value = value / (FT_PER_MM * 1E3);
                        else
                                value = -1;                                 
                }
                else if (formerUnit.equals("mi"))
                {
                        if (unit.equals("mm"))
                                value = value / MI_PER_MM;
                        else if (unit.equals("cm"))
                                value = value / (MI_PER_MM * 10);
                        else if (unit.equals("m"))
                                value = value / (MI_PER_MM * 1E2);
                        else if (unit.equals("km"))
                                value = value / (MI_PER_MM * 1E3);
                        else 
                                value = -1;                                        

                }
                else
                {
                        value = -2;
                }
                
                if (value < -1)
                        System.out.printf("Error: Unit \"%s\" does not belong to " 
                                + "imperial system of measurement\n", formerUnit);
                else if (value > -1)
                        System.out.printf("%.1f %s = %.1f %s\n", prev, formerUnit, value, unit);
                else
                        System.out.printf("Error: Incompatible conversion types "
                                + "\"%s -> %s\"\n", formerUnit, unit);
        }
}