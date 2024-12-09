package hu.szamalk;

public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla('#');
        tabla.Megjelenít();
        System.out.println("Található üres oszlop?: " + tabla.ÜresOszlop(2));
        System.out.println("Található üres sor?: " + tabla.ÜresSor(2));
    }
}