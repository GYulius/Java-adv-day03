package oop.polymorphism.overriding.example01;

// Clasa principală care demonstrează polimorfismul și suprascrierea metodelor
public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Andrew", "D222", "Java"); // Crearea unui obiect Developer
        Manager mgr = new Manager("Victor", "E213", "HR"); // Crearea unui obiect Manager

        dev.displayDetails(); // Afișarea detaliilor pentru Developer
        mgr.displayDetails(); // Afișarea detaliilor pentru Manager
    }
}