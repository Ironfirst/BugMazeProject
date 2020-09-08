import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MazeReader
{
    File file = new File("Horizontal.txt");
    Scanner minReader;
    {
        try
        {
            minReader = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
