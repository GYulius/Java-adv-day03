package oop.composition;

public class TV {
    private String type; // Tipul TV-ului
    private int size; // Dimensiunea TV-ului

    // Constructor pentru a inițializa un TV cu un tip și o dimensiune
    public TV(String type, int size) {
        this.type = type;
        this.size = size;
    }

    // Metodă pentru a afișa detaliile TV-ului
    public void displayTVDetails(){
        System.out.println("TV type: " + type + " size: " + size);
    }
}
