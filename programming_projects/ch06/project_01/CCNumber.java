/**
    This program removes spaces and dashes from a credit card number.
    and then checks if the credit card number is valid.
*/
public class CCNumber
{
    public static void main(String[] args)
    {
        String creditCardNumber = "4123-5678-9012-3450";
      
        int i = 0;
        while (i < creditCardNumber.length())
        {
            char ch = creditCardNumber.charAt(i);
            if (ch == ' ' || ch == '-')         
            {
                // Remove the character at position i

                String before = creditCardNumber.substring(0, i);
                String after = creditCardNumber.substring(i + 1);
                creditCardNumber = before + after;
            }
            else
            {
                i++;
            }
        }
      
        System.out.println(creditCardNumber);
        
        int total = 0;
        for (int j = creditCardNumber.length() - 2; j > 0; j = j - 2)
        {
            char ch = creditCardNumber.charAt(j);
            String s = String.valueOf(ch);
            int digit = Integer.parseInt(s);
            if (digit > 4)
            {
                total = total + digit;
            }
        }
        
        if (total % 10 == 0) { System.out.println("Valid credit card."); }
        else { System.out.println("Invalid credit card."); }
    }
}