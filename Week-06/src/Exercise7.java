import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        String text = "Dominik";
        List<Character> letters = new ArrayList<>();
        for(char c : text.toCharArray()) {
            letters.add(c);
        }
        System.out.println(text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
    }
}