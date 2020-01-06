public class RestRoomStallDemo
{
    public static void main(String[] args)
    {
        boolean[] stalls = new boolean[10];
                
        while (hasUnoccupiedStalls(stalls))
        {
            display(stalls);   
            
            // find the middle position of the longest run
            // of unocupied stalls
            int start = 0;
            int stop = 0;
            int startLongestRun = 0;
            int endLongestRun = 0;
            
            for (int i = 0; i < stalls.length; i++)
            {
                if (!stalls[i])
                {
                    start = i;
                    stop = end(i, stalls);
                    i = stop;
                }
                
                if (stop - start > endLongestRun - startLongestRun)
                {
                    startLongestRun = start;
                    endLongestRun = stop;
                }
            }
                 
            // calculate the position of the stall in the middle 
            // of the rest stalls
            int middle = (startLongestRun + endLongestRun) / 2;
            
            stalls[middle] = true;
        }
        display(stalls);
    }
    
    public static boolean hasUnoccupiedStalls(boolean[] stalls)
    {
        boolean occupied = true;
        int i = 0;
        // searches for the 1st unoccupied stall
        while (occupied && i < stalls.length)
        {
            occupied = stalls[i];
            i++;
        }
        
        return !occupied;
    }
    
    public static int end(int pos, boolean[] stalls)
    {
        int i = pos;
        while(i < stalls.length && !stalls[i])
        {
            i++;
        }
        
        return i;
    }
    
    public static void display(boolean[] stalls)
    {
        // display the rest stalls
        for (boolean stall : stalls)
        {
            if (stall) { System.out.print("X"); }
            else { System.out.print("_"); }
            System.out.print(" ");
        }
        System.out.println();
    }
}