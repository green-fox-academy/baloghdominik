import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyFiles {
    public static void main(String[] args) {
        String pathString = "src/myfile4.txt";
        String pathString2 = "src/myfile5.txt";
        copyfile(pathString, pathString2);
    }

    private static boolean copyfile(String pathString, String pathString2) {
        try {
            Path path1 = Paths.get(pathString);
            Path path2 = Paths.get(pathString2);
            Files.copy(path1,path2,REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}