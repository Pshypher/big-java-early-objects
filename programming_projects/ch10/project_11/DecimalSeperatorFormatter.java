package project_11;

import project_11.util.NumberFormatter;

public class DecimalSeperatorFormatter implements NumberFormatter
{
   public String format(int n)
   {
      final int DIGITS_PRECEEDING_DECIMAL = 3;
      
      String out = "";
      
      String str;
      if (n < 0) 
      {
         str = new DefaultFormatter().format(-n);
      }
      else 
      {
         str = new DefaultFormatter().format(n);
      }
      
      for (int i = str.length() - 1; i >= 0; i--)
      {
         if (i % DIGITS_PRECEEDING_DECIMAL == 0 && i != str.length() - 1)
         {
            out = "," + out;
         }
         out = str.charAt(i) + out;
      }
      
      if (n < 0) { out = "-" + out; }
      return out;
   }
}