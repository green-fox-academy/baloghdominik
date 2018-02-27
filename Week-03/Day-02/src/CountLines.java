import java.io.IOException;
import java.nio.file.*;

public class CountLines {
    public static void main(String[] args) {
        String pathString = "src/myfile.txt";
        int i = 0;
        try {
            Path path1 = Paths.get(pathString);
            for (String line:Files.readAllLines(path1)) {
                i++;
            }
            System.out.println(i);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read "+ pathString);
        } finally {

        }
    }
}