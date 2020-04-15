import java.util.Scanner;

/**
        This program prompts the user for the drive letter, the path
        , the file name, and the extension and displays the complete file name
*/
public class FilePath
{
        public static void main(String[] args)
        {
                // Constructs an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the label of the drive letter (e.g C, D etc.): ");
                String driveLetter = in.next();
                System.out.print("Enter the path preceeding the file name (e.g \\Windows\\System): ");
                String filePath = in.next();
                System.out.print("Enter the name of the file: ");
                String fileName = in.next();
                System.out.print("Enter the file name extension (e.g txt, html, etc.): ");
                String extension = in.next();
                System.out.println();
                
                // Prints out the complete file name including the drive letter
                // , file path and extension
                System.out.printf("%s:%s\\%s.%s", driveLetter, filePath, fileName, extension);
        }
}