package oop.composition;

public class Bed {
    private String name; // Numele patului
    private String bedroomType; // Tipul de cameră unde se află patul

    // Constructor pentru a inițializa un pat cu un nume și un tip de cameră
    public Bed(String name, String bedroomType) {
        this.name = name;
        this.bedroomType = bedroomType;
    }

    // Metodă pentru a afișa detaliile patului
    public void displayBedDetails() {
        System.out.println("Bed: " + name + " type: " + bedroomType);
    }
}