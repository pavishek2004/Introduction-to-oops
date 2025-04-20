package OopsConcept;
public class Person {
    private String name;
    private int age;
    
    // Default constructor with default age 18
    public Person() {
        this.age = 18;
    }
    
    // Constructor with only name (age will be default 18)
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }
    
    // Parameterized constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display name and age of person
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Testing default constructor
        Person p1 = new Person();
        p1.name = "John";
        p1.display();
        
        // Testing constructor with only name
        Person p2 = new Person("Alice");
        p2.display();
        
        // Testing constructor with name and age
        Person p3 = new Person("Bob", 25);
        p3.display();
    }
}