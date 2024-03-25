package pckg_arrays;

import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int MIN = 10;
    private static final int MAX = 450;

    public static int[] populateArrayRandInt(int arrSize){
        int [] arr = new int[arrSize];
        for(int k=0; k<arrSize; k++){
            int numElement= ThreadLocalRandom.current().nextInt(MIN,MAX);
            arr [k] =numElement;




        }
        return arr;
    }
}
