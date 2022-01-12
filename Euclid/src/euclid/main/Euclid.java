package euclid.main;

public class Euclid {
    private int count = 0;
    private long input_n;
    private long input_m;
    private long result;

    public int getCount() {
        return count;
    }

    public long getInput_n() {
        return input_n;
    }

    public long getInput_m() {
        return input_m;
    }

    public long getResult() {
        return result;
    }

    public long GreatestCommonDivisor(long m, long n) {
        long r;
        input_n = n;
        input_m = m;
        while ((r = (m % n)) != 0) {
            count++;
            m = n;
            n = r;
        }
        result = n;
        return n;
    }
}