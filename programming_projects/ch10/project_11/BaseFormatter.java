package project_11;

import project_11.util.NumberFormatter;

public class BaseFormatter implements NumberFormatter
{  
   private static final int LOWER_BOUND = 2;
   private static final int UPPER_BOUND = 36;
   
   private static final String[] digits = {
      "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
      "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
      "U", "V", "W", "X", "Y", "Z"
   };
   
   private int base;
   
   /**
      Constructor for an object that formats a number using a
      base between 2 - 36.
      @param aBase the base 
   */
   public BaseFormatter(int aBase)
   {
      base = aBase;
   }
   
   public String format(int n)
   {
      if (base < LOWER_BOUND || base > UPPER_BOUND)
      {
         System.out.println("Base ought to be between 2 - 36.");
         return null;
      }
      
      String out = "";
      String sign = (n < 0) ? "-" : "";
      if (n < 0) { n = -n; }
      while (n > 0)
      {
         int rem = n % base;
         out = digits[rem] + out;
         n = n / base;
      }
      
      return sign + out;
   }
}