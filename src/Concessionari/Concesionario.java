package Concessionari;

public class Concesionario {
	
	private int numCoches;
	private Coche [] nouCoche;
	
	public Concesionario(int max, int contador) {
		this.nouCoche = new Coche [max];
		this.numCoches = numCoches;
	}
	
	public Concesionario() {
		numCoches=0;
		this.nouCoche=new Coche[10];
	} 
	
	public void nuevoCoche(Coche c) {
		this.nouCoche[numCoches] = c;
		this.numCoches++;
	}
	
	public Coche buscaCoche(String matricula) {
		for(Coche c:this.nouCoche) {
			if(c.getMatricula() == matricula) {
				return c;
			}
		}
		return null;
	}

	public int getNumCoches() {
		return numCoches;
	}

	public void setNumCoches(int numCoches) {
		this.numCoches = numCoches;
	}

	public Coche[] getNouCoche() {
		return nouCoche;
	}

	public void setNouCoche(Coche[] nouCoche) {
		this.nouCoche = nouCoche;
	}
	
	public String toString() {
		String resultat = "";
		for(Coche c: this.nouCoche) {
			if(c!=null) {
				resultat = resultat + c.toString()+"\n";
			}
		}
		return resultat;
	}
}