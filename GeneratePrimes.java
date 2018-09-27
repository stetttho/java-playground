package dummy;

import java.util.ArrayList;

public class GeneratePrimes {
    
    static boolean[] field;
    static int amountOfPrimes;

    public static void main(String[] args) {
        int[] primnumbers = generatePrimesModulo(100);
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
    
    static int[] generatePrimesModulo(int maxValue) {
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
        generateBooleanField(maxValue);
        crossOutMultiples(maxValue);
        ArrayList<Integer> result = getUncrossedNumbers();
        return result;
    }
    
    private static void generateBooleanField(int maxValue) {
        field = new boolean[maxValue+1];
        for(int i=0; i < field.length; i++) {
            field[i]=true;
        }
        field[0]=field[1]=false;
    }
    
    private static void crossOutMultiples(int maxValue) {
        int limit = (int)Math.sqrt(maxValue);
        for(int i=2; i<=limit; i++) {
            if(field[i]) {     
                for(int j=(int)Math.pow(i, 2); j < field.length; j=j+i) {
                    field[j]=false;
                }
            }
        }
    }
    
    private static ArrayList<Integer> getUncrossedNumbers() {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < field.length; i++) {
            if(field[i]) {
                result.add(i);
            }
        }
        amountOfPrimes = result.size();
        return result;
    }

}
