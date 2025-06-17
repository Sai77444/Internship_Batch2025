

interface Printable {
    void print();
}


class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the document ");
    }
}


class Photo implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the photo ");
    }
}


public class Main4 {
    public static void main(String[] args) {
        Printable myDoc = new Document();
        Printable myPhoto = new Photo();

        myDoc.print();    
        myPhoto.print();  
    }
}
