class User11{
    String user;
    String email;
     public User11(String user,String email){
        this.user=user;
        this.email=email;
    }
    void display(){
        System.out.println(user);
          System.out.println(email);

    }
}
class Admin extends User11{
    int level;
    Admin(String user,String email,int level){
  super(user,email);
  this.level=level;
    }
    void display(){
        super.display();
        System.out.println(level);
    }

    
public static void main(String args[]){
     Admin admin = new Admin("admin123", "admin@example.com", 5);
        admin.display();

}
    }

