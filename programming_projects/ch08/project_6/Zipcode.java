import static java.lang.Math.*;

public class Zipcode
{

    private int zipcode;
    
    /**
        Constructor of a postal code with five digits and a 
        check digit.
    */
    public Zipcode(int postalcode)
    {
        zipcode = postalcode;
    }
    
    /**
        Convert a single digit of a postal code to a string
        representation of a bar code.
        @param value one of the digits in the postal code.
        @return the bar code string.
    */
    private String encode(int value)
    {
        int[] weights = { 7, 4, 2, 1, 0 };
        
        int temp = value;
        String barcode = "";
        for (int i = 0; i < weights.length - 1; i++)
        {
            if (weights[i] <= temp)
            {
                barcode = barcode + 1;
                temp = temp - weights[i];
            }
            else
            {
                barcode = barcode + 0;
            }
        }
        
        if (value == 0) { barcode = "11000"; }
        else if (contains(weights, value)) { barcode = barcode + 1; }
        else { barcode = barcode + 0; }
        
        return barcode;
    }
    
    /**
        Change this zipcode to a barcode.
        @return barcode object for this zipcode.
    */
    public Barcode transform()
    {
        int temp = zipcode * 10 + checkDigit();
        String bitCode = "";
        while (temp > 0)
        {
            int digit = temp % 10;
            temp = temp / 10;
            bitCode = encode(digit) + bitCode;
        }
        
        String barcodeString = toBarcodeString(bitCode);
        return new Barcode(barcodeString);
    }
    
    /**
        Get the postal code for this zip code object.
        @return the zip code.
    */
    public int getPostalCode()
    {
        return zipcode;
    }
    
    /**
        Compute the check digit of from the corresponding zip code
        for this bar code.
        @return check digit for this bar code.
    */
    private int checkDigit()
    {
        int total = sum();
        int check = 0;
        if (total % 10 == 0) { return check; }
        
        int exponent = (int) (log10(total));
        int digit = (int) (total / pow(10, exponent));  // extract foremost digit
        digit++;
        check = (int) (digit * pow(10, exponent) - total);
        
        return check;
    }
    
    /**
        Calculate the sum of digits in this zip code.
        @return sum of digits in this zip code.
    */
    private int sum()
    {
        int temp = zipcode;
        int total = 0;
        while (temp > 0)
        {
            int digit = temp % 10;
            total = total + digit;
            temp = temp / 10;
        }
        
        return total;
    }
    
    /**
        Zip-code is represented as a combination of two full and three
        half frame heights.
        @return the barcode string as full and half frame height of
        this zipcode.
    */
    private String toBarcodeString(String bitCode)
    {
        String barcodeString = bitCode.replace('0', ':');
        barcodeString = barcodeString.replace('1', '|');
        barcodeString = '|' + barcodeString + '|';
        return barcodeString;
    }
    
    private boolean contains(int[] values, int n)
    {
        boolean found = false;
        int i = 0;
        while (!found && i < values.length)
        {
            if (values[i] == n) { found = true; }
            i++;  
        }
        
        return found;
    }
}