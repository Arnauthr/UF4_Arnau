package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt10 {
	public static Scanner teclat = new Scanner(System.in);
	public static int opcio=0;
	public static int coord1;
	public static int coord2;
	public static int [][] matriu = new int[4][2];
	
	public static void inicialitzar_matriu() {
		for (int i = 0; i < matriu.length; i++) {
	        for (int j = 0; j < matriu[j].length; j++) {
	        	matriu[i][j] = 0;
	        	System.out.print(matriu[i][j]);
				System.out.print("|");
			}
			System.out.println( "" );
		}
	}
	
	public static void mostrar_menu() {
		System.out.println("1. Afegir element");
        System.out.println("2. Modificar element");
        System.out.println("3. Eliminar element");
        System.out.println("4. Imprimir matriu");
        System.out.println("5. Imprimir estadístiques");
        System.out.println("6. Sortir");
	}
	
	public static void afegir_element() {
        System.out.println("Introdueix la coordenada de la fila: ");
        coord1 = teclat.nextInt();
        System.out.println("Introdueix la coordenada de la columna: ");
        coord2 = teclat.nextInt();
        if (matriu[coord1][coord2] != 0) {
            System.out.println("Posició OCUPADA, torna al menú!");
                return;
        } else {
            System.out.println("Introdueix l'element: ");
            int element = teclat.nextInt();
            matriu[coord1][coord2] = element;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
	}
	
	public static void modificar_element() {
		System.out.println("Introdueix la coordenada de la fila: ");
        coord1 = teclat.nextInt();
        System.out.println("Introdueix la coordenada de la columna: ");
        coord2 = teclat.nextInt();
        if (matriu[coord1][coord2] == 0) {
            System.out.println("Posició BUIDA, torna al menú");
            return;
        } else {
            System.out.println("Introdueix el nou element: ");
            int element = teclat.nextInt();
            matriu[coord1][coord2] = element;
        }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriu[i][j] + " ");
                }
                System.out.println();
            }
    }
	
	public static void eliminar_element() {
		System.out.println("Introdueix la coordenada de la fila: ");
        coord1 = teclat.nextInt();
        System.out.println("Introdueix la coordenada de la columna: ");
        coord2 = teclat.nextInt();
        if (matriu[coord1][coord2] == 0) {
            System.out.println("Posició JA BUIDA, torna al menú!");
                return;
        } else {
            System.out.println("Borra l'element: ");
            matriu[coord1][coord2] = 0;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
	}

	public static void imprimir_taula(boolean trasposta) {
		if (trasposta) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriu[j][i] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matriu[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
	
	public static void imprimir_stats() {
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriu[i][j] < min) {
                    min = matriu[i][j];
                }
                if (matriu[i][j] > max) {
                    max = matriu[i][j];
                }
                suma += matriu[i][j];
                contador++;
            }
        }
        double mitjana = (double) suma / contador;
        System.out.println("Valor mínim: " + min);
        System.out.println("Valor màxim: " + max);
        System.out.println("Mitjana: " + mitjana);
        System.out.println("Suma: " + suma);
    }

	public static void iniciarPrograma() {
				inicialitzar_matriu();
				mostrar_menu();
				opcio = teclat.nextInt();
				
				while (opcio != 6) {
			        switch (opcio) {
			        case 1:
			        	afegir_element();
			        	mostrar_menu();
			        	opcio = teclat.nextInt();
			            break;
			        case 2:
			        	modificar_element();
			        	mostrar_menu();
			        	opcio = teclat.nextInt();
			            break;
			        case 3:
			        	eliminar_element();
			        	mostrar_menu();
			        	opcio = teclat.nextInt();
			            break;
			        case 4:
			        	imprimir_taula(true);
			        	mostrar_menu();
			        	opcio = teclat.nextInt();
			            break;
			        case 5:
			        	imprimir_stats();
			        	mostrar_menu();
			        	opcio = teclat.nextInt();
			            break;
			        case 6:
			            break;
			        default:
			            System.out.println("Opció invàlida! Introdueix una opció del menú.");
			            mostrar_menu();
						opcio = teclat.nextInt();
			            break;
			            } 
			        }
	            }
	
	public static void main(String[] args) {
		iniciarPrograma();
		teclat.close();
	  }
}