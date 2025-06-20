class Demo{
    synchronized void run(){
        System.out.println("Synchronized");
    }
}
public class Thread3 extends Demo {
    Demo s;
    public Thread3(Demo s){
        this.s=s;
    }
    public void run(){
        s.run();
            System.out.println("Not Synchronized");
        }
    
    
        public static void main(String args[]){
            Demo s=new Demo();
            Thread3 sd=new Thread3(s);
           sd.run();
        }
    }
