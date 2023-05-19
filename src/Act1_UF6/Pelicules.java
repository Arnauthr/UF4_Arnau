package Act1_UF6;

import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class Pelicules {
	private static Connection connexio;
	public final static String USER = "root";
	public final static String PASSW = "";
	public final static String database = "jdbc:mysql://localhost:3308/pelicules";
	public static final String nomTaula = "";
	public static int opcio =0;
	public static Scanner teclat = new Scanner (System.in);
	
	
	public static void connexio() {
		try {
			connexio = (Connection) DriverManager.getConnection(database, USER, PASSW);
			System.out.println("Server Connectat");
			
		}catch (SQLException e){
			System.out.println("No s'ha pogut connectar a la base de dades");
			e.printStackTrace();
		}
	}
	
	public static void connexioClose() {
		try {
			connexio.close();
			JOptionPane.showMessageDialog(null, "S'ha tancat la connexió amb la base de dades");
		}catch (SQLException e){
				System.out.println("Error al tanca la base de dades");
				e.printStackTrace();
			}
	}
	
	public static void getRegistres(String nomTaula) {
		try {
			String Query = "SELECT * FROM " +nomTaula;
			Statement st = connexio.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);
			
			
			while (resultSet.next()) {
				switch (nomTaula){
				case "clients":
				System.out.println("ID Client: " + resultSet.getString("id_client") + "	"
						+ "Usuari : " + resultSet.getString("usuari") + "	"
						+ "Contrasenya : " + resultSet.getString("contrasenya") + "	");
					break;
				case "lloguers":
					System.out.println("ID Lloguer: " + resultSet.getString("id_lloguer") + "	"
							+ "ID Película: " + resultSet.getString("id_peli") + "	"
							+ "ID Client: " + resultSet.getString("id_client") + "	");
						break;
				case "pelicules":
					System.out.println("ID Película : " + resultSet.getString("id_peli") + "	"
							+ "Nom : " + resultSet.getString("nom") + "	"
							+ "Director : " + resultSet.getString("director") + "	"
							+ "Any de Producció : " + resultSet.getString("any_prod") + "	"
							+ "Estat de la película : " + resultSet.getString("llogada") + "	");
						break;
				}
			}
		}catch (SQLException e){
			System.out.println("Error a l'hora d'obtenir les dades");
			e.printStackTrace();
			}
	}
	
	
	public static void main(String[] args) {

		connexio();
        String opcio;
        do {
            System.out.println("1. Consultar una taula");
            System.out.println("2. Sortir del programa");
            System.out.println();
            System.out.println("Opció: ");
             opcio = teclat.nextLine();
            switch(opcio) {
            	case "1":
            			System.out.println("Quina taula vols consultar?");
            			String nomTaula =teclat.nextLine();
            			getRegistres(nomTaula);
            			System.out.println("\n");
            		break;

            	case "2":
            			System.out.println("Has tancat el programa");
            			connexioClose();
            			teclat.close();
            		break;
            }
        }while(opcio != "2");
	}
}