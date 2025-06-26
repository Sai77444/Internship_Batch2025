

public class Constructor1 {
    int id;
    String name;
    double salary;
    public Constructor1(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public static void main(String args[]){
Constructor1 e=new Constructor1(101,"Sai",5000000);
Constructor1 e1=new Constructor1(102,"OM",5000000);
System.out.println("NAme"+e.name + "ID"+e.id +"Salary"+e.salary);
    }
}
