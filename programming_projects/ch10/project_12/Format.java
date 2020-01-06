package project_12;

import project_11.util.NumberFormatter;

/**
   This class formats an array of integers and aligns the corresponding 
   format string to the right.
*/
public class Format
{

   public static void process(int[] values, NumberFormatter f)
   {
      String[] formatStrings = toFormatStrings(values, f);
      
      int width = formatStrings[0].length();
      for (int i = 1; i < formatStrings.length; i++)
      {
         if (width < formatStrings[i].length())
         {
            width = formatStrings[i].length();
         }
      }
      
      for (String s : formatStrings)
      {
         System.out.println(rightAlign(s, width));
      }
   }
   
   private static String[] toFormatStrings(int[] values, NumberFormatter f)
   {
      String[] formattedStrs = new String[values.length];
      
      for (int i = 0; i < values.length; i++)
      {
         formattedStrs[i] = f.format(values[i]);
      }
      
      return formattedStrs;
   }
   
   private static String rightAlign(String value, int width)
   {
      int spaces = width - value.length();
      
      for (int i = 0; i < spaces; i++)
      {
         value = " " + value; 
      }
      
      return value;
   }
}