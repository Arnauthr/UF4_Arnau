package Act_UF4;

public class Alumne {

	private String nom;
	private int edat;
	private String DNI;
	private String email;
	
	public Alumne(String nom, int edat, String DNI, String email) {
		this.nom= nom;
		this.edat=edat;
		this.DNI=DNI;
		this.email=email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}