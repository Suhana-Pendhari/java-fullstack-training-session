class Ten implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error in Thread 1");
            }
        }
    }
}

class Two implements Runnable {

    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Error in Thread 2");
            }
        }
    }
}

public class Thread6 {

    public static void main(String[] args) {

        Ten task1 = new Ten();
        Two task2 = new Two();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        try {
            t1.start();
            t1.join();   // Wait until t1 finishes

            t2.start();  // Start second thread after t1 completes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
