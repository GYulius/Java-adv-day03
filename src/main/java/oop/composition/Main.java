package oop.composition;

// Clasa principală care demonstrează compoziția obiectelor
public class Main {
    public static void main(String[] args) {
        // Crearea obiectului Bed
        Bed myBed = new Bed("King size","Classic");
        // Crearea obiectului TV
        TV myTV = new TV("LED", 55);
        // Crearea obiectului Room care include un pat și un TV
        Room myRoom = new Room(myBed, myTV);
        // Afișarea detaliilor camerei
        myRoom.displayRoomDetail();
    }
}