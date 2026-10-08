class student {
    String name;
    
}
public class work2 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = s1;
        s1.name = "John";
        System.out.println("the name :" + s1.name);
        System.out.println(s2.name);
    }
}