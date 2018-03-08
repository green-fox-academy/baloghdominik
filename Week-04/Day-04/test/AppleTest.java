import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

    Apple apple;

    public void setUp() {
        apple = new Apple("apple");
    }

    @Test
    public void getApple() {
        assertEquals("apple", Apple.getApple());
    }
}