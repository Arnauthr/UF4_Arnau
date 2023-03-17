package Act3_Bancs;

public class Banc {
		
	private String nom;
	private Compte [] llistaComptes;
	private int cont;
	
	public Banc(String nom) {
		this.nom=nom;
		this.llistaComptes = new Compte [100];
		this.cont=0;
	}
	
	public void nouCompte(Compte c) {
		this.llistaComptes[cont]=c;
		this.cont++;
	}

	public Compte[] getLlistaComptes() {
		return llistaComptes;
	}

	public void setLlistaComptes(Compte[] llistaComptes) {
		this.llistaComptes = llistaComptes;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return (toStringBanc() + toStringCompte());
	}
	
	public String toStringBanc() {
		return ("Nom: " +  this.nom + "\n");
	}
	
	public String toStringCompte() {
		String resultat = "";
		for(Compte c: this.llistaComptes) {
			if(c!=null) {
				resultat = resultat + c.toString()+"\n"+"\n";
			}
		}
		return resultat;
	}
}