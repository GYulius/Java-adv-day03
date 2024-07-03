package oop.polymorphism.overriding.example02;

public class Animal {
    // Metodă care returnează un obiect de tip Animal
    public Animal getAnimal() {
        System.out.println("Animal: getAnimal() method");
        return new Animal();
    }
}