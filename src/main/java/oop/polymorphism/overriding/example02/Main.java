package oop.polymorphism.overriding.example02;

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect de tip Animal și apelarea metodei getAnimal
        Animal animal = new Animal();
        animal.getAnimal();

        // Crearea unui obiect de tip Dog și apelarea metodei getAnimal
        Dog dog = new Dog();
        dog.getAnimal();

        // Polimorfism
        // O instanță a clasei Dog atribuită unei referințe de tip Animal
        Animal polyMorphicAnimal = new Dog();
        polyMorphicAnimal.getAnimal();
    }
}