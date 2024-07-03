package oop.polymorphism.overriding.example01;

// Clasa Manager extinde clasa Employee și adaugă un atribut specific
public class Manager extends Employee {

    private String department; // Departamentul specific pentru Manager

    // Constructor pentru inițializarea unui obiect Manager
    public Manager(String name, String employeeId, String department) {
        super(name, employeeId); // Apelarea constructorului clasei părinte (Employee)
        this.department = department;
    }

    // Suprascrierea metodei displayDetails pentru a afișa detaliile specifice unui Manager
    @Override
    public void displayDetails(){
        super.displayDetails(); // Apelarea metodei displayDetails din clasa părinte
        System.out.println("Department: " + department); // Afișarea departamentului
    }
}