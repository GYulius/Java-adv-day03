package oop.polymorphism.overloading.first;
public class TRex {

    // Metodă pentru ca TRex să mănânce un Triceratops
    public void eat(Triceratops victim) {
        System.out.println("Take some bites from the triceratops");
    }

    // Metodă pentru ca TRex să mănânce un Dromaeosaurus
    public void eat(Dromaeosaurus victim) {
        System.out.println("Take some bites from the dromaeosaurus");
    }

    // Metodă pentru ca TRex să mănânce doi oameni
    public void eat(Human first, Human second) {
        System.out.println("No humans at the time to eat");
    }

    // Metodă pentru ca TRex să mănânce un singur om
    public void eat(Human first) {
        System.out.println("First human is not available");
    }

    // Java nu consideră return type ca parte a semnăturii metodei
    // și nu putem face overloading pe baza return type-ului.
//    public boolean eat(Triceratops victim){
//        return false;
//    }

    // Metoda principală care demonstrează apelurile metodelor de overloading
    public static void main(String[] args) {
        TRex tRex = new TRex();

        // TRex mănâncă un Triceratops
        tRex.eat(new Triceratops());

        // TRex mănâncă un Dromaeosaurus
        tRex.eat(new Dromaeosaurus());

        // TRex încearcă să mănânce doi oameni
        tRex.eat(new Human("John"), new Human("Alice"));

        // TRex încearcă să mănânce un singur om
        tRex.eat(new Human("Human1"));
    }
}