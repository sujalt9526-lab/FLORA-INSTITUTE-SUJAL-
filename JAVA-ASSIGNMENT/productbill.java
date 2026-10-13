public class productbill {
    public static void main(String[] args) {
        Product p = new Product("Keyboard", 501, 2000, 3);
        if (p.valid) p.display();
        else System.out.println("Invalid price or quantity!");
    }
}

class Product {
    private String name;
    private int id, qty;
    private double price;
    boolean valid;

    Product(String name, int id, double price, int qty) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty;
        valid = price > 0 && qty > 0;
    }

    double subtotal() { return price * qty; }

    double discount() {
        double s = subtotal();
        double percent = s >= 10000 ? 15 : s >= 5000 ? 10 : s >= 1000 ? 5 : 0;
        return s * percent / 100;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Discount: " + discount());
        System.out.println("Final Bill: " + (subtotal() - discount()));
    }
}