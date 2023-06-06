package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt7_Exercici1 {
	public static String demanarParaula() {
		Scanner teclat = new Scanner(System.in);
		return teclat.nextLine();
	}
	
	public static int contaParaules(String paraula) {
		int num = paraula.length();
		return num;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			String paraula = demanarParaula();
			System.out.println(contaParaules(paraula));
		}
	}
}