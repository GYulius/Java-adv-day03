package oop.composition;

public class Room {
    private Bed bed; // Obiectul Bed
    private TV tv; // Obiectul TV

    // Constructor pentru a inițializa o cameră cu un pat și un TV
    public Room(Bed bed, TV tv) {
        this.bed = bed;
        this.tv = tv;
    }

    // Metodă pentru a afișa detaliile camerei
    public void displayRoomDetail(){
        System.out.println("Room details: ");
        bed.displayBedDetails(); // Afișarea detaliilor patului
        tv.displayTVDetails(); // Afișarea detaliilor TV-ului
    }
}