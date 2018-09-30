package dummy;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizerTest {

    @Test
    public void test10() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        assertEquals(expected, PrimeFactorizer.factor(10));
    }
    
    @Test
    public void test13() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(13);
        assertEquals(expected, PrimeFactorizer.factor(13));
    }

}
