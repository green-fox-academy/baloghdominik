import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerTest {

    //Arrange
    private ArrayList<Card> cards = new ArrayList<>();

    //Act
    private Poker poker = new Poker();

    //Assert
    @Test
    public void getHigh() {

        List<Card> cards = Arrays.asList(
                new Card("2", "H"),
                new Card("2", "S"),
                new Card("5", "H"),
                new Card("9", "H"),
                new Card("K", "H"),
                new Card("2", "C"),
                new Card("3", "H"),
                new Card("3", "S"),
                new Card("8", "C"),
                new Card("A", "H"));

        String winnerPair = poker.getHigh(cards);

        Assert.assertEquals("AH", winnerPair);
    }

    @Test
    public void getHighAgain() {
        cards.add(new Card("2", "H"));
        cards.add(new Card("2", "S"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("2", "C"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("3", "S"));
        cards.add(new Card("8", "C"));
        cards.add(new Card("J", "H"));
        Assert.assertEquals("KH", poker.getHigh(cards));
    }

    @Test
    public void getPairsBlackHigh() {
        cards.add(new Card("2", "H"));
        cards.add(new Card("2", "S"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("2", "C"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("3", "S"));
        cards.add(new Card("8", "C"));
        cards.add(new Card("A", "H"));
        Assert.assertEquals("Black", poker.getPairs(cards));
    }

    @Test
    public void getPairsWhiteHigh() {
        cards.add(new Card("4", "H"));
        cards.add(new Card("4", "S"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("5", "C"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("3", "S"));
        cards.add(new Card("8", "C"));
        cards.add(new Card("2", "H"));
        Assert.assertEquals("White", poker.getPairs(cards));
    }

    @Test
    public void getPairsWhite() {
        cards.add(new Card("4", "H"));
        cards.add(new Card("4", "S"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("5", "C"));
        cards.add(new Card("7", "H"));
        cards.add(new Card("3", "S"));
        cards.add(new Card("8", "C"));
        cards.add(new Card("2", "H"));
        Assert.assertEquals("White", poker.getPairs(cards));
    }

    @Test
    public void getPairsBlack() {
        cards.add(new Card("4", "H"));
        cards.add(new Card("8", "S"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("5", "C"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("3", "S"));
        cards.add(new Card("J", "C"));
        cards.add(new Card("J", "H"));
        Assert.assertEquals("Black", poker.getPairs(cards));
    }

    @Test
    public void getFlushWhite() {
            cards.add(new Card("2", "H"));
            cards.add(new Card("3", "H"));
            cards.add(new Card("5", "H"));
            cards.add(new Card("9", "H"));
            cards.add(new Card("K", "H"));
            cards.add(new Card("2", "C"));
            cards.add(new Card("3", "H"));
            cards.add(new Card("3", "S"));
            cards.add(new Card("8", "C"));
            cards.add(new Card("A", "H"));
        Assert.assertEquals("White", poker.isFlush(cards));
    }

    @Test
    public void getFlushBlack() {
        cards.add(new Card("2", "H"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "D"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("2", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("8", "D"));
        cards.add(new Card("A", "D"));
        Assert.assertEquals("Black", poker.isFlush(cards));
    }

    @Test
    public void getFlushNull() {
        cards.add(new Card("2", "H"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("5", "S"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("2", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("8", "C"));
        cards.add(new Card("A", "D"));
        Assert.assertEquals(null, poker.isFlush(cards));
    }

    @Test
    public void getFlushBoth() {
        cards.add(new Card("2", "H"));
        cards.add(new Card("3", "H"));
        cards.add(new Card("5", "H"));
        cards.add(new Card("9", "H"));
        cards.add(new Card("K", "H"));
        cards.add(new Card("2", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("3", "D"));
        cards.add(new Card("8", "D"));
        cards.add(new Card("A", "D"));
        Assert.assertEquals("Both", poker.isFlush(cards));
    }
}