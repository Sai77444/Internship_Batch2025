

public class Exception1 {
   public static void main(String args[]){
    int a=0;
    int b=100;
    try {
        int c=b/a;
    } catch (Exception e) {
        System.out.println("cannot divide by zero");
    }
finally{
     System.out.println(" divide by xero");
}
    }
   } 

