import java.util.ArrayList;
import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
        cities.stream()
                .filter(c -> c.startsWith("A") && c.endsWith("I"))
                .map(c -> c + " ")
                .forEach(System.out::print);
    }
}
