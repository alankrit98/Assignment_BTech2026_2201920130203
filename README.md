**Day 1: Problem Statement-25/01/25 (Basic OOP)**
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
