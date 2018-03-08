import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sum() {
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(16);
        numbers.add((3));

        assertEquals(69, sum.sum(numbers));
    }

    @Test
    public void sumTestEmpty() {
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(0, sum.sum(numbers));
    }

    @Test
    public void sumTestOne() {
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        assertEquals(1, sum.sum(numbers));
    }

    @Test(expected = NullPointerException.class)
    public void sumTestNull() {
        Sum sum = new Sum();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(null);

        assertEquals(69, sum.sum(numbers));
    }
}