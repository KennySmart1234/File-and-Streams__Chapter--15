import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HorizonsFileCreator {
    public static void main(String[] args){
        // 1. Defining the path that points to the file you are trying to work with
        // unix - home/gamp/Desktop... Windows -c:\\Users\Desktop...
//        String fileLocation = "/home/gamp/Desktop";
        String  fileLocation = "a/b/c/d/../../e/f/../";
        Path path = Path.of(fileLocation);
        System.out.println(path.getFileSystem());
        System.out.println(path.getRoot());
        System.out.println(path.normalize());

//        System.out.println(path.toAbsolutePath());
//        System.out.println(path.toFile());

        // 2. Use a method of class file to work with the file



    }
}

