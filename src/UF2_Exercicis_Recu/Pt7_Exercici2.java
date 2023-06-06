package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt7_Exercici2 {
	public static void mostrarmatriu(int[][] taula) {
		for (int i = 0; i < taula.length; i++) {
			for (int j = 0; j < taula[i].length; j++) {
				System.out.print(taula[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public static void introduirNumero(int fila, int columna, int[][] tauler) {
		Scanner teclat = new Scanner(System.in);
		System.out.print("A quina fila vols introduir el número 1?");
		fila = teclat.nextInt();
		System.out.print("A quina columna vols introduir el número 1?");
		columna = teclat.nextInt();
		for (int i = 0; i < tauler.length; i++) {
			for (int j = 0; j < tauler[i].length; j++) {
				tauler[fila][columna] = 1;
				mostrarmatriu(tauler);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		int fila = 0;
		int columna = 0;
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix el numero de files i columnes");
		int num = teclat.nextInt();
		int[][] tauler = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				tauler[i][j] = 0;
			}
		}
		mostrarmatriu(tauler);
		for (int i = 0; i < num; i++) {
			introduirNumero(fila, columna, tauler);
		}
		mostrarmatriu(tauler);
	}
}