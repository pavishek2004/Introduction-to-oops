package OopsConcept;

class Person1 {
    private String name;
    private int age;

    // Constructor to initialize Person attributes
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}