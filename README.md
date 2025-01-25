**Day 1: Problem Statement (Basic OOP)**
```
Problem Statement:
Write a Java program to create a class Student with the following attributes:   id, name, age
Include the following methods in the class:
A constructor to initialize the attributes.
A method displayDetails() to print the student's details.
Task:  Create two instances of the Student class with different details and display their information.

Solution: 
class Student {
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", 20);
        Student student2 = new Student(2, "Bob", 22);
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}
```
