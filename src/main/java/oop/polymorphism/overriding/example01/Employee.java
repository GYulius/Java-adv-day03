package oop.polymorphism.overriding.example01;

// Clasa Employee reprezintă un angajat de bază
public class Employee {
    protected String name; // Numele angajatului
    protected String employeeId; // ID-ul angajatului

    // Constructor pentru inițializarea unui obiect Employee
    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Metodă pentru afișarea detaliilor unui angajat
    public void displayDetails(){
        System.out.println("Name: " + name + " employee id: " + employeeId);
    }
}