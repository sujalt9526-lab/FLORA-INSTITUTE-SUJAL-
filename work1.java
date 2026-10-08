class student
 {
    String name;
    int marks;
}

class student_factory {
    student create_stud()
    {
        student s = new student();
        s.name = "John";
        s.marks = 90;
        return s;
    }
}

public class work1 {
    public static void main(String[] args) {
        student_factory factory = new student_factory();
        student s1 = factory.create_stud();
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);
    }
  }