package Act1_Figures;

public class Quadrat implements Figura {
	
	private float costat;

	public Quadrat(float costat) {
		this.costat=costat;
	}

	public float area() {
		return costat*costat;
	}

	public float perimetre() {
		return costat*4;
	}
	
	public String toString() {
		return "Quadrat: " + "Perímetre = " + perimetre() + " Àrea = " + area();
	}
}