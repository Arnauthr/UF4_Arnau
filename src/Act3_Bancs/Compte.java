package Act3_Bancs;

public class Compte {

	private String numCompte;
	private Titular nom;
	private double saldo;
	
	public Compte(String numCompte, Titular nom) {
		this.numCompte=numCompte;
		this.nom=nom;
	}
	
	public Compte(String numCompte, Titular nom, double saldo) {
		this.numCompte=numCompte;
		this.nom=nom;
		this.saldo=saldo;
	}
	
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public Titular getNom() {
		return nom;
	}

	public void setNom(Titular nom) {
		this.nom = nom;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return ("Compte: " +  numCompte +  " Saldo: " +  saldo + "\n" + nom.toString());
	}
}