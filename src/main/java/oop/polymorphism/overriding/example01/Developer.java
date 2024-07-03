package oop.polymorphism.overriding.example01;

// Clasa Developer extinde clasa Employee și adaugă un atribut specific
public class Developer extends Employee {

    private String programmingLanguage; // Limba de programare specifică pentru Developer

    // Constructor pentru inițializarea unui obiect Developer
    public Developer(String name, String employeeId, String programmingLanguage) {
        super(name, employeeId); // Apelarea constructorului clasei părinte (Employee)
        this.programmingLanguage = programmingLanguage;
    }

    // Suprascrierea metodei displayDetails pentru a afișa detaliile specifice unui Developer
    @Override
    public void displayDetails(){
        super.displayDetails(); // Apelarea metodei displayDetails din clasa părinte
        System.out.println("Programming language: " + programmingLanguage); // Afișarea limbii de programare
    }
}