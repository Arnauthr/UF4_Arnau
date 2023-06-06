package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt11_Ex2 {
    public static Scanner teclat = new Scanner(System.in);
    public static boolean any_traspas(int any) {
        if (any%4 == 0) {
            if(any%100 == 0) {
                if(any%400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static int diesMes(int mes, int any) {
        switch(mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        case 2:
            if(any_traspas(any)) {
                return 29;
            }else {
                return 28;
            }
        }
        return 0;
    }

    public static int [] demanar_data(){
        int  [] data = {12,12,2001};
        return data;
    }

    public static void main(String[] args) {
        int dia = demanar_data()[0];
        int mes = demanar_data()[1];
        int any = demanar_data()[2];

        int diesJulians = 0;

        for(int i =1; i<mes; i++) {
            diesJulians += diesMes(i, any);
        }
        diesJulians += dia;
        System.out.println("Total dels dies: "+diesJulians);
    }
}