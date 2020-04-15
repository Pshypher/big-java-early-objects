/**
      A modified Circuit class with a single switch across the hallway
*/
public class Circuit
{
   private int lamp;
   private int knob;
   
   /**
         Return the state of the switch
         @param knob the switch state, 0 is down, 1 is up
        @return the state of the switch
   */
   public int getSwitchState(int knob) 
   {
      this.knob = knob;
      return knob;
   }
   
   /**
         Get the state of the lamp, 0 is off and 1 is on
         @return the state of the lamp                
   */
   public int getLampState()
   {
      return lamp;
   }
   
   /**
         Toggles the state of the passed in switch and the lamp
         @param knob the switch used to control the lamp
   */
   public void toggleSwitch(int knob)
   {
      this.knob = 1 - knob;
      lamp = 1 - lamp;
   }
}