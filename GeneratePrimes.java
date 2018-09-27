package dummy;

import java.util.ArrayList;

public class GeneratePrimes {

    public static void main(String[] args) {
        int[] primnumbers = generatePrimes(100);
        int i = 0;
        while(primnumbers[i] != 0) {
            System.out.println(primnumbers[i]);
            i++;
        }
        
        System.out.println("------------------");
        
        ArrayList<Integer> primnumbers2 = generatePrimesSieve(100);
        for(int j : primnumbers2) {
            System.out.println(j);
        }

    }
    
    static int[] generatePrimes(int maxValue) {
        int[] result = new int[100];
        result[0]=2;
        result[1]=3;
        int i = 2;
        int number = 4;
        while(number <= maxValue) {
            boolean prim = true;
            for(int j = 0; j < i; j++) {
                if(number%result[j] == 0) {
                    prim = false;
                }
            }
            if(prim) {
                result[i]=number;
                i++;
            }
            number++;
        }
        
        return result;
    }
        
    static ArrayList<Integer> generatePrimesSieve(int maxValue) {
        // Initialisierung Boolean-Feld
        boolean[] field = new boolean[maxValue];
        for(int i=0; i < field.length; i++) {
            field[i]=true;
        }
        field[0]=field[1]=false;
        
        // Limit bis zu dem geprüft werden muss
        int limit = (int)Math.sqrt(maxValue);
        
        for(int i=2; i<=limit; i++) {
            if(field[i]) {     
                for(int j=(int)Math.pow(i, 2); j < maxValue; j=j+i) {
                    field[j]=false;
                }
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < field.length; i++) {
            if(field[i]) {
                result.add(i);
            }
        }
        return result;
    }

}