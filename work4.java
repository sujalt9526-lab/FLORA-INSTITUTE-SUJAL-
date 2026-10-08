class student {
    private String name;
    private int marks;

    void SetName(String name) {
        this.name =name;
    }

    void SetMarks(int marks) {
        this.marks =marks;
    }

    String Getname() {
        return name;   
    }

    int Getmarks() {
        return marks;
    }
}

public class work4 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.SetName("sujal");
        s1.SetMarks(95);
        System.out.println("Name:" + s1.Getname());
        System.out.println("Marks:" + s1.Getmarks());
    }
}
