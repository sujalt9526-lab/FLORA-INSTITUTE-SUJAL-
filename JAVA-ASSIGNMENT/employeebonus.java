public class employeebonus {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 105, 50000, 4);
        if (e.valid) e.display();
        else System.out.println("Invalid salary or rating!");
    }
}

class Employee {
    private String name;
    private int id, rating;
    private double salary;
    boolean valid;

    Employee(String name, int id, double salary, int rating) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.rating = rating;
        valid = salary >= 0 && rating >= 1 && rating <= 5;
    }

    double annual() { return salary * 12; }

    double bonus() {
        int[] percent = {0, 0, 5, 10, 15, 20};   // index = rating
        return annual() * percent[rating] / 100;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + annual());
        System.out.println("Annual Bonus: " + bonus());
        System.out.println("Total Annual Compensation: " + (annual() + bonus()));
    }
}