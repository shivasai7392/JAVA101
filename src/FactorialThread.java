import java.math.BigInteger;

public class FactorialThread extends Thread {
    private long number;

    public BigInteger getResult() {
        return result;
    }

    public boolean isDone() {
        return done;
    }

    private BigInteger result;
    private boolean done;

    FactorialThread(long number) {
        this.number = number;
        result = BigInteger.valueOf(0);
        done = false;
    }

    @Override
    public void run() {
        result = factorial(number);
        done = true;
    }

    BigInteger factorial(long number) {
        BigInteger result = BigInteger.valueOf(1);
        for (int k = 2; k < number; k++) {
            result = result.multiply(BigInteger.valueOf(k));
        }
        return result;
    }


}
