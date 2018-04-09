import java.util.ArrayList;
import java.util.List;

public class Poker {

    private ArrayList<Card> cards = new ArrayList<>();

    private String[] valueRank(){
        return new String[]{"2","3","4","5","6","7","8","9","J","Q","K","A"};
    }

    public String getHigh(List<Card> cards){
        int rank = 0;
        Card highestCard = new Card("0","0");
        for (int i = 0; i < cards.size(); i++) {
            for (int j = 0; j < valueRank().length; j++) {
                if (valueRank()[j].equals(cards.get(i).getValue())){
                    if (rank < j){
                        rank = j;
                        highestCard = new Card(cards.get(i).getValue(), cards.get(i).getColor());
                    }
                }

            }

        }
        return highestCard.getCard();
    }

    public String getPairs(ArrayList<Card> cards) {
        Card whitepair = new Card("0","0");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(cards.get(i).getValue().equals(cards.get(j).getValue()) && j != i){
                    whitepair = new Card(cards.get(i).getValue(), cards.get(i).getColor());
                }
            }
        }
        Card blackpair = new Card("0","0");
        for (int i = 5; i < 9; i++) {
            for (int j = 5; j < 9; j++) {
                if(cards.get(i).getValue().equals(cards.get(j).getValue()) && j != i){
                    blackpair = new Card(cards.get(i).getValue(), cards.get(i).getColor());
                }
            }
        }
        if (!whitepair.getValue().equals("0") && !blackpair.getValue().equals("0")) {
            ArrayList<Card> pairs = new ArrayList<>();
            pairs.add(new Card(whitepair.getValue(), whitepair.getColor()));
            pairs.add(new Card(blackpair.getValue(), blackpair.getColor()));
            String winner = getHigh(pairs);
            if (winner.equals(whitepair.getCard())){
                return "White";
            } else {
                return "Black";
            }
        } else if (!whitepair.getValue().equals("0")){
            return "White";
        } else if (!blackpair.getValue().equals("0")){
            return "Black";
        } else {
            return null;
        }
    }

    public String isFlush(ArrayList<Card> cards) {
        boolean whiteFlush = true;
            for (int j = 0; j < 5; j++) {
                if(cards.get(0).getColor().equals(cards.get(j).getColor()) && whiteFlush){
                    whiteFlush = true;
                } else {
                    whiteFlush = false;
                }
            }
        boolean blackFlush = true;
        for (int j = 5; j < 9; j++) {
            if(cards.get(5).getColor().equals(cards.get(j).getColor()) && blackFlush){
                blackFlush = true;
            } else {
                blackFlush = false;
            }
        }
        if (whiteFlush && blackFlush) {
            return "Both";
        } else if (whiteFlush) {
            return "White";
        } else if (blackFlush) {
            return "Black";
        } else {
            return null;
        }
    }
}
