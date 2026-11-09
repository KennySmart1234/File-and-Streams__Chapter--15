import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HorizonsFileCreator2 {
    public static void main(String[] args) {
        try{
            String fileLocation = "/home/semicolon/Desktop/goggle.txt";
            Path path = Paths.get(fileLocation);
            Files.write(path, "There is a tide affair of men... ".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());

        }
    }
}
