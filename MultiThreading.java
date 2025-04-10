class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Step " + i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-One");
        t2.setName("Thread-Two");

        t1.start();
        t2.start();
    }
}
