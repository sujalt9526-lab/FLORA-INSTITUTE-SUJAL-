public class comparemployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 40000);
        Employee e2 = new Employee("Amit", 50000);
        Employee e3 = new Employee("Priya", 50000);

        e1.compare(e2);
        e2.compare(e3);

        Employee top = e1.higher(e2).higher(e3);
        System.out.println("Highest-paid employee: " + top.name);
        System.out.println("Annual Salary: " + top.annual());
    }
}

class Employee {
    static int count = 0;
    String name;
    int no;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        no = ++count;
    }

    double annual() { return salary * 12; }

    void compare(Employee o) {
        if (annual() > o.annual())
            System.out.println("Employee " + no + " earns more than Employee " + o.no + ".");
        else if (annual() < o.annual())
            System.out.println("Employee " + o.no + " earns more than Employee " + no + ".");
        else
            System.out.println("Employee " + no + " and Employee " + o.no + " have equal annual salaries.");
    }

    Employee higher(Employee o) { return o.annual() > annual() ? o : this; }
}