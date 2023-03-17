package Act3_Bancs;

public class Titular {

	private String dni;
	private String nom;
	private String apellidos;
	
	public Titular(String dni, String nom, String apellidos) {
		this.dni=dni;
		this.nom=nom;
		this.apellidos=apellidos;
	}

	public String getdni() {
		return dni;
	}

	public void setdni(String dni) {
		dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String toString() {
		return ("DNI: " +  dni +  " Nom: " +  nom + " " + apellidos);
	}
}