import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        String text = "Easy TaSk";
        List<Character> letters = new ArrayList<>();
        for(char c : text.toCharArray()) {
            letters.add(c);
        }
        letters.stream().
                filter(Character::isUpperCase).
                forEach(System.out::print);
    }
}