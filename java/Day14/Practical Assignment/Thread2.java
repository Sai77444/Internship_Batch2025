// Create a thread by implementing Runnable interface
class Thread2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from thread! (" + i + ")");
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        Thread2 h = new Thread2();         // Create task
        Thread thread = new Thread(h);                 // Create thread with task
        thread.start();                                        // Start the thread
    }
}
