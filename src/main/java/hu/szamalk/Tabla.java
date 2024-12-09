package hu.szamalk;

import java.util.Random;

public class Tabla {

    private char[][] T;
    private char ÜresCella;

    public Tabla(char üresCella) {
        T = new char[8][8];
        this.ÜresCella = üresCella;
        for (int i = 0; i < T.length; i++) {
            for(int j = 0; j < T.length; j++){
                T[i][j] = üresCella;
            }
        }
    }

    public void Megjelenít(){
        Elhelyez(2);
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                    System.out.print(T[i][j]);
            }
            System.out.println();
        }

    }

    public void Elhelyez(int n){
        Random rnd = new Random();
        int randomHely = rnd.nextInt(0, 8);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (T[randomHely][randomHely] == '#') {
                    T[randomHely][randomHely] = 'K';
                }
            }
        }

    }


}
