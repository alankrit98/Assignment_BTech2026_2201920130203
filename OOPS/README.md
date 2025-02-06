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
**Day 2: Problem Statement-26/01/25 (Basic OOP)**
```
Problem Statement:
Create a Java program that demonstrates encapsulation by creating a class BankAccount with the following private attributes:    accountNumber, accountHolderName, balance
Include the following methods:
Constructor to initialize accountNumber and accountHolderName with user-defined values. Initialize balance to zero.
Getter and Setter methods for each private attribute.
A method deposit(double amount) to add the specified amount to the balance.
A method withdraw(double amount) to subtract the specified amount from the balance (only if sufficient funds are available).
A method displayAccountDetails() to print the account information.
Task:   Create an instance of BankAccount, perform some deposits and withdrawals, and display the account details.

Solution:
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe");
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600);
        System.out.println("\nAccount Details:");
        account.displayAccountDetails();
    }
}
```
**Day 3: Problem Statement-27/01/2025 (Basic OOP)**
```
Problem Statement:
Create a Java program to demonstrate inheritance by creating the following classes:
Parent Class: Animal
Attributes: name
Methods:
Constructor to initialize name.
eat(): Prints a message that the animal is eating.
Child Class: Dog (inherits from Animal)
Attributes: breed
Methods:
Constructor to initialize name and breed.
bark(): Prints a message that the dog is barking.
Task:  Create an instance of the Dog class and demonstrate the use of inherited and child-specific methods.

Solution:
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
class Dog extends Animal {
    private String breed;
    public Dog(String name, String breed) {
        super(name); // Call the parent class constructor
        this.breed = breed;
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayDetails();
        dog.eat(); ]
        dog.bark();
    }
}
```
**Day 4: Problem Statement-28/01/25 (Basic OOP)**
```
Problem Statement:
Create a Java program to demonstrate polymorphism by implementing method overriding.
Parent Class: Shape
Method:
area(): Prints "Calculating area of a shape."
Child Classes:
Circle
Attribute:   radius
Constructor to initialize radius.
Override area() to calculate and print the area of a circle (π * radius²).
Rectangle
Attributes: length, width
Constructor to initialize length and width.
Override area() to calculate and print the area of a rectangle (length * width).
Task:    Create instances of Circle and Rectangle, call their area() methods, and demonstrate method overriding.

Solution:
class Shape {
    public void area() {
        System.out.println("Calculating area of a shape.");
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void area() {
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        circle.area();
        rectangle.area();
    }
}
```
**Day 5: Problem Statement-29/01/25 (Basic OOP)**
```
Problem Statement:
Create a Java program that demonstrates abstraction using the abstract keyword.
Abstract Class: Vehicle
Attributes: brand
Constructor to initialize brand.
Abstract method startEngine().
Concrete Classes:
Car
Attribute: fuelType
Constructor to initialize brand and fuelType.
Implement startEngine() method to print a message specific to cars.
Bike
Attribute: hasKickStart
Constructor to initialize brand and hasKickStart.
Implement startEngine() method to print a message specific to bikes.
Task:    Create instances of Car and Bike, call their startEngine() methods, and demonstrate abstraction.

Solution:
abstract class Vehicle {
    protected String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    abstract void startEngine();
}
class Car extends Vehicle {
    private String fuelType;
    public Car(String brand, String fuelType) {
        super(brand);
        this.fuelType = fuelType;
    }
    @Override
    void startEngine() {
        System.out.println(brand + " car with " + fuelType + " fuel is starting.");
    }
}
class Bike extends Vehicle {
    private boolean hasKickStart;
    public Bike(String brand, boolean hasKickStart) {
        super(brand);
        this.hasKickStart = hasKickStart;
    }
    @Override
    void startEngine() {
        System.out.println(brand + " bike is starting. Kick start available: " + hasKickStart);
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Petrol");
        Vehicle bike = new Bike("Yamaha", true);
        car.startEngine();
        bike.startEngine();
    }
}
```
**Day 6: Problem Statement-30/01/25 (Intermediate OOP)**
```
Problem Statement:
Create a Java program that demonstrates interfaces by defining an interface Payment and implementing it in different classes.
Interface: Payment
Method:
void makePayment(double amount)
Implementing Classes:
CreditCardPayment- Implements makePayment() to print a message for credit card transactions.
UPIPayment- Implements makePayment() to print a message for UPI transactions.
Task:   Create instances of CreditCardPayment and UPIPayment, call makePayment(), and demonstrate interface implementation.

Solution:
interface Payment {
    void makePayment(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();
        creditCard.makePayment(1000);
        upi.makePayment(500);
    }
}
```
**Day 7: Problem Statement-31/01/25 (Intermediate OOP)**
```
Problem Statement:
Create a Java program that demonstrates constructor chaining by using both constructors in a class and in a derived class.
Base Class: Employee
Attributes: id, name
Constructor to initialize id and name.
Derived Class: Manager (inherits from Employee)
Attribute: department
Constructor to initialize id, name, and department. It should call the constructor of the Employee class.
Task:    Create an instance of Manager, initialize its attributes, and print out the information using constructor chaining.

Solution:
class Employee {
    protected int id;
    protected String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Manager extends Employee {
    private String department;
    public Manager(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Alice", "HR");
        manager.displayDetails();
    }
}
```
**Day 8: Problem Statement-01/02/25 (Intermediate OOP)**
```
Problem Statement:
Create a Java program to demonstrate method overloading by defining multiple methods with the same name but different parameters.
Class: Calculator
Method:
add(int a, int b): Returns the sum of two integers.
add(double a, double b): Returns the sum of two doubles.
add(int a, int b, int c): Returns the sum of three integers.
Task:    Create an instance of Calculator, call all overloaded add() methods, and print the results.

Solution:
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(5, 10));
        System.out.println("Sum of two doubles: " + calc.add(5.5, 2.3));
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3));
    }
}
```
**Day 9: Problem Statement-02/02/25 (Intermediate OOP)**
```
Problem Statement:
Create a Java program to demonstrate encapsulation by defining a class with private attributes and public getter and setter methods.
Class: BankAccount
Private Attributes:  accountNumber, balance
Methods:
Constructor to initialize accountNumber and balance.
deposit(double amount): Adds the amount to balance.
withdraw(double amount): Deducts the amount if sufficient balance is available.
getBalance(): Returns the current balance.
Task:    Create an instance of BankAccount, perform deposit and withdrawal operations, and display the balance using encapsulation.

Solution:
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000);
        account.deposit(2000);
        account.withdraw(1500);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
```
**Day 10: Problem Statement-03/02/25 (Intermediate OOP)**
```
Problem Statement:
Create a Java program to demonstrate the Singleton Design Pattern, ensuring only one instance of a class is created.
Class: DatabaseConnection
Private static instance variable to hold a single instance.
Private constructor to restrict object creation from outside.
Public static method getInstance() to return the single instance.
Method connect() to print a connection message.
Task:    Create an instance of DatabaseConnection using getInstance() and call the connect() method. Verify that multiple calls return the same instance.

Solution:
class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        System.out.println("Database Connection Established.");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connected to Database.");
    }
}
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();
        System.out.println("Are both instances the same? " + (db1 == db2));
    }
}
```
**Day 11: Problem Statement-04/02/25 (Advanced OOP)**
```
Problem Statement:
Create a Java program to demonstrate Java Reflection by inspecting the methods and fields of a class dynamically.
Class: Person
Private attributes: name, age
Constructor to initialize attributes.
Public method displayInfo() to print details.
Task:    Use Reflection API to get and print all methods and fields of the Person class dynamically at runtime.

Solution:
import java.lang.reflect.Field;
import java.lang.reflect.Method;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println("Methods of Person class:");
        for (Method method : personClass.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("\nFields of Person class:");
        for (Field field : personClass.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }
}
```
**Day 12: Problem Statement-05/02/25 (Advanced OOP)**
```
Problem Statement:
Create a Java program to demonstrate Method Overriding and Runtime Polymorphism using inheritance.
Base Class: Animal
Method:
sound(): Prints a generic message like "Animal makes a sound".
Derived Classes:
Dog (inherits Animal)
Overrides sound() to print "Dog barks".
Cat (inherits Animal)
Overrides sound() to print "Cat meows".
Task:       Create objects of Dog and Cat using runtime polymorphism (i.e., refer them using Animal type). Call sound() method and observe overridden behavior.

Solution:
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();
        myAnimal1.sound();
        myAnimal2.sound();
    }
}
```
**Day 13: Problem Statement-06/02/25 (Advanced OOP)**
```
Problem Statement:
Create a Java program to demonstrate Multiple Inheritance using Interfaces.
Interfaces:-
Printable:
Method: void print()
Showable:
Method: void show()
Class: Document
Implements both Printable and Showable.
Provides implementation for print() and show().
Task:     Create an instance of Document and call both methods.

Solution:
interface Printable {
    void print();
}
interface Showable {
    void show();
}
class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
    @Override
    public void show() {
        System.out.println("Showing the document...");
    }
}
public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
```