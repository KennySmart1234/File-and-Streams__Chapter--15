////import java.io.File;
////import java.io.IOException;
////import java.io.InputStream;
////import java.net.URI;
////import java.nio.file.Path;
//
//import jdk.jfr.DataAmount;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URI;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class Post {
//
//    public static void main(String[] args) {
//
//        String baseUri = "https://jsonplaceholder.typicode.com/posts";
//        String endpoint = "";
//
//        URI uri = URI.create(baseUri + endpoint);
//        Path path = Path.of("posts.json");
//        String fileName = "posts.json";
//        byte[] data = readJsonData(baseUri.concat(endpoint));
//        writeToJsonFile(fileName, data);
//
//        public static byte [] readJsonData(){
//
//
//        }
//
//        try (InputStream inputStream = uri.toURL().openStream()) {
//
//            byte[] data = inputStream.readAllBytes();
//
//            Files.write(path, data);
//
//            System.out.println("Posts downloaded successfully!");
//
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
////
////import java.io.File;
////import java.io.IOException;
////import java.io.InputStream;
////import java.net.URI;
////import java.nio.file.Path;
////
////public class Post {
////
////    public static void main(String[] args) {
////
////
////        String baseUri = "https://jsonplaceholder.typicode.com/posts";
////        String endpoint = "/post";
////
////        URI uri = URI.create(baseUri+endpoint);
////        Path path = Path.of("posts.json");
////
////        try(InputStream inputStream = uri.toURL().openStream()) {
////
//////            String fileLocation =  "/home/semicolon/Desktop/post.txt";
//////            Path path = Paths.get(fileLocation);
////            byte[] data = InputStream.readAllBytes();
////            File.write(path, data);
////
////        } catch (IOException exception) {
////            exception.printStackTrace();
////
////        }
////
////    }
////}
