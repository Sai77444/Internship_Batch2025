class Movie{
    String title;
    String director;
    int year;
   Movie(String title,String director,int year){
  this.title=title;
  this.director=director;
  this.year=year;  

   }
       void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + year);
        System.out.println("-----------------------");
    }

}
public class movie11{
    public static void main(String args[]){
        Movie m=new Movie("hi","hi",2010);
        Movie m1=new Movie("hi","hi",2010);
        m.displayDetails();
        m1.displayDetails();
    }
}




