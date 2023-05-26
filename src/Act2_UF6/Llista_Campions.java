package Act2_UF6;

import java.util.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class Llista_Campions {
	
	public static Scanner teclat = new Scanner (System.in);
	
	private static Connection connexio;
	public final static String USER = "root";
	public final static String PASSW = "";
	public final static String database = "jdbc:mysql://localhost:3308/lol";
	public static final String nomTaula = "champions";
	public static int opcio =0;
	public static String nom_campio;
	
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
	
	public static void getCampions(String nomTaula) {
		try {
			String Query = "SELECT id, name, title, tags FROM " +nomTaula;
			Statement st = connexio.createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);			
			
			while (resultSet.next()) {
				System.out.println("Champion ID: " + resultSet.getString("id") + ".	"
						+ "Name: " + resultSet.getString("name") + ".	"
						+ "Title: " + resultSet.getString("title") + ".	"
						+ "Tags: " + resultSet.getString("tags") + ".	");
				}
			
		}catch (SQLException e){
			System.out.println("Error a l'hora d'obtenir les dades");
			e.printStackTrace();
			}
	}
	
	public static void getCampio(String nomTaula) {
		
        System.out.println("Introdueix el nom o id del campió");
        nom_campio = teclat.nextLine();

    		try {
    			String Query = "SELECT * FROM champions WHERE id = '" + nom_campio + "' OR name LIKE '%" +nom_campio+ "%'";       
    			Statement st = connexio.createStatement();
    			java.sql.ResultSet resultSet;
    			resultSet = st.executeQuery(Query);
    			
    			while (resultSet.next()) {
    				System.out.println("Champion Name: " + resultSet.getString("name") + ".	"
    						+ "Title: " + resultSet.getString("title") + ".	"
    						+ "Tags: " + resultSet.getString("tags") + ".	"
    						+ "Lore: " + resultSet.getString("lore") + ".	");
    				}
    		}catch (SQLException e){
    			System.out.println("Error a l'hora d'obtenir les dades");
    			e.printStackTrace();
    			}
		} 
	
	public static void afegirCampio(String name, String title, String lore, String tags) {
		try {
		String Query = "SELECT * FROM "+nomTaula+ " WHERE name = '" + name + "'";
        Statement statement = connexio.createStatement();
        ResultSet resultSet = statement.executeQuery(Query);
        if (resultSet.next()) {
            System.out.println("Error a l'hora d'obtenir les dades");
		} else {
            String Query2= "INSERT INTO "+nomTaula+"(name, title, lore, tags ) VALUE("
                    + "\""+ name + "\", "
                    + "\""+ title + "\", "
                    + "\""+ lore + "\", "
                    + "\""+ tags + "\"); ";
            Statement st = connexio.createStatement();
            st.executeUpdate(Query2);
            
            System.out.println("Dades guardades correctament");

		 }
       }catch(SQLException e) {
           System.out.println(e.getMessage());
           System.out.println("Error a l'hora d'obtenir les dades");
       }	
	}

	public static void main(String[] args) {
		String opcio;
		connexio();
		do {
            System.out.println("1. Mostrar la llista de campions");
            System.out.println("2. Buscar un campió");
            System.out.println("3. Afegir un campió");
            System.out.println("4. Sortir");
            System.out.println("Opció: ");
             opcio = teclat.nextLine();
             switch(opcio) {
         	case "1":
         			getCampions(nomTaula);
         			System.out.println("\n");
         		break;
         	case "2":
     			getCampio(nomTaula);
     			System.out.println("\n");
     			break;
         	case "3":
         		System.out.println("Introdueix el nom del campió:");
        		String name = teclat.nextLine();
        		System.out.println("Introdueix el títol del campió:");
        		String title = teclat.nextLine();
        		System.out.println("Introdueix els tags del campió:");
        		String tags = teclat.nextLine();
        		System.out.println("Introdueix el lore del campió:");
        		String lore = teclat.nextLine();
         		
     			afegirCampio(name, title, tags, lore);
     			System.out.println("\n");
     			break;
         	case "4":
         			System.out.println("Has tancat el programa");
         			connexioClose();
         			teclat.close();
         		break;
         }
     }while(opcio != "4");
   }
}