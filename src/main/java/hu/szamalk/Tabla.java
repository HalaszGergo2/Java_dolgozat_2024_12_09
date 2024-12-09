package hu.szamalk;

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
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                    System.out.print(T[i][j]);
            }
            System.out.println();
        }

    }



}
