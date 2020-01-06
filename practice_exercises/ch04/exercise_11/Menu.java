/**
        A menu that is displayed on a console.    
*/
public class Menu
{
        // Declare and assign constant(s)
        public static final String LABEL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        private String menuText;
        private int optionCount;
         
        
        /**
                Constructs a menu with no options.
        */
        public Menu()
        {
                menuText = "";
                optionCount = 0;
        }
        /**
                Adds an option to the end of this menu.
                @param option the option to add
        */
        public void addOption(String option)
        {
                menuText = menuText + LABEL.substring(optionCount, optionCount + 1) + ")" + option + "\n";
                optionCount = optionCount + 1;
        }
        
        /**
                Displays the menu on the console.
        */
        public void display()
        {
                System.out.println(menuText);
        }
}        