public class WaitingState1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
