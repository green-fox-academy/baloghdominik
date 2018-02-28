package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

        System.out.println(sortingDominoes(dominoes));
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<Domino>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    private static List<Domino> sortingDominoes(List<Domino> dominoes) {

        List<Domino> orderedDominoes = new ArrayList<Domino>();
        orderedDominoes.add(dominoes.get(0));

        for (int i = 0; i < orderedDominoes.size(); i++) {
            int[] tempValues = orderedDominoes.get(i).getValues();

            for (int j = 1; j < dominoes.size(); j++) {
                int[] tempValues2 = dominoes.get(j).getValues();

                if (tempValues[1] == tempValues2 [0]) {
                    orderedDominoes.add(dominoes.get(j));
                }
            }
        }
        return orderedDominoes;
    }
}
