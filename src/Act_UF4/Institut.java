package Act_UF4;

public class Institut {
	
	private String nom;
	private int num;
	private Alumne [] llistaAlumnes;
	
	public Institut(String nom) {
	        this.nom = nom;
	        this.llistaAlumnes =  new Alumne [100];
	        this.num = 0;
	}

	public Institut(String nom, int max) {
	        this.nom = nom;
	        this.llistaAlumnes =  new Alumne [max];
	        this.num = 0;
	}
	
	public void afegirAlumne(Alumne al) {
		this.llistaAlumnes[num]=al;
		this.num++;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Alumne[] getLlistaAlumnes() {
		return llistaAlumnes;
	}

	public void setLlistaAlumnes(Alumne[] llistaAlumnes) {
		this.llistaAlumnes = llistaAlumnes;
	}
}