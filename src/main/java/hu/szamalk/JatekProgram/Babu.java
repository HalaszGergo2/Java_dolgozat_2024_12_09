package hu.szamalk.JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(szin, 1);
    }

    public Babu(String szin, int ero) {
        this.szin = szin;
        if(ero > 0 && ero < 10){
            this.ero = ero;
        }else{
            System.out.println("Nem lehet ennyi az erő!");
        }

    }
}
