class Shape{
    void area(){
        System.out.println("Area of Shape");
    }
}
class Circle extends Shape{
    int r=10;
    //@Override
    void area(){
        System.out.println("Area of Shape"+3.14*r*r);
    }
}
class Rect  extends Shape{
    int l=3;
    int b=4;
    //@Override
    void area(){
        System.out.println("Area of Reactangle"+l*b);
    }
}
public class Main2 {
    public static void main(String args[]){

    Rect r1=new Rect();
    Circle c=new Circle();
     r1.area();
     c.area();
    }
}
