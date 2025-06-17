class Animal{
    void msound(){
        System.out.println(" ");
    }
}
class Dog extends Animal{
    void msound(){
     System.out.println("Bhau Bhau") ; 
    }
}
class Cat extends Animal{
    void msound(){
        System.out.print("MauMAu");
    }
}
class Demo5{
    public static void main(String args[]){
        Dog a=new Dog();
        Cat a1=new Cat();
        a.msound();
        a1.msound();
    }
}
