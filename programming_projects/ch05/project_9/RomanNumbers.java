import java.util.Scanner;

/**
        This program converts a positive integer into the Roman number system.
*/
public class RomanNumbers
{
        public static void main(String[] args)
        {
                final String ZERO = "";
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter a +ve integer in the range of 1 - 3999: ");
                int value = in.nextInt();
                
                int decimal = value;
                
                int thousands = value / 1000;
                value = value % 1000;
                int hundreds = value / 100;
                value = value % 100;
                int tens = value / 10;
                value = value % 10;
                
                if (thousands > 3)
                {
                        System.out.println("Error: Integer should be between 1 and 3999");
                }
                else
                {
                        String thousandsRomanNumeral;
                        switch (thousands)
                        {
                                case 1: thousandsRomanNumeral = "M"; break;
                                case 2: thousandsRomanNumeral = "MM"; break;
                                case 3: thousandsRomanNumeral = "MMM"; break;
                                default: thousandsRomanNumeral = ZERO; break; 
                        }
                
                        String hundredsRomanNumeral;
                        switch (hundreds)
                        {
                                case 1: hundredsRomanNumeral = "C"; break;
                                case 2: hundredsRomanNumeral = "CC"; break;
                                case 3: hundredsRomanNumeral = "CCC"; break;
                                case 4: hundredsRomanNumeral = "CD"; break;
                                case 5: hundredsRomanNumeral = "D"; break;
                                case 6: hundredsRomanNumeral = "DC"; break;
                                case 7: hundredsRomanNumeral = "DCC"; break;
                                case 8: hundredsRomanNumeral = "DCCC"; break; 
                                case 9: hundredsRomanNumeral = "CM"; break;
                                default: hundredsRomanNumeral = ZERO; break;
                        }
                
                        String tensRomanNumeral;
                        switch (tens)
                        {
                                case 1: tensRomanNumeral = "X"; break;
                                case 2: tensRomanNumeral = "XX"; break;
                                case 3: tensRomanNumeral = "XXX"; break;
                                case 4: tensRomanNumeral = "XL"; break;
                                case 5: tensRomanNumeral = "L"; break;
                                case 6: tensRomanNumeral = "LX"; break;
                                case 7: tensRomanNumeral = "LXX"; break;
                                case 8: tensRomanNumeral = "LXXX"; break;
                                case 9: tensRomanNumeral = "XC"; break;
                                default: tensRomanNumeral = ZERO; break;
                        }
                        
                        String unitsRomanNumeral;
                        switch (value)
                        {
                                case 1: unitsRomanNumeral = "I"; break;
                                case 2: unitsRomanNumeral = "II"; break;
                                case 3: unitsRomanNumeral = "III"; break;
                                case 4: unitsRomanNumeral = "IV"; break;
                                case 5: unitsRomanNumeral = "V"; break;
                                case 6: unitsRomanNumeral = "VI"; break;
                                case 7: unitsRomanNumeral = "VII"; break;
                                case 8: unitsRomanNumeral = "VIII"; break;
                                case 9: unitsRomanNumeral = "IX"; break;
                                default: unitsRomanNumeral = ZERO; break;
                        }
                        
                        String romanNumeral = thousandsRomanNumeral + hundredsRomanNumeral 
                                + tensRomanNumeral + unitsRomanNumeral; 
                        System.out.printf("%d is %s\n", decimal, romanNumeral);
                }
        }
}