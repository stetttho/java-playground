package dummy;

import java.util.ArrayList;

public class PrimeFactorizer {
    
    public static ArrayList<Integer> factor(int multiple) {
        ArrayList<Integer> primes = GeneratePrimes.generatePrimesSieve(multiple);
        ArrayList<Integer> result = new ArrayList<>();
        for(int prime : primes) {
            if(multiple % prime == 0) {
                result.add(prime);
            }
        }       
        return result;
    }
}
