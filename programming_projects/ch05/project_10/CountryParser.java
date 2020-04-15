import java.util.Scanner;

/**
        This program reads the French name of a country and adds the article:
        le for masculine or la for feminine, such as le Canada or la Belgique.
*/
public class CountryParser
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the name of a country in french: ");
                String country = in.next();
                
                String initial = country.substring(0, 1); 
                String end = country.substring(country.length() - 1);
                
                if (end.equals("s"))
                        country = "les " + country;
                else if (initial.equals("A") || initial.equals("E") ||
                        initial.equals("I") || initial.equals("O") ||
                        initial.equals("U"))
                        country = "l'" + country;
                else if (end.equals("e"))
                {
                        switch (country)
                        {
                                case "Belize": 
                                case "Cambodge": 
                                case "Mexique":
                                case "Mozambique":
                                case "Zaire":
                                case "Zimbabwe": country = "le " + country; break;
                                default: country = "la " + country; break;  
                        }
                }
                else 
                        country = "le " + country;
                
                System.out.print(country);                                                                                           
        }
}
