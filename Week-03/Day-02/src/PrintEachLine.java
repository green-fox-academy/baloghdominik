import java.io.IOException;
import java.nio.file.*;

public class PrintEachLine {
    public static void main(String[] args) {
        String pathString = "src/myfile.txt";
        try {
            Path path1 = Paths.get(pathString);
            for (String line:Files.readAllLines(path1)) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read "+ pathString);
        } finally {

        }
    }
}