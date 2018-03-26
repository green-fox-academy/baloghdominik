import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        Character[] characters = {'z', 'e', 'r', 'o'};
        String s = Arrays.stream(characters)
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(s);
    }
}