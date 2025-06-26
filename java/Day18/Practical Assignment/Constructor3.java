public class Constructor3 {
    String name;
    int marks1, marks2, marks3;

    public Constructor3(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Constructor3 student = new Constructor3("Sai", 78, 85, 90);
        student.displayResult();
    }
}

