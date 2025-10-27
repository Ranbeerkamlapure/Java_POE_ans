class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Up: " + i);
        }
    }
}

class DescendingRunnable implements Runnable {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Down: " + i);
        }
    }
}

public class Set18_Q2_ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new AscendingThread();
        Thread t2 = new Thread(new DescendingRunnable());

        t1.start();
        t2.start();
    }
}
