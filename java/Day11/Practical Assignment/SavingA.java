public class SavingA {
    int acno=223061106;
    double balance=3600.34;
    String BankName="Bank of BAroda";
    void Display(){
         System.out.println(acno);
          System.out.println(balance);
           System.out.println(BankName);
    }
    public static void main(String[] args) {
        SavingA A =new SavingA();
        A.Display();
    }
}
