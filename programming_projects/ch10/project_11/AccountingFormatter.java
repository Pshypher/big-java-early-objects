package project_11;

import project_11.util.NumberFormatter;

public class AccountingFormatter implements NumberFormatter
{
   public String format(int n)
   {
      if (n >= 0) { return "" + n; }
      else { return "(" + n + ")"; } 
   }
}