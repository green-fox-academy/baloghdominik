import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Exercise2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        OptionalDouble oddNums = numbers.stream().filter(x -> x % 2 == 1).mapToInt(x -> x).average();
        Double average = oddNums.orElse(0);
        System.out.println(average);
    }
}