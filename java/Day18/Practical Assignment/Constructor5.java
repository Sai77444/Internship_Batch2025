public class Constructor5 {
    static int count = 0;

    public Constructor5() {
        count = count + 1;
        System.out.println("Object number: " + count);
    }

    public static void main(String[] args) {
        Constructor5 obj1 = new Constructor5();
        Constructor5 obj2 = new Constructor5();
        Constructor5 obj3 = new Constructor5();
    }
}
