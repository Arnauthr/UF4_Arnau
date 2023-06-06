package UF2_Exercicis_Recu;

import java.util.Scanner;

public class Pt13 {
	public static Scanner teclat = new Scanner (System.in);
	public static String matriu[][] = new String [4][3];
	public static int opcio=0;
	
	public static void inicialitzarMatriu() {
		for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 3; j++) {
	        	matriu[0][0] = "1 ";
	        	matriu[1][0] = "2 ";
	        	matriu[2][0] = "3 ";
	        	matriu[3][0] = "4 ";
	        	matriu[0][1] = "Paco Mangueras";
	        	matriu[1][1] = "Alex Tintor   ";
	        	matriu[2][1] = "Elsa Patilla  ";
	        	matriu[3][1] = "Jordi Bord    ";
	        	matriu[0][2] = "6";
	        	matriu[1][2] = "3";
	        	matriu[2][2] = "15";
	        	matriu[3][2] = "2";
	        	System.out.print(matriu[i][j]);
				System.out.print("|");
			}
			System.out.println( "" );
		}
	}
		
	public static void mostrarMenu() {
		System.out.println(" ");
		System.out.println("1. Introduir hores");
        System.out.println("2. Llistar bombers ");
        System.out.println("3. Sortir");
	}
	
	public static void introduirHores() {
		System.out.println("Introdueix el número del treballador: ");
	    int treballador = teclat.nextInt();
	    System.out.println("Introdueix les hores a afegir: ");
	    int hores = teclat.nextInt();

	    int horesActuals = Integer.parseInt(matriu[treballador - 1][2]);
	    int horesNoves = horesActuals + hores;

	    matriu[treballador - 1][2] = Integer.toString(horesNoves);
	    
	    
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 3; j++) {
	        	System.out.print(matriu[i][j]);
	    	    System.out.print("|");
	    }
	   System.out.println( "" );
	  }
	}
	
	public static void llistarBombers() {
		String hores;
		String nom;
		String id;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(matriu[i][2]) < Integer.parseInt(matriu[j][2])) {
                    hores=matriu[i][2];
                    id=matriu[i][0];
                    nom=matriu[i][1];

                    for (int x = i; x > j; x--) {
                         matriu[x][2]=matriu[x-1][2];
                         matriu[x][1]=matriu[x-1][1];
                         matriu[x][0]=matriu[x-1][0];
                    }
                    matriu[j][2]=hores;
                    matriu[j][1]=nom;
                    matriu[j][0]=id;
                    j=5;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 3; j++) {
	        	System.out.print(matriu[i][j]);
	    	    System.out.print("|");
	    }
	   System.out.println( "" );
	  }
	}
	
	public static void iniciarPrograma() {
		inicialitzarMatriu();
		mostrarMenu();
		opcio=teclat.nextInt();
		
		while (opcio != 3) {
			switch(opcio) {
			case 1:
	        	introduirHores();
	        	mostrarMenu();
	        	opcio = teclat.nextInt();
	            break;
			case 2:
	        	llistarBombers();
	        	mostrarMenu();
	        	opcio = teclat.nextInt();
	            break;
			case 3:
	            break;
	        default:
	        	System.out.println("Opció invàlida! Introdueix una opció del menú.");
	            mostrarMenu();
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