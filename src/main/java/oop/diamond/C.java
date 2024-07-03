package oop.diamond;
// Definirea interfeței C, care extinde interfața A
public interface C extends A{
    @Override
    default void methodX(){
        A.super.methodX(); // Apelarea implementării methodX din interfața A
        System.out.println("Hello from C");
    }
}
