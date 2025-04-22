public class WaitingState2 implements Runnable {
    @Override
    public void run() {
        Thread t = new Thread(new WaitingState1());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
