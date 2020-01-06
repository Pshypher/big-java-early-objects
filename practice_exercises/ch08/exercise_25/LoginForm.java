/**
    A LoginForm simulates the form found on many 
    web-pages
*/
public class LoginForm
{
    private String username;
    private String password;
    private String[] entries;
    private int entriesSize;
    private boolean loggedIn;  
    
    /**
        Construct a login form with no input and the expected 
        username and password
    */
    public LoginForm()
    {
        final int NUM_ENTRIES = 2;
        
        username = "RamesesVI";
        password = "#!pshyPher_1217";
        entries = new String[NUM_ENTRIES];
        reset();
        loggedIn = false;
    }
    
    /**
        Resets the fields of the login form
    */
    private void reset()
    {
        for (int i = 0; i < entriesSize; i++)
        {
            entries[i] = "";
        }
        entriesSize = 0;
    }
    
    /**
        Used to input the username and password on
        this login form
        @param text either one of username or password entries
    */
    public void input(String text)
    {
        if (loggedIn) { reset(); }
        entries[entriesSize] = text;
        entriesSize++;          
    }
    
    /**
        Takes either one of two actions on this login form,
        submit the entries or reset the form
        @param button label of the button to be clicked 
    */
    public void click(String button)
    {
        if (button.equals("Submit"))
        {
            if (loggedIn) { return; }
            
            if (username.equals(entries[0]) 
                && password.equals(entries[1]))
            {
                loggedIn = loggedIn();
            }
            else
            {
                reset();
            }
        }
        else if (button.equals("Reset"))
        {
            reset();
        }
    }
    
    /**
        Gets the inputs entered on the login form
        @return the current username and pasword
    */
    public String[] checkEntries()
    {
        return entries;
    }
    
    /**
        Checks if the user logged in successfully
        @return true if the user has logged in
    */
    public boolean loggedIn()
    {
        return true;
    }
}