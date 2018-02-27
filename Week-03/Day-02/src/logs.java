import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class logs {
    public static void main(String[] args) {
        String pathString = "src/log.txt";
        ArrayList<String> uniqueip = new ArrayList<String>();
        unique_ip(pathString, uniqueip);
        writeUniqueIP(uniqueip);
    }

    private static void writeUniqueIP(ArrayList<String> uniqueip) {
        for (int counter = 0; counter < uniqueip.size(); counter++) {
            System.out.println(uniqueip.get(counter));
        }
    }

    private static void unique_ip(String pathString, ArrayList<String> uniqueip) {
        ArrayList<String> log = new ArrayList<String>();
        ArrayList<String> ip = new ArrayList<String>();
        try {
            readLog(log, pathString);
            getIP(log, ip);
            collectUniqueIP(ip, uniqueip);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private static void collectUniqueIP(ArrayList<String> ip, ArrayList<String> uniqueip) {
        String temp = "";
        for (int c = 0; c < ip.size(); c++) {
            temp = ip.get(c);
            if (uniqueip.contains(temp)) {
            } else {
                uniqueip.add(temp);
            }
        }
    }

    private static void getIP(ArrayList<String> log, ArrayList<String> ip) {
        String line2 = "";
        for (int counter = 0; counter < log.size(); counter++) {
            line2 = log.get(counter);
            line2.split("\\s+");
            ip.add(line2.split("\\s+")[5]);
        }
    }

    private static void readLog(ArrayList<String> log, String pathString) throws IOException {
        Path path = Paths.get(pathString);
        for (String line : Files.readAllLines(path)) {
            log.add(line);
        }
    }
}

