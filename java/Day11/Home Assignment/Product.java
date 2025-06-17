public class Product {
    String name;
    int price;
    Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    void Display(){
          System.out.println(name);
            System.out.println(price);
    }
    public static void main(String[] args) {
        Product p=new Product("cream",20);
         Product p1=new Product("powder",50);
          Product p2=new Product("facewash",70);
        p.Display();
        p1.Display();
        p2.Display();

    }
    
}
