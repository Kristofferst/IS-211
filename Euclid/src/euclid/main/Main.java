package euclid.main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            Euclid euclid = new Euclid();
            long m = random.nextLong(0, Integer.MAX_VALUE);
            euclid.GreatestCommonDivisor(m,1551000);
            System.out.println("N: "+euclid.getInput_n());
            System.out.println("M: "+euclid.getInput_m());
            System.out.println("Result:"+euclid.getResult());
            System.out.println("Count: "+euclid.getCount());
        }

        Euclid euclid = new Euclid();
        euclid.GreatestCommonDivisor(117669030460994L, 72723460248141L); // Fibonacci tall
        System.out.println("N: "+euclid.getInput_n());
        System.out.println("M: "+euclid.getInput_m());
        System.out.println("Result:"+euclid.getResult());
        System.out.println("Count: "+euclid.getCount());

        Euclid testE = new Euclid();
        testE.GreatestCommonDivisor(199, 544);

        System.out.println(testE.getCount());
    }
}
