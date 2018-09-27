package dummy;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GeneratePrimesTest {
    
    

    @Test
    public void test10() {
        
        ArrayList<Integer> korrekt = new ArrayList<>();
        korrekt.add(2);
        korrekt.add(3);
        korrekt.add(5);
        korrekt.add(7);
        
        assertEquals(korrekt, GeneratePrimes.generatePrimesSieve(10));
    }
    
    @Test
    public void testEdgecase11() {
        ArrayList<Integer> korrekt = new ArrayList<>();
        korrekt.add(2);
        korrekt.add(3);
        korrekt.add(5);
        korrekt.add(7);
        korrekt.add(11);
        
        assertEquals(korrekt, GeneratePrimes.generatePrimesSieve(11));
    }

}
