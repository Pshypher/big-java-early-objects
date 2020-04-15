import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HomeWork
{
   public class readFile()
   {
      String filename;
      
      List<String> lines = Files.readAllLines(Paths.get(filename));
      String content = new String(Files.readAllBytes(Paths.get(filename)));
   }
}