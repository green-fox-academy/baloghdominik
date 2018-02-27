import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteSingleLine {
    public static void main(String[] args) {
        String pathString = "src/myfile2.txt";
        String myname = "Balogh Dominik";
        try {
            Path path1 = Paths.get(pathString);
            Files.write(path1,myname.getBytes(),APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to write file: "+ pathString);
        } finally {

        }
    }
}