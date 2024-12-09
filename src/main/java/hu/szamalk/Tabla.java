package hu.szamalk;

public class Tabla {
    private char[][] T;
    private char ÜresCella;

    public Tabla(char üresCella) {
        T = new char[8][8];
        ÜresCella = üresCella;
        for (int i = 0; i < T.length; i++) {
            for(int j = 0; j < T.length; j++){
                T[i][j] = ÜresCella;
            }
        }
    }

}
