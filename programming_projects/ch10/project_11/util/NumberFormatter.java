package project_11.util;

/**
   Describes objects that can format integers. 
*/
public interface NumberFormatter
{
   /**
      Converts an integer to the desired format.
      @param n the integer
      @return the integer as a formatted string 
   */
   String format(int n);
}