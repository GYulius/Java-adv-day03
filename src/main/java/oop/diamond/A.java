package oop.diamond;

public interface A {
    // Definirea interfeței A cu o metodă implicită methodX
   default void methodX(){
        System.out.println("Hello from A");
    }

}
