package Act_UF4;

public class UsaInstitut {

	public static void main(String[] args) {
		Institut jaume = new Institut("Jaume");
		Institut narcis = new Institut("Narcis", 100);
		
		Alumne arnau = new Alumne("Arnau", 17, "2345678N", "arnau@gmail.com");
		Alumne manel = new Alumne("Manel", 18, "2345678M", "manel@gmail.com");
		Alumne nour = new Alumne("Nour", 19, "2345678H", "nour@gmail.com");
		Alumne edgar = new Alumne("Edgar", 20, "2345678J", "edgar@gmail.com");
		Alumne alexis = new Alumne("Alexis", 21, "2345678K", "alexis@gmail.com");
		Alumne josep = new Alumne("Josep", 22, "2345678L", "josep@gmail.com");
		
		jaume.afegirAlumne(arnau);
		jaume.afegirAlumne(manel);
		jaume.afegirAlumne(nour);
		narcis.afegirAlumne(edgar);
		narcis.afegirAlumne(alexis);
		narcis.afegirAlumne(josep);

		for(int i=0;i<jaume.getNum();i++) {
			
			System.out.println(jaume.getLlistaAlumnes()[i].getNom());
		}
		System.out.println(" ");
		for(int i=0;i<narcis.getNum();i++) {
			
			System.out.println(narcis.getLlistaAlumnes()[i].getNom());
		}
	}
}