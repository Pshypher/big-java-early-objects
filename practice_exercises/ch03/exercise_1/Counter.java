/**
        This class models a tally counter.
*/
public class Counter
{
        private int value;
        private int limit;
        
        /**
                Gets the current value of this counter.
                @return the current value
        */
        public int getValue()
        {
                return value;
        }
        
        /**
                Advances the value of this counter by 1.
        */
        public void click()
        {
                value = value + 1;
                value = Math.min(limit, value);
        }
        
        /**
                Resets the value of this counter to 0.
        */
        public void reset()
        {
                value = 0;
        }
        
        /**
                Undo a previous click action
        */
        public void undo()
        {
                 value = value - 1;
                 value = Math.max(0, value);
        }
        
        /**
                Attaches a limit to value of each Counter object
                @param maximum the upper limit of the tally Counter  
        */
        public void setLimit(int maximum) 
        {
                limit = maximum;
        }
                                                                    
}     