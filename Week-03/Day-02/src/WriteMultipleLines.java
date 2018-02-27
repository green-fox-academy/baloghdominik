import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteMultipleLines {
    public static void main(String[] args) {
        String pathString = "src/myfile3.txt";
        int num = 5;
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple"));
        multiplelines(pathString, num, list);
    }

    private static void multiplelines(String pathString, int num, ArrayList<String> list) {
        try {
            Path path1 = Paths.get(pathString);
            for (int i = 1; i <= num; i++) {
                Files.write(path1, list, APPEND);
            }
        } catch (IOException e) {
        } finally {

        }
    }
}