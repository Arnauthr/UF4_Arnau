package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt11_Ex1 {
	public static Scanner teclat = new Scanner (System.in);
    public static String [][] taula =  {{"Arnau","aarmeijac"},
                                        {"Alexis","asalguero"},
                                        {"Ismael","itaouil"},
                                        {"Sergi","smiro"},
                                        {"Isaac","icabre"},
                                        {"Josep","jsarrias"}};
    
    public static boolean login(String usuari, String contrasenya){
        for(int i = 0; i<6; i++) {
            if(usuari == taula[i][0] && contrasenya == taula[i][1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String usuari ="Arnau";
        String contrasenya = "aarmeijac";
        boolean acces = login(usuari, contrasenya);
        if(acces==true) {
            System.out.println("Estàs dins");
        }else {
        	System.out.println("Usuari o contrasenya incorrecta");
        }
    }
}