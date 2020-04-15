/**
         A class that models a bug moving in an horizontal fashion
*/
public class Bug
{
        private int position;
        /**
                Construct a Bug object located at the specified point
                @param initialPosition the initial position of the bug
        */
        public Bug(int initialPosition)
        {
                position = initialPosition;
        }
        
        /**
                Change the direction in which the bug moves
        */
        public void turn()
        {
                position = position - 2;
        }
        
        /**
                Moves the bug in the current direction one pixel forward
        */
        public void move()
        {
                position = position + 1;
        }
        
        /**
                Returns the current position of the bug
        */
        public int getPosition()
        {
                return position;
        }
}