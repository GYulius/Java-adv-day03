package oop.diamond;
// Definirea interfeței B, care extinde interfața A
public interface B extends A {
    @Override
    default void methodX(){
        A.super.methodX(); // Apelarea implementării methodX din interfața A
        System.out.println("Hello from B");
    }

}
// implements e folosit pentru clase nu interfete
