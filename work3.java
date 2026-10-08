class shop {
   String component;
    double price;
}
public class work3 {
    public static void main(String[] args) {
        shop s1 = new shop();

        s1.component = "Laptop";
        s1.price = 50000;

        shop s2 = s1;

        s2.price = 45000;
        System.out.println(s1.price);
        System.out.println(s2.price);
    

    }
}