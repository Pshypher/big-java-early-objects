package project_11;

import project_11.util.NumberFormatter;

public class DefaultFormatter implements NumberFormatter
{
   public String format(int n)
   {
      return "" + n;
   }
}