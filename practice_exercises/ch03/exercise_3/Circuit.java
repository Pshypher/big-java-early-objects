/**
        A Circuit class that controls both switches at two endsof a hallway
*/
public class Circuit
{
        private int lamp;
        private int firstSwitch;
        private int secondSwitch;
        
        /**
                Construct a Circuit object
        */
        public Circuit()
        {
                lamp = -1;
                firstSwitch = -1;
                secondSwitch = -1;
        }
        
        /**
                Gets the state of the First switch
                @return the state of the first switch
        */
        public int getFirstSwitchState()
        {
                return Math.max(0, firstSwitch);    // 0 for down, 1 for up
        }
        
        /**
                Return the current state of the second switch
                @return the state of the second switch
        */
        public int getSecondSwitchState()
        {
                return Math.max(0, secondSwitch);    // 0 for down, 1 for up
        }
        
        /**
                Get the present state of the Lamp
                @return the current state of the lamp
        */
        public int getLampState()
        {
                return Math.max(0, lamp);    // 0 for off, 1 for on
        }
        
        /**
                Alternate the current states of the lamp and first switch
        */
        public void toggleFirstSwitch()
        {
                firstSwitch = firstSwitch * -1;
                lamp = lamp * -1;
        }
        
        /**
                Alternate the state of the lamp andd the second switch
        */
        public void toggleSecondSwitch()
        {
                secondSwitch = secondSwitch * -1;
                lamp = lamp * -1;
        }
}