import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamSmaple {

    public static void main(String[] args){
        String fileLocation = "/home/semicolon/Documents/first_issue.txt";

        try(FileInputStream fileInputStream = new FileInputStream(fileLocation);){
            byte[] fileContent = fileInputStream.readAllBytes();
            System.out.println(new String(fileContent));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
