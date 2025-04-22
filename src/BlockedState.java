public class BlockedState implements Runnable {
    @Override
    public void run() {
        commonResource();
    }

    public static synchronized void commonResource() {
        while (true) {}
    }
}
