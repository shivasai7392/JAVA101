class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println(this);
    }
}

class SimpleRunnable implements Runnable{
    public void run() {
        System.out.println(this);
    }
}

public class ThreadExample {
    public static void main(String[] args) {
//        NewThread myThread = new NewThread();
//        myThread.setName("MyThread1");
//        NewThread myThread2 = new NewThread();
//        myThread2.setName("MyThread2");
//        myThread.start();
//        myThread2.start();

        Thread newThread = new Thread(new SimpleRunnable());
        newThread.setName("MyThread2");
        newThread.start();

        Thread myThread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        myThread.setName("MyThread3");
        myThread.start();

        // JVM Scheduler - Thread Scheduling
    }
}
