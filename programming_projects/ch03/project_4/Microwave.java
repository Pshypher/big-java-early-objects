/**
        A Microwave class, the control panel of the Mirowave has four buttons
*/
public class Microwave
{
        private int duration;
        private int level;
        private int icSwitch;
        
        /**
                Constructs a new Microwave
        */
        public Microwave()
        {
                duration = 0;
                level = 1;
                icSwitch = 1;
        }

        /**
                Increases the time the Microwave works by 30 seconds
        */
        public void increaseTimer()
        {
                duration = duration + 30;
        }
        
        /**
                Adjusts the power level of the Microwave, 1 is low and 2 indicates a high power
        */
        public void switchPowerLevel()
        {
                level = level + icSwitch;
                icSwitch = icSwitch * -1;
        }
        
        /**
                Resets the Microwave settings to the default
        */
        public void reset()
        {
                duration = 0;
                level = 1;
        }
        
        /**
                Starts the Microwave for the set duration 
        */
        public void start()
        {
                System.out.print("Cooking for ");
                System.out.print(duration);
                System.out.print(" seconds at level ");
                System.out.println(level);
        }
}
