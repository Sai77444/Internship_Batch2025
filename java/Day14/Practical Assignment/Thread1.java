

public class Thread1 extends Thread {
    public void thread1(){
try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                Thread.sleep(1000); 
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
    
    
    public static void main(String args[]){
  Thread1 thread = new Thread1(); 
        thread.start();
    }
}
