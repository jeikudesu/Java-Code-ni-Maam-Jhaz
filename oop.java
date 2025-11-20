
// =======================================
// PART 1 — INHERITANCE
// =======================================

// Base class
class Animal {
    public void speak() {
        System.out.println("Animal speaks...");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog says: Woof!");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat says: Meow!");
    }
}


// Vehicle base class
class Vehicle {
    String brand;
    int fuel;

    public Vehicle(String brand, int fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }
}

// Car subclass with super()
class Car extends Vehicle {
    int doors;

    public Car(String brand, int fuel, int doors) {
        super(brand, fuel); // calling parent constructor
        this.doors = doors;
    }

    public void drive() {
        if (fuel > 0) {
            fuel -= 10;
            System.out.println("Driving... Fuel left: " + fuel);
        } else {
            System.out.println("No fuel left!");
        }
    }
}


// =======================================
// PART 2 — ENCAPSULATION
// =======================================

class BankAccount {
    private double balance; // private attribute

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public double getBalance() {
        return balance;
    }
}


// Age Validation with getters/setters
class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else System.out.println("Age must be positive!");
    }
}



// =======================================
// PART 3 — POLYMORPHISM
// =======================================

// Method overriding
class InkPrinter {
    public void printDocument() {
        System.out.println("Ink Printer printing...");
    }
}

class LaserPrinter {
    public void printDocument() {
        System.out.println("Laser Printer printing...");
    }
}


// Duck typing style (Java version)
class Bird {
    public void speak() {
        System.out.println("Bird chirps!");
    }
}

class Robot {
    public void speak() {
        System.out.println("Robot says: Beep!");
    }
}

class SpeakerTool {
    public static void makeItSpeak(Object obj) {
        // Check if object has speak() method
        if (obj instanceof Bird) {
            ((Bird)obj).speak();
        } else if (obj instanceof Robot) {
            ((Robot)obj).speak();
        } else {
            System.out.println("Object cannot speak!");
        }
    }
}



// =======================================
// PART 4 — ABSTRACTION
// =======================================

abstract class Shape {
    public abstract double area(); // abstract method
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double area() {
        return w * h;
    }
}


// Employee abstraction
abstract class Employee {
    public abstract double calculatePay();
}

class HourlyEmployee extends Employee {
    double rate, hours;

    public HourlyEmployee(double r, double h) {
        rate = r;
        hours = h;
    }

    public double calculatePay() {
        return rate * hours;
    }
}

class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee(double s) {
        salary = s;
    }

    public double calculatePay() {
        return salary;
    }
}



// =======================================
// MAIN CLASS — RUN EVERYTHING
// =======================================
public class Main {
    public static void main(String[] args) {

        // Inheritance
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.speak();
        d.speak();
        c.speak();

        Car car = new Car("Toyota", 50, 4);
        car.drive();

        // Encapsulation
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Account balance: " + acc.getBalance());

        Person p = new Person();
        p.setAge(20);
        System.out.println("Age: " + p.getAge());

        // Polymorphism
        InkPrinter ip = new InkPrinter();
        LaserPrinter lp = new LaserPrinter();
        ip.printDocument();
        lp.printDocument();

        // Duck typing-like
        SpeakerTool.makeItSpeak(new Bird());
        SpeakerTool.makeItSpeak(new Robot());
        SpeakerTool.makeItSpeak(123); // cannot speak

        // Abstraction
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Rectangle area: " + s2.area());

        Employee e1 = new HourlyEmployee(100, 8);
        Employee e2 = new SalariedEmployee(30000);
        System.out.println("Hourly Employee Pay: " + e1.calculatePay());
        System.out.println("Salaried Employee Pay: " + e2.calculatePay());
    }
}

