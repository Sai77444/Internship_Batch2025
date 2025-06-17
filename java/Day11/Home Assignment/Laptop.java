public class Laptop {
    int modeln=202762;
    String Lcompany="Dell";
    String color="Silver";
void Display(){
    System.out.println(modeln);
  System.out.println(Lcompany);
    System.out.println(color);
}
   public static void main(String args[]){
    Laptop l=new Laptop();
    l.Display();
   } 
}
