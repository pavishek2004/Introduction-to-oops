package OopsConcept;

public class Employee extends Person{
    private String employeeID;
    private double salary;

    // Constructor using super() to initialize Person
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployee() {
        super.display(); // Display name and age from Person
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }

    // Main method to test Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 30, "E101", 50000.0);
        emp1.displayEmployee();

        Employee emp2 = new Employee("Alice", 28, "E102", 60000.0);
        emp2.displayEmployee();
    }
}
