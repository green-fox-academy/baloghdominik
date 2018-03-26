import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("Dominik", "Corsac", "red"));
        foxList.add(new Fox("Peti", "Pallida", "green"));
        foxList.add(new Fox("Samu", "Pallida", "blue"));
        foxList.add(new Fox("Denes", "Macrotis", "green"));

        foxList.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .map(fox -> fox.getName() + " ")
                .forEach(System.out::print);

        System.out.println();

        foxList.stream()
                .filter(fox -> fox.getColor().toLowerCase().equals("green") && fox.getType().toLowerCase().equals("pallida"))
                .map(fox -> fox.getName() + " ")
                .forEach(System.out::print);
    }
}
