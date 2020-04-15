import java.util.Scanner;

/**
        This program simulates a portion of the control software for the sliding
        doors of a minivan
*/
public class SlidingDoor
{
        public static void main(String[] args)
        {
                final double OFF = 0;
                final double ACTIVATED = 1;
                
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter all eight combinations of the switches,");
                System.out.print(" locks, handles and gear shift setting: ");
                String input = in.nextLine();
                
                int leftDashboardSwitch = Integer.parseInt(input.substring(0, 1));
                int rightDashboardSwitch = Integer.parseInt(input.substring(2, 3));
                int childLock = Integer.parseInt(input.substring(4, 5));
                int masterUnlock = Integer.parseInt(input.substring(6, 7));
                int insideLeftHandle = Integer.parseInt(input.substring(8, 9));
                int outsideLeftHandle = Integer.parseInt(input.substring(10, 11));
                int insideRightHandle = Integer.parseInt(input.substring(12, 13));
                int outsideRightHandle = Integer.parseInt(input.substring(14, 15));
                String gearShiftSetting = input.substring(16);
                
                String output;
                if (masterUnlock == ACTIVATED && gearShiftSetting.equals("P"))
                {
                        if ((leftDashboardSwitch == ACTIVATED || outsideLeftHandle == ACTIVATED 
                                || (childLock == ACTIVATED && insideLeftHandle == ACTIVATED)) &&
                                (rightDashboardSwitch == ACTIVATED || outsideRightHandle == ACTIVATED
                                || (childLock == ACTIVATED && insideRightHandle == ACTIVATED)))
                                output = "left door opens and right door opens";
                        else if (leftDashboardSwitch == ACTIVATED || outsideLeftHandle == ACTIVATED 
                                || (childLock == ACTIVATED && insideLeftHandle == ACTIVATED))
                                output = "left door opens";
                        else if (rightDashboardSwitch == ACTIVATED || outsideRightHandle == ACTIVATED
                                || (childLock == ACTIVATED && insideRightHandle == ACTIVATED))
                                output = "right door opens";
                        else
                                output = "both doors stay closed";                                                
                }
                else
                        output = "both doors stay closed";
                        
                System.out.print(output);                        
        }
}