package javaEducation;

/**
 * This is a simple Java class to demonstrate basic Java concepts
 * Author: Learning Java
 * Date: Today
 */
public class simpleCode {
    
    // Instance variables (also called fields)
    private String name;
    private int age;
    
    // Constructor - special method that runs when we create a new object
    public simpleCode(String name, int age) {
        this.name = name;  // 'this' refers to the current object
        this.age = age;
    }
    
    // Getter method - allows us to access the name from outside the class
    public String getName() {
        return name;
    }
    
    // Setter method - allows us to change the name from outside the class
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Method to check if the person is an adult
    public boolean isAdult() {
        return age >= 18;  // Returns true if age is 18 or older
    }
    
    // Main method - this is where the program starts running
    public static void main(String[] args) {
        // Create a new object of our class
        simpleCode person1 = new simpleCode("Alice", 25);
        simpleCode person2 = new simpleCode("Bob", 16);
        
        // Display information about both people
        System.out.println("=== Person 1 ===");
        person1.displayInfo();
        System.out.println("Is adult: " + person1.isAdult());
        
        System.out.println("\n=== Person 2 ===");
        person2.displayInfo();
        System.out.println("Is adult: " + person2.isAdult());
        
        // Demonstrate changing values
        System.out.println("\n=== After changing Bob's age ===");
        person2.setAge(20);  // Change Bob's age to 20
        person2.displayInfo();
        System.out.println("Is adult: " + person2.isAdult());
        
        // Simple loop example
        System.out.println("\n=== Counting from 1 to 5 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // Simple if-else example
        System.out.println("\n=== Age comparison ===");
        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are the same age");
        }
    }
}
