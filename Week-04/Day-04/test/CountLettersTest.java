import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countletters() {
        CountLetters cl = new CountLetters("CIGI?");
        assertEquals(5,cl.countLetters());
    }
}