package hu.szamalk.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla = new Babu[4][5];
    private int[] sorrend = new int[10];
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb > 1 && babuDb < 16){
            this.babuDb = babuDb;
        }else{
            System.out.println("Nem lehet ennyi bábu!");
        }
    }

    public boolean van8FelettEro(){
        return true;
    }

    @Override
    public void kezd(){
        super.kezd();
        System.out.println("Kezdés");
    }

    @Override
    public void ment(){
        super.ment();
        System.out.println("Mentés");
    }

    @Override
    public void vege(){
        super.vege();
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
