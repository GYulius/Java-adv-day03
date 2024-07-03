package oop.polymorphism.overriding.example02;

public class Dog extends Animal {
    // Suprascrierea metodei getAnimal pentru a returna un obiect de tip Dog
    @Override
    public Dog getAnimal() {
        System.out.println("Dog: getAnimal() method");
        return new Dog();
    }
}